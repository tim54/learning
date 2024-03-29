package com.home.learning.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayBag<Item> implements Iterable<Item> {
    private static int CAPACITY = 4;

    private int n;
    private Item a[];

    public ArrayBag(){
        n = 0;
        a =  (Item[]) new Object[2];
    }

    public int size(){
        return n;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    private void resize(int capacity){
        assert capacity >= n;
        Item[] temp = (Item []) new Object[CAPACITY];
        for (int i = 0; i < n; i++){
            temp[i] = a[i];
        }
        a = temp;
    }

    public void add(Item item){
        if (n == a.length) resize(2 * a.length);
        a[n++] = item;
    }

    public Iterator<Item> iterator() {
        return new arrayBagIterator();
    }

    private class arrayBagIterator implements Iterator<Item>{
        private int num = 0;

        public boolean hasNext() { return num < n; }

        public void remove() { throw new UnsupportedOperationException(); }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            return a[num++];
        }
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();

        str.append("String is: ");
        for (int i = 0; i < a.length; i++){
            str.append(a[i] + " : ");
        }
        return str.toString();
    }
}
