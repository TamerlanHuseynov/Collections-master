package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_66_Plus_One {
    public static void main(String[] args) {
        T_66_Plus_One obj = new T_66_Plus_One();
        /*
        You are given a large integer represented as an integer array digits,
        where each digits[i] is the ith digit of the integer.
        The digits are ordered from most significant to the least significant in left-to-right order.
        The large integer does not contain any leading 0's.
        Increment the large integer by one and return the resulting array of digits.
         */
        int[][] input = {{3, 1, 8, 9, 2, 0, 9, 9},
                         {9,9,9,9}
        };
        System.out.println(Arrays.toString(obj.plus_one(input[1])));
    }

    private int[] plus_one(int[] input) {
        int pointer = input.length-1;
        boolean extra_digit = false;

        while(pointer >= 0 && input[pointer] == 9){
            input[pointer] = 0;
            if (pointer == 0) {
                extra_digit = true;
                break;
            }
            pointer--;
        }

        if(extra_digit) {
            int[] result = new int[input.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = input[i - 1];
            }
            return result;
        }else input[pointer]++;

        return input;
    }

}
