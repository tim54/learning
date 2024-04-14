package com.home.learning.solutions.lambdas;

import java.util.function.Predicate;

public class lambdasTest {
    public static void main(String[] arg){
        Predicate<String> m = c -> c.isEmpty();
        Predicate<String> n = c -> c.isEmpty();
    }
}
