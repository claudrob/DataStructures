package datastructures.test;

import my.datastructures.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        testLLConstructor();
        testLLAppend();
        testRemoveLast();
        testPrepend();
        testRemoveFirst();
        testGet();
        testSet();
        testInsert();
        testRemove();
        testReverse();
    }

    private static void testLLConstructor() {
        System.out.println("\n----------Test LinkedList Constructor:----------");
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

    private static void testLLAppend() {
        System.out.println("\n----------Test LinkedList APPEND:----------");
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.makeEmpty();
        myLinkedList.append(1);
        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

    private static void testRemoveLast(){
        System.out.println("\n----------Test LinkedList REMOVE LAST:----------");
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());
    }

    private static void testPrepend(){
        System.out.println("\n----------Test LinkedList PRE PEND:----------");
        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }

    public static void testRemoveFirst(){
        System.out.println("\n----------Test LinkedList REMOVE FIRST:----------");

        LinkedList myLinkedList = new LinkedList(2);
        myLinkedList.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myLinkedList.removeFirst());
    }
    public static void testGet(){
        System.out.println("\n----------Test LinkedList GET:----------");

        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);


        System.out.println(myLinkedList.get(3).value);
    }
    public static void testSet(){
        System.out.println("\n----------Test LinkedList SET:----------");

        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);

        System.out.println("Linked List before set():");
        myLinkedList.printList();

        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.printList();
    }
    public static void testInsert(){
            System.out.println("\n----------Test LinkedList INSERT:----------");

            LinkedList myLinkedList = new LinkedList(1);
            myLinkedList.append(3);

            System.out.println("LL before insert():");
            myLinkedList.printList();

            myLinkedList.insert(1, 2);

            System.out.println("\nLL after insert(2) in middle:");
            myLinkedList.printList();

            myLinkedList.insert(0, 0);

            System.out.println("\nLL after insert(0) at beginning:");
            myLinkedList.printList();

            myLinkedList.insert(4, 4);

            System.out.println("\nLL after insert(4) at end:");
            myLinkedList.printList();
        }
        public static void testRemove(){

            System.out.println("\n----------Test LinkedList REMOVE:----------");
            LinkedList myLinkedList = new LinkedList(1);
            myLinkedList.append(2);
            myLinkedList.append(3);
            myLinkedList.append(4);
            myLinkedList.append(5);

            System.out.println("LL before remove():");
            myLinkedList.printList();

            System.out.println("\nRemoved node:");
            System.out.println(myLinkedList.remove(2).value);
            System.out.println("LL after remove() in middle:");
            myLinkedList.printList();

            System.out.println("\nRemoved node:");
            System.out.println(myLinkedList.remove(0).value);
            System.out.println("LL after remove() of first node:");
            myLinkedList.printList();

            System.out.println("\nRemoved node:");
            System.out.println(myLinkedList.remove(2).value);
            System.out.println("LL after remove() of last node:");
            myLinkedList.printList();
        }
    public static void testReverse(){

            System.out.println("\n----------Test LinkedList REVERSE:----------");
            LinkedList myLinkedList = new LinkedList(1);
            myLinkedList.append(2);
            myLinkedList.append(3);
            myLinkedList.append(4);

            System.out.println("LL before reverse():");
            myLinkedList.printList();

            myLinkedList.reverse();

            System.out.println("\nLL after reverse():");
            myLinkedList.printList();
        }




}
