/**
 * @ClassName Interview12
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/13/12:05
 */
import javafx.beans.property.ReadOnlyBooleanWrapper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Interview12 {




    public boolean exist(char[][] board, String word) {
        int len = word.length();
        int ROW = board.length;
        int COL = board[0].length;
        if (ROW * COL < len) {
            return false;
        }
        int index = 0;
        // 监视每个位置是否被用过了
        boolean[][] visit_board = new boolean[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (existHelper(board, visit_board, ROW, COL, i, j, word, len, index)) {
                    return true;
                }
            }
        }
        return false;
    }
//    [["a","b"],["c","d"]]
//            "abcd"

    private boolean existHelper(char[][] board, boolean[][] visit_board, int ROW, int COL, int i, int j, String word, int len, int index) {
        if (i < 0 || j < 0 || i >= ROW || j >= COL || visit_board[i][j] || board[i][j] != word.charAt(index)) {
            return false;// 有一个为真，就返回flase说明不满足条件，是找不到的
        }
        if (visit_board[i][j] == false && (board[i][j] == word.charAt(index))) {
            visit_board[i][j] = true;
            // 找到最后一个，说明找到了
            if (index + 1 >= len) {
                return true;
            }
        }
        // 去找他的四个方向
        if (    existHelper(board, visit_board, ROW, COL, i+1, j, word, len, index+1)||
                existHelper(board, visit_board, ROW, COL, i-1, j, word, len, index+1)||
                existHelper(board, visit_board, ROW, COL, i, j+1, word, len, index+1)||
                existHelper(board, visit_board, ROW, COL, i, j-1, word, len, index+1)) {
            return true;
        }
        // 四个方向都没有找到，那么visit_board[i][j]这个位置去找是找不到的，置为false在往回退
        visit_board[i][j] = false;
        return false;


    }


}
