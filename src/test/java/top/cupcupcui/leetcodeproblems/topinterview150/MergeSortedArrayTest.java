package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author garre
 */
public class MergeSortedArrayTest {

    /**
     * 正例
     */
    @Test
    public void mergeSortedArray_PositiveCase1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] mergeSortedResponse = mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);

        int[] expectedResponse = {1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(expectedResponse, mergeSortedResponse);
    }

    /**
     * 正例
     */
    @Test
    public void mergeSortedArray_PositiveCase2() {
        /*
         * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
         * 输出：[1]
         * */
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] mergeSortedResponse = mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);

        int[] expectedResponse = {1};
        Assert.assertArrayEquals(expectedResponse, mergeSortedResponse);
    }

    /**
     * 正例
     */
    @Test
    public void mergeSortedArray_PositiveCase3() {
        /*
         * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
         * 输出：[1]
         * */
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] mergeSortedResponse = mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);

        int[] expectedResponse = {1};
        Assert.assertArrayEquals(expectedResponse, mergeSortedResponse);
    }

    /**
     * 正例
     */
    @Test
    public void mergeSortedArray_PositiveCase4() {
        /*
         * 输入：nums1 = [], m = 0, nums2 = [], n = 0
         * 输出：[]
         * */
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {};
        int n = 0;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] mergeSortedResponse = mergeSortedArray.mergeSortedArray(nums1, m, nums2, n);

        int[] expectedResponse = {};
        Assert.assertArrayEquals(expectedResponse, mergeSortedResponse);
    }

}