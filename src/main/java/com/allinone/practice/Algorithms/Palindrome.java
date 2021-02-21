package com.allinone.practice.Algorithms;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("mom"));
        String s="hari";
        System.out.println(s.substring(1,3));
    }

    private static boolean isPalindrome(String s) {
        String temp=s.toLowerCase();
        if(s==null||s.length()==1) return false;
        String rev=reverse(temp);
        if(rev.equals(temp)) return true;
        return  false;


    }

    private static String reverse(String s) {
        if(s.isEmpty()) return s;
        return (s.substring(s.length()-1)+reverse(s.substring(0,s.length()-1)));
    }

    public static boolean isPalindromeFinal(String s){

        if(s==null) return false;
        if(s.length()==1) return true;
        int i=0; int j=s.length()-1;
        while(i<=j){
            char char1=s.charAt(i);
            char char2=s.charAt(j);
            if(char1<'a' && char1>'z') i++;
            if(char2<'a' && char1>'z') j--;

            if(char1!=char2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
