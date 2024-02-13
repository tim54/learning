package com.home.learning.sorting;

import java.util.Comparator;

public class Insertion {

    private Insertion() { }

    public static void sort(Comparable[] a){
        int n = a.length;

        for (int i = 0; i < n; i++){
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
                System.out.println();
                exch(a, j, j-1);
            }
        }
    }

    public static void sort(Object[] a, Comparator comparator){
        int n = a.length;

        for (int i = 0; i < n; i++){
            for (int j = i; j > 0 && less(a[j], a[j - 1], comparator); j--){
                exch(a, j, j-1);
            }
        }
    }

    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    private static boolean less(Object v, Object w, Comparator comporator){
        return comporator.compare(v, w) < 0;
    }

    private static void exch(Object[] a, int i, int j){
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
