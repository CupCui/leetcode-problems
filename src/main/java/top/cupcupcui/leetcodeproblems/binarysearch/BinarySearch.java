package top.cupcupcui.leetcodeproblems.binarysearch;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @author cuiguanghao
 * @date 2025/11/27 16:57
 * @description 704. 二分查找
 */
public class BinarySearch {
    /**
     * https://leetcode.cn/problems/binary-search/?envType=study-plan-v2&envId=binary-search
     * 704. 二分查找
     * 简单
     *
     * 给定一个 n 个元素<b>有序</b>的（<b>升序</b>）<b>整型</b>数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果 target 存在返回下标，否则返回 -1。
     * 你必须编写一个具有 O(log n) 时间复杂度的算法。
     *
     * 示例 1:
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     * 解释: 9 出现在 nums 中并且下标为 4
     *
     * 示例 2:
     * 输入: nums = [-1,0,3,5,9,12], target = 2
     * 输出: -1
     * 解释: 2 不存在 nums 中因此返回 -1
     *
     * 提示：
     * 你可以假设 nums 中的所有元素是<b>不重复</b>的。
     * n 将在 [1, 10000]之间。
     * nums 的每个元素都将在 [-9999, 9999]之间。
     *
     * 相关标签
     * 数组 二分查找
     *
     */

    /**
     * 思路：二分法
     * 时间复杂度：O(logn)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        /**
         *
         * 输入: nums = [0,1,2,3], target = 9
         * 输出: 2
         * left right mid
         * 0    3     2
         * left right mid
         * 3    3     3
         */
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
