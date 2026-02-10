package top.cupcupcui.leetcodeproblems.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cuiguanghao
 * @date 2026/2/9 14:26
 * @description 148. 排序链表
 */
public class SortList {
    /**
     * https://leetcode.cn/problems/sort-list/?envType=problem-list-v2&envId=sorting&
     * 148. 排序链表
     * 中等
     * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
     *
     * 示例 1：
     * 输入：head = [4,2,1,3]
     * 输出：[1,2,3,4]
     *
     * 示例 2：
     * 输入：head = [-1,5,3,4,0]
     * 输出：[-1,0,3,4,5]
     *
     * 示例 3：
     * 输入：head = []
     * 输出：[]
     *
     * 提示：
     * 链表中节点的数目在范围 [0, 5 * 104] 内
     * -105 <= Node.val <= 105
     *
     * 进阶：你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
     *
     * 相关标签
     * 链表 双指针 分治 排序 归并排序
     */

    /**
     * 思路：
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        /**
         * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
         * 输入：head = [4,2,1,3]
         * 输出：[1,2,3,4]
         */
        /**
         * 暴力解法：
         *  新建一个 head newHead，
         *  遍历 nodes，固定一个 node，遍历 new nodes，把 node 放到合适的位置
         */

        List<Integer> values = new ArrayList<>();
        do {
            values.add(head.val);
            head = head.next;
        } while (head.next != null);
        values.add(head.val);
        System.out.println(values);

        return null;
    }

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
