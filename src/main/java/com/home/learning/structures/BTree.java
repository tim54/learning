package com.home.learning.structures;

public class BTree<Key extends Comparable<Key>, Value> {

    private static final int M = 4;

    private Node root;
    private int height;
    private int n;

    private static final class Node{
        private int m;
        private Entry[] children = new Entry[M];
        public Node(int k){
            m = k;
        }
    }

    private static class Entry{
        private Comparable key;
        private Object val;
        private Node next;
        public Entry(Comparable key, Object val, Node next){
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    public BTree() { root = new Node(0); }

    public int size() { return n; }

    public boolean isEmpty(){ return size() == 0; }
    public int height(){ return height; }


}
