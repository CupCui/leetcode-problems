package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainWaterTest {

    /**
     * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * 输出：6
     */
    @Test
    public void test_PositiveCase0() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [4,2,0,3,2,5]
     * 输出：9
     */
    @Test
    public void test_PositiveCase1() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {4, 2, 0, 3, 2, 5};
        int expected = 9;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [0]
     * 输出：0
     */
    @Test
    public void test_PositiveCase2() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {0};
        int expected = 0;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase3() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {1};
        int expected = 0;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [1, 1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase4() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {1, 1};
        int expected = 0;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

}