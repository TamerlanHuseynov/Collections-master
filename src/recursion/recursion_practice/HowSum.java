package recursion.recursion_practice;

import LeetCode.leet_code_helpers.LeetCodeUtils;

import java.util.LinkedList;
import java.util.List;

public class HowSum {
    /*
    Write a method HowSum(targetSum, int[] nums)
    that takes a target number and an array of numbers as args
    The function should return an array containing any combination of elements that
    add up to exactly the targetSum. If there is no combination that adds up to
    the targetSum, then return null. If there are multiple combinations that sum up to
    targetSum, return any one of them.
     */
    public static void main(String[] args) {
        HowSum obj = new HowSum();
        LeetCodeUtils util = new LeetCodeUtils();
//        int[] nums = util.generate_random_array(10, 11);
//        util.print_Arrays(nums);
//        System.out.println("howSum(10, "+ Arrays.toString(nums) + ") = " + obj.howSum(10, nums));


        int[] nums = {2, 3, 1, 7, 10};
        System.out.println(obj.howSum(5, nums));
    }

    //TODO add memo
    public List<Integer> howSum(int target, int[] nums) {
        if(target == 0) return new LinkedList<>();
        if(target < 0) return null;

        for (int num : nums) {
            int remainder = target - num;
            List<Integer> result = howSum(remainder, nums);

            if(result != null) {
                result.add(num);
                return result;
            }
        }

        return null;
    }


}
