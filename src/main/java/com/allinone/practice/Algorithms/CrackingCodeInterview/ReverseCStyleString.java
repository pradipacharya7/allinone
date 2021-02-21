package com.allinone.practice.Algorithms.CrackingCodeInterview;

public class ReverseCStyleString {
    public static void main(String[] args) {
        String s="pradip";
        String rev=reverse(s);
        System.out.println(rev.length());
        System.out.println(s.equals(rev)
        );
        System.out.println(rev);
    }
    public  static String reverse(String s){
//        if(s.isEmpty()) return "";
//       return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
        int j=s.length()-1;
        char[] a=s.toCharArray();
        for (int i=0;i<a.length/2;i++){
            char c= a[i];
                a[i] = a[j];
                a[j--] = c;
        }
        return new String(a);
    }
}
