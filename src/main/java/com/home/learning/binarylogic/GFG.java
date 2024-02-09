package com.home.learning.binarylogic;// Java program to add two binary strings

public class GFG {

    // Function to add two binary strings
    static String add_Binary(String x, String y)
    {

        int num1 = Integer.parseInt(x, 2);
        // converting binary string into integer(decimal
        // number)

        int num2 = Integer.parseInt(y, 2);
        // converting binary string into integer(decimal
        // number)

        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in
        // sum

        String result = Integer.toBinaryString(sum);
        // Converting that resultant decimal into binary
        // string

        return result;
    }

    static String checkConsumers(String x, String y){
        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        return Integer.toBinaryString(num1 | num2);
    }

    static int checkConsumers(int x, int y, int z){
        return x | y | z;
    }
    // Main driver method
    public static void main(String args[])
    {
        String x = "111011111111", y = "100000000";
        // Results: 1011111

        System.out.println(checkConsumers(x, y));
        System.out.println(checkConsumers(3835, 256, 3839));
    }
}