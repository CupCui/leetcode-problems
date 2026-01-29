package top.cupcupcui.leetcodeproblems.sorting;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cuiguanghao
 * @date 2026/1/27 17:15
 * @description 15. 三数之和
 */
public class ThreeSumV2 {
    /**
     * https://leetcode.cn/problems/3sum/description/?envType=problem-list-v2&envId=sorting&
     * 15. 三数之和
     * 中等
     * 提示
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
     * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且**不重复**的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     * 示例 1：
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     * 解释：
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
     * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
     * 注意，输出的顺序和三元组的顺序并不重要。
     *
     * 示例 2：
     * 输入：nums = [0,1,1]
     * 输出：[]
     * 解释：唯一可能的三元组和不为 0 。
     *
     * 示例 3：
     * 输入：nums = [0,0,0]
     * 输出：[[0,0,0]]
     * 解释：唯一可能的三元组和为 0 。
     *
     * 提示：
     * 3 <= nums.length <= 3000
     * -105 <= nums[i] <= 105
     *
     * 相关标签
     * 数组 双指针 排序
     */


    /**
     * 思路：双指针 排序
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     */
    public List<List<Integer>> threeSum(int[] nums) {
        /**
         *
         * 示例 1：
         * 输入：nums = [-1,0,1,2,-1,-4]
         * 排序：nums = [-4,-1,-1,0,1,2]
         * 输出：[[-1,-1,2],[-1,0,1]]
         */


        // 快排（分治）

        int l = 0;
        int h = nums.length - 1;
        partition(nums, l, h);

        return Collections.singletonList(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        // return null;
    }

    /**
     * 思路：双指针 排序
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     */
    private static void partition(int[] nums, int l, int h) {
        if (l >= h) {
            return;
        }
        // 基准值
        int pivotValue = nums[h];
        int pivotIndex = l;
        // 把小于基准值的元素放到左边，把大于基准值的元素放到右边，基准值归位
        // 遍历 nums 中每一个元素，如果 nums[i] 小于 pivot，把 nums[i] 和 pivotIndex 交换
        for (int i = l; i < h; i++) {
            if (nums[i] < pivotValue) {
                swap(nums, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(nums, pivotIndex, h);

        partition(nums, l, pivotIndex - 1);
        partition(nums, pivotIndex + 1, h);
    }

    private static void swap(int[] nums, int source, int target) {
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }

}
