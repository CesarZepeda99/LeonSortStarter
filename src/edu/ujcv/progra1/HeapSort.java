package edu.ujcv.progra1;
import java.util.PriorityQueue;

public class HeapSort {
    public static int[] heapSort(int[] array, int posicion, int tamaño) {

        int ind1 = 2 * posicion + 1;
        int ind2 = ind1 + 1;

        if (ind1 < tamaño) {

            if (ind2 < tamaño) {
                if (array[ind1] < array[ind2]) {
                    ind1 = ind2;
                }
            }
        }


    }
}




