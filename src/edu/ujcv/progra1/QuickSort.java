package edu.ujcv.progra1;

public class QuickSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        imprimeArreglo(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static void imprimeArreglo(int[] array) {

        for(int i = 0 ; i < array.length ; i++) {

        }

    }
    public static void quicksort(int[] array, int izq, int der) {


        int pivote = array[izq];

        int i = izq;
        int j = der;

        int swap;


        while(i < j) {

            while(array[i] <= pivote && i < j) {
                i++;
            }

            while(array[j] > pivote) {
                j--;
            }

            if(i < j) {
                swap = array[i];
                array[i] = array[j];
                array[j] = swap;

                imprimeArreglo(array);
            }
        }
        array[izq] = array[j];
        array[j] = pivote;

        if(izq < j - 1) {
            quicksort(array, izq, j - 1);
        }
        if(j + 1 < der) {
            quicksort(array, j + 1, der);
        }
    }
}
