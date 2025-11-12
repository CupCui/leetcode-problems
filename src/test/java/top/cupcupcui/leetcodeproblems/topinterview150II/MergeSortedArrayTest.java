package top.cupcupcui.leetcodeproblems.topinterview150II;

import org.junit.Assert;
import org.junit.Test;
import top.cupcupcui.leetcodeproblems.topinterview150.MinimumSizeSubarraySum;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    /**
     * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * 输出：[1,2,2,3,5,6]
     */
    @Test
    public void test_PositiveCase0() {
        MergeSortedArray service = new MergeSortedArray();
        int[] arg1 = {1, 2, 3, 0, 0, 0};
        int arg2 = 3;
        int[] arg3 = {2, 5, 6};
        int arg4 = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        int[] response = service.merge(arg1, arg2, arg3, arg4);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
     * 输出：[1]
     */
    @Test
    public void test_PositiveCase1() {
        MergeSortedArray service = new MergeSortedArray();
        int[] arg1 = {1};
        int arg2 = 1;
        int[] arg3 = {};
        int arg4 = 0;
        int[] expected = {1};
        int[] response = service.merge(arg1, arg2, arg3, arg4);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
     * 输出：[1]
     */
    @Test
    public void test_PositiveCase2() {
        MergeSortedArray service = new MergeSortedArray();
        int[] arg1 = {0};
        int arg2 = 0;
        int[] arg3 = {1};
        int arg4 = 1;
        int[] expected = {1};
        int[] response = service.merge(arg1, arg2, arg3, arg4);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums1 = [1,0], m = 1, nums2 = [1], n = 1
     * 输出：[1,1]
     */
    @Test
    public void test_PositiveCase3() {
        MergeSortedArray service = new MergeSortedArray();
        int[] arg1 = {1, 0};
        int arg2 = 1;
        int[] arg3 = {1};
        int arg4 = 1;
        int[] expected = {1, 1};
        int[] response = service.merge(arg1, arg2, arg3, arg4);

        Assert.assertArrayEquals(expected, response);
    }

}