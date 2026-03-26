package top.cupcupcui.leetcodeproblems.geminiinterview20;

/**
 * 53. 最大子数组和
 *
 * @author cuiguanghao
 * @date 2026/3/26 15:52
 */
public class MaximumSubarray {
    /**
     * https://leetcode.cn/problems/maximum-subarray/
     * 53. 最大子数组和
     * 中等
     * 给你一个整数数组 nums ，请你找出一个具有**最大和**的连续**子数组**（子数组最少包含**一个**元素），返回其最大和。
     * 子数组是数组中的一个连续部分。
     *
     * 示例 1：
     * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出：6
     * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
     *
     * 示例 2：
     * 输入：nums = [1]
     * 输出：1
     *
     * 示例 3：
     * 输入：nums = [5,4,-1,7,8]
     * 输出：23
     *
     * 提示：
     * 1 <= nums.length <= 105
     * -104 <= nums[i] <= 104
     * 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。
     */

    /**
     * 思路：
     * 思路一：遍历 nums，固定当前位置的元素；从当前位置再次遍历 nums，求最大的和
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {

        return -1;
    }

}
