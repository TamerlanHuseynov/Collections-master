package LeetCode.MixedTasks;

public class T_999_Available_Captures_for_Rook {
//    https://leetcode.com/problems/available-captures-for-rook/
    public static void main(String[] args) {

        T_999_Available_Captures_for_Rook obj = new T_999_Available_Captures_for_Rook();
        char[][] chess_board = {{'.','.','.','.','.','.','.','.'},
                                {'.','.','.','p','.','.','.','.'},
                                {'.','.','.','R','.','.','.','p'},
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','p','.','.','.','.'},
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','.','.','.','.','.'}};
        System.out.printf("Result = %s", obj.numRookCaptures(chess_board) );
    }



    private int numRookCaptures(char[][] board) {
        int[] position = new int[2];
        outside:
        for(int y = 0; y < 8; y++){
            for(int x = 0; x < 8; x++) {
                if(board[y][x] == 'R') {
                    position[0] = y;
                    position[1] = x;
                    break outside;
                }
            }
        }
        return rockCapturesIt(board, position[0], position[1]);
    }

    private int rockCapturesIt(char[][] board, int y, int x) {
        int count = 0;

        for(int i = y; i < board.length; i++) {
            if(board[i][x] == 'p') {
                count++;
                break;
            }
            else if (board[i][x] == 'B') break;
        }

        for(int i = y; i >= 0; i--) {
            if(board[i][x] == 'p') {
                count++;
                break;
            }
            else if (board[i][x] == 'B') break;
        }

        for(int i = x; i < board[y].length; i++) {
            if(board[y][i] == 'p') {
                count++;
                break;
            }
            else if (board[y][i] == 'B') break;
        }

        for(int i = x; i >= 0; i--) {
            if(board[y][i] == 'p') {
                count++;
                break;
            }
            else if (board[y][i] == 'B') break;
        }
        return count;
    }

//    private int rockCaptures(char[][] board, int y, int x) {
//        if( y < 0 || y > 7 || x < 0 || x > 7) return 0;
//        if(board[y][x] == 'p') return 1;
//        if(board[y][x] == 'B') return 0;
//        if(board[y][x] == '.' || board[y][x] == 'R') {
//            return  rockCaptures(board, y+1, x) +
//                    rockCaptures(board, y-1, x) +
//                    rockCaptures(board, y, x+1) +
//                    rockCaptures(board, y-1, x);
//        }
//        return 0;
//    }

}
