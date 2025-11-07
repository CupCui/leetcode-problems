package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    /**
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     */
    @Test
    public void test_PositiveCase0() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {-1, 0, 3, 5, 9, 12};
        int arg2 = 9;
        int expected = 4;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [-1,0,3,5,9,12], target = 2
     * 输出: -1
     */
    @Test
    public void test_PositiveCase1() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {-1, 0, 3, 5, 9, 12};
        int arg2 = 2;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [1], target = 1
     * 输出: 0
     */
    @Test
    public void test_PositiveCase2() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1};
        int arg2 = 1;
        int expected = 0;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [1], target = 2
     * 输出: -1
     */
    @Test
    public void test_PositiveCase3() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1};
        int arg2 = 2;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }


    /**
     * 输入: nums = [1,2,3,4], target = 1
     * 输出: 0
     */
    @Test
    public void test_PositiveCase4() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1, 2, 3, 4};
        int arg2 = 1;
        int expected = 0;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }


    /**
     * 输入: nums = [1,2,3,4], target = 4
     * 输出: 3
     */
    @Test
    public void test_PositiveCase5() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1, 2, 3, 4};
        int arg2 = 4;
        int expected = 3;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [1,2,3,4], target = 0
     * 输出: -1
     */
    @Test
    public void test_PositiveCase6() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1, 2, 3, 4};
        int arg2 = 0;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

}