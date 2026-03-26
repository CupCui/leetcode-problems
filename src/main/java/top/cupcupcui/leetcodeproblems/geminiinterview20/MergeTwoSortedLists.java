package top.cupcupcui.leetcodeproblems.geminiinterview20;

/**
 * 21. 合并两个有序链表
 *
 * @author cuiguanghao
 * @date 2026/3/26 12:30
 */
public class MergeTwoSortedLists {
    /**
     * https://leetcode.cn/problems/merge-two-sorted-lists/description/
     * 21. 合并两个有序链表
     * 简单
     * 将两个**升序**链表合并为一个新的 **升序** 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     *
     * 示例 1：
     * 输入：l1 = [1,2,4], l2 = [1,3,4]
     * 输出：[1,1,2,3,4,4]
     *
     * 示例 2：
     * 输入：l1 = [], l2 = []
     * 输出：[]
     *
     * 示例 3：
     * 输入：l1 = [], l2 = [0]
     * 输出：[0]
     *
     * 提示：
     * 两个链表的节点数目范围是 [0, 50]
     * -100 <= Node.val <= 100
     * l1 和 l2 均按 **非递减顺序** 排列
     */

    /**
     * 考点：递归、链表
     * 思路：遍历 list1、list2，比较大小，结果放到一个新 node 中。
     * 时间复杂度：O(n + m)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode ansNode = null;
        if (list1.val <= list2.val) {
            ansNode = list1;
            list1 = list1.next;
        } else {
            ansNode = list2;
            list2 = list2.next;

        }

        ListNode currNode = ansNode;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currNode.next = list1;
                list1 = list1.next;
                currNode = currNode.next;
            } else {
                currNode.next = list2;
                list2 = list2.next;
                currNode = currNode.next;
            }
        }
        if (list1 == null) {
            currNode.next = list2;
        }
        if (list2 == null) {
            currNode.next = list1;
        }

        return ansNode;
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
