package com.home.learning.structures;

import java.util.NoSuchElementException;

public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node{
        private Key key;
        private Value val;
        private Node right, left;
        private int size;

        public Node(Key key, Value val, int size){
            this.key = key;
            this.val = val;
            this.size = size;
        }
    }

    public BST() { }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        return size(root);
    }

    private int size(Node x){
        if (x == null) return 0;
        else return x.size;
    }

    public boolean contains(Key key){
        if (key == null) throw new NullPointerException("key is Null");
        return get(key) != null;
    }

    public Value get(Key key){
        return get (root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null) return null;

        int cmp = key.compareTo(x.key);

        if (cmp > 0) return get(x.right, key);
        else if (cmp < 0) return get(x.left, key);
        else return x.val;
    }

    public void put(Key key, Value val){
        if (key == null) throw new IllegalArgumentException("Cannot be null");
        if (val == null){
            return;
        }
        root = put(root, key, val);
    }

    private Node put(Node x, Key key, Value val){
        if (x == null) return new Node(key, val,1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0 ) x.left = put(x.left, key, val);
        else if (cmp > 0) x.right = put(x.right, key, val);
        else x.val = val;
        x.size = 1 + size(x.left) + size(x.right);
        return x;
    }
}
