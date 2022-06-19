package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_409_Longest_Palindrome {
//    https://leetcode.com/problems/longest-palindrome/
    public static void main(String[] args) {
        T_409_Longest_Palindrome obj = new T_409_Longest_Palindrome();
        System.out.printf("A char = %s\n", (int)('A' - 39) );
        System.out.printf("Z char = %s\n", (int)('Z' - 39) );
        System.out.println("-------------------------------------");

        String input1 = "abccccdd"; // Expected = 7;
        String input2 = "adam";
        System.out.printf("Result = %s", obj.longestPalindrome(input2));
    }

    private int longestPalindrome(String s) {
        if(s == null || s.length() == 0) return 0;
        int[] alpha = new int[52];

        for(char c : s.toCharArray()) {
            if(Character.isLowerCase(c)) alpha[c-97]++;
            else alpha[c-39]++;
        }
        System.out.println(Arrays.toString(alpha));

        int count = 0;
        boolean odd = false;
        for(int i : alpha) {
            if(i % 2 == 0) count += i;
            else if(i > 0){
                count += i - 1;
                odd = true;
            }
        }
        return odd ? count + 1 : count;
    }

}
