package top.cupcupcui.leetcodeproblems.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PlusOneTest {

    /**
     * 输入：digits = [1,2,3]11
     * 输出：[1,2,4]
     */
    @Test
    public void test_PositiveCase0() {
        PlusOne service = new PlusOne();
        int[] arg1 = {1, 2, 3};
        int[] expected = {1, 2, 4};
        int[] response = service.plusOne(arg1);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：digits = [4,3,2,1]
     * 输出：[4,3,2,2]
     */
    @Test
    public void test_PositiveCase1() {
        PlusOne service = new PlusOne();
        int[] arg1 = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        int[] response = service.plusOne(arg1);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：digits = [9]
     * 输出：[1,0]
     */
    @Test
    public void test_PositiveCase2() {
        PlusOne service = new PlusOne();
        int[] arg1 = {9};
        int[] expected = {1, 0};
        int[] response = service.plusOne(arg1);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：digits = [9,9]
     * 输出：[1,0,0]
     */
    @Test
    public void test_PositiveCase3() {
        PlusOne service = new PlusOne();
        int[] arg1 = {9, 9};
        int[] expected = {1, 0, 0};
        int[] response = service.plusOne(arg1);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：digits = [1,9,9]
     * 输出：[2,0,0]
     */
    @Test
    public void test_PositiveCase4() {
        PlusOne service = new PlusOne();
        int[] arg1 = {1, 9, 9};
        int[] expected = {2, 0, 0};
        int[] response = service.plusOne(arg1);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：digits = [0]
     * 输出：[1]
     */
    @Test
    public void test_PositiveCase5() {
        PlusOne service = new PlusOne();
        int[] arg1 = {0};
        int[] expected = {1};
        int[] response = service.plusOne(arg1);
        Assert.assertArrayEquals(expected, response);
    }

}