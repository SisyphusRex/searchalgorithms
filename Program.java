package searchalgorithms;

import java.util.Arrays;
import searchclasses.*;
//main program file

public class Program {
    // put main program here
    private int[] int_array = { 43, 12, 65, 23, 24, 8, 2, 3, 4, 1 };
    private int[] int_array2 = { 35, 5, 16, 77, 97, 95, 40, 20, 6, 11 };

    public void run() {
        BubbleSortInt my_BubbleSortInt = new BubbleSortInt();
        int[] sorted_array = my_BubbleSortInt.bubble_sort_int(int_array);
        System.out.println("BubbleSorted:");
        System.out.println(Arrays.toString(sorted_array));
        System.out.println();

        LinearSearchInt my_LinearSearchInt = new LinearSearchInt();
        int search_value = 23;
        int index = my_LinearSearchInt.linear_search_int(int_array, search_value);
        if (index >= 0) {
            System.out.println("LinearSearched:");
            System.out.println(String.format("Index: %d", index));
            System.out.println();
        }

        ParallelSumInt my_ParallelSumInt = new ParallelSumInt();
        index = 3;
        int sum = my_ParallelSumInt.parallel_sum_int_arrays(int_array, int_array2, index);
        System.out.println("ParallelSum:");
        System.out.println(String.format("Sum: %d", sum));
        System.out.println();

        BinarySearchInt my_BinarySearchInt = new BinarySearchInt();
        index = my_BinarySearchInt.binary_search_int_array(int_array, search_value);
        if (index >= 0) {
            System.out.println("BinarySearched:");
            System.out.println(String.format("Index: %d", index));
            System.out.println();
        }

    }
}
