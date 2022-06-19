package LeetCode.MixedTasks;

import java.util.Arrays;

public class T_1502_Can_Make_Arithmetic_Progression_From_Sequence {
    // https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
    public static void main(String[] args) {
        T_1502_Can_Make_Arithmetic_Progression_From_Sequence obj = new T_1502_Can_Make_Arithmetic_Progression_From_Sequence();
        int[] input = {3,5,1};
        int[] input2 = {-68, -96, -12, -40, 16};
        System.out.printf("Result = %s", obj.canMakeArithmeticProgression(input2));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = Math.abs(arr[1]) - Math.abs(arr[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println(diff);
        // [1, 3, 5]

        for(int i = 1; i < arr.length - 1; i++) {

            if(Math.abs(arr[i+1]) - Math.abs(arr[i]) != diff) return false;

        }
        return true;
    }
}
