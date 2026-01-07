package top.cupcupcui.leetcodeproblems.binarysearch;

/**
 * @author cuiguanghao
 * @date 2025/11/27 16:57
 * @description 704. 二分查找
 */
public class BinarySearchV2 {
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
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        /**
         * 输入: nums = [-1,0,3,5,9,12], target = 9
         * 输出: 4
         * 解释: 9 出现在 nums 中并且下标为 4
         */
        int low = 0;
        int high = nums.length - 1;
        // why not left < right
        //   ans: because if only one element, it will be give a wrong answer.
        // why the exit condition is lef <= right
        //   ans: because if not lef <= right, it will be never stop.

        while (low <= high) {
            // consider out of bound
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

}
