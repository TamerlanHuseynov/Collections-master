package LeetCode.MixedTasks;

import java.util.Stack;

public class T_922_Sort_Array_By_Parity_II {
    // TODO find bug, refactor a little, take less space, can make linear with nested loops
    public static void main(String[] args) {
        T_922_Sort_Array_By_Parity_II obj = new T_922_Sort_Array_By_Parity_II();
        int[] input = {648,831,560,986,192,424,997,829,897,843};
        // expected    648,831,560,997,192,897,986,829,424,843
        // my actual   648,831,560,986,192,997,424,829,897,843

        System.out.println(obj.sortArrayByParityII(input));
    }

    public int[] sortArrayByParityII(int[] nums) {
        int length = nums.length;
        if(length<2) return nums;

        Stack<Integer> index_odd = new Stack<>();
        Stack<Integer> index_even = new Stack<>();
        boolean start_odd = false;
        boolean start_even = false;

        for(int i = 0; i < length; i++) {

            if(i%2 == 0 && nums[i] % 2 == 1) {
                start_odd = true;
                index_odd.add(i);
            }
            if(i%2 == 1 && nums[i] % 2 == 0) {
                start_even = true;
                index_even.add(i);
            }

            if(start_odd && start_even) {
                swap(nums, index_odd.pop(), index_even.pop());
                start_odd = false;
                start_even = false;
            }


        }

        return nums;
    }

    private void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
