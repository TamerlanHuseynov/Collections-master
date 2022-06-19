package LeetCode.MixedTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class T_1260_Shift_2D_Grid {
//    https://leetcode.com/problems/shift-2d-grid/
    public static void main(String[] args) {
        T_1260_Shift_2D_Grid obj = new T_1260_Shift_2D_Grid();
        int[][][] grids = {
                        {{1,2,3}, // first grid
                         {4,5,6},
                         {7,8,9}},

                       {{1},   // second grid
                        {2},
                        {3},
                        {4},
                        {7},
                        {6},
                        {5}},

                {{1}}  // third grid
        };
        int[] k = {2, 23, 100};
        for (int i = 0; i < grids.length; i++) obj.printResult(grids[i], k[i]);
    }

    /*
    input      output    expected
   [1,2,3]    [2,3,4],   [9,1,2],
   [4,5,6]    [5,6,7],   [3,4,5],
   [7,8,9]    [8,9,1]    [6,7,8]]
    */

    private List<List<Integer>> shiftGrid_right(int[][] grid, int k) {
        int y_grid = grid.length, x_grid = grid[0].length;
        int totalSquares = x_grid * y_grid;
        if(totalSquares == 1) return new ArrayList<List<Integer>>(){{add(new ArrayList<>(Arrays.asList(grid[0][0])));}};
        if(k > totalSquares) k = k % totalSquares;
        int y = (totalSquares - k) / x_grid;
        int x = (totalSquares - k) % x_grid;
        List<List<Integer>> matrix = new ArrayList<>(x_grid);
        while(matrix.size() < y_grid) {
            List<Integer> ans_row = new ArrayList<>(y_grid);
            while(ans_row.size() < x_grid) {
                if (x >= x_grid) {
                    x = 0;
                    y = y + 1 < y_grid ? ++y : 0;
                }
                ans_row.add(grid[y][x++]);
            }
            matrix.add(ans_row);
        }
        return matrix;
    }

    // a little faster - by 1 ms than above solution
    private List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int y = grid.length, x = grid[0].length;
        int newK = k % (y * x);
        List<List<Integer>> shifted_matrix = new LinkedList<>();
        int endPoint = newK == 0 ? 0 : y * x - newK;
        int boundary = y * x;
        Integer[][] newGrid = new Integer[y][x];
        for(int i = 0,j = endPoint; i < boundary; i++, j++) {
            if(j == boundary) j = 0;
            newGrid[i / x][i % x] = grid[j / x][j % x];
        }
        for(Integer[] a : newGrid) shifted_matrix.add(Arrays.asList(a));
        return shifted_matrix;
    }

    private void printResult(int[][] grid, int k) {
        System.out.println("BEFORE SHIFTING");
        for(int[] row : grid) System.out.println(Arrays.toString(row));
        System.out.println("AFTER SHIFTING");
        List<List<Integer>> result_two = shiftGrid_right(grid, k);
        for(List<Integer> row : result_two) System.out.println(row);
        System.out.println("---------Next RUN----------");
    }

}
