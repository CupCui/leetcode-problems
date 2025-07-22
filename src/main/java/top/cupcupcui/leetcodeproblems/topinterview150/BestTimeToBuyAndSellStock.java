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
     * -[] 贪心，每一天都考虑，获取之前几天最小购入价，获取之后几天最大售出价
     * 时间复杂度：0()
     * 空间负责度：0()
     * 知识点：数组 / 字符串
     * 测试:
     * 结果: 超时
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @return
     */
    public int bestTimeToBuyAndSellStock(int[] prices) {
        /**
         * 假设给定的数组为：[7, 1, 5, 3, 6, 4]
         * 如果我们在图表上绘制给定数组中的数字，我们将会得到：
         *
         * 我们来假设自己来购买股票。随着时间的推移，每天我们都可以选择出售股票与否。那么，假设在第 i 天，如果我们要在今天卖股票，那么我们能赚多少钱呢？
         * 显然，如果我们真的在买卖股票，我们肯定会想：如果我是在历史最低点买的股票就好了！太好了，
         * 在题目中，我们只要用一个变量记录一个历史最低价格 minprice，我们就可以假设自己的股票是在那天买的。那么我们在第 i 天卖出股票能得到的利润就是 prices[i] - minprice。
         * 因此，我们只需要遍历价格数组一遍，记录历史最低点，然后在每一天考虑这么一个问题：如果我是在历史最低点买进的，那么我今天卖出能赚多少钱？当考虑完所有天数之时，我们就得到了最好的答案。
         */

        // 最大收益
        int maxMargin = 0;
        int historyMinPrice = prices[0];
        int historyMinPriceIndex = 0;

        // 每一天都考虑，今天要卖出
        for (int i = 0; i < prices.length; i++) {
            // 获取之前几天最小购入价
            for (int j = historyMinPriceIndex; j < i; j++) {
                int price = prices[j];
                if (price < historyMinPrice) {
                    historyMinPrice = price;
                    historyMinPriceIndex = i;
                }
            }

            int curMaxMargin = prices[i] - historyMinPrice;
            if (curMaxMargin > maxMargin) {
                maxMargin = curMaxMargin;
            }
        }

        return maxMargin;
    }

    /**
     * 思路：
     * -[]
     * 时间复杂度：0()
     * 空间负责度：0()
     * 知识点：数组 / 字符串
     * 测试:
     * 结果: 超时
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param prices
     * @return
     */
    public int bestTimeToBuyAndSellStock4(int[] prices) {
        /**
         * 假设给定的数组为：[7, 1, 5, 3, 6, 4]
         * 如果我们在图表上绘制给定数组中的数字，我们将会得到：
         *
         * 我们来假设自己来购买股票。随着时间的推移，每天我们都可以选择出售股票与否。那么，假设在第 i 天，如果我们要在今天卖股票，那么我们能赚多少钱呢？
         * 显然，如果我们真的在买卖股票，我们肯定会想：如果我是在历史最低点买的股票就好了！太好了，
         * 在题目中，我们只要用一个变量记录一个历史最低价格 minprice，我们就可以假设自己的股票是在那天买的。那么我们在第 i 天卖出股票能得到的利润就是 prices[i] - minprice。
         * 因此，我们只需要遍历价格数组一遍，记录历史最低点，然后在每一天考虑这么一个问题：如果我是在历史最低点买进的，那么我今天卖出能赚多少钱？当考虑完所有天数之时，我们就得到了最好的答案。
         */

        // 最大收益
        int maxMargin = 0;
        int historyMinPrice = prices[0];
        int historyMinPriceIndex = 0;

        // 每一天都考虑，今天要卖出
        for (int i = 0; i < prices.length; i++) {
            // 获取之前几天最小购入价
            for (int j = historyMinPriceIndex; j < i; j++) {
                int price = prices[j];
                if (price < historyMinPrice) {
                    historyMinPrice = price;
                    historyMinPriceIndex = i;
                }
            }

            int curMaxMargin = prices[i] - historyMinPrice;
            if (curMaxMargin > maxMargin) {
                maxMargin = curMaxMargin;
            }
        }

        return maxMargin;
    }

    /**
     * 思路：
     * -[] 贪心，每一天都考虑，获取之前几天最小购入价，获取之后几天最大售出价
     * 时间复杂度：0(n2)
     * 空间负责度：0(1)
     * 知识点：数组 / 字符串
     * 测试:
     * 结果: 超时
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param prices
     * @return
     */
    public int bestTimeToBuyAndSellStock3(int[] prices) {

        // 最大收益
        int maxMargin = 0;

        /**
         * 输入：prices = [2,4,1]
         * 输出：2
         */

        // 每一天都考虑
        for (int i = 0; i < prices.length; i++) {
            int leftMinPrice = prices[0];
            int leftMinPriceIndex = 0;

            // 获取之前几天最小购入价
            for (int j = 0; j < i; j++) {
                int leftPrice = prices[j];
                if (leftPrice < leftMinPrice) {
                    leftMinPrice = leftPrice;
                    leftMinPriceIndex = j;
                }
            }

            // 获取之后几天最大售出价
            for (int j = leftMinPriceIndex; j < prices.length; j++) {
                int currPrice = prices[j];
                int currMargin = currPrice - leftMinPrice;
                if (currMargin > maxMargin) {
                    maxMargin = currMargin;
                }
            }
        }

        return maxMargin;
    }

    /**
     * 输入：prices = [2,4,1]
     * 输出：2
     * <p>
     * 思路：
     * -[] 贪心，从左边找一个最小的，从右边找一个最大的
     * 时间复杂度：0(n)
     * 空间负责度：0(1)
     * 知识点：数组 / 字符串
     * 测试:
     * 结果: 不通过
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param prices
     * @return
     */
    public int bestTimeToBuyAndSellStock2(int[] prices) {

        // 最大收益
        int maxMargin = 0;
        int leftMinPrice = prices[0];
        int leftMinPriceIndex = 0;

        /**
         * 输入：prices = [2,4,1]
         * 输出：2
         */
        for (int i = 0; i < prices.length; i++) {
            int leftPrice = prices[i];
            if (leftPrice < leftMinPrice) {
                leftMinPrice = leftPrice;
                leftMinPriceIndex = i;
            }
        }

        for (int i = leftMinPriceIndex; i < prices.length; i++) {
            int currPrice = prices[i];
            int currMargin = currPrice - leftMinPrice;
            if (currMargin > maxMargin) {
                maxMargin = currMargin;
            }
        }

        return maxMargin;
    }

    /**
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
     * @param prices
     * @return
     */
    public int bestTimeToBuyAndSellStock1(int[] prices) {

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
