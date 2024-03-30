package com.home.learning.sorting;

import java.util.Comparator;

public class Selection {

    public Selection() { }

    public void sort(Comparable[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    public void sort(Object[] a, Comparator comparator){
        int n = a.length;
        for (int i = 0; i < n; i++){
            int min = i;
            for (int j = i + 1; j < n; j++){
                if (less(comparator, a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    private boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private boolean less(Comparator comporator, Object a, Object b){
        return comporator.compare(a,b) < 0;
    }

    private void exch(Object[] a, int i, int j){
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
