package LeetCode.MixedTasks.random_medium_tasks;

import java.util.*;

public class T_1337_The_K_Weakest_Rows_in_a_Matrix {
//    https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
    public static void main(String[] args) {
        T_1337_The_K_Weakest_Rows_in_a_Matrix obj = new T_1337_The_K_Weakest_Rows_in_a_Matrix();

        int k = 3;
        int[][] mat = { {1,1,0,0,0}, // 0
                        {1,1,1,1,0}, // 1
                        {1,0,0,0,0}, // 2
                        {1,1,0,0,0}, // 3
                        {1,1,1,1,1}};// 4
        //Expected {2, 0, 3}
        System.out.println(Arrays.toString(obj.kWeakestRows(mat, k)));

    }

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<MatEntry> queue = new PriorityQueue<>( (a, b) -> {
        int keyComp = Integer.compare(a.key, b.key);
        int valComp = Integer.compare(a.value, b.value);
        if (valComp != 0) return valComp;
        return keyComp;
        });
        int[] result = new int[k];
        for(int i = 0; i < mat.length; i++) queue.add(new MatEntry(i, getRowStrength(mat[i])));
        for (int i = 0; i < k; i++) result[i] = Objects.requireNonNull(queue.poll()).key;
        return result;
    }

    private int getRowStrength(int[] arr) {
        int count = 0;
        int it = 0;
        while(it < arr.length && arr[it] == 1) {
            count++;
            it++;
        }
        return count;
    }

    public static class MatEntry{
        public int key;
        public int value;

        public MatEntry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

}


