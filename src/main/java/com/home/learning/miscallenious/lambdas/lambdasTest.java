package com.home.learning.miscallenious.lambdas;

import java.util.function.Predicate;

public class lambdasTest {
    public static void main(String[] arg){
        Predicate<String> m = c -> c.isEmpty();
        Predicate<String> n = c -> c.isEmpty();
    }
}
