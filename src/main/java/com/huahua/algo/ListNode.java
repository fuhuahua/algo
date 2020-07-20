package com.huahua.algo;

import lombok.Data;

/**
 * @author xingkong
 * @date 2020/7/20 下午4:19
 */
@Data
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val=val;
    }
}
