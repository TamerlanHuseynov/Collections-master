package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_561_Array_Partition_I {
    // https://leetcode.com/problems/array-partition-i/
    public static void main(String[] args) {
        T_561_Array_Partition_I obj = new T_561_Array_Partition_I();
        int[] input_1 = {6, 2, 6, 5, 1, 2}; //Expected 9
        int[] input_2 = {1, 4, 3, 2}; //Expected 4
        System.out.printf("Input = %s. Result = %s, expected = %s\n", Arrays.toString(input_1), obj.arrayPairSum(input_1), 9);
        System.out.printf("Input = %s. Result = %s, expected = %s\n", Arrays.toString(input_2), obj.arrayPairSum(input_2), 4);
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length - 1; i += 2) result += Math.min(nums[i], nums[i+1]);
        return result;
    }

}
