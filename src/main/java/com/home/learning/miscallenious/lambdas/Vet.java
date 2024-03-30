package com.home.learning.miscallenious.lambdas;

import java.util.List;
import java.util.function.BiFunction;

interface Yawn {
    String yawn(double d, List<Integer> time);
}

//class Sloth implements Yawn {
//    public String yawn(double zzz, List<Integer> time) {
//        return "Sleep: " + zzz;
//    }
//}

public class Vet {
    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }

    public static void main(String... unused) {
//        System.out.println(takeNap(new Sloth()));
        BiFunction<Double, List<Integer>, String> f = (a,b) -> "Sleep: " + (double)(b==null ? a : a);
        System.out.println(takeNap((a,b) -> "Sleep: " + (double)(b==null ? a : a)));
//        System.out.println(takeNap(f));
    }
}
