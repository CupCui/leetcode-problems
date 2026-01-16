package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    /**
     * 输入：nums = [5,7,7,8,8,10], target = 8
     * 输出：[3,4]
     */
    @Test
    public void test_PositiveCase0() {
        FindFirstAndLastPositionOfElementInSortedArray service = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] arg1 = {5, 7, 7, 8, 8, 10};
        int arg2 = 8;
        int[] expected = {3, 4};
        int[] response = service.searchRange(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [5,7,7,8,8,10], target = 6
     * 输出：[-1,-1]
     */
    @Test
    public void test_PositiveCase1() {
        FindFirstAndLastPositionOfElementInSortedArray service = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] arg1 = {5, 7, 7, 8, 8, 10};
        int arg2 = 6;
        int[] expected = {-1, -1};
        int[] response = service.searchRange(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [], target = 0
     * 输出：[-1,-1]
     */
    @Test
    public void test_PositiveCase2() {
        FindFirstAndLastPositionOfElementInSortedArray service = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] arg1 = {};
        int arg2 = 0;
        int[] expected = {-1, -1};
        int[] response = service.searchRange(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [1], target = 1
     * 输出：[0,0]
     */
    @Test
    public void test_PositiveCase3() {
        FindFirstAndLastPositionOfElementInSortedArray service = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] arg1 = {1};
        int arg2 = 1;
        int[] expected = {0, 0};
        int[] response = service.searchRange(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [1,2], target = 1
     * 输出：[0,0]
     */
    @Test
    public void test_PositiveCase4() {
        FindFirstAndLastPositionOfElementInSortedArray service = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] arg1 = {1, 2};
        int arg2 = 1;
        int[] expected = {0, 0};
        int[] response = service.searchRange(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [1,2], target = 2
     * 输出：[1,1]
     */
    @Test
    public void test_PositiveCase5() {
        FindFirstAndLastPositionOfElementInSortedArray service = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] arg1 = {1, 2};
        int arg2 = 2;
        int[] expected = {1, 1};
        int[] response = service.searchRange(arg1, arg2);

        Assert.assertArrayEquals(expected, response);
    }

}