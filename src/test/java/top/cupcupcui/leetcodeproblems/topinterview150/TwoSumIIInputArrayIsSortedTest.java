package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumIIInputArrayIsSortedTest {

    /**
     * 输入：numbers = [2,7,11,15], target = 9
     * 输出：[1,2]
     */
    @Test
    public void test_PositiveCase0() {
        TwoSumIIInputArrayIsSorted service = new TwoSumIIInputArrayIsSorted();
        int[] arg1 = {2, 7, 11, 15};
        int arg2 = 9;
        int[] expected = {1, 2};
        int[] response = service.twoSum(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：numbers = [2,3,4], target = 6
     * 输出：[1,3]
     */
    @Test
    public void test_PositiveCase1() {
        TwoSumIIInputArrayIsSorted service = new TwoSumIIInputArrayIsSorted();
        int[] arg1 = {2, 3, 4};
        int arg2 = 6;
        int[] expected = {1, 3};
        int[] response = service.twoSum(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：numbers = [-1,0], target = -1
     * 输出：[1,2]
     */
    @Test
    public void test_PositiveCase2() {
        TwoSumIIInputArrayIsSorted service = new TwoSumIIInputArrayIsSorted();
        int[] arg1 = {-1, 0};
        int arg2 = -1;
        int[] expected = {1, 2};
        int[] response = service.twoSum(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：numbers = [0,0], target = 0
     * 输出：[1,2]
     */
    @Test
    public void test_PositiveCase3() {
        TwoSumIIInputArrayIsSorted service = new TwoSumIIInputArrayIsSorted();
        int[] arg1 = {0, 0};
        int arg2 = 0;
        int[] expected = {1, 2};
        int[] response = service.twoSum(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：numbers = [-1,1], target = 0
     * 输出：[1,2]
     */
    @Test
    public void test_PositiveCase4() {
        TwoSumIIInputArrayIsSorted service = new TwoSumIIInputArrayIsSorted();
        int[] arg1 = {-1, 1};
        int arg2 = 0;
        int[] expected = {1, 2};
        int[] response = service.twoSum(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：numbers = [1,2,4,5], target = 5
     * 输出：[1,3]
     */
    @Test
    public void test_PositiveCase5() {
        TwoSumIIInputArrayIsSorted service = new TwoSumIIInputArrayIsSorted();
        int[] arg1 = {1, 2, 4, 5};
        int arg2 = 5;
        int[] expected = {1, 3};
        int[] response = service.twoSum(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：numbers = [1,2,3,5], target = 5
     * 输出：[2,3]
     */
    @Test
    public void test_PositiveCase6() {
        TwoSumIIInputArrayIsSorted service = new TwoSumIIInputArrayIsSorted();
        int[] arg1 = {1, 2, 3, 5};
        int arg2 = 5;
        int[] expected = {2, 3};
        int[] response = service.twoSum(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：numbers = [1,2,3,5,6], target = 11
     * 输出：[4,5]
     */
    @Test
    public void test_PositiveCase7() {
        TwoSumIIInputArrayIsSorted service = new TwoSumIIInputArrayIsSorted();
        int[] arg1 = {1, 2, 3, 5, 6};
        int arg2 = 11;
        int[] expected = {4, 5};
        int[] response = service.twoSum(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：numbers = [1,2,3,4,10], target = 11
     * 输出：[1,5]
     */
    @Test
    public void test_PositiveCase8() {
        TwoSumIIInputArrayIsSorted service = new TwoSumIIInputArrayIsSorted();
        int[] arg1 = {1, 2, 3, 4, 10};
        int arg2 = 11;
        int[] expected = {1, 5};
        int[] response = service.twoSum(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

}