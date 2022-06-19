package recursion.recursion_practice;

import java.util.HashMap;
import java.util.Map;

public class CanSum {
//    Can we sum numbers from the given array to target number?
//    nums are always positive, we can reuse each number many times if we want to.
    public static void main(String[] args) {
        CanSum obj = new CanSum();
        Map<Integer, Boolean> memo_map = new HashMap<>();
        int[] nums = {10, 3, 4, 7, 19, 11};
        System.out.println("result = " + obj.canSum(nums, 5000, memo_map));
        System.out.println("result = " + obj.canSum(new int[]{7, 14}, 300, memo_map));
    }

    public boolean canSum(int[] nums, int target, Map<Integer, Boolean> memo) {
        if(memo.get(target) != null && memo.get(target)) return true;
        if (target == 0) return true;
        if (target < 0 ) return false;
        for (int num : nums) {
            int remainder = target-num;
            if(canSum(nums, remainder, memo)) {
                memo.put(target, true);
                return true;
            }
        }
        memo.put(target, false);
        return false;
    }
}