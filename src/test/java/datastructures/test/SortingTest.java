package datastructures.test;

import my.datastructures.BubbleSort;
import my.datastructures.SelectionSort;

import java.util.Arrays;

public class SortingTest {

    public static void main(String [] args) {
        testBubbleSort();
        testSelectionSort();

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

        SelectionSort.selectionSort(myArray);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(myArray));
    }

}
