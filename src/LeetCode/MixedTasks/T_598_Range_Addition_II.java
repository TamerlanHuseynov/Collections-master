package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_598_Range_Addition_II {
//    https://leetcode.com/problems/range-addition-ii/
    public static void main(String[] args) {
        T_598_Range_Addition_II obj = new T_598_Range_Addition_II();
        int m = 3, n = 3;
        int[][] operations = {{2,2},{3,3}};
        System.out.println("Result = " + obj.maxCount(m, n, operations));

    }

    private int maxCount(int m, int n, int[][] ops) {
        int min_m = m;
        int min_n = n;
        for(int[] ints: ops) {
            if(ints[0] < min_m) min_m = ints[0];
            if(ints[1] < min_n) min_n = ints[1];
        }
        return min_m * min_n;
    }
}
