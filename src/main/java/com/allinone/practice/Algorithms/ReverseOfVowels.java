package com.allinone.practice.Algorithms;

import java.util.Arrays;
import java.util.List;

public class ReverseOfVowels {
    public static void main(String[] args) {
        String s="abecoid";
        String result=reverse(s);
        System.out.println(result);
    }
    public static String reverse(String s){
        List<Character> vowels= Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        char a[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j && !vowels.contains(s.charAt(i))){
            i++;
        }
        while(i<j && !vowels.contains(s.charAt(j))){
            j--;
        }
        char temp=a[i];
        a[i++]=a[j];
        a[j--]=temp;
        return new String(a);

    }
}
