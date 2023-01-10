package datastructures.test;

import my.datastructures.*;

import java.util.Arrays;

public class SortingTest {

    public static void main(String [] args) {
        testBubbleSort();
        testSelectionSort();
        testInsertionSort();
        testMerge();
        testMergeSort();
        testPivot();
        testQuickSort();
    }

    private static void testBubbleSort() {
        System.out.println("---- Test: BubbleSort");

        int[] myArray = {4, 2, 6, 5, 1, 3};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(myArray));

        BubbleSort.bubbleSort(myArray);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(myArray));
    }

    private static void testSelectionSort() {
        System.out.println("---- Test: Selection Sort");

        int[] myArray = {4, 2, 6, 5, 1, 3};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(myArray));

        SelectionSort.selectionSort(myArray);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(myArray));
    }

    private static void testInsertionSort() {
        System.out.println("---- Test: Insertion Sort");

        int[] myArray = {4, 2, 6, 5, 1, 3};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(myArray));

        InsertionSort.insertionSort(myArray);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(myArray));
    }

    public static void testMerge(){
        System.out.println("/n ----- Test: Merge -----");
        int[] array1 = {1,3,7,8};
        int[] array2 = {2,4,5,6};

        System.out.println( Arrays.toString( MergeSort.merge(array1, array2) ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8]

         */
    }

    public static void testMergeSort(){
        System.out.println("/n ----- Test: Merge SORT -----");
        int[] originalArray = {3,1,4,2};

        int [] sortedArray = MergeSort.mergeSort(originalArray);

        System.out.println( "\nOriginal Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Original Array: [3, 1, 4, 2]

            Sorted Array: [1, 2, 3, 4]

         */
    }

    public static void testPivot(){
        System.out.println("/n----- Test: Pivot -----");
        int[] myArray = {4,6,1,7,3,2,5};

        int returnedIndex = QuickSort.pivot(myArray, 0, 6);

        System.out.println( "\nReturned Index: " + returnedIndex);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Returned Index: 3
            [2, 1, 3, 4, 6, 7, 5]

         */
    }

    public static void testQuickSort(){
        System.out.println("---- Testing Quick Sort ----");
        int[] myArray = {4,6,1,7,3,2,5};

        QuickSort.quickSort(myArray);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7]

         */
    }


}
