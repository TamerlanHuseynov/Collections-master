package LeetCode.maps;

import java.util.*;

public class CheckCharactersHaveEqualNumberOccurrences {
    public static void main(String[] args) {
        String str = "abcdefghijka";
        System.out.println("result: " + areOccurrencesEqual(str));
    }

    /*
     * for (Map.Entry<String,String> entry : map.entrySet())
     *             System.out.println("Key = " + entry.getKey() +
     *                              ", Value = " + entry.getValue());
     *     }
     */

    public static boolean areOccurrencesEqual(String s) {
        if (s == null || s.isEmpty()) return true;
        Map<Character, Integer> map = new HashMap<>();
        for(Character c: s.toCharArray()){
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) +1);
        }
        int count = map.get(s.charAt(0));
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(count != entry.getValue()) return false;
        }
        return true;
    }
}
