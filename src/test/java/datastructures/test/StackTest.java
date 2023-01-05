package datastructures.test;

import my.datastructures.Stack;

public class StackTest {

    public static void main(String[] args) {
        testConstructor();
        testPush();
        testPop();
    }

    public static void testConstructor(){
        System.out.println("----- TEST: CONSTRUCTOR -----");
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();
    }

    public static void testPush(){
        System.out.println("----- TEST: Push -----");
        Stack myStack = new Stack(2);

        System.out.println("Before push():");
        System.out.println("--------------");
        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();

        myStack.push(1);

        System.out.println("\n\nAfter push():");
        System.out.println("-------------");
        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();

    }

    public static void testPop(){
        System.out.println("----- TEST: POP -----");
        Stack myStack = new Stack(2);
        myStack.push(1);

        // (2) Items - Returns 1 Node
        System.out.println(myStack.pop().value);
        // (1) Item - Returns 2 Node
        System.out.println(myStack.pop().value);
        // (0) Items - Returns null
        System.out.println(myStack.pop());
    }


}
