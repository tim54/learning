package com.home.learning.solutions.strings;

public class checkUnique {

    public boolean checkUniqueness(String s1) {
        char[] chars = new char[128];

        for (int i = 0; i < 128; i++){
            chars[i] = 0;
        }

        for (int i = 0; i < s1.length(); i++){
            if (chars[i] == 0) {
                chars[i] = s1.charAt(i);
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        return;
    }
}
