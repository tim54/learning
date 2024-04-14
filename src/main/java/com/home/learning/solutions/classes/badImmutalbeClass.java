package com.home.learning.solutions.classes;

import java.util.ArrayList;
import java.util.List;

public final class badImmutalbeClass {
    private final ArrayList<String> someList;

    public badImmutalbeClass(){
        this.someList = new ArrayList<String>();
        someList.add("Apple");
    }

    public List<String> getFavoriteFood(){
        return someList;
    }

    public static void main(String ...args){
        var newBadClass = new badImmutalbeClass();
        System.out.println(newBadClass.getFavoriteFood());

        newBadClass.getFavoriteFood().clear();
        newBadClass.getFavoriteFood().add("Something bad");
        System.out.println(newBadClass.getFavoriteFood());
    }
}
