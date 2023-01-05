package datastructures.test;

import my.datastructures.Queue;

public class QueueTest {

    public static void main(String[] args) {
        testConstructor();
        testEnqueue();
        testDequeue();
    }

    public static void testConstructor() {
        System.out.println("----- TEST: CONSTRUCTOR -----");
        Queue myQueue = new Queue(4);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();
    }

    public static void testEnqueue() {
        System.out.println("----- TEST: ENQUEUE -----");
        Queue myQueue = new Queue(2);

        System.out.println("Before enqueue():");
        System.out.println("--------------");
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();

        myQueue.enqueue(1);

        System.out.println("\n\nAfter enqueue():");
        System.out.println("-------------");
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        System.out.println("\nQueue:");
        myQueue.printQueue();

    }

    public static void testDequeue() {
        System.out.println("----- TEST: DEQUEUE -----");
        Queue myQueue = new Queue(2);
        myQueue.enqueue(1);

        // (2) Items - Returns 2 Node
        System.out.println(myQueue.dequeue().value);
        // (1) Item - Returns 1 Node
        System.out.println(myQueue.dequeue().value);
        // (0) Items - Returns null
        System.out.println(myQueue.dequeue());
    }
}