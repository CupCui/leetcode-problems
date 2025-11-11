package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.Arrays;

/**
 * @author cuiguanghao
 * @date 2025/11/6 17:23
 * @description 209. 长度最小的子数组
 */
public class MinimumSizeSubarraySum {
    /**
     * https://leetcode.cn/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
     * 209. 长度最小的子数组
     * 中等
     * 给定一个含有 n 个**正整数**的数组和一个正整数 target 。
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
     * 思路：滑动窗口
     * -[]
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 结果: 通过
     * 优化建议：
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        /**
         * 滑动窗口，左边界、左边界，左右边界的总和
         * 如果sum < target，right 右移
         * 如果sum >= target，left 右移
         */
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        /**
         * 输入：target = 7, nums = [2,3,1,2,4,3]
         * 输出：2
         */
        while (right < nums.length) {
            sum = sum + nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }

    /**
     * 思路：二分查找
     * -[]
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     * 结果: 通过
     * 优化建议：
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen4(int target, int[] nums) {
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < prefixSum.length - 1; i++) {
            int targetSum = target + prefixSum[i];
            int targetForIndex = search(prefixSum, targetSum, i + 1);
            if (targetForIndex != -1) {
                minLength = Math.min(minLength, targetForIndex - i);
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }

    /**
     * 给定一个 n 个元素的**有序（升序）**整型数组 nums 和一个目标值 target，写一个函数搜索 nums 中第一个大于等于 target 的元素。如果存在这样的元素，返回其下标；否则返回 -1。
     *
     * @param nums   数组
     * @param target 目标值
     * @param left   左边界
     * @return
     */
    public int search(int[] nums, int target, int left) {
        int right = nums.length - 1;
        if (left == right && nums[left] >= target) {
            // 只有一个元素并且第一个元素满足要求
            return left;
        }

        while (left <= right) {
            int middleIndex = (right - left) / 2 + left;

            if (nums[middleIndex] >= target) {
                if (middleIndex == 0 || nums[middleIndex - 1] < target) {
                    return middleIndex;
                }
                right = middleIndex - 1;
            } else if (nums[middleIndex] < target) {
                left = middleIndex + 1;
            }
        }
        return -1;
    }

    /**
     * 思路：利用有序性
     * -[]
     * 时间复杂度：O(n2)
     * 空间复杂度：O(n)
     * 结果: 超出时间限制
     * 优化建议：
     *
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen3(int target, int[] nums) {
        /**
         * 给定一个含有 n 个**正整数**的数组和一个正整数 target 。
         * 找出该数组中满足 nums[m] - nums[n] >= target, 其中 m - n 最小的值，返回 m - n。
         *
         * 输入：target = 7, nums = [2,5,6,8,12,15]
         * 输出：2
         * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
         */
        int[] sumNums = new int[nums.length + 1];
        sumNums[0] = 0;
        for (int i = 1; i < sumNums.length; i++) {
            sumNums[i] = sumNums[i - 1] + nums[i - 1];
        }
        int minSubArrayLen = Integer.MAX_VALUE;
        for (int i = 0; i < sumNums.length - 1; i++) {
            for (int j = i + 1; j < sumNums.length; j++) {
                if (sumNums[j] - sumNums[i] >= target) {
                    minSubArrayLen = Math.min(minSubArrayLen, j - i);
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
