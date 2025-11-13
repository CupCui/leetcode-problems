package top.cupcupcui.leetcodeproblems.topinterview150II;

/**
 * @author cuiguanghao
 * @date 2025/11/12 17:01
 * @description 912. 排序数组
 */
public class SortAnArray {
    /**
     * https://leetcode.cn/problems/sort-an-array/description/
     * 912. 排序数组
     * 中等
     * 给你一个整数数组 nums，请你将该数组升序排列。
     *
     * 你必须在 不使用任何内置函数 的情况下解决问题，时间复杂度为 O(nlog(n))，并且空间复杂度尽可能小。
     *
     * 示例 1：
     * 输入：nums = [5,2,3,1]
     * 输出：[1,2,3,5]
     * 解释：数组排序后，某些数字的位置没有改变（例如，2 和 3），而其他数字的位置发生了改变（例如，1 和 5）。
     *
     * 示例 2：
     * 输入：nums = [5,1,1,2,0,0]
     * 输出：[0,0,1,1,2,5]
     * 解释：请注意，nums 的值不一定唯一。
     *
     * 提示：
     * 1 <= nums.length <= 5 * 104
     * -5 * 104 <= nums[i] <= 5 * 104
     *
     * 相关标签
     * 数组 分治 桶排序 计数排序 基数排序 排序 堆（优先队列） 归并排序
     *
     */

    /**
     * 思路：
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @return
     */
    public int[] sortArray(int[] nums) {
        int pivot = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                pivot = i;
            } else {
                // nums[i] >= nums[pivot]
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                pivot = i;
            }
        }

        return nums;
    }

}
