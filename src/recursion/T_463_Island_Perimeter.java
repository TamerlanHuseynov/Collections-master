package recursion;

public class T_463_Island_Perimeter {
    // https://leetcode.com/problems/island-perimeter/
    public static void main(String[] args) {
        T_463_Island_Perimeter obj = new T_463_Island_Perimeter();
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}}; // expected 16;
        System.out.printf("Result = %s\n", obj.islandPerimeter(grid));
    }

    public int islandPerimeter(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++)
                if(grid[i][j] == 1) count = depthFirstSearch(grid, i, j);
        }
        return count;
    }

    private int depthFirstSearch(int[][] grid, int i, int j) {
        if( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return 1;
        if(grid[i][j] == -1) return 0;
        grid[i][j] = -1;
        return  depthFirstSearch(grid, i + 1, j) +
                depthFirstSearch(grid, i - 1, j) +
                depthFirstSearch(grid, i, j + 1) +
                depthFirstSearch(grid, i, j - 1);
    }

}