package com.home.learning.structures;

import java.util.NoSuchElementException;

public class Queue<Item> {

    Node<Item> first;
    Node<Item> last;
    int n;

    private static class Node<Item>{
        Item item;
        Node<Item> next;
    }

    public Queue(){
        first = null;
        last = null;
        n = 0;
    }

    public boolean isEmpty(){ return first == null; }

    public int size() { return n; }

    public Item peek() { return last.item; }

    public void enqueue(Item item){
        Node<Item> oldLast = last;
        last = new Node<>();

        last.item = item;
        last.next = null;
        oldLast.next = last;
    }

    public Item dequeue(){
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        Item item = first.item;

        first = first.next;

        return item;
    }

}
