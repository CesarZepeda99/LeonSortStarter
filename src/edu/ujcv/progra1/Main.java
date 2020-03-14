package edu.ujcv.progra1;

public class Main {

    public static void main(String[] args) {
        int[] elementos = {65,43,32,4,45,56,67,1,2,3,4,5,6,7,8,9,3,8,7,6,5,4,3,3};
        BubleSort s = new BubleSort();
        elementos = s.bubleSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("\n\ntarda "+ s.sort(elementos)+ " milisegundos");
    }
}
