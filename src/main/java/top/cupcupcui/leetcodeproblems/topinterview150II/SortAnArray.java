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
     * 时间复杂度：O(nlogn/n2)
     * 空间复杂度：O(n)
     * 结果: 超出时间限制
     * 优化建议：
     * 1，主元随机获取；2.原地交换数据
     *
     * @param nums
     * @return
     */
    public int[] sortArray(int[] nums) {
        /**
         * 小于等于的放到左边
         * 输入：nums = [5,1,1,2,0,0] left = 0, right = 5
         * 输入：nums = [1,1,2,0,0,5] left = 0, right = 5
         * 输入：nums = [0,0,1,1] [2,5] left = 0, right = 3 left = 4, right = 5
         * 输入：nums = [0,0] [1,1] [2] [5] left = 0, right = 1 left = 5, right = 5
         *
         *
         * 输入：nums = [5,1,1,2,0,0]
         * 输入：nums = [1,1,2,0,0] [5]
         * 输入：nums = [0,0] [1,1,2] [5]
         * 输入：nums = [0,0] [1,1] [2] [5]
         */
        // 左边界
        int left = 0;
        // 右边界
        int right = nums.length - 1;

        extracted(nums, left, right);

        return nums;
    }

    /**
     * 递归
     *
     * @param nums  数组
     * @param left  左边界
     * @param right 右边界
     */
    private static void extracted(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        // 主元
        int pivot = left;

        // 存放临时排序结果
        int[] tempNums = new int[right - left + 1];
        // 起点指针
        int tempStart = 0;
        // 终点指针
        int tempEnd = tempNums.length - 1;
        // 遍历区间数组
        for (int j = left + 1; j <= right; j++) {
            // 和主元比较
            if (nums[j] <= nums[pivot]) {
                tempNums[tempStart] = nums[j];
                tempStart++;
            } else {
                tempNums[tempEnd] = nums[j];
                tempEnd--;
            }
        }
        tempNums[tempStart] = nums[pivot];
        for (int j = 0; j < tempNums.length; j++) {
            nums[left + j] = tempNums[j];
        }

        // 计算新的分区点
        int pivotIndex = left + tempStart;

        // 递归排序左右两部分
        extracted(nums, left, pivotIndex - 1);
        extracted(nums, pivotIndex + 1, right);
    }

}
