package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockTest {

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：[7,1,5,3,6,4]
     * 输出：5
     * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     */
    @Test
    public void jumpGame_PositiveCase0() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {7, 1, 5, 3, 6, 4};
        int expected = 5;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：[7,1,1,1,1,1]
     * 输出：0
     * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
     */
    @Test
    public void jumpGame_PositiveCase2() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {7, 1, 1, 1, 1, 1};
        int expected = 0;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：[1,7,1,1,1,7]
     * 输出：0
     */
    @Test
    public void jumpGame_PositiveCase3() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {1, 7, 1, 1, 1, 7};
        int expected = 6;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：[0,7,1,8,1,7]
     * 输出：8
     */
    @Test
    public void jumpGame_PositiveCase4() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {0, 7, 1, 8, 1, 7};
        int expected = 8;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 2：
     * 输入：prices = [7,6,4,3,1]
     * 输出：0
     * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
     */
    @Test
    public void jumpGame_PositiveCase1() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {7, 6, 4, 3, 1};
        int expected = 0;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }


    // ------ 反例 -------

    /**
     * 反例
     * <p>
     * 输入：prices = [2,4,1]
     * 输出：2
     */
    @Test
    public void jumpGame_NegativeCase1() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {2, 4, 1};
        int expected = 2;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }

    // ------- 临界条件 ------

    /**
     * 临界条件
     * <p>
     * 示例 2：
     * 输入：prices = [0]
     * 输出：0
     */
    @Test
    public void jumpGame_BoundaryCase1() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {0};
        int expected = 0;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 临界条件
     * <p>
     * 示例 2：
     * 输入：prices = [0,0]
     * 输出：0
     */
    @Test
    public void jumpGame_BoundaryCase2() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {0, 0};
        int expected = 0;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }


    /**
     * 临界条件
     * <p>
     * 示例 2：
     * 输入：prices = [0,1]
     * 输出：0
     */
    @Test
    public void jumpGame_BoundaryCase3() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {0, 1};
        int expected = 1;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 临界条件
     * <p>
     * 示例 2：
     * 输入：prices = [1,0]
     * 输出：1
     */
    @Test
    public void jumpGame_BoundaryCase4() {
        BestTimeToBuyAndSellStock service = new BestTimeToBuyAndSellStock();
        int[] nums = {1, 0};
        int expected = 0;
        int response = service.bestTimeToBuyAndSellStock(nums);
        Assert.assertEquals(expected, response);
    }


}