package LeetCode.MixedTasks;

import java.util.HashSet;
import java.util.Set;

public class T_2154_Keep_Multiplying_Found_Values_by_Two {
    public static void main(String[] args) {
        T_2154_Keep_Multiplying_Found_Values_by_Two obj = new T_2154_Keep_Multiplying_Found_Values_by_Two();

        int[] nums = {5,3,6,1,12};
        int original = 3;
        // expected 24
        System.out.println("result = " + obj.findFinalValue(nums, original));
    }

    public int findFinalValue(int[] nums, int original) {
        if(nums.length == 0) return original;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        while(set.contains(original)) {
            original *= 2;
        }
        return original;

    }

}
