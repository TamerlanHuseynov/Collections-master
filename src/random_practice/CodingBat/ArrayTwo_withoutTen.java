package random_practice.CodingBat;

import java.util.Arrays;

public class ArrayTwo_withoutTen {
    public static void main(String[] args) {
        int[] nums1 ={1, 10, 10, 2};
//                    1,  2,  0, 0

        int[] nums2 ={10, 13, 10, 14};
//                    13, 14,  0,  0

        int[] nums3 ={10, 13, 10, 14, 10};
//                    13, 14, 0,   0,  0

        System.out.println(Arrays.toString(withoutTen(nums2)));

    }

    public static int[] withoutTen(int[] nums) {
        int end = nums.length;
        int temp = 0;
        for (int i = 0; i < end; i++) {

            if (nums[i] == 10) {
                nums[i] = 0;
                temp++;
            }
        }

        for (int i = 0; i < end; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[end - temp];
                nums[end - temp--] = 0;
                if (temp == 0) break;
/*
0  13  0  14
13 14  0  0
0   1  2  3
 */
            }

        }


        return nums;
    }
}