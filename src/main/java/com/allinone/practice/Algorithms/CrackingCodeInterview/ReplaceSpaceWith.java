package com.allinone.practice.Algorithms.CrackingCodeInterview;

public class ReplaceSpaceWith {
    public static void main(String[] args) {
        String str="This is america.";
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                stringBuilder.append("%20");
            }
            else stringBuilder.append(str.charAt(i));
        }

        System.out.println(stringBuilder.toString());
    }
}
