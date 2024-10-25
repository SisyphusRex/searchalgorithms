package searchalgorithms.searchclasses;

import java.util.Arrays;

public class Merge {
    // Merge class for integers

    // prevents class from instantiation
    private Merge() {
    }

    public static void mergeSort(Comparable[] inputArray) {
        Comparable[] auxillaryArray = new Comparable[inputArray.length];
        sort(inputArray, auxillaryArray, 0, inputArray.length - 1);
    }

    private static void merge(Comparable[] inputArray, Comparable[] auxillaryArray, int min, int mid, int max) {
        // merge method
        // requisite: subarrays are sorted
        // assert isSorted(inputArray, min, mid);
        // assert isSorted(inputArray, mid + 2, max);

        // copy inputArray to auxillaryArray
        for (int arrayIndex = min; arrayIndex <= max; arrayIndex++) {
            auxillaryArray[arrayIndex] = inputArray[arrayIndex];
        }

        // merge subarrays to inputArray
        int subarrayOneIndex = min;
        int subarrayTwoIndex = mid + 1;
        for (int arrayIndex = min; arrayIndex <= max; arrayIndex++) {
            if (subarrayOneIndex > mid) {
                inputArray[arrayIndex] = auxillaryArray[subarrayTwoIndex++];
            } else if (subarrayTwoIndex > max) {
                inputArray[arrayIndex] = auxillaryArray[subarrayOneIndex++];
            } else if (isLessThan(auxillaryArray[subarrayTwoIndex], auxillaryArray[subarrayOneIndex])) {
                System.out.println(auxillaryArray[subarrayOneIndex]);
                inputArray[arrayIndex] = auxillaryArray[subarrayOneIndex++];
                System.out.println("Changed to:");
                System.out.println(auxillaryArray[subarrayOneIndex]);
                System.out.println();
            } else {
                inputArray[arrayIndex] = auxillaryArray[subarrayOneIndex++];
            }
        }
        // post condition
        // assert isSorted(inputArray, min, max);

    }

    private static void sort(Comparable[] inputArray, Comparable[] auxillaryArray, int min, int max) {
        if (max <= min) {
            return;
        }
        int mid = min + (max - min) / 2;
        sort(inputArray, auxillaryArray, min, mid);
        sort(inputArray, auxillaryArray, mid + 1, max);
        merge(inputArray, auxillaryArray, min, mid, max);
    }

    // is leftcomparable less than rightcomparable
    private static boolean isLessThan(Comparable left, Comparable right) {
        return left.compareTo(right) < 0;
    }

    // check if array is sorted
    private static boolean isSorted(Comparable[] myArray) {
        return isSorted(myArray, 0, myArray.length - 1);
    }

    private static boolean isSorted(Comparable[] myArray, int min, int max) {
        for (int index = min; index < max; index++) {
            if (isLessThan(myArray[index + 1], myArray[index])) {
                return false;
            }
        }
        return true;
    }

}