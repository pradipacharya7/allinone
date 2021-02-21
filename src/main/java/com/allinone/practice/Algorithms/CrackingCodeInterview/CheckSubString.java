package com.allinone.practice.Algorithms.CrackingCodeInterview;

public class CheckSubString {
    public static void main(String[] args) {
        String str="pineapple";
        String str2="pplepinea";
        System.out.println(isRotation(str,str2));
    }
    private static boolean isRotation(String str, String str2) {
        if(str.length()==str2.length()){
            return isSubString(str+str,str2);
        }
        return false;
    }

    private static boolean isSubString(String s, String str2) {
        return (s.contains(str2));
    }
}
