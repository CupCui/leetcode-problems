package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/11/6 15:05
 * @description 11. 盛最多水的容器
 */
public class ContainerWithMostWater {
    /**
     * https://leetcode.cn/problems/container-with-most-water/description/?envType=study-plan-v2&envId=top-interview-150
     * 11. 盛最多水的容器
     * 提示
     * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * 返回容器可以储存的最大水量。
     * 说明：你不能倾斜容器。
     *
     * 示例 1：
     * 输入：[1,8,6,2,5,4,8,3,7]
     * 输出：49
     * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
     *
     * 示例 2：
     * 输入：height = [1,1]
     * 输出：1
     *
     * 提示：
     * n == height.length
     * 2 <= n <= 105
     * 0 <= height[i] <= 104
     *
     * 相关标签
     * 贪心 数组 双指针
     */

    /**
     * 思路：双指针
     * 核心思想: 贪心策略，总是移动较短边的指针，以寻找可能的更优解
     * -[]
     * 复杂度分析
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 相关标签:
     * 测试:
     * 结果: 超出时间限制
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int result = 0;
        while (left < right) {
            int currMaxArea = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, currMaxArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    /**
     * 思路：暴力解法，贪心，获取每个线能盛的容量，取最大值
     * -[]
     * 复杂度分析
     * 时间复杂度：O(n2)
     * 空间复杂度：O(n)
     * 相关标签:
     * 测试:
     * 结果: 超出时间限制
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param height
     * @return
     */
    public int maxArea1(int[] height) {
        int[] maxArea = new int[height.length];
        for (int i = 0; i < height.length - 1; i++) {
            /**
             * 输入：height = [1,1]
             * 输出：1
             * 输入：height = [1,0]
             * 输出：0
             * 输入：height = [1,2,3,4]
             * 输出：4
             */
            int left = i;
            int leftMaxArea = 0;
            for (int j = i + 1; j < height.length; j++) {
                int right = j;
                int currMaxArea = Math.min(height[left], height[right]) * (right - left);
                if (currMaxArea > leftMaxArea) {
                    leftMaxArea = currMaxArea;
                }
            }
            maxArea[i] = leftMaxArea;
        }
        int result = maxArea[0];
        for (int i = 0; i < maxArea.length; i++) {
            result = Math.max(result, maxArea[i]);
        }
        return result;
    }

}
