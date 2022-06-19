package LeetCode.MixedTasks;

import java.util.Arrays;

public class FillArray {
    public static void main(String[] args) {
        System.out.println(generateTheString(6));
    }


    public static String generateTheString(int n) {
        char[] result = new char[n];
        Arrays.fill(result,'a');
        if(n%2 == 0)result[0] = 'b';
        return new String(result);
    }
}
