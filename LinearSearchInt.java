package searchalgorithms;

//linear search for int array file

public class LinearSearchInt extends LinearSearch {
    // class for linear search of int arrays

    public int linear_search_int(int[] my_array, int search_value) {
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == search_value) {
                return i;
            }
        }
        return -1;
    }
}