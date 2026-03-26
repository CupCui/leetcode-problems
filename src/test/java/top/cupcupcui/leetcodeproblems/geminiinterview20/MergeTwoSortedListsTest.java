package top.cupcupcui.leetcodeproblems.geminiinterview20;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    /**
     * 输入：l1 = [1,2,4], l2 = [1,3,4]
     * 输出：[1,1,2,3,4,4]
     */
    @Test
    public void test_PositiveCase0() {
        MergeTwoSortedLists service = new MergeTwoSortedLists();
        int[] l1 = new int[]{1, 2, 4};
        int[] l2 = new int[]{1, 3, 4};
        MergeTwoSortedLists.ListNode arg1 = getListNode(l1);
        MergeTwoSortedLists.ListNode arg2 = getListNode(l2);

        int[] l3 = new int[]{1, 1, 2, 3, 4, 4};
        MergeTwoSortedLists.ListNode expected = getListNode(l3);
        MergeTwoSortedLists.ListNode response = service.mergeTwoLists(arg1, arg2);
        assertNodeEquals(expected, response);
    }

    /**
     * 输入：l1 = [], l2 = []
     * 输出：[]
     */
    @Test
    public void test_PositiveCase1() {
        MergeTwoSortedLists service = new MergeTwoSortedLists();
        int[] l1 = new int[]{};
        int[] l2 = new int[]{};
        MergeTwoSortedLists.ListNode arg1 = getListNode(l1);
        MergeTwoSortedLists.ListNode arg2 = getListNode(l2);

        int[] l3 = new int[]{};
        MergeTwoSortedLists.ListNode expected = getListNode(l3);
        MergeTwoSortedLists.ListNode response = service.mergeTwoLists(arg1, arg2);
        assertNodeEquals(expected, response);
    }

    /**
     * 输入：l1 = [], l2 = [0]
     * 输出：[0]
     */
    @Test
    public void test_PositiveCase2() {
        MergeTwoSortedLists service = new MergeTwoSortedLists();
        int[] l1 = new int[]{};
        int[] l2 = new int[]{0};
        MergeTwoSortedLists.ListNode arg1 = getListNode(l1);
        MergeTwoSortedLists.ListNode arg2 = getListNode(l2);

        int[] l3 = new int[]{0};
        MergeTwoSortedLists.ListNode expected = getListNode(l3);
        MergeTwoSortedLists.ListNode response = service.mergeTwoLists(arg1, arg2);
        assertNodeEquals(expected, response);
    }

    /**
     * 输入：l1 = [2], l2 = [1]
     * 输出：[1,2]
     */
    @Test
    public void test_PositiveCase3() {
        MergeTwoSortedLists service = new MergeTwoSortedLists();
        int[] l1 = new int[]{2};
        int[] l2 = new int[]{1};
        MergeTwoSortedLists.ListNode arg1 = getListNode(l1);
        MergeTwoSortedLists.ListNode arg2 = getListNode(l2);

        int[] l3 = new int[]{1, 2};
        MergeTwoSortedLists.ListNode expected = getListNode(l3);
        MergeTwoSortedLists.ListNode response = service.mergeTwoLists(arg1, arg2);
        assertNodeEquals(expected, response);
    }

    /**
     * 输入：l1 = [3,3], l2 = [1,2]
     * 输出：[1,2,3,3]
     */
    @Test
    public void test_PositiveCase4() {
        MergeTwoSortedLists service = new MergeTwoSortedLists();
        int[] l1 = new int[]{3, 3};
        int[] l2 = new int[]{1, 2};
        MergeTwoSortedLists.ListNode arg1 = getListNode(l1);
        MergeTwoSortedLists.ListNode arg2 = getListNode(l2);

        int[] l3 = new int[]{1, 2, 3, 3};
        MergeTwoSortedLists.ListNode expected = getListNode(l3);
        MergeTwoSortedLists.ListNode response = service.mergeTwoLists(arg1, arg2);
        assertNodeEquals(expected, response);
    }

    private MergeTwoSortedLists.ListNode getListNode(int[] l1) {
        MergeTwoSortedLists.ListNode prevNode = null;
        MergeTwoSortedLists.ListNode arg1 = null;
        for (int i = l1.length - 1; i >= 0; i--) {
            arg1 = new MergeTwoSortedLists.ListNode(l1[i], prevNode);
            prevNode = arg1;
        }
        return arg1;
    }

    private void assertNodeEquals(MergeTwoSortedLists.ListNode expected, MergeTwoSortedLists.ListNode response) {
        while (expected != null) {
            Assert.assertEquals(expected.val, response.val);
            expected = expected.next;
            response = response.next;
        }
    }
}