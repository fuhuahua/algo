package com.huahua.algo.array;

import java.util.Arrays;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int i = 0;
        int j = nums.length - 1;
        int sumLeft = nums[i];
        int sumRight = nums[j];
        while (sumLeft != sumRight && j - i > 0) {
            if (sumLeft < sumRight) {
                i++;
                sumLeft = sumLeft + nums[i];
            } else {
                j--;
                sumRight = sumRight + nums[j];
            }
        }
        if (j - i == 2) {
            return i + 1;
        }
        return -1;
    }

    public int PivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }
}

//经验
/**
 * 先总结出公式，直接应用为代码条件
 */

