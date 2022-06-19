package LeetCode.MixedTasks;

import LeetCode.leet_code_helpers.LeetCodeUtils;

import java.util.*;
import java.util.stream.Collectors;

public class T_2032_Two_Out_of_Three {
//    https://leetcode.com/problems/two-out-of-three/
    public static void main(String[] args) {
        T_2032_Two_Out_of_Three obj = new T_2032_Two_Out_of_Three();
        LeetCodeUtils arrayGenerator = new LeetCodeUtils();
        int[] ints_one = arrayGenerator.generate_random_array(10, 10);
        int[] ints_two = arrayGenerator.generate_random_array(10, 10);
        int[] ints_three = arrayGenerator.generate_random_array(10, 10);
        System.out.println("3 original arrays: \n" +
                "ints_one = " + Arrays.toString(ints_one) + "\n" +
                "ints_two = " + Arrays.toString(ints_two) + "\n" +
                "ints_three = " + Arrays.toString(ints_three) + "\n" +
                "-----------------------------------------------------");
        System.out.println("slow set        = " + obj.twoOutOfThree(ints_one, ints_two, ints_three));
        System.out.println("faster set      = " + obj.twoOutOfThree_Better_Set(ints_one, ints_two, ints_three));
        System.out.println("Bit shenanigans = " + obj.twoOutOfThree_BitManipulation(ints_one, ints_two, ints_three));
    }

    // Slowest solution:
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = makeSet(nums1);
        Set<Integer> set2 = makeSet(nums2);
        Set<Integer> set3 = makeSet(nums3);
        Set<Integer> result = new HashSet<>(intersect(set1, set2));
        result.addAll(intersect(set1, set3));
        result.addAll(intersect(set2, set3));
        return new ArrayList<>(result);
    }
    private Set<Integer> makeSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);
        return set;
    }
    private Set<Integer> intersect(Set<Integer> one, Set<Integer> two) {
        Set<Integer> res = new HashSet<>(one);
        res.retainAll(two);
        return res;
    }

    // Better Set solution:
    public List<Integer> twoOutOfThree_Better_Set(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> results = new ArrayList<>();
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> set3 = Arrays.stream(nums3).boxed().collect(Collectors.toSet());
        for (Integer n : set1) if(set2.contains(n) || set3.contains(n)) results.add(n);
        for (Integer n : set2) if(set3.contains(n) && !results.contains(n)) results.add(n);
        return results;
    }

    // Bit manipulation solution (best), but excludes 0 as per task on Leet
    // But my method to generate array has no param to start from 1... whatever.
    public List<Integer> twoOutOfThree_BitManipulation(int[] nums1, int[] nums2, int[] nums3) {
        int[] bits = new int[101];
        for (int n : nums1)  bits[n] |= 0b110;
        for (int n : nums2)  bits[n] |= 0b101;
        for (int n : nums3)  bits[n] |= 0b011;
        List<Integer> result = new ArrayList<>();
        for (int i = bits.length - 1; i > 0; i--) if (bits[i] == 0b111) result.add(i);
        return result;
    }
}
