package com.allinone.practice.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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


            String s1="pradip";
            String s2=s1.intern();
            s2="pradip acharya";
            System.out.println(s1);
            System.out.println(s2);

            List<String> list=new ArrayList<>();
            list.add("ram");

            Iterator it=list.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }

        }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

