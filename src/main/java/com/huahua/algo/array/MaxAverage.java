package com.huahua.algo.array;

public class MaxAverage {
    
    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage = 0d;
        double maxAveragef = 0d;
        int hasz = 0;
        for (int i = 0; i < nums.length; i++) {
            int sumK = 0;
            int end = k + i;
            if(end <= nums.length) {
                for (int j = i; j < k + i; j++) {
                    sumK = sumK + nums[j];
                }
            }
            if(sumK < 0 && maxAveragef >= 0){
                maxAveragef = sumK;
            }
            if(sumK > 0) {
                hasz++;
                if (sumK > maxAverage) {
                    maxAverage = sumK;
                }
            }
        }
        if(hasz == 0){
            return maxAveragef/k;
        }
        return maxAverage/k;
    }

    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 1;
        System.out.println(findMaxAverage(nums,k));
    }
}
