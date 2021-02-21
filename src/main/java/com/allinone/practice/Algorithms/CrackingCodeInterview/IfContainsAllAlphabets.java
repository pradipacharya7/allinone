package com.allinone.practice.Algorithms.CrackingCodeInterview;

import java.util.HashMap;
import java.util.HashSet;

public class IfContainsAllAlphabets {
    public static void main(String[] args) {
        String str="The quick brown fox jumps over the lazy dog111";
        HashSet<Character> map=new HashSet<>();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            Character c=str.charAt(i);
            if(c!=' ' && !Character.isDigit(c))
            map.add(str.charAt(i));
        }
        System.out.println(map.size());
        for(Character c:map) System.out.println(c+" ");
        if(map.size()==26) System.out.println("true");
        else System.out.println("false");
    }
}
