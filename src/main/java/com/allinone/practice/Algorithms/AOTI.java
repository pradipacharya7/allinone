package com.allinone.practice.Algorithms;

/*
str="12345" return 12345;
 */
public class AOTI {
    public static void main(String[] args) {
        String string= "-s12345";

        int result=aoti(string);
        System.out.println(result);
    }
    public  static int aoti(String s){
        boolean neg=false;
        if(s.charAt(0)=='-') {
            neg = true;
            s=s.substring(1);
        }
        int result=0;
        for(int i=0;i<s.length();i++){
            char character=s.charAt(i);
            if(!Character.isDigit(character)){
                return 0;
            }
            result=result*10+(character-'0');
        }
        if(neg) return -1*result;
        return result;
    }
}
