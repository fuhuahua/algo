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

    public ListNode() {
    }

    public ListNode(Integer val) {
        this.val = val;
    }


    public ListNode push(Integer[] value) {
        ListNode head = new ListNode();
        for (int i = 0; i < value.length; i++) {
            ListNode listNodeHead = new ListNode(i);
            ListNode temp = head;
            while (true) {
                if(temp.next == null){
                    break;
                }
                temp = temp.next;
            }
            temp.next = listNodeHead;
        }

        return head;
    }
}
