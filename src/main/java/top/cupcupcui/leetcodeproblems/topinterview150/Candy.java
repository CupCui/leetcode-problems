package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/8/15 18:05
 * @description
 */
public class Candy {
    /**
     * https://leetcode.cn/problems/candy/description/?envType=study-plan-v2&envId=top-interview-150
     *
     * 135. 分发糖果
     * 困难
     *
     * n 个孩子站成一排。给你一个整数数组 ratings 表示每个孩子的评分。
     *
     * 你需要按照以下要求，给这些孩子分发糖果：
     *
     * 每个孩子至少分配到 1 个糖果。
     * 相邻两个孩子中，评分更高的那个会获得更多的糖果。
     * 请你给每个孩子分发糖果，计算并返回需要准备的 最少糖果数目 。
     *
     * 示例 1：
     * 输入：ratings = [1,0,2]
     * 输出：5
     * 解释：你可以分别给第一个、第二个、第三个孩子分发 2、1、2 颗糖果。
     *
     * 示例 2：
     * 输入：ratings = [1,2,2]
     * 输出：4
     * 解释：你可以分别给第一个、第二个、第三个孩子分发 1、2、1 颗糖果。
     *      第三个孩子只得到 1 颗糖果，这满足题面中的两个条件。
     *
     * 输入：ratings = [1,9,2,1]
     * 输出：7
     *
     * 提示：
     *
     * n == ratings.length
     * 1 <= n <= 2 * 104
     * 0 <= ratings[i] <= 2 * 104
     */


    /**
     * 思路：
     * -[] 两次遍历，left[] 和 right[]
     * 时间复杂度：0()
     * 空间负责度：0()
     * 知识点：数组 / 字符串
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param ratings
     * @return
     */
    public int candy01(int[] ratings) {

        // int[] candy

        /**
         * 输入：ratings = [1,2,2]
         * 输入：leftCandy = [1,2,3]
         * 输入：rightCandy = [1,2,1]
         * 输出：4
         *
         * 输入：ratings = [1,9,2]
         * 输入：leftCandy =  [1,2,1]
         * 输入：rightCandy = [1,2,1]
         * 输出：4
         *
         * 输入：ratings = [1,9,2,1]
         * 输入：leftCandy =  [1, 2, 1, 1]
         * 输入：rightCandy = [1, 3, 2, 1]
         * 输出：7
         */


        return -1;

    }


    /**
     * 作者：力扣官方题解
     */
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }

        int[] rightCandy = new int[n];

        int right = 0, ret = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            rightCandy[i] = right;
            ret += Math.max(left[i], right);
        }
        return ret;
    }


}
