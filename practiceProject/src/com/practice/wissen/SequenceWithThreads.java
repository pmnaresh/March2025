package com.practice.wissen;

class NumberPrinter {
    private int number = 1;
    private final int N;
    private final int TOTAL_THREADS = 3;

    public NumberPrinter(int N) {
        this.N = N;
    }

    public void printNumbers(int threadId) {
        while (true) {
            synchronized (this) {
                while (number <= N && number % TOTAL_THREADS != threadId) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                if (number > N) {
                    notifyAll();
                    break;
                }

                System.out.println("THREAD-" + (threadId + 1) + " : " + number);
                number++;
                notifyAll();
            }
        }
    }
}

public class SequenceWithThreads {
    public static void main(String[] args) {
        int N = 10;
        NumberPrinter printer = new NumberPrinter(N);

        for (int i = 0; i < 3; i++) {
            final int threadId = i;
            new Thread(() -> printer.printNumbers(threadId)).start();
        }
    }
}
