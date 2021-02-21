package com.allinone.practice.Algorithms;

public class Fibo {
    static int[] memo=new int[20];
    public static void main(String[] args) {
        for(int i=0;i<=4;i++){
            System.out.print(fibo(i)+" ");
        }
    }

    private static int fibo(int n) {
        if(n==0){
            memo[0]=0;
            return memo[0];
        }
        if(n==1){
            memo[1]=1;
            return memo[1];
        }
        if(n>1 & memo[n]!=0){
            return memo[n];
        }
        else {
            int res=fibo(n-1)+fibo(n-2);
            memo[n]=res;
            return memo[n];
        }


    }
}
