package com.allinone.practice.Algorithms;

import java.util.Arrays;

public class MergeAndSortTwoArrays {
    public static void main(String[] args) {
        int a[]={1,2,7,9,10};
        int b[]={11,22,34,55,67};
        int c[]=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            } else c[k++]=a[j++];
        }
        while(i<a.length && k<c.length){
            c[k++]=a[i++];
        }
        while(j<b.length && k<c.length){
            c[k++]=b[j++];
        }
        System.out.println(Arrays.toString(c));
        if((c.length+1)%2==0) System.out.println("Median is::"+c[(c.length+1)/2]);
        else {
            int pos =(c.length+1)/2;
            double median= (double) (c[pos-1]+c[pos])/2;
            System.out.println("Median is " +median);

        }


    }
}
