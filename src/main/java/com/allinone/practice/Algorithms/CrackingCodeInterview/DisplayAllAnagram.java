package com.allinone.practice.Algorithms.CrackingCodeInterview;

import java.util.*;

public class DisplayAllAnagram {
    public static void main(String[] args) {
        List<String> words=new ArrayList<String>();
        words.add("Rat");
        words.add("Car");
        words.add("Below");
        words.add("Tast");
        words.add("Cried");
        words.add("Study");
        words.add("Thing");
        words.add("Chin");
        words.add("Grab");
        words.add("Act");
        words.add("Robed");
        words.add("Vase");
        words.add("Glean");
        words.add("Desserts");
        words.add("Tar");
        words.add("Arc");
        words.add("Elbow");
        words.add("State");
        words.add("Cider");
        words.add("Dusty");
        words.add("Night");
        words.add("Inch");
        words.add("Brag");
        words.add("Cat");
        words.add("Bored");
        words.add("Save");
        words.add("Angel");
        words.add("Streseed");

        HashMap<String, List<String>> map=new HashMap<>();
        List<List<String>> result=new ArrayList<>();

        for(int i=0;i<words.size();i++){
            String str=words.get(i);
            str=str.toLowerCase();
            char a[]=str.toCharArray();
            Arrays.sort(a);
            str=new String(a);
            if(!map.containsKey(str)){
                List<String> list1=new ArrayList<>();
                list1.add(words.get(i));
                map.put(str,list1);
            }
            else {
                List<String> list2=map.get(str);
                list2.add(words.get(i));
                map.put(str,list2);
            }
        }

        for (Map.Entry<String,List<String>> val:map.entrySet()){
            result.add(val.getValue());
        }
        System.out.println(result);

    }
}
