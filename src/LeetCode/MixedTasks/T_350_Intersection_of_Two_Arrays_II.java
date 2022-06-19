package LeetCode.MixedTasks;

import LeetCode.leet_code_helpers.LeetCodeUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_350_Intersection_of_Two_Arrays_II {
//    https://leetcode.com/problems/intersection-of-two-arrays-ii/
    public static void main(String[] args) {
        T_350_Intersection_of_Two_Arrays_II obj = new T_350_Intersection_of_Two_Arrays_II();
        LeetCodeUtils array_generator = new LeetCodeUtils();
        int[] ints_1 = array_generator.generate_random_array(10, 11);
        int[] ints_2 = array_generator.generate_random_array(20, 11);
        array_generator.print_Arrays(ints_1, ints_2);
        System.out.println("Result         = " + Arrays.toString(obj.intersect(ints_1, ints_2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        int index_nums1 = 0;
        int index_nums2 = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        while(index_nums1 < nums1.length && index_nums2 < nums2.length) {
            if(nums1[index_nums1] < nums2[index_nums2]) index_nums1++;
            else if(nums1[index_nums1] > nums2[index_nums2]) index_nums2++;
            else {
                result.add(nums1[index_nums1++]);
                index_nums2++;
            }
        }
        int i = 0;
        int[] answer = new int[result.size()];
        for(Integer integer : result) answer[i++] = integer;
        return answer;
    }
}
