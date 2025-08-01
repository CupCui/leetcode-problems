package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductOfArrayExceptSelfTest {

    /**
     * 输入: nums = [1,2,3,4]
     * 输出: [24,12,8,6]
     */
    @Test
    public void test_PositiveCase0() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] response = productOfArrayExceptSelf.productOfArrayExceptSelf(nums);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入: nums = [-1,1,0,-3,3]
     * 输出: [0,0,9,0,0]
     */
    @Test
    public void test_PositiveCase1() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] response = productOfArrayExceptSelf.productOfArrayExceptSelf(nums);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入: nums = [-1,1]
     * 输出: [1,-1]
     */
    @Test
    public void test_PositiveCase2() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] nums = {-1, 1};
        int[] expected = {1, -1};
        int[] response = productOfArrayExceptSelf.productOfArrayExceptSelf(nums);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入: nums = [0,0]
     * 输出: [0,0]
     */
    @Test
    public void test_PositiveCase3() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] nums = {0, 0};
        int[] expected = {0, 0};
        int[] response = productOfArrayExceptSelf.productOfArrayExceptSelf(nums);
        Assert.assertArrayEquals(expected, response);
    }

}