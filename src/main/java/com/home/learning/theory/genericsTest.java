package com.home.learning.theory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class genericsTest {

    static void addSound(List<? super String> list){
        list.add("quack");
    }

    class A {}
    class B extends A {}
    class C extends B {}

    <T> T first(List<? extends T> list) { return list.get(0); }

//    <T> <? extends T> second(List<? extends T> list) { return list.get(0); }

//    <B extends A> B third(List<B> list) { return new B(); }

//    <X> void fifth(List<X super B> list) { }

    public static void main(String[] args)
    {
        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();

//        List<? extends B> list4 = new ArrayList<A>();
        List<? super B> list5 = new ArrayList<A>();
//        List<?> list6 = new ArrayList<? extends A>();

        List<String> strings = new ArrayList<String>();

        strings.add("tweet");

        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);

        List<? super IOException> exceptions = new ArrayList<>();
//        exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());


    }
}
