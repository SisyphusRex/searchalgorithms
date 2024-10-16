package searchalgorithms;

//Binary search for int array file

public class BinarySearchInt extends BinarySearch {
    // Binary search int class

    public int binary_search_int_array(int[] my_array, int search_value) {
        // method for binary search in int array
        int min = 0;
        int max = my_array.length - 1;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (my_array[mid] == search_value) {
                return mid;
            }
            if (my_array[mid] > search_value) {
                max = mid;
            }
            if (my_array[mid] < search_value) {
                min = mid;
            }
        }
        return -1;
    }
}