package com.home.learning.structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<Item> implements Iterable<Item>{

    private Node<Item> first;
    private Node<Item> last;
    private int n;

    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }

    public Queue(){
        first = null;
        last = null;
        n = 0;
    }

    public boolean isEmpty(){ return first == null; }

    public int size() { return n; }

    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("");
        return first.item;
    }

    public void enqueue(Item item){
        Node<Item> oldLast = last;
        last = new Node<Item>();

        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldLast.next = last;
        n++;
    }

    public Item dequeue(){
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;
        return item;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();

        for (Item item : this){
            s.append(item + " ");
        }
        return s.toString();
    }

    public Iterator<Item> iterator() { return new ListIterator<Item>(first); }

    private class ListIterator<Item> implements Iterator<Item>{
        Node<Item> current;

        public ListIterator(Node<Item> first) { current = first; }

        public boolean hasNext() { return current != null; }
        public void remove() { throw new UnsupportedOperationException(); }

        public Item next(){
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;

            return item;
        }
    }

}
