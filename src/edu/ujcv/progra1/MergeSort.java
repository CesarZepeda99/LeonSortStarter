package edu.ujcv.progra1;

public class MergeSort  implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        mergeSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] mergeSort(int[] array) {
        if(array.length <= 1) {
            return array;
        }
        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right;

        if(array.length % 2 == 0) {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1];
        }
        for(int i=0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for(int j=0; j < right.length; j++) {
            right[j] = array[midpoint+j];
        }
        int[] result = new int[array.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);
        return result;
    }



}
