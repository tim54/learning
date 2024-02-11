package com.home.learning.solutions.strings;

public class checkUnique {

    public boolean checkUniquenessNotSureWorking(String s1) {
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

    public boolean checkUniq(String s1) {
        int n = s1.length();

        if (n > 128){
            return false;
        }

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < n; i++){
            if (char_set[s1.charAt(i)]) return false;
            char_set[s1.charAt(i)] = true;
        }

        return true;
    }

    public boolean checkUniq2(String s1) {
        int n = s1.length();

        if (n > 26){
            return false;
        }

        int checker = 0;
        for (int i = 0; i < n; i++){
            int val = s1.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }

        return true;
    }

    public static void main(String args[]){
        return;
    }
}
