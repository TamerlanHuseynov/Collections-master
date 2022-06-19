package LeetCode.MixedTasks;

import java.util.*;
import java.util.stream.Collectors;

public class T_2176_Count_Equal_and_Divisible_Pairs_in_an_Array {
//    https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/
    public static void main(String[] args) {
        T_2176_Count_Equal_and_Divisible_Pairs_in_an_Array obj = new T_2176_Count_Equal_and_Divisible_Pairs_in_an_Array();

        int[] nums = {3, 1, 2, 2, 2, 1, 3}; // Expected = 4
        int k = 2;
        System.out.printf("Result of %s %s = <%s>\n", Arrays.toString(nums), k, obj.countPairs_brute(nums, k));
        System.out.printf("Result of %s %s = <%s>\n", Arrays.toString(nums), k, obj.countPairs_brute_optimized(nums, k));
    }

    /** Brute Force O(n^2) runtime 6ms */
    private int countPairs_brute(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && i * j % k == 0) count++;
            }
        }
        return count;
    }

    /** Brute Force O(n^2) optimized runtime 4ms */
    private int countPairs_brute_optimized(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % k == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            } else {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j] && (j * i) % k == 0) {
                        count++;
                    }
                }
            }

        }
        return count;
    }

    /** Hashing solution, extra memory, slow runtime */
    public int countPairs_hashing(int[] nums, int k) {
        int count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> keyList = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> l = map.getOrDefault(nums[i], new LinkedList<>());
            l.add(i);
            if (l.size() >= 2) {
                keyList.add(nums[i]);
            }
            map.put(nums[i], l);
        }

        if (keyList.size() == 0) {
            return count;
        }

        for (int key : keyList) {
            List<Integer> list = map.get(key);
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if ((list.get(i) * list.get(j)) % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /** Hashing solution, extra memory, terrible runtime 27ms */
    public  int countPairs_hashing_optimized(int[] nums, int k) {
        int count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> l = map.getOrDefault(nums[i], new LinkedList<>());
            l.add(i);
            map.put(nums[i], l);
        }
        List<Integer> collect = map.keySet().stream().filter(v -> map.get(v).size() >= 2).collect(Collectors.toList());
        for (int key : collect) {
            List<Integer> list = map.get(key);
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if ((list.get(i) * list.get(j)) % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
