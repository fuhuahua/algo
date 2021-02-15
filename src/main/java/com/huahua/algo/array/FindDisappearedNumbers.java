package com.huahua.algo.array;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(nums[i]);
        }
        for (int i = 1; i <= result.size(); i++) {
            if(!result.contains(i)){
                result2.add(i);
            }
        }
        return result2;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(i+1);
            if(result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    public static List<Integer> findDisappearedNumbers3(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] <= n) {
                ret.add(i + 1);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers3(nums));
    }
}
