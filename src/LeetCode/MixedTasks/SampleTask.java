package LeetCode.MixedTasks;

import java.util.*;

public class SampleTask {

    public static void main(String[] args) {

        String pew = "let us count how many of each letter do we have here";
        String s = pew.replaceAll("\\ ", "");
        System.out.println(s);

        Map<Character, Integer> map = new TreeMap<>();

        for (char c: s.toCharArray()){
            if(map.containsKey(c)) map.put(c, map.get(c)+1);
            else map.put(c,1);
        }
        System.out.println(map);

        int[] arr = new int[26]; //<--- 27 characters in english alphabet

        for (int i = 0; i< s.length(); i++){   // a-97 b-98 c-99 d-100 e-101
            arr[s.charAt(i)-'a']++;            //  0    1    2     3    4
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("letter " + (char)(i+97) + ", count = " + arr[i]);
        }

    }

}
