package LeetCode.string;

public class T_392_Is_Subsequence {
//    https://leetcode.com/problems/is-subsequence/
    public static void main(String[] args) {
        T_392_Is_Subsequence obj = new T_392_Is_Subsequence();

        String input = "ahbgdc";
        String sub = "abc";

        System.out.println("Result = " + obj.isSubsequence(sub, input));


    }

    private boolean isSubsequence(String substr, String in) {
        char[] sub = substr.toCharArray();
        char[] input = in.toCharArray();
        int input_pointer = 0;
        int sub_pointer = 0;
        while(input_pointer < input.length && sub_pointer < sub.length) {
            char sub_char = sub[sub_pointer];
            char input_char = input[input_pointer];
            if(sub_char == input_char) {
                sub_pointer++;
                input_pointer++;
            }
            else input_pointer++;
        }
        return sub_pointer == sub.length;
    }

}
