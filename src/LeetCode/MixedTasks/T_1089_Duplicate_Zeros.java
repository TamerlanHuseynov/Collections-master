package LeetCode.MixedTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_1089_Duplicate_Zeros {
//    https://leetcode.com/problems/duplicate-zeros/
    public static void main(String[] args) {
        T_1089_Duplicate_Zeros obj = new T_1089_Duplicate_Zeros();
        int[] arr = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(arr));
        obj.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void duplicateZeros(int[] input_array) {
        List<Integer> list = new ArrayList<>(input_array.length);
        for (int value : input_array) {
            if (value == 0) {
                list.add(0);
                list.add(0);
            } else list.add(value);
        }
        for(int i = 0; i < input_array.length; i++) {
            input_array[i] = list.get(i);
        }
    }

}
