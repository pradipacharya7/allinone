package com.allinone.practice.Algorithms;

public class PowerOf {
    public static void main(String[] args){

        int b= powerOf(1);
        System.out.println(b);

    }

    public static int powerOf(int n){
        if(n==1) return 0;
        int count =0;
        while(n>1){
            if(n%10!=0){
                return -1;
            }
            count++;
            n=n/10;
        }
        return count;
    }
}
