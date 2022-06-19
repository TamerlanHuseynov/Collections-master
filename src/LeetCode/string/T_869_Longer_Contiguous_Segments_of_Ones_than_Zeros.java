package LeetCode.string;

public class T_869_Longer_Contiguous_Segments_of_Ones_than_Zeros {
//    https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/
    public static void main(String[] args) {
        T_869_Longer_Contiguous_Segments_of_Ones_than_Zeros obj = new T_869_Longer_Contiguous_Segments_of_Ones_than_Zeros();
        String input1 = "1101";
        String input2 = "111000";
        System.out.println("Result 1 = " + obj.checkZeroOnes(input1));
        System.out.println("Result 2 = " + obj.checkZeroOnes(input2));
    }

    private boolean checkZeroOnes(String s) {
        int zeros = 0;
        int ones = 0;
        char[] input = s.toCharArray();
        int start = 0;
        int end = 0;
        while( end < input.length ) {
            char start_char = input[start];
            char end_char = input[end];
            if(start_char == end_char) end++;
            else{
                if(start_char == '1') ones = Math.max(end - start, ones);
                else zeros = Math.max(end - start, zeros);
                start = end;
            }
        }
        if(input[start] == input[end-1] && end == input.length) {
            if(input[start] == '1') ones = Math.max(end - start, ones);
            else zeros = Math.max(end - start, zeros);
        }
        return ones > zeros;
    }

}
