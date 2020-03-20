package edu.ujcv.progra1;
import java.util.PriorityQueue;

public class HeapSort implements SortTester{

    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        heapSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            ordenar(array, n, i);


        for (int i = n - 1; i >= 0; i--) {
            int tamaño = array[0];
            array[0] = array[i];
            array[i] = tamaño;

            ordenar(array, i, 0);
        }
    }

    public static void ordenar(int array[], int n, int i) {
        int ind1 = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && array[l] > array[ind1])
            ind1 = l;

        if (r < n && array[r] > array[ind1])
            ind1 = r;

        if (ind1 != i) {
            int ind2 = array[i];
            array[i] = array[ind1];
            array[ind1] = ind2;

            ordenar(array, n, ind1);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}



