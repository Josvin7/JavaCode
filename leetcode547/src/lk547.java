/**
 * @ClassName lk547
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/16/12:01
 */
public class lk547 {
    private static int count;
    private static int[] id;
    private static int[] size;
    public int findCircleNum(int[][] isConnected) {
        Union_Find(isConnected);
        return count;
    }

    private void Union_Find(int[][] isConnected) {
        int N = isConnected.length;
        id = new int[N];
        size = new int[N];
        count = N;
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (1 == isConnected[i][j]) {
                    Union(i, j);
                }
            }
        }
    }

    private static void Union(int p, int q) {
        int proot = Find(p);
        int qroot = Find(q);
        if (proot == qroot) {
            return;
        }
        if (size[p] > size[q]) {
            id[proot] = qroot;
            size[qroot] += size[p];

        } else {
            id[qroot] = proot;
            size[proot] += size[q];
        }
        count--;
    }

    private static int Find(int p) {
        if (id[p] != p) {
            id[p] = Find(id[p]);
        }
        return id[p];
    }
}
