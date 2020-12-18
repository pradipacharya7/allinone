package com.allinone.practice.Algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={5,7,1,2,8,9,12};
        int[] b=insortionSort(a);
        System.out.println(Arrays.toString(b));
    }
    public static int[] insortionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int k=i;
            int temp=a[i];

            while( k>0 && temp<a[k-1]){
                a[k]=a[k-1];
                k--;
            }
            a[k]=temp;
        }
        return a;
    }
}
