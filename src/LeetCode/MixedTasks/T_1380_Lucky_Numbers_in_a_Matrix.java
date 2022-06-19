package LeetCode.MixedTasks;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class T_1380_Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
        T_1380_Lucky_Numbers_in_a_Matrix obj = new T_1380_Lucky_Numbers_in_a_Matrix();
        int[][] matrix = {{3,7,8},
                          {9,11,13},
                          {15,16,17}};
        System.out.println(obj.luckyNumbers(matrix));
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();
        for (int[] row : matrix) {
            Integer result = return_if_max_vertical_or_null(matrix, find_min_horizontal(row));
            if (result != null) lucky.add(result);
        }
        return lucky;
    }

    private int[] find_min_horizontal(int[] horizontal) {
        //                      value          index
        int[] min = new int[]{Integer.MAX_VALUE, 0};
        for (int i=0;i<horizontal.length; i++){
            if(min[0] > horizontal[i]){
                min[0] = horizontal[i];
                min[1] = i;
            }
        }
        return min;
    }

    private Integer return_if_max_vertical_or_null(int[][] matrix, int[] min) {
        for (int[] ints : matrix) if (min[0] < ints[min[1]]) return null;
        return min[0];
    }

}
