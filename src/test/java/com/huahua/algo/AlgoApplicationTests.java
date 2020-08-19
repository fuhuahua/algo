package com.huahua.algo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AlgoApplicationTests {

    @Autowired
    private IListQuestions iListQuestions;

    @Test
    void contextLoads() {
        ListNode node1 = new ListNode(0);
        ListNode node11 = new ListNode(2);
        ListNode node111 = new ListNode(3);
        node11.next = node111;
        node1.next = node11;
        revertList(node1);
        ListNode node2 = new ListNode(0);
        ListNode node22 = new ListNode(3);
        node2.next = node22;
        sumTwo(node1,node2);
        ListNode head = new ListNode();
        Integer[] v = {1,2,4};
        head.push(v);
        for (int i = 0; i < 5; i++) {
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
        System.out.println(head.toString());
        node1.val = 2;
        node1.next = node1;
        iListQuestions.sumTwo(node1, node2);
    }

    public int sumTwo(ListNode node1, ListNode node2){

        int a = node1.getVal();
        StringBuilder builder1 = new StringBuilder();
        builder1.append(node1.getVal());
        StringBuilder builder2 = new StringBuilder();
        builder2.append(node2.getVal());
        while (node1.next!=null){
            node1 = node1.next;
            int value = node1.getVal();
            builder1.append(","+ value);

        }
        while (node2.next!=null){
             node2 = node2.next;
            int value = node2.getVal();
            builder2.append(","+ value);

        }
        
        int node1Sum = 0;
        int node2Sum = 0;
        for (int i = 0; i < builder1.toString().split(",").length; i++) {

        }

        return 0;
    }

    /**
     * 1.构造临时链表存储上次循环里的
     * 2.将当前链表指向temp
     * 3.将当前链表赋值给temp
     */
    public ListNode revert(ListNode node){

        if(node == null || node.next == null){
            return node;
        }
        ListNode reversedNode = null;
        ListNode temp = node;
        while (node.next!=null){
            temp = node.next;

            reversedNode = node;
            node = node.next;
        }
        node.next =temp;
        return reversedNode;
    }

    public ListNode revertList(ListNode node){

        if(node == null || node.next == null){
            return node;
        }
        ListNode prev = null;
        ListNode curr = node;
        while (curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

}
