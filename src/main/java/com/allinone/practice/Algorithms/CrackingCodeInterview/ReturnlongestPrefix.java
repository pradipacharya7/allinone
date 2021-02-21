package com.allinone.practice.Algorithms.CrackingCodeInterview;
/*
strs = ["flower","flow","flight"]
 */
public class ReturnlongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String resuslt=findLongest(strs);
        System.out.println(resuslt);

    }
    public static String findLongest(String[] strs) {
        String first = strs[0];
        int k = 0;
        String prefix = "";
        for (int i = 1; i < strs.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (first.charAt(k) != strs[j].charAt(k)) {
                    return prefix;
                }

            }
            prefix = prefix + first.charAt(k);
            k++;
        }
        return prefix;
    }
}
