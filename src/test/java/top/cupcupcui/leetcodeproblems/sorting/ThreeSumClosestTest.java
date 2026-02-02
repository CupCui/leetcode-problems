package top.cupcupcui.leetcodeproblems.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    /**
     * 输入：nums = [-1,2,1,-4], target = 1
     * 输出：2
     */
    @Test
    public void test_PositiveCase0() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {-1, 2, 1, -4};
        int arg2 = 1;
        int expected = 2;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [0,0,0], target = 1
     * 输出：0
     */
    @Test
    public void test_PositiveCase1() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {0, 0, 0};
        int arg2 = 1;
        int expected = 0;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [0,0,1], target = 1
     * 输出：1
     */
    @Test
    public void test_PositiveCase2() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {0, 0, 1};
        int arg2 = 1;
        int expected = 1;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1,1,1], target = 1
     * 输出：3
     */
    @Test
    public void test_PositiveCase3() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {1, 1, 1};
        int arg2 = 1;
        int expected = 3;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [100,0,0,0], target = 1
     * 输出：0
     */
    @Test
    public void test_PositiveCase4() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {100, 0, 0, 0};
        int arg2 = 1;
        int expected = 0;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

}