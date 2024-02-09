package com.home.learning.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Bag<Item> implements Iterable<Item>{
    private Node<Item> first;
    private int n;

    private static class Node<Item>{
        Item item;
        Node<Item> next;
    }

    Bag(){
        first = null;
        n = 0;
    }

    public int size(){ return n; }

    public boolean isEmpty(){ return first == null; }

    public void add(Item item){
        Node<Item> oldFirst = first;
        first = new Node<Item>();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    public Iterator<Item> iterator(){
        return new ListIterator<Item>(first);
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first){
            current = first;
        }

        public boolean hasNext(){ return current != null; }
        public void delete(){ throw new UnsupportedOperationException(); }

        public Item next(){
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }



}
