package com.home.learning;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map m1 = new HashMap();
        m1.put(123, "123");
        m1.put("abc", "def");

        System.out.println(m1.containsKey("123"));
        System.out.println(m1.containsKey("abc"));

    }
}
