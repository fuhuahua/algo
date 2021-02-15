package com.huahua.algo.array;

public class YangHui2 {

    public static void printYanghui(int k){

        int[][] pre =  new int[k][k];
        for (int i = 0; i <= pre.length; i++) {
            for(int j = 0; j <= i; j++){
                if(i==j || j==0){
                    pre[i][j] = 1;
                }else{
                    pre[i][j] = pre[i - 1][j - 1] + pre[i - 1][j];
                }
                System.out.print(pre[i][j]);
//                if(i+1 == k) {
//                    System.out.print(pre[i][j]);
//                }
            }
        }
    }

    public static void  printYanghui2(int rows){
        for (int i = 0; i < rows; i++) {
            int number = 1;
            // 打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }




    public static void main(String[] args) {
        printYanghui(3);
    }

}

