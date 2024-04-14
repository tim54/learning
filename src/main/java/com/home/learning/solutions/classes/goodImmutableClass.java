package com.home.learning.solutions.classes;

import java.util.ArrayList;
import java.util.List;

public final class goodImmutableClass {
    private final List<String> internalList;

    public goodImmutableClass(){
        this.internalList = new ArrayList<String>();
        this.internalList.add("Apple");
    }

    public int getSize(){
        return internalList.size();
    }
    
    public String getIndex(int i){
        return internalList.get(i);
    }
}
