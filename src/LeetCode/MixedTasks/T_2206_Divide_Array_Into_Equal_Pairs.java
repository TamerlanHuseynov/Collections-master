package LeetCode.MixedTasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class T_2206_Divide_Array_Into_Equal_Pairs {
    //https://leetcode.com/problems/divide-array-into-equal-pairs/
    public static void main(String[] args) {
        T_2206_Divide_Array_Into_Equal_Pairs obj = new T_2206_Divide_Array_Into_Equal_Pairs();
        int[] input = {3, 2, 3, 2, 2, 2}; //True
        System.out.printf("Result = %s", obj.divideArray_1(input));

    }

    private boolean divideArray_1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) return false;
        }
        return true;
    }

    private boolean divideArray_2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)) set.remove(num);
            else set.add(num);
        }
        return set.isEmpty();
    }

    private boolean divideArray_3(int[] nums) {
        boolean[] booleans = new boolean[501];
        for (int num : nums) booleans[num] = !booleans[num];
        for(boolean b : booleans) if(b) return false;
        return true;
    }


}
