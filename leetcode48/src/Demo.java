/**
 * @ClassName Demo
 * @Description ${DESCRIPTION}
 * @Author Fangwenhui
 * @Date 2020/12/19/9:59
 */

/*
* 旋转数组，顺时针90度
*
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

原地旋转输入矩阵，使其变为:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]

* */
public class Demo {
    public void rotate(int[][] matrix) {
        int ROW = matrix.length;
        int COL = matrix[0].length;
        // 首先将数组元素对半交换
        for (int i = 0; i < COL; i++) {//
            for (int j = 0; j < ROW/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][ROW-j-1];
                matrix[i][ROW-j-1] = temp;
            }
        }
        // 主对角线交换
        for (int i = 0; i < COL; i++) {
            for (int j = 0; j < ROW-i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[COL-1-j][ROW-1-i];
                matrix[COL-1-j][ROW-1-i] = temp;
            }
        }

    }
}
