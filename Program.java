package searchalgorithms;

import java.util.Arrays;
import searchalgorithms.searchclasses.*;
//main program file

public class Program {
    // put main program here
    private int[] int_array = { 43, 12, 65, 23, 24, 8, 2, 3, 4, 1 };
    private int[] int_array2 = { 35, 5, 16, 77, 97, 95, 40, 20, 6, 11 };
    private Integer[] integerArray = { 45, 88, 4, 2, 34, 8, 77, 99, 98, 101, 66 };

    public void run() {
        BubbleSort my_BubbleSort = new BubbleSort();
        my_BubbleSort.bubble_sort(int_array);
        System.out.println("BubbleSorted:");
        System.out.println(Arrays.toString(int_array));
        System.out.println();

        LinearSearch my_LinearSearch = new LinearSearch();
        int search_value = 23;
        int index = my_LinearSearch.linear_search(int_array, search_value);
        if (index >= 0) {
            System.out.println("LinearSearched:");
            System.out.println(String.format("Index: %d", index));
            System.out.println();
        }

        ParallelSum my_ParallelSum = new ParallelSum();
        index = 3;
        int sum = my_ParallelSum.parallel_sum(int_array, int_array2, index);
        System.out.println("ParallelSum:");
        System.out.println(String.format("Sum: %d", sum));
        System.out.println();

        BinarySearch my_BinarySearch = new BinarySearch();
        index = my_BinarySearch.binary_search(int_array, search_value);
        if (index >= 0) {
            System.out.println("BinarySearched:");
            System.out.println(String.format("Index: %d", index));
            System.out.println();
        }

        Merge.sort(integerArray);
        System.out.println("MergeSorted: ");
        System.out.println(Arrays.toString(integerArray));
        System.out.println();

    }
}
