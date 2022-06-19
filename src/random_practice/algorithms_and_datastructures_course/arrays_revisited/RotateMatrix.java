package random_practice.algorithms_and_datastructures_course.arrays_revisited;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        RotateMatrix r = new RotateMatrix();
        r.rotateMatrix(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public boolean rotateMatrix(int[][] matrix){
        if(matrix.length==0 || matrix.length != matrix[0].length) return false;
        int l = matrix.length;
        for (int layer = 0; layer < l / 2; layer++) {
            int first = layer;
            int last = l - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i-first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[i][last] = top;
            }
        }
    return true;
    }

}
