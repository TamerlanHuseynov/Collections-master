package LeetCode.MixedTasks;

import java.util.*;

public class T_448_Find_All_Numbers_Disappeared_in_an_Array {
//    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static void main(String[] args) {
        T_448_Find_All_Numbers_Disappeared_in_an_Array obj = new T_448_Find_All_Numbers_Disappeared_in_an_Array();
        int[] input = {4,3,2,7,8,2,3,1};


    }

    private List<Integer> findDisappearedNumbers_solution_slow(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return list;
        Set<Integer> set = new HashSet<>();

        for(int num: nums) set.add(num);

        for(int i = 1; i <= nums.length; i++) if(!set.contains(i)) list.add(i);

        return list;
    }

    private List<Integer> findDisappearedNumbers_solution_fast(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return list;
        boolean[] compare = new boolean[nums.length];
        for(int i = 0; i < nums.length; i++) compare[nums[i]-1] = true;
        for(int i = 0; i < compare.length; i++)
            if(!compare[i]) list.add(i+1);
        return list;
    }

    private List<Integer> findDisappearedNumbers_solution_sorting(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums == null || nums.length == 0) return list;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) if(nums[i] != i + 1) list.add(i+1);
        return list;
    }
}
