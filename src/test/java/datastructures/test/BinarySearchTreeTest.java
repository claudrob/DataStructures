package datastructures.test;

import my.datastructures.BinarySearchTree;

public class BinarySearchTreeTest {

    public static void main(String[] args) {
        testConstructor();
        testInsert();
        testContains();
    }

    private static void testConstructor(){
        System.out.println("----- TEST: CONSTRUCTOR -----");
        BinarySearchTree myBST = new BinarySearchTree();


        // ROOT MUST BE PUBLIC FOR THIS LINE TO WORK
        System.out.println("Root: " + myBST.root);

    }

    public static void testInsert(){

        System.out.println("----- TEST: INSERT -----");
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */



        // ROOT MUST BE PUBLIC FOR THESE LINES TO WORK
        System.out.println("Root: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */

    }

    public static void testContains() {
        System.out.println("----- TEST: CONTAINS -----");


        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);


        System.out.println("BST Contains 27:");
        System.out.println(myBST.contains(27));

        System.out.println("\nBST Contains 17:");
        System.out.println(myBST.contains(17));


        /*
            EXPECTED OUTPUT:
            ----------------
            BST Contains 27:
            true

            BST Contains 17:
            false

        */
    }
}
