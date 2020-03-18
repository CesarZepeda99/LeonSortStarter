package edu.ujcv.progra1;

public class QuickSort implements SortTester {
    public long sort(int[] array) {
        long start = System.nanoTime();
        quicksort(array);

        long end = System.nanoTime();

        return end - start;
    }

    public int[] quicksort(int num[]) {
        return quicksort(num,0,num.length - 1);
    }

    public int[] quicksort(int num[], int izq, int der) {
        if (izq >= der)
            return num;
        int i = izq, d = der;
        if (izq != der) {
            int pivote;
            int aux;
            pivote = izq;
            while (izq != der) {

                while (num[izq] < num[pivote] && izq < der)
                    der--;
                while (num[izq] < num[pivote] && izq < der)
                    izq++;

                if (der != izq) {
                    aux = num[der];
                    num[der] = num[izq];
                    num[izq] = aux;
                }
            }
            if (izq == der) {
                quicksort(num, i, izq - 1);
                quicksort(num, izq + 1, d);
            }
        } else
            return num;
        return num;
    }
}
