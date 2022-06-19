package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_283_Move_Zeroes {
//    https://leetcode.com/problems/move-zeroes/
    public static void main(String[] args) {
        T_283_Move_Zeroes obj = new T_283_Move_Zeroes();
        int[] input = {0, 0, 0, 1, 2, 3, 3, 4, 14, 0, 0, 1, 2, 0, 0, 12, 22};
        obj.moveZeroes(input);
        System.out.println(Arrays.toString(input));
    }

    private void moveZeroes(int[] nums) {
        int start = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            }
        }
    }

}
