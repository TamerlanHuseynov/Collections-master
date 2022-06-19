package random_practice.CodingBat;

import java.util.Arrays;

public class ArrayTwo_postFour {
    public static void main(String[] args) {

        int[] nums1 = {2, 4, 1, 2}; //expected = [1, 2]

        int[] nums2 = {4, 1, 4, 2}; //expected = [2]

        int[] nums3 = {4, 2};       //expected = [2]

        int[] nums4 = {2, 4, 1, 4, 3, 2};//expected = [3, 2]

        System.out.println(Arrays.toString(post4(nums4)));

    }

    public static int[] post4(int[] nums) {

        int last = -1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                last = i;
                break;
            }
        }
//            {2, 4, 1, 4, 3, 2} length = 5-3=2
//             0  1  2  3  4  5

        if (last < 0) {
            return new int[0];
        } else {

            int[] newNums = new int[nums.length - last-1];
            int index = 0;

            for (int j = last + 1; j < nums.length; j++) {
                newNums[index++] = nums[j];
            }
            return newNums;

        }


    }
}