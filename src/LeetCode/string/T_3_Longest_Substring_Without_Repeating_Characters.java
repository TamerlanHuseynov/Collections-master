package LeetCode.string;

import java.util.HashSet;
import java.util.Set;

public class T_3_Longest_Substring_Without_Repeating_Characters {
//    https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static void main(String[] args) {
        T_3_Longest_Substring_Without_Repeating_Characters obj = new T_3_Longest_Substring_Without_Repeating_Characters();
        String input = "abcabcbb"; // answer = 3
        System.out.println("Result for "+ input + " is = " + obj.lengthOfLongestSubstring(input));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int max = 0;

        while(end < s.length()) {
            if(!set.contains(s.charAt(end) )) set.add(s.charAt(end++) );
            else set.remove(s.charAt(start++) );
            max = Math.max(set.size(), max);
        }
        return max;
    }
}
