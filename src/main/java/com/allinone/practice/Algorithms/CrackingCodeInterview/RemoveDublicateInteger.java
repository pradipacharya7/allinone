package com.allinone.practice.Algorithms.CrackingCodeInterview;

import java.util.Arrays;

public class RemoveDublicateInteger {
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,4,5,6,6};
        Arrays.sort(a);
        int k=0;
        for (int i=0;i<a.length-1;i++){
            int j=i+1;
            if(a[i]!=a[j] ){
                a[k++]=a[i];
            }
        }
        if(a[k]!=a[a.length-1]) a[k++]=a[a.length-1];
        System.out.println(Arrays.toString(a));
    }
}
