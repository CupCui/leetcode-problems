package top.cupcupcui.leetcodeproblems.array;

import org.junit.Assert;
import org.junit.Test;
import top.cupcupcui.leetcodeproblems.sorting.ContainsDuplicate;

import static org.junit.Assert.*;

public class TwoSumTest {

    /**
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     */
    @Test
    public void test_PositiveCase0() {
        TwoSum service = new TwoSum();
        int[] arg1 = {2, 7, 11, 15};
        int arg2 = 9;
        int[] expected = {0, 1};
        int[] response = service.twoSum(arg1, arg2);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     */
    @Test
    public void test_PositiveCase1() {
        TwoSum service = new TwoSum();
        int[] arg1 = {3, 2, 4};
        int arg2 = 6;
        int[] expected = {1, 2};
        int[] response = service.twoSum(arg1, arg2);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     */
    @Test
    public void test_PositiveCase2() {
        TwoSum service = new TwoSum();
        int[] arg1 = {3, 3};
        int arg2 = 6;
        int[] expected = {0, 1};
        int[] response = service.twoSum(arg1, arg2);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [0,0], target = 0
     * 输出：[0,1]
     */
    @Test
    public void test_PositiveCase3() {
        TwoSum service = new TwoSum();
        int[] arg1 = {0, 0};
        int arg2 = 0;
        int[] expected = {0, 1};
        int[] response = service.twoSum(arg1, arg2);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [0,1,0], target = 0
     * 输出：[0,2]
     */
    @Test
    public void test_PositiveCase4() {
        TwoSum service = new TwoSum();
        int[] arg1 = {0, 1, 0};
        int arg2 = 0;
        int[] expected = {0, 2};
        int[] response = service.twoSum(arg1, arg2);
        Assert.assertArrayEquals(expected, response);
    }

}