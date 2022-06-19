package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box {
    // https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
    public static void main(String[] args) {
        T_1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box obj = new T_1769_Minimum_Number_of_Operations_to_Move_All_Balls_to_Each_Box();
        System.out.println(Arrays.toString(obj.minOperations("110"))); // expected [1,1,3]
    }

    // slow solution. Could be improved.
    public int[] minOperations(String boxes) {
        char[] boxes_arr = boxes.toCharArray();
        int l = boxes_arr.length;
        int[] result = new int[l];
        int temp = 0;
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < l; j++) {
                    int cur_balls_count = Character.getNumericValue(boxes.charAt(j) );
                    temp += Math.abs(j-i) * cur_balls_count;
                }
            result[i] = temp;
            temp = 0;
            }
        return result;
        }

    }
