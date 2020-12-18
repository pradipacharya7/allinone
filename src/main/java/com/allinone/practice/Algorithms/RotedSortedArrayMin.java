package com.allinone.practice.Algorithms;

public class RotedSortedArrayMin {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 8, 9, 1, 2, 3};
        int min = minRotatedSortedArray(a, 0, a.length - 1);
        System.out.println(min);
    }

    public static int minRotatedSortedArray(int[] a, int l, int r) {
        while (l < r) {
            int mid = (r + l) / 2;
            if (a[mid] == a[r])
                r--;
            else if (a[mid] > a[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }

        }
        return a[r];

    }
}
