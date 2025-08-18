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

}