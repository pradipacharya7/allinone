package com.allinone.practice.Algorithms.CrackingCodeInterview;

import java.util.HashSet;

public class IfAllUniqueChars {
    public static void main(String[] args) {
        String s="abcde";

       boolean result=checkIfunique(s);
        System.out.println(result);
    }
    public static boolean checkIfunique(String s) {
        boolean[] characters=new boolean[s.length()];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i)) && characters[s.charAt(i)-'a']){
                return false;
            }
            characters[s.charAt(i)-'a']=true;
        }
        return true;
//        s=s.toLowerCase();
//        HashSet<Character> set = new HashSet<>();
//        for (int i = 0; i < s.length(); i++) {
//            if(Character.isAlphabetic(s.charAt(i)) && set.contains(s.charAt(i))) {
//                return false;
//            }
//            set.add(s.charAt(i));
//        }
//        return true;

    }
}
