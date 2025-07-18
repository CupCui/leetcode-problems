package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/7/16 19:12
 * @description 121. 买卖股票的最佳时机
 */
public class BestTimeToBuyAndSellStock {
    /**
     * 简单
     * <p>
     * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
     * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
     * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
     * <p>
     * 示例 1：
     * 输入：[7,1,5,3,6,4]
     * 输出：5
     * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     * 示例 2：
     * 输入：prices = [7,6,4,3,1]
     * 输出：0
     * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
     * <p>
     * 提示：
     * 1 <= prices.length <= 105
     * 0 <= prices[i] <= 104
     * <p>
     * 思路：
     * -[] 贪心算法，遍历，每次获取最大收益
     * 时间复杂度：0(n2)
     * 空间负责度：0(1)
     * 知识点：数组 / 字符串
     * 测试:
     * 结果: 超出时间限制
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @return
     */

    public int bestTimeToBuyAndSellStock(int[] prices) {

        // 最大收益
        int maxMargin = 0;

        for (int i = 0; i < prices.length; i++) {
            int buyPrice = prices[i];
            for (int j = i; j < prices.length; j++) {
                int salePrice = prices[j];
                int margin = salePrice - buyPrice;
                if (margin > maxMargin) {
                    maxMargin = margin;
                }
            }

        }

        return maxMargin;
    }

}
