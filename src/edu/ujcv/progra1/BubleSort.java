package edu.ujcv.progra1;

public class BubleSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        bubleSort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public static int[] bubleSort(int[] a){
        public void burbuja (int [] array){
            int res;
            boolean cam = false;
            while (true) {// cambios
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        res = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = res;
                        cam = true;

                    }
                }
            }
        }}}


