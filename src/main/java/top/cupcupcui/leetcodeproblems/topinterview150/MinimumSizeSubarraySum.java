package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.Arrays;

/**
 * @author cuiguanghao
 * @date 2025/11/6 17:23
 * @description
 */
public class MinimumSizeSubarraySum {
    /**
     * https://leetcode.cn/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
     * 209. 长度最小的子数组
     * 中等
     * 给定一个含有 n 个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其**总和大于等于 target** 的**长度最小的** 子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
     * 子数组是指数组中连续的元素序列，必须保持原有顺序且位置连续。
     * 示例 1：
     * 输入：target = 7, nums = [2,3,1,2,4,3]
     * 输出：2
     * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
     *
     * 示例 2：
     * 输入：target = 4, nums = [1,4,4]
     * 输出：1
     *
     * 示例 3：
     * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
     * 输出：0
     *
     * 提示：
     * 1 <= target <= 109
     * 1 <= nums.length <= 105
     * 1 <= nums[i] <= 104
     *
     * 进阶：
     * 如果你已经实现 O(n) 时间复杂度的解法, 请尝试设计一个 O(n log(n)) 时间复杂度的解法。
     *%
     * 相关标签
     * 数组 二分查找 前缀和 滑动窗口
     */

    /**
     * 思路：
     * -[]
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int minSubArrayLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    minSubArrayLen = Math.min(minSubArrayLen, j - i + 1);
                    break;
                }
            }
        }
        if (minSubArrayLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minSubArrayLen;
    }

    /**
     * 思路：暴力法，贪心
     * -[]
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     * 结果: 超出时间限制
     * 优化建议：
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen2(int target, int[] nums) {
        int minSubArrayLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    minSubArrayLen = Math.min(minSubArrayLen, j - i + 1);
                    break;
                }
            }
        }
        if (minSubArrayLen == Integer.MAX_VALUE) {
            return 0;
        }
        return minSubArrayLen;
    }

    /**
     * 思路：排序，贪心（子数组概念不理解导致错误解答）
     * -[]
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果: 答案错误
     * 优化建议：
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen1(int target, int[] nums) {
        // 冒泡排序
        for (int i = 0; i < nums.length - 1; i++) {
            int maxIndex = i;
            // 找出当前最大值的索引，交换 currIndex 和 maxIndex
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }

            // 交换
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }

        /**
         * 输入：target = 213, nums = [12,28,83,4,25,26,25,2,25,25,25,12]
         * 输出：8
         */
        System.out.println(Arrays.toString(nums));

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum >= target) {
                return i + 1;
            }
        }

        return 0;
    }
}
