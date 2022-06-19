package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_942_DI_String_Match {
    // https://leetcode.com/problems/di-string-match/
    public static void main(String[] args) {
        T_942_DI_String_Match obj = new T_942_DI_String_Match();
        String s = "IDID"; // Expected [0,4,1,3,2]
        System.out.printf("Result = %s", Arrays.toString(obj.diStringMatch(s)));
    }

    private int[] diStringMatch(String s) {
        int len = s.length();
        int[] result = new int[len + 1];
        int low = 0;
        int high = len;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == 'I') result[i]=low++;
            else result[i] = high--;
        }
        result[len] = high;
        return result;
    }
}
