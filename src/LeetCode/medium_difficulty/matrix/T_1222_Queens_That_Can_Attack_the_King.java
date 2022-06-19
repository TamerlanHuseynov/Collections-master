package LeetCode.medium_difficulty.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T_1222_Queens_That_Can_Attack_the_King {
    //    https://leetcode.com/problems/queens-that-can-attack-the-king/
    public static void main(String[] args) {
        T_1222_Queens_That_Can_Attack_the_King obj = new T_1222_Queens_That_Can_Attack_the_King();

        int[][] queens = {{0,1}, {1,0},{4,0},{0,4},{3,3},{2,4}};
        int[] king = {0,0}; //        Output: [[0,1],[1,0],[3,3]]

        List<List<Integer>> result = obj.queensAttackTheKing(queens, king);
        System.out.println(result);
        System.out.println("[[0,1],[1,0],[3,3]]");
    }

    private List<List<Integer>> queensAttackTheKing(int[][] queens, int[] king) {
        List<List<Integer>> attacking_queens = new ArrayList<>();
        if(queens.length == 0) return attacking_queens;
        boolean[][] chess_board = new boolean[8][8];
        for (int[] position : queens) chess_board[position[0]][position[1]] = true;
        int[][] directions = {
                {-1,  0},
                { 1,  0},
                { 0,  1},
                { 0, -1},
                {-1, -1},
                {-1,  1},
                { 1, -1},
                { 1,  1}
        };

        for(int[] direction : directions) {
            int x = king[0], y = king[1];

            while(x >= 0 && x < 8 && y >= 0 && y < 8) {
                if(chess_board[x][y]) {
                    attacking_queens.add(new ArrayList<>(Arrays.asList(x, y)));
                    break;
                }
                x += direction[0];
                y += direction[1];
            }
        }
        return attacking_queens;
    }

}

