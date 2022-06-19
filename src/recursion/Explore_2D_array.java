package recursion;

import java.util.Arrays;

public class Explore_2D_array {
    static int count = 0;
    public static void main(String[] args) {
        int[][] matrix = {  {1,0,0,0,0},
                            {0,0,1,1,0},
                            {1,0,0,1,0},
                            {1,1,1,1,0}};
        explore_matrix(matrix, 0, 3);
        for (int[] ints : matrix) System.out.println(Arrays.toString(ints));
        System.out.println("number of recursive calls = " + count);
    }

    public static void explore_matrix(int[][] matrix, int x, int y) {
        if(matrix[x][y] == 0) matrix[x][y]=-1;
        if(x-1 >= 0                 &&  matrix[x-1][y]==0) explore_matrix(matrix, x-1, y);
        if(x+1 < matrix.length      &&  matrix[x+1][y]==0) explore_matrix(matrix, x+1, y);
        if(y-1 >= 0                 &&  matrix[x][y-1]==0) explore_matrix(matrix, x, y-1);
        if(y+1 < matrix[x].length   &&  matrix[x][y+1]==0) explore_matrix(matrix, x, y+1);
        count++;
    }
}
