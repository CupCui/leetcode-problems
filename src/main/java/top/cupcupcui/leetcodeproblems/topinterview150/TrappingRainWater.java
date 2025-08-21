package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/8/20 15:03
 * @description 42. 接雨水
 */
public class TrappingRainWater {

    /**
     * https://leetcode.cn/problems/trapping-rain-water/description/?envType=study-plan-v2&envId=top-interview-150
     * <p>
     * 42. 接雨水
     * 困难
     * <p>
     * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
     * <p>
     * 示例 1：
     * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * 输出：6
     * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
     * 示例 2：
     * 输入：height = [4,2,0,3,2,5]
     * 输出：9
     * <p>
     * 提示：
     * n == height.length
     * 1 <= n <= 2 * 104
     * 0 <= height[i] <= 105
     * <p>
     * 相关标签：栈、数组、双指针、动态规划、单调栈
     */


    /**
     * 思路：
     * -[] 遍历，找到左边的最大值和右边的最大值
     * 复杂度分析
     * 时间复杂度：O(n2)
     * 空间复杂度：O(n)
     * 相关标签:
     * 测试: 测试通过
     * 结果: 超出时间限制
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {

        /**
         * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
         * 输出：6
         * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
         *
         * 输入：height =            [0,1,0,2,1,0,3,1,0]
         * 输入：relativeMaxHeight = [0,1,1,2,2,2,3,0,0]
         * 输入：relativeMaxMargin = [0,0,1,0,2,2,0,0,0]
         * 输出：4
         */

        int[] relativeMaxHeight = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            int leftMaxHeight = 0;
            int rightMaxHeight = 0;
            for (int j = 0; j < i; j++) {
                leftMaxHeight = Math.max(leftMaxHeight, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                rightMaxHeight = Math.max(rightMaxHeight, height[j]);
            }
            relativeMaxHeight[i] = Math.min(leftMaxHeight, rightMaxHeight);
        }

        int trapped = 0;
        for (int i = 0; i < height.length; i++) {
            int relativeHeight = relativeMaxHeight[i] - height[i];
            relativeHeight = Math.max(relativeHeight, 0);
            trapped += relativeHeight;
        }

        return trapped;
    }

    /**
     * 力扣官方题解
     *
     * @param height
     * @return
     */
    public int trap1(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; ++i) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }


}