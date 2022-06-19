package LeetCode.MixedTasks;

public class T_1351_Count_Negative_Numbers_in_a_Sorted_Matrix {

    public static void main(String[] args) {
        T_1351_Count_Negative_Numbers_in_a_Sorted_Matrix obj = new T_1351_Count_Negative_Numbers_in_a_Sorted_Matrix();
        int[][] matrix = {{4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}};
        System.out.printf("Result = %s\n", obj.countNegatives_1(matrix));
    }

    private int countNegatives_1(int[][] grid) {
        /*
        [ 4,   3,  2, -1],
        [ 3,   2,  1, -1],
        [ 1,   1, -1, -2],
        [-1,  -1, -2, -3]
        */
        int count = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[i].length - 1; j >= 0 && grid[i][j] < 0; j--) {
                count++;
            }
        }
        return count;
    }

    private int countNegatives_2(int[][] grid) {
        int count = 0;
        int row = 0;
        int col = grid[row].length - 1;

        while (row < grid.length && col >= 0) {
            if (grid[row][col] < 0) {
                count += grid.length - row;
                col--;
            } else row++;
        }
        return count;
    }

}
