package top.cupcupcui.leetcodeproblems.geminiinterview20;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTest {

    /**
     * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出：6
     */
    @Test
    public void test_PositiveCase0() {
        MaximumSubarray service = new MaximumSubarray();
        int[] arg1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected = 6;
        int response = service.maxSubArray(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1]
     * 输出：1
     */
    @Test
    public void test_PositiveCase1() {
        MaximumSubarray service = new MaximumSubarray();
        int[] arg1 = {1};
        int expected = 1;
        int response = service.maxSubArray(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [5,4,-1,7,8]
     * 输出：23
     */
    @Test
    public void test_PositiveCase2() {
        MaximumSubarray service = new MaximumSubarray();
        int[] arg1 = {5, 4, -1, 7, 8};
        int expected = 23;
        int response = service.maxSubArray(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1,2,3]
     * 输出：6
     */
    @Test
    public void test_PositiveCase3() {
        MaximumSubarray service = new MaximumSubarray();
        int[] arg1 = {1, 2, 3};
        int expected = 6;
        int response = service.maxSubArray(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [-1,-2,-3]
     * 输出：-1
     */
    @Test
    public void test_PositiveCase4() {
        MaximumSubarray service = new MaximumSubarray();
        int[] arg1 = {-1, -2, -3};
        int expected = -1;
        int response = service.maxSubArray(arg1);
        Assert.assertEquals(expected, response);
    }

}