package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/11/7 10:45
 * @description 704. Binary Search（二分查找）
 */
public class BinarySearch {
    /**
     * 题目描述
     * 给定一个 n 个元素**有序（升序）**整型数组 nums 和一个目标值 target，写一个函数搜索 nums 中的 target。如果目标值存在，返回其下标；否则返回 -1。
     *
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     * 解释: 9 出现在 nums 中并且下标为 4
     *
     * 输入: nums = [-1,0,3,5,9,12], target = 2
     * 输出: -1
     * 解释: 2 不存在 nums 中因此返回 -1
     */

    /**
     * 思路：
     * -[]
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
         * 输入: nums = [1,2,3,4,5], target = 4 2
         * 输出: 3
         * 输入: nums = [1,2,3,4], target = 4 1
         * 输出: 3
         */
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middleIndex = (right - left) / 2 + left;
            if (nums[middleIndex] == target) {
                return middleIndex;
            }

            if (nums[middleIndex] < target) {
                left = middleIndex + 1;
            } else {
                right = middleIndex - 1;
            }
        }
        return -1;
    }

    /**
     * 思路：遍历
     * -[]
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int search1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }


}
