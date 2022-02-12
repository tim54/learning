package com.home.learning.solutions;

public class PermutationInString {

    private static int line = 1;
    
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) return true;

        char p[] = s1.toCharArray();

        if (s1.length() == s2.length()){
            for (int i = 0; i < s1.length(); i++){
                char ch = s1.charAt(i);
                System.out.println("Char is: " + ch);
            }
        }

        return true;
    }

    public static void printReplacing(String s1){
        char p[] = s1.toCharArray();
        printArr(p);
        for (int i = 0; (i < p.length - 1) && line < p.length * 2; i++) {
            for (int j = i; j < p.length - 1; j++) {
                char tmp = p[i];
                p[i] = p[i + 1];
                p[i + 1] = tmp;
                printArr(p);
                i = 0;
            }
        }
    }

    public static void printArr(char[] p){
        System.out.print(line++ + ": ");
        for (int i = 0; i < p.length; i++){

            System.out.print(p[i] + " ");
        }
        System.out.println();
    }

    /*public static void swap(char ch1, char ch2){
        char tmp = ch1;
        ch1 = ch2;
        ch2 = tmp;
    }*/

    public static void main(String[] args){
        String s1 = "ab";
        // String s2 = "asdsjjfgbasddsfd";
        String s2 = "abc";


        //checkInclusion(s1, s2);
        // printReplacing(s2);
    }
}
