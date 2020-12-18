package com.allinone.practice.Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a={5,4,3,2,10,15,11,13,1};
        for(int i=0;i<a.length;i++)
        {
            int small =i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                   small=j;
                }
            }
            int temp=a[i];
            a[i]=a[small];
            a[small]=temp;

        }
        System.out.println(Arrays.toString(a));

    }
}
