package LeetCode.MixedTasks;

public class T_1463_Cherry_Pickup_II {
    //https://leetcode.com/problems/cherry-pickup-ii/
    //TODO complete the task
    public static void main(String[] args) {
        T_1463_Cherry_Pickup_II obj = new T_1463_Cherry_Pickup_II();

        int[][] field = {
        {3, 1, 1},
        {2, 5, 1},
        {1, 5, 5},
        {2, 1, 1}};
    }

    private int solve(int[][] grid, int y, int x) {
        int max = 0;
        if(!isInGrid(grid, y, x-1) && max < grid[y][x-1] ) {
            max = grid[y][x - 1];
        }




        return -1;
    }

    private int[] returnAndResetMax(int[][] grid, int y, int x) {
        int[] index_value = new int[2];
        int max_value = Integer.MIN_VALUE;
        int max_index = 0;
        if(isInGrid(grid, y, x)){
            if(max_value < grid[y][x]){
                max_index = x;
                max_value = grid[y][x];
            }
        }
        if(isInGrid(grid, y, x-1)){
            if(max_value < grid[y][x-1]){
                max_index = x-1;
                max_value = grid[y][x-1];
            }
        }
        if(isInGrid(grid, y, x+1)) {
            if (max_value < grid[y][x - 1]) {
                max_index = x + 1;
                max_value = grid[y][x + 1];
            }
        }
        index_value[0] = max_index;
        index_value[1] = max_value;
        grid[y][max_index] = 0;
        return index_value;
//        return max_index;
    }

    private boolean isInGrid(int[][] grid, int y, int x) {
        if(x < 0 || x >= grid[y].length) return false;
        if(y >= grid.length) return false;
        return true;
    }

}
