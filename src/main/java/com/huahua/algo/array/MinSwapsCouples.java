package com.huahua.algo.array;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * N 对情侣坐在连续排列的 2N 个座位上，想要牵到对方的手。 计算**最少交换座位的次数**，以便每对情侣可以并肩坐在一起。 一次交换可选择任意两人，让他们站起来交换座位。
 * 人和座位用 0 到 2N-1 的整数表示，情侣们按顺序编号，第一对是 (0, 1)，第二对是 (2, 3)，以此类推，最后一对是 (2N-2, 2N-1)。
 * 这些情侣的初始座位  row[i] 是由最初始坐在第 i 个座位上的人决定的。
 *
 * 说明:
 *
 * 1.len(row) 是偶数且数值在 [4, 60]范围内。
 * 2.可以保证row 是序列 0...len(row)-1 的一个全排列。
 *
 */
public class MinSwapsCouples {

    public static int minSwapsCouples(int[] row) {
        int start = 0;
        int target;
        int temp;
        int swap = 0;
        int now = row[start];
        if(now % 2 ==1){
            target = now -1 ;
        }else {
            target = now + 1;
        }
        for (int i = 0; i < row.length; i++) {
            if(i > 0 && row[i] == target){
                temp = row[start+1];
                row[start+1] = row[i];
                row[i] = temp;
                start = start + 2;
                swap++;
                minSwapsCouples(row);
            }
        }
        return swap;
    }

    public static int minSwapsCouples2(int[] row) {
        int n = row.length;
        int tot = n / 2;
        int[] f = new int[tot];
        for (int i = 0; i < tot; i++) {
            f[i] = i;
        }

        for (int i = 0; i < n; i += 2) {
            int l = row[i] / 2;
            int r = row[i + 1] / 2;
            add(f, l, r);
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < tot; i++) {
            int fx = getf(f, i);
            map.put(fx, map.getOrDefault(fx, 0) + 1);
        }

        int ret = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ret += entry.getValue() - 1;
        }
        return ret;
    }

    public static int getf(int[] f, int x) {
        if (f[x] == x) {
            return x;
        }
        int newf = getf(f, f[x]);
        f[x] = newf;
        return newf;
    }

    public static void add(int[] f, int x, int y) {
        int fx = getf(f, x);
        int fy = getf(f, y);
        f[fx] = fy;
    }

    public static void main(String[] args) {
       int[] row = {0, 2, 1, 3};
        System.out.println(minSwapsCouples2(row));
    }




    private class UnionFind {

        private int[] parent;

        private int count;

        public int getCount() {
            return count;
        }

        public UnionFind(int n) {
            this.count = n;
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            while (x != parent[x]) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }

            parent[rootX] = rootY;
            count--;
        }
    }
}
