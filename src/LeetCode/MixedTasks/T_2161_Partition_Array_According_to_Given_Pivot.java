package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_2161_Partition_Array_According_to_Given_Pivot {
    // https://leetcode.com/problems/partition-array-according-to-given-pivot/
    public static void main(String[] args) {
        T_2161_Partition_Array_According_to_Given_Pivot obj = new T_2161_Partition_Array_According_to_Given_Pivot();
        int[] input = {9,12,5,10,14,3,10};
        int[] expected = {9,5,3,10,10,12,14};
        int pivot = 10;
        int[] result = obj.pivotArray(input, pivot);
        System.out.println("Result is " + (obj.validate(input, expected,result) ? "correct!" : "wrong!") );
    }

    public int[] pivotArray(int[] nums, int pivot) {
        /*
        [9,12,5,10,14,3,10]
                ^       ^
        [9, 5, 3]  10, 10 [12, 14]
        */
        int[] result = new int[nums.length];
        int how_many_pivots = 0;
        int count_of_less = 0;

        for (int num : nums) {
            if (num == pivot) how_many_pivots++;
            else if (num < pivot) count_of_less++;
        }

        int index_of_pivot = count_of_less;
        int end = index_of_pivot + how_many_pivots;
        int start = 0;

        for (int num : nums) {
            if (num < pivot) result[start++] = num;
            else if (num == pivot) result[index_of_pivot++] = num;
            else result[end++] = num;
        }
        return result;
    }

    private boolean validate(int[] input, int[] expected, int[] result) {
        System.out.println("Input    = " + Arrays.toString(input));
        System.out.println("Expected = " + Arrays.toString(expected));
        System.out.println("Actual   = " + Arrays.toString(result));
        return Arrays.equals(expected, result);
    }
}
