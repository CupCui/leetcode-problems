package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    /**
     * 输入: nums = [1,3,5,6], target = 5
     * 输出: 2
     */
    @Test
    public void test_PositiveCase0() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1, 3, 5, 6};
        int arg2 = 5;
        int expected = 2;
        int response = service.searchInsert(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [1,3,5,6], target = 2
     * 输出: 1
     */
    @Test
    public void test_PositiveCase1() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1, 3, 5, 6};
        int arg2 = 2;
        int expected = 1;
        int response = service.searchInsert(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [1,3,5,6], target = 7
     * 输出: 4
     */
    @Test
    public void test_PositiveCase2() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1, 3, 5, 6};
        int arg2 = 7;
        int expected = 4;
        int response = service.searchInsert(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [1], target = 1
     * 输出: 0
     */
    @Test
    public void test_PositiveCase3() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1};
        int arg2 = 1;
        int expected = 0;
        int response = service.searchInsert(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [1], target = 0
     * 输出: 0
     */
    @Test
    public void test_PositiveCase4() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1};
        int arg2 = 0;
        int expected = 0;
        int response = service.searchInsert(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [1], target = 2
     * 输出: 1
     */
    @Test
    public void test_PositiveCase5() {
        BinarySearch service = new BinarySearch();
        int[] arg1 = {1};
        int arg2 = 2;
        int expected = 1;
        int response = service.searchInsert(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

}