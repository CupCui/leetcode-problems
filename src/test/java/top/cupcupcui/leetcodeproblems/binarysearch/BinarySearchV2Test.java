package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchV2Test {

    /**
     * 输入: nums = [-1,0,3,5,9,12], target = 9
     * 输出: 4
     */
    @Test
    public void test_PositiveCase0() {
        BinarySearchV2 service = new BinarySearchV2();
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
        BinarySearchV2 service = new BinarySearchV2();
        int[] arg1 = {-1, 0, 3, 5, 9, 12};
        int arg2 = 2;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [0], target = 0
     * 输出: 0
     */
    @Test
    public void test_PositiveCase2() {
        BinarySearchV2 service = new BinarySearchV2();
        int[] arg1 = {0};
        int arg2 = 0;
        int expected = 0;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [0], target = 1
     * 输出: -1
     */
    @Test
    public void test_PositiveCase3() {
        BinarySearchV2 service = new BinarySearchV2();
        int[] arg1 = {0};
        int arg2 = 1;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [0, 1], target = -1
     * 输出: -1
     */
    @Test
    public void test_PositiveCase4() {
        BinarySearchV2 service = new BinarySearchV2();
        int[] arg1 = {0, 1};
        int arg2 = -1;
        int expected = -1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [0, 1], target = 1
     * 输出: 1
     */
    @Test
    public void test_PositiveCase5() {
        BinarySearchV2 service = new BinarySearchV2();
        int[] arg1 = {0, 1};
        int arg2 = 1;
        int expected = 1;
        int response = service.search(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    public int bsearch(int[] a, int n, int value) {

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

}