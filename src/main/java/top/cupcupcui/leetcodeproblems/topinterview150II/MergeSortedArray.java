package top.cupcupcui.leetcodeproblems.topinterview150II;

import java.util.Arrays;

/**
 * @author cuiguanghao
 * @date 2025/11/12 16:06
 * @description 88. 合并两个有序数组
 */
public class MergeSortedArray {
    /**
     * https://leetcode.cn/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
     * 88. 合并两个有序数组
     * 简单
     * 提示
     * 给你两个按 **非递减**顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 **非递减**顺序 排列。
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     *
     *
     * 示例 1：
     * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * 输出：[1,2,2,3,5,6]
     * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
     * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
     *
     * 示例 2：
     * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
     * 输出：[1]
     * 解释：需要合并 [1] 和 [] 。
     * 合并结果是 [1] 。
     *
     * 示例 3：
     * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
     * 输出：[1]
     * 解释：需要合并的数组是 [] 和 [1] 。
     * 合并结果是 [1] 。
     * 注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。
     *
     * 提示：
     * nums1.length == m + n
     * nums2.length == n
     * 0 <= m, n <= 200
     * 1 <= m + n <= 200
     * -109 <= nums1[i], nums2[j] <= 109
     *
     * 进阶：你可以设计实现一个时间复杂度为 O(m + n) 的算法解决此问题吗？
     *
     * 相关标签
     * 数组 双指针 排序
     */

    /**
     * 思路：
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     * @return
     */
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        /**
         * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
         * 输出：[1,2,2,3,5,6]
         * 双指针
         * 新建一个空数组
         * while point1 < nums1.length && point2 < nums2.length
         * 比较 nums1[point1] 和 nums2[point2]
         * 如果 nums1[point1] <= nums2[point2]
         *      将 nums1[point1] 放入数组
         * 如果 nums1[point1] > nums2[point2]
         *      将 nums2[point2] 放入数组
         *
         * 输入：nums1 = [1,0], m = 1, nums2 = [1], n = 1
         * 输出：[1,1]
         */
        int[] ans = new int[nums1.length];
        if (nums2.length == 0) {
            ans = nums1;
        }
        int point1 = 0;
        int point2 = 0;
        int i = 0;
        while (i < nums1.length) {
            if (point2 < n && (nums2[point2] <= nums1[point1] || point1 >= m)) {
                ans[i] = nums2[point2];
                point2++;
            } else {
                ans[i] = nums1[point1];
                point1++;
            }
            i++;
        }

        for (int j = 0; j < nums1.length; j++) {
            nums1[j] = ans[j];
        }
        return nums1;
    }

}
