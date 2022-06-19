package LeetCode.MixedTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T_2164_Sort_Even_and_Odd_Indices_Independently {
//    https://leetcode.com/problems/sort-even-and-odd-indices-independently/
    public static void main(String[] args) {
        T_2164_Sort_Even_and_Odd_Indices_Independently obj = new T_2164_Sort_Even_and_Odd_Indices_Independently();
        int[] nums = {36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34};
        int[] actual = obj.sortEvenOdd(nums);
        System.out.println("Expected = " + Arrays.toString(new int[]{9,46,15,45,15,41,27,34,32,31,33,31,36,26,36,16,44,6}));
        System.out.println("Result   = " + Arrays.toString(actual));
    }

    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>((nums.length+1)/2);
        List<Integer> even = new ArrayList<>((nums.length+1)/2);

        for(int i = 0; i < nums.length; i++){
            if (i % 2 == 0) even.add(nums[i]);
            else odd.add(nums[i]);
        }

        odd.sort(Collections.reverseOrder());
        Collections.sort(even);

        System.out.println("odd  = " + odd);
        System.out.println("even = " + even);

        int odd_i = 0;
        int even_i = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) nums[i] = even.get(even_i++);
            else nums[i] = odd.get(odd_i++);
        }
        return nums;
    }

}
