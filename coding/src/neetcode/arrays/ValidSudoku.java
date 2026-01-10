package neetcode.arrays;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {

        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] == '.') continue;

                String rowKey = i + "row" + board[i][j];
                String colKey = j + "col" + board[i][j];
                String boxKey = (i / 3) + "row" + (j / 3) + "col" + board[i][j];

                if (set.contains(rowKey) ||
                        set.contains(colKey) ||
                        set.contains(boxKey)) {
                    return false;
                }

                set.add(rowKey);
                set.add(colKey);
                set.add(boxKey);
            }
        }
        return true;
    }
}
/**
 * Time Complexity = O(1)
 * Space Complexity =O(1)
 * **/
