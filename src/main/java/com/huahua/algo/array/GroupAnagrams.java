package com.huahua.algo.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>(strs.length);

        for (int i = 0; i < result.size(); i++) {
            List<String> child = result.get(i);
            for (int j = 0; j < strs.length; j++) {
//                if(j==0 && result.contains()){
//                    child.add(strs[j]);
//                }
                String[] split = strs[j].split("");
                int sum = 0;
                for (int i1 = 0; i1 < split.length; i1++) {
                    if(child.contains(split[i1])){
                        sum++;
                    }
                }
                if(sum == split.length){
                    child.add(strs[j]);
                }
            }
        }

        return result;
    }
}
