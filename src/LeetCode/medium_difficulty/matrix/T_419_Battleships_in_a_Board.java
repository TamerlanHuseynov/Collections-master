package LeetCode.medium_difficulty.matrix;

public class T_419_Battleships_in_a_Board {
//    https://leetcode.com/problems/battleships-in-a-board/
    public static void main(String[] args) {
        T_419_Battleships_in_a_Board obj = new T_419_Battleships_in_a_Board();
        char[][] board = {  {'X','.','.','X'},
                            {'.','.','.','X'},
                            {'.','.','.','X'}};
        System.out.printf("Result = %s \nExpected = 2", obj.countBattleships(board));

    }

    private int countBattleships(char[][] board) {
        int count=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='.') continue;
                if( i>0&&board[i-1][j]=='X')continue;
                if( j>0&&board[i][j-1]=='X')continue;
                count++;
            }
        }
        return count;
    }
}
