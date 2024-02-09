package com.home.learning.structures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class ArrayList<Item> implements Iterable<Item>{
    private class Node {
        Item item;
        Node next;
    }

    private Node start;
    private Node end;
    int n;

    ArrayList(){
        start = null;
        end = null;
        n = 0;
    }

    ArrayList(ArrayList<Item> arr){
        for (Item item : arr){
            this.add(item);
        }
    }

    public boolean isEmpty () { return n > 0; }

    public int size() { return n; }

    public void add(Item item){
        Node node = new Node();
        node.item = item;

        if (start != null){
            end.next = node;
            end = node;
        } else {
            end = start = node;
        }
    }

    public Iterator<Item> iterator(){
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<Item>{
        Node current = start;

        public boolean hasNext () { return current != null; }

        public void remove() { throw new UnsupportedOperationException(); }

        public Item next(){
            if (!hasNext()){ throw new NoSuchElementException(); }

            Item item = current.item;
            current = current.next;

            return item;
        }
    }

    @Override
    public String toString(){
        Node tmp = start;
        StringBuilder str = new StringBuilder();

        str.append("String is: ");
        while (tmp.next != null){
            str.append("[" + tmp.item + "]");
            tmp = tmp.next;
        }
        str.append("[" + tmp.item + "]");

        return str.toString();
    }

    public void revertList(){
        end = start;
        Node previous = null;
        Node current = end;
        Node tmp = new Node();

        while (current.next != null){
            previous = current;
            current = current.next;

            if (previous == start){
                tmp.next = previous;
                previous.next = null;
            } else {
                previous.next = tmp.next;
                tmp.next = previous;
            }
        }
        current.next = previous;
        start = current;
    }

    public void deleteDups(){
        Node n = start;
        Set<Item> buff = new HashSet<Item>();
        Node prev = null;
        while (n != null){
            if (buff.contains(n.item)){
                prev.next = n.next;
            } else {
                buff.add(n.item);
                prev = n;
            }
            n = n.next;
        }
    }

    public void deleteDups2(){
        Node n = start;
        while (n != null){
            Node runner = n;
            while (runner.next != null){
                if (runner.next.item == n.item){
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            n = n.next;
        }
    }

    public int printkthelem(Node n, int index){
        if (n == null) { return 0; }

        int i = printkthelem(n.next, index) + 1;
        if (i == index){
            System.out.println("Found element: " + n.item);
        }
        return i;
    }

    class myIndex {
        public int index = 0;
    }

    public Node printktolast(Node n, int num){
        myIndex index = new myIndex();

        return printktolast(n, num, index);
    }

    public Node printktolast(Node n, int num, myIndex index){
        if (n.next == null) return null;

        Node node = printktolast(n.next, num, index);
        index.index++;
        if (index.index == num) {
            return node;
        }
        return n;
    }

    public static void main(String[] arg){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("One");
        arr.add("Two");
        arr.add("Two");
        arr.add("Three");

        ArrayList<String> arr2 = new ArrayList<String>(arr);

        System.out.println(arr.isEmpty());
        System.out.println(arr.size());
        System.out.println(arr);

        for (String str : arr){
            System.out.println(str);
        }
        System.out.println(arr2);

        arr.revertList();
        System.out.println(arr);

        // arr.deleteDups();
        arr.deleteDups2();
        System.out.println(arr);

        arr.printkthelem(arr.start, 1);

        ArrayList.Node tmp = arr.printktolast(arr.start, 1);
        System.out.println(tmp.item);
    }
}
