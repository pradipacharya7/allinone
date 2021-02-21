package com.allinone.practice.Algorithms.CrackingCodeInterview;

import java.util.Arrays;

public class CheckIfTwoStringAreAnagram {

    public static void main(String[] args) {
        String string="ram";
        String string1="mar";
        if(sort(string).equals(sort(string1))) System.out.println(true);
        else System.out.println("false");

    }

    private static String sort(String string) {
        char a[]=string.toCharArray();Arrays.sort(a);
        return new String(a);
    }
}
