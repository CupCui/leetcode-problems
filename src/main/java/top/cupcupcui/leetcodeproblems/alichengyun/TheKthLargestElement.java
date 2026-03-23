package top.cupcupcui.leetcodeproblems.alichengyun;

/**
 * 数组第 K 大元素（用快速排序思想实现）
 *
 * @author cuiguanghao
 * @date 2026/3/23 14:42
 */
public class TheKthLargestElement {
    /**
     * 题目：数组第 K 大元素（用快速排序思想实现）
     *
     * 题目描述：
     * 给定一个整数数组 nums 和一个整数 k，请返回数组中**第 k 大**的**元素**。
     * 要求使用**快排**相关思想完成（推荐：partition 分区过程），而不是直接调用库排序。
     *
     * 说明：
     * 1. 第 k 大是按从大到小排序后的第 k 个元素，不是第 k 个不同元素。
     * 2. 可以基于快速排序做部分排序，或使用快速选择（QuickSelect）实现。
     *
     * 输入格式：
     * nums：整数数组
     * k：正整数
     *
     * 输出格式：
     * 返回一个整数，表示第 k 大元素
     *
     * 示例 1：
     * 输入：nums = [3,2,1,5,6,4], k = 2
     * 输出：5
     * 解释：从大到小排序后为 [6,5,4,3,2,1]，第 2 大是 5。
     *
     * 示例 2：
     * 输入：nums = [3,2,3,1,2,4,5,5,6], k = 4
     * 输出：4
     * 解释：从大到小排序后为 [6,5,5,4,3,3,2,2,1]，第 4 大是 4。
     *
     * 数据范围：
     * 1 <= nums.length <= 10^5
     * -10^4 <= nums[i] <= 10^4
     * 1 <= k <= nums.length
     */

    /**
     * 思路：
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @return
     */
    public int theKthLargestElement(int[] nums, int k) {
        // 快排
        /**
         * 输入：nums = [6,5,4,3,2,1], k = 2
         * left   mid   right
         * 0      3(3)     5
         * 输入：nums = [2,1,3  ,4,  6,5], k = 2
         *
         * left   mid   right
         * 0      1(1)     2
         * 输入：nums = [1,2,3  ,4,  6,5], k = 2
         *
         * 输出：5
         */
        int left = 0;
        int right = nums.length - 1;
        partition(nums, left, right);

        return nums[nums.length - k];
    }

    private void partition(int[] nums, int left, int right) {
        if (left < 0 || right > nums.length - 1) {
            return;
        }
        if (left >= right) {
            return;
        }
        int pivotIndex = left;
        for (int i = left; i <= right; i++) {
            // 交换 pivotIndex 和 i
            if (nums[i] < nums[right]) {
                swap(nums, i, pivotIndex);
                pivotIndex++;
            }
        }
        // 将 mid 放到位置上
        swap(nums, pivotIndex, right);

        partition(nums, left, pivotIndex - 1);
        partition(nums, pivotIndex + 1, right);
    }

    private void swap(int[] nums, int source, int target) {
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }

}
