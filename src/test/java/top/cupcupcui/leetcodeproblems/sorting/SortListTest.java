package top.cupcupcui.leetcodeproblems.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortListTest {

    /**
     * 输入：head = [4,2,1,3]
     * 输出：[1,2,3,4]
     */
    @Test
    public void test_PositiveCase0() {
        SortList service = new SortList();
        int[] arg1 = {4, 2, 1, 3};
        SortList.ListNode head = getListNode(arg1);

        SortList.ListNode expected = getListNode(arg1);
        SortList.ListNode response = service.sortList(head);
        do {
            Assert.assertEquals(expected.val, response.val);
            response = response.next;
            expected = expected.next;
            Assert.assertEquals(expected.next == null, response.next == null);
        } while (expected.next != null && response.next != null);
        Assert.assertEquals(expected.val, response.val);
    }

    private static SortList.ListNode getListNode(int[] arg1) {
        SortList.ListNode head = new SortList.ListNode();
        head.val = arg1[0];
        SortList.ListNode preNode = head;
        for (int i = 1; i < arg1.length; i++) {
            SortList.ListNode node = new SortList.ListNode();
            node.val = arg1[i];
            preNode.next = node;
            preNode = node;
        }
        return head;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
}