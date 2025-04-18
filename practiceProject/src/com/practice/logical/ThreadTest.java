package com.practice.logical;

class RunnableTask1 implements Runnable {
    private String resource1, resource2;

    public RunnableTask1(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println("Task 1: Locked " + resource1);
            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (resource2) {
                System.out.println("Task 1: Locked " + resource2);
            }
        }
    }
}

class RunnableTask2 implements Runnable {
    private String resource1, resource2;

    public RunnableTask2(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) { // same locking order as Task 1
            System.out.println("Task 2: Locked " + resource1);
            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (resource2) {
                System.out.println("Task 2: Locked " + resource2);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        final String resource1 = "Test1";
        final String resource2 = "Test2";

        Thread t1 = new Thread(new RunnableTask1(resource1, resource2));
        Thread t2 = new Thread(new RunnableTask2(resource1, resource2));

        t1.start();
        t2.start();
    }
}
