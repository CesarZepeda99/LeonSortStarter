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
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("----------------------");

    }
    public static void quicksort(int[] array, int izq, int der) {

        // ELEGIR PIVOTE
        int pivote = array[izq];

        // LOS ELEMENTOS > AL PIVOTE VAN A LA DERECHA, LOS < A LA IZQUIERDA
        // VARIABLES AUXILIARES:
        // i PARA LOS ELEMENTOS DE LA IZQUIERDA
        // j PARA LOS ELEMENTOS DE LA DERECHA
        int i = izq;
        int j = der;

        int swap;

        // SE EVALUAN LOS ELEMENTOS PARA UBICAR EL NUEVO PIVOTE
        while(i < j) {
            // MIENTRAS QUE arreglo[i] SEA MENOR O IGUAL AL PIVOTE SE AUMENTA EL VALOR DE i
            // CUANDO NO SE CUMPLE EL WHILE, EL ELEMENTO EN arreglo[i] ES MAYOR AL PIVOTE
            // Y DEBE IR A LA DERECHA
            while(array[i] <= pivote && i < j) {
                i++;
            }
            // MIENTRAS QUE EL arreglo[j] SEA MAYOR AL PIVOTE SE DISMINUYE j
            // CUANDO NO SE CUMPLE EL WHILE EL ELEMENTO EN arreglo[j] ES MENOR O IGUAL AL PIVOTE
            // Y DEBE IR A LA IZQUIERDA
            while(array[j] > pivote) {
                j--;
            }
            // SIEMPRE Y CUANDO i SEA MENOR A j, SE HACE UN CAMBIO DE LOS ELEMENTOS
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
