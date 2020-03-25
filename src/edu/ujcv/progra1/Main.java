package edu.ujcv.progra1;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
     int[] array = new int [100000];
     Random R = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(R.nextInt(1000));
        }



        HeapSort he = new HeapSort();
        he.heapSort(array);
        BubleSort bu = new BubleSort();
        bu.bubleSort(array);
        MergeSort me = new MergeSort();
        me.mergeSort(array);
        QuickSort qu = new QuickSort();
        int n = array.length;
        qu.quicksort(array,0,n-1);



        for (int i = 0; i <array.length ; i++) {

        }

        System.out.println("el quicksort tarda "+ qu.sort(array)+ " milisegundos");
        System.out.println("el heapsort tarda "+ he.sort(array)+ " milisegundos");
        System.out.println("el bubblesort tarda "+ bu.sort(array)+ " milisegundos");
        System.out.println("el mergesort tarda "+ me.sort(array)+ " milisegundos");

        double promedio = qu.sort(array) + he.sort(array) + bu.sort(array) + me.sort(array);
        System.out.println("El promedio de tiempo de los arrays es de: " + " " + promedio);
    }
}
