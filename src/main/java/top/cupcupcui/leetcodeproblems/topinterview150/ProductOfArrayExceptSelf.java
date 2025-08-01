package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/8/1 18:03
 * @description 238. 除自身以外数组的乘积
 */
public class ProductOfArrayExceptSelf {
    /**
     * https://leetcode.cn/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=top-interview-150
     * product-of-array-except-self
     * ProductOfArrayExceptSelf
     * 238. 除自身以外数组的乘积
     * 中等
     * 提示
     * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
     * <p>
     * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
     * <p>
     * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
     * <p>
     * <p>
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1,2,3,4]
     * 输出: [24,12,8,6]
     * 示例 2:
     * <p>
     * 输入: nums = [-1,1,0,-3,3]
     * 输出: [0,0,9,0,0]
     * <p>
     * <p>
     * 提示：
     * <p>
     * 2 <= nums.length <= 105
     * -30 <= nums[i] <= 30
     * 输入 保证 数组 answer[i] 在  32 位 整数范围内
     * <p>
     * 进阶：你可以在 O(1) 的额外空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组 不被视为 额外空间。）
     *
     * 思路：
     * -[]
     * 时间复杂度：0()
     * 空间负责度：0()
     * 知识点：数组 / 字符串
     * 测试:
     * 结果: 通过
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @return
     */
    /**
     * 思路：两次循环遍历
     * -[]
     * 时间复杂度：0(n2)
     * 空间负责度：0(1)
     * 知识点：数组 / 字符串
     * 测试:
     * 结果: 通过
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param nums
     * @return
     */
    public int[] productOfArrayExceptSelf(int[] nums) {

        /**
         * 输入: nums = [1,2,3,4]
         * 输出: [24,12,8,6]
         */

        int[] answer = new int[nums.length];

        // 遍历 nums 次
        for (int i = 0; i < nums.length; i++) {

            boolean firstFor = true;
            // 遍历 nums 中除了当前元素的乘积
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (firstFor) {
                        firstFor = false;
                        answer[i] = nums[j];
                    } else {
                        answer[i] = answer[i] * nums[j];
                    }
                }
            }
        }

        return answer;
    }

}
