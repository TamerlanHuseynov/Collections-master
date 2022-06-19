package LeetCode.MixedTasks;

import java.util.*;

public class T_2215_Find_the_Difference_of_Two_Arrays {
    // https://leetcode.com/problems/find-the-difference-of-two-arrays/
    public static void main(String[] args) {
        T_2215_Find_the_Difference_of_Two_Arrays obj = new T_2215_Find_the_Difference_of_Two_Arrays();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> difference = obj.findDifference(nums1, nums2);
        System.out.printf("Result = %s and %s\n", difference.get(0), difference.get(1));
    }

    private List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>(2);
        List<Integer> not_in_num1 = new ArrayList<>();
        List<Integer> not_in_num2 = new ArrayList<>();
        Set<Integer> nums_one = new HashSet<>(); for (int one : nums1) nums_one.add(one);
        Set<Integer> nums_two = new HashSet<>(); for (int two : nums2) nums_two.add(two);
        for (int two : nums_two) if(!nums_one.contains(two)) not_in_num1.add(two);
        for (int one : nums_one) if(!nums_two.contains(one)) not_in_num2.add(one);
        answer.add(not_in_num2);
        answer.add(not_in_num1);
        return answer;
    }

    /** NOT mine, review */
    private List<List<Integer>> findDifference_2(int[] nums1, int[] nums2) {
        List<List<Integer>> table = new ArrayList<>();
        table.add(new ArrayList<Integer>());
        table.add(new ArrayList<Integer>());
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i != nums1.length && j != nums2.length){
            //ignore all coinciding contiguous number except one
            while(i + 1 != nums1.length && nums1[i+1] == nums1[i]) i++;
            while(j + 1 != nums2.length && nums2[j+1] == nums2[j]) j++;

            //ignore current numbers from two arrays if they are equal
            if(nums1[i] == nums2[j]) {i++; j++;}
            else if(nums1[i] < nums2[j]) table.get(0).add(nums1[i++]);//if not - update answer
            else table.get(1).add(nums2[j++]);
        }

        while(i != nums1.length){ //add "tail" from nums1
            while(i + 1 != nums1.length && nums1[i] == nums1[i+1]) i++;
            table.get(0).add(nums1[i++]);
        }

        while(j != nums2.length){ //add "tail" from nums2
            while(j + 1 != nums2.length && nums2[j] == nums2[j+1]) j++;
            table.get(1).add(nums2[j++]);
        }

        return table;
    }

}
