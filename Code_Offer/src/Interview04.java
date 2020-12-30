/**
 * @ClassName Interview04
 * @Description ：TODO
 * @Author Josvin
 * @Date 2020/12/30/10:08
 */
public class Interview04 {
    public boolean findNumberIn2DArray11(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int ROW = matrix.length;
        int COL = matrix[0].length;
        for (int i = 0; i < ROW ; i++) {
            for (int j = 0; j < COL; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }



        public boolean findNumberIn2DArray(int[][] matrix, int target) {
                if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                    return false;
                }
                int i = 0;
                int j = matrix[0].length-1;

            while (i < matrix.length && j >= 0) {
                int tmp = matrix[i][j];
                if (tmp > target) {
                    j--;
                } else if (tmp < target) {
                    i++;
                } else {
                    return true;
                }
            }
                return false;
            }




}
