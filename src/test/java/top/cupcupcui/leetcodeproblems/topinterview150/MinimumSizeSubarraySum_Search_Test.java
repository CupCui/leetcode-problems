package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

public class MinimumSizeSubarraySum_Search_Test {

    /**
     * 输入：target = 15, nums = [2, 5, 6, 8, 12, 15]
     * 输出：5
     */
    @Test
    public void test_PositiveCase0() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int[] arg1 = {2, 5, 6, 8, 12, 15};
        int arg2 = 15;
        int expected = 5;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 3, nums = [1,2,3,4]
     * 输出：2
     */
    @Test
    public void test_PositiveCase1() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int[] arg1 = {1, 2, 3, 4};
        int arg2 = 3;
        int expected = 2;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 0, nums = [1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase2() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int[] arg1 = {1};
        int arg2 = 0;
        int expected = 0;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 1, nums = [1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase3() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int[] arg1 = {1};
        int arg2 = 1;
        int expected = 0;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 2, nums = [1]
     * 输出：-1
     */
    @Test
    public void test_PositiveCase4() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int[] arg1 = {1};
        int arg2 = 2;
        int expected = -1;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

}