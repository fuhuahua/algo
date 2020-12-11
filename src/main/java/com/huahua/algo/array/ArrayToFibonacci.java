package com.huahua.algo.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个数字字符串 S，比如 S = "123456579"，我们可以将它分成斐波那契式的序列 [123, 456, 579]
 * 示例 1：
 *
 * 输入："123456579"
 * 输出：[123,456,579]
 * 示例 2：
 *
 * 输入: "11235813"
 * 输出: [1,1,2,3,5,8,13]
 * 示例 3：
 *
 * 输入: "112358130"
 * 输出: []
 * 解释: 这项任务无法完成。
 * 示例 4：
 *
 * 输入："0123"
 * 输出：[]
 * 解释：每个块的数字不能以零开头，因此 "01"，"2"，"3" 不是有效答案。
 * 示例 5：
 *
 * 输入: "1101111"
 * 输出: [110, 1, 111]
 * 解释: 输出 [11,0,11,11] 也同样被接受。
 *
 * 提示：
 *
 * 1 <= S.length <= 200
 * 字符串 S 中只含有数字。
 *
 */
public class ArrayToFibonacci {

    public static List<Integer> splitIntoFibonacci(String s) {
        String[] splitResult = s.split("");
        List<Integer> result = new ArrayList();
        for(){

        }
    }

    public static boolean isFibonacci(List<Integer> targetList){
        for (int i = 2; i < targetList.size(); i++) {
            if(targetList.get(i-2) + targetList.get(i - 1) != targetList.get(i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        splitIntoFibonacci("11111111");
    }
}
