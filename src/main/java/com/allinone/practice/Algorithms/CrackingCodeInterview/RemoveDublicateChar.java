package com.allinone.practice.Algorithms.CrackingCodeInterview;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDublicateChar {
    public static void main(String[] args) {
        String string="papapa";
        String str=removeDublicate(string);
        System.out.println(str);
    }

    private static String removeDublicate(String string) {

     HashSet<Character> set=new HashSet<>();
        for(int i=1;i<string.length();i++){
            set.add(string.charAt(i));
        }
        String str=set.stream().map(String::valueOf).collect(Collectors.joining());
    return str;
    }
}
