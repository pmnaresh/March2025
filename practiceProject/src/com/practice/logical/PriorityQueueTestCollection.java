package com.practice.logical;

 import java.util.*;

public class PriorityQueueTestCollection {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(5);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // prints: 2 3 5 5
        }

        System.out.println(pq);

        System.out.println("add Operation in Queue: " + queue.add("Kumar"));  //true
        System.out.println("add Operation in Queue: " + queue.add("Hitesh")); //true
        System.out.println("Elements in Queue: " + queue); //[Hitesh, Kumar]

        System.out.println("element Operation in Queue: " + queue.element()); //Hitesh
        System.out.println("Elements in Queue: " + queue); //  [Hitesh, Kumar]

        System.out.println("peek Operation in Queue: " + queue.peek()); // Hitesh
        System.out.println("Elements in Queue: " + queue);  //[Hitesh, Kumar]

        System.out.println("offer Operation in Queue: " + queue.offer("Manoj")); //true -inserts element
        System.out.println("Elements in Queue: " + queue); //[Hitesh, Kumar, Manoj]

        System.out.println("remove Operation in Queue: " + queue.remove());  //Retrieves and removes //Retrieves and removes 
        System.out.println("Elements in Queue: " + queue); //[Kumar, Manoj]

        System.out.println("poll Operation in Queue: " + queue.poll()); //Retrieves and removes  //Kumar
        System.out.println("Elements in Queue: " + queue); //[Manoj]
        
        //Both add elements to the queue. Difference is that 
        //add() throws exception if queue is full (not here)
        //, offer() returns false
        
        //Both remove the head.
//        remove() throws if empty,
//        poll() returns null.
    }
}

