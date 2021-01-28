package com.huahua.algo.array;

/**
 * 给你一个由一些多米诺骨牌组成的列表 dominoes。
 *
 * 如果其中某一张多米诺骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。
 *
 * 形式上，dominoes[i] = [a, b] 和 dominoes[j] = [c, d] 等价的前提是 a==c 且 b==d，或是 a==d 且 b==c。
 *
 * 在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i, j) 的数量。

 */
public  class Domino {
    public static int numEquivDominoPairs(int[][] dominoes) {
        int num = 0;
        for (int i = 0; i < dominoes.length; i++) {
            for (int i1 = i+1; i1 < dominoes.length; i1++) {
                if(dominoes[i][0] == dominoes[i1][0] && dominoes[i][1] == dominoes[i1][1]){
                    num++;
                }else if(dominoes[i][0] == dominoes[i1][1] && dominoes[i][1] == dominoes[i1][0]){
                    num++;
                }
            }
        }
        return num;
    }

    public static int numEquivDominoPair(int[][] dominoes) {
        int[] num = new int[100];
        int ret = 0;
        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0];
            ret += num[val];
            num[val]++;
        }
        return ret;
    }

    public static void main(String[] args) {

        int[][] dominoes = {{1,1},{2,2},{1,1},{1,2},{1,2},{1,1}};
        int num = numEquivDominoPair(dominoes);
        System.out.println(num);
    }
}
