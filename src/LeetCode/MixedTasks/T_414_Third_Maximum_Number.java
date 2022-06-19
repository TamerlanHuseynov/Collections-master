package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_414_Third_Maximum_Number {
//    https://leetcode.com/problems/third-maximum-number/
    public static void main(String[] args) {
        T_414_Third_Maximum_Number obj = new T_414_Third_Maximum_Number();
        int[] input = {2,2,3,1}; // Expected 1
        System.out.printf("3rd maximum num is = %s", obj.thirdMax(input));

    }

    private int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int third = nums[nums.length-1];
        int count = 1;
        for(int i = nums.length -1; i >= 0 ; i--) {
            if(third > nums[i]) {
                count++;
                third = nums[i];
                if(count == 3) break;
            }
        }
        return count == 3 ? third : nums[nums.length-1];
    }

}
