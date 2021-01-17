/**
 * @ClassName Demo
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/17/11:47
 */
public class Demo {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 2) {
            return true;
        }
        int k = 0;
        // 求斜率 分母等于0
        if (coordinates[1][0] == coordinates[0][0] ) {
            k = 1;
        }else {
            // 分母不为0
            k = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        }
        int b = coordinates[0][1] - k * coordinates[0][0];

        for (int i = 2; i < coordinates.length ; i++) {
            if (!check(coordinates[i][0], coordinates[i][1], k, b)) {
                return false;
            }
        }
        return true;

    }

    private boolean check(int x, int y, int k, int b) {
        if (k == 1 && b == 0 && y == 0) {
            return true;
        }

        if (y == (k * x + b)) {
            return true;
        }
        return false;
    }
}
