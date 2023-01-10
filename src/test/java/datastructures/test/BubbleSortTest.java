package datastructures.test;

import my.datastructures.BubbleSort;

import java.util.Arrays;

public class BubbleSortTest {

    public static void main(String [] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(myArray));

        BubbleSort.bubbleSort(myArray);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(myArray));

    }
}
