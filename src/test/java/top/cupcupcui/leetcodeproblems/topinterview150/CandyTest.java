package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

public class CandyTest {

    /**
     * 输入：ratings = [1,0,2]
     * 输出：5
     */
    @Test
    public void test_PositiveCase0() {
        Candy candy = new Candy();
        int[] nums = {1, 0, 2};
        int expected = 5;
        int response = candy.candy(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：ratings = [1,2,2]
     * 输出：4
     */
    @Test
    public void test_PositiveCase1() {
        Candy candy = new Candy();
        int[] nums = {1, 2, 2};
        int expected = 4;
        int response = candy.candy(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：ratings = [1,9,2]
     * 输出：4
     */
    @Test
    public void test_PositiveCase2() {
        Candy candy = new Candy();
        int[] nums = {1, 9, 2};
        int expected = 4;
        int response = candy.candy(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：ratings = [1,9,2,1]
     * 输出：4
     */
    @Test
    public void test_PositiveCase3() {
        Candy candy = new Candy();
        int[] nums = {1, 9, 2, 1};
        int expected = 5;
        int response = candy.candy(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 方法一：两次遍历
     * 思路及解法
     *
     * 我们可以将「相邻的孩子中，评分高的孩子必须获得更多的糖果」这句话拆分为两个规则，分别处理。
     *
     * 左规则：当 ratings[i−1]<ratings[i] 时，i 号学生的糖果数量将比 i−1 号孩子的糖果数量多。
     *
     * 右规则：当 ratings[i]>ratings[i+1] 时，i 号学生的糖果数量将比 i+1 号孩子的糖果数量多。
     *
     * 我们遍历该数组两次，处理出每一个学生分别满足左规则或右规则时，最少需要被分得的糖果数量。每个人最终分得的糖果数量即为这两个数量的最大值。
     *
     * 具体地，以左规则为例：我们从左到右遍历该数组，假设当前遍历到位置 i，如果有 ratings[i−1]<ratings[i] 那么 i 号学生的糖果数量将比 i−1 号孩子的糖果数量多，我们令 left[i]=left[i−1]+1 即可，否则我们令 left[i]=1。
     *
     * 在实际代码中，我们先计算出左规则 left 数组，在计算右规则的时候只需要用单个变量记录当前位置的右规则，同时计算答案即可。
     *
     * 代码
     *
     * 作者：力扣官方题解
     */


}