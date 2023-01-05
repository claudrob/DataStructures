package datastructures.test;

import my.datastructures.DoublyLinkedList;

public class DoubleLinkListTest {

    public static void main(String[] args) {

        testDLLConstructor();
        testDLLAppend();
        testRemoveLast();
        testPreApend();
        testRemoveFirst();
        testGet();
        testSet();
        testInsert();
        testRemove();
    }



    public static void testDLLConstructor(){
        System.out.println("--------- TEST: DLL CONSTRUCTOR ---------");
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();
    }

    public static void testDLLAppend(){
        System.out.println("--------- TEST: DLL APPEND ---------");
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

    }

    public static void testRemoveLast(){
        System.out.println("--------- TEST: DLL REMOVE LAST ---------");
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeLast().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeLast());
    }

    public static void testPreApend(){
        System.out.println("--------- TEST: DLL PRE APPEND ---------");
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(3);

        System.out.println("Before prepend():");
        System.out.println("-----------------");
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

        myDLL.prepend(1);

        System.out.println("\n\nAfter prepend():");
        System.out.println("----------------");
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();
    }

    public static void testRemoveFirst(){
        System.out.println("--------- TEST: DLL REMOVE FIRST ---------");
        DoublyLinkedList myDLL = new DoublyLinkedList(2);
        myDLL.append(1);

        // (2) Items - Returns 2 Node
        System.out.println(myDLL.removeFirst().value);
        // (1) Item - Returns 1 Node
        System.out.println(myDLL.removeFirst().value);
        // (0) Items - Returns null
        System.out.println(myDLL.removeFirst());
    }

    public static void testGet(){
        System.out.println("--------- TEST: DLL GET ---------");
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);


        System.out.println(myDLL.get(3).value);
    }

    public static void testSet(){
        System.out.println("--------- TEST: DLL SET ---------");
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);

        System.out.println("DLL before set():");
        myDLL.printList();

        myDLL.set(2, 99);

        System.out.println("\nDLL after set():");
        myDLL.printList();
    }

    public static void testInsert(){
        System.out.println("--------- TEST: DLL INSERT ---------");
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(3);

        System.out.println("DLL before insert():");
        myDLL.printList();

        myDLL.insert(1, 2);

        System.out.println("\nDLL after insert(2) in middle:");
        myDLL.printList();

        myDLL.insert(0, 0);

        System.out.println("\nDLL after insert(0) at beginning:");
        myDLL.printList();

        myDLL.insert(4, 4);

        System.out.println("\nDLL after insert(4) at end:");
        myDLL.printList();
    }


    public static void testRemove(){
        System.out.println("--------- TEST: DLL REMOVE ---------");
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        System.out.println("DLL before remove():");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() in middle:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(0).value);
        System.out.println("DLL after remove() of first node:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() of last node:");
        myDLL.printList();
    }

}
