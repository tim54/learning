package com.home.learning.solutions;

public class PermutationInString {
    
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

    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";

        checkInclusion(s1, s2);
    }
}
