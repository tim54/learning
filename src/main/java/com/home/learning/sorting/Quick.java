package com.home.learning.sorting;

public class Quick {

    private Quick() { }

    public static void sort(Comparable a[]){
        int n = a.length;
        sort(a, 0, n - 1);
    }

    public static void sort(Comparable[] a, int lo, int hi){
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
    }

    public static int partition(Comparable[] a, int hi, int lo){

    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = a[i];
    }
}
