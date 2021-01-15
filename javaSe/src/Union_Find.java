/**
 * @ClassName Union_Find
 * @Description ：TODO
 * @Author Josvin
 * @Date 2021/01/14/21:00
 */

class UnionFind {
    private int[] id;// 存储各个元素属于那个集合，他们的下标值表示他们的元素，值表示他们属于哪个集合
    private int count;// 表示刚开始有多少集合（初始每个元素就是一个集合）

    public UnionFind(int N) {
        // 初始化
        count = N;
        id = new int[N];
        for(int i = 0; i < N; i++) id[i] = i;
    }

    // 获取有多少集合
    public int getCount() {
        return count;
    }

    //判断 p 和 q 是不是一个集合
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    // 查找（找最后被合并到那个集合，也就是找集合老大）
    public int find(int p) {
        return id[p];
    }

    // 合并 (吧一个集合的合并到另一个集合，也就是换一个集合的老大)
    public void union(int p, int q){
        int pRoot = find(p);
        int qRoot = find(q);

        if(pRoot == qRoot) return;

        for(int i = 0; i < id.length; i++)
            if(id[i] == pRoot)  id[i] = qRoot;
        count--;// 当没合并一次，集合的数目就会少一个
    }
}

public class Union_Find {
    public static void main(String[] args) {

    }
}
