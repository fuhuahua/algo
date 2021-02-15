package com.huahua.algo.array;

public class FindMaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        if(nums.length < 0 || nums.length>10000){
            return 0;
        }
        int maxNumber = 0;
        int currMaxNumber = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 1){
                currMaxNumber++;
            }else {
                if(currMaxNumber > maxNumber){
                    maxNumber = currMaxNumber;
                }
                currMaxNumber = 0;
            }
            if(currMaxNumber > maxNumber){
                maxNumber = currMaxNumber;
            }
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }

}
