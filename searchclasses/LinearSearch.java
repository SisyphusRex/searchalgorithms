package searchalgorithms.searchclasses;

//linear search file

public class LinearSearch {
    // linear search class

    // here we use method overloading to account for different array data types
    public int linear_search(int[] my_array, int search_value) {
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == search_value) {
                return i;
            }
        }
        return -1;
    }

    public int linear_search(float[] my_array, float search_value) {
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == search_value) {
                return i;
            }
        }
        return -1;
    }
}