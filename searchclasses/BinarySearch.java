package searchalgorithms.searchclasses;

//binary search file

public class BinarySearch {
    // binary search parent class
    public int binary_search(int[] my_array, int search_value) {
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

    public float binary_search(float[] my_array, float search_value) {
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