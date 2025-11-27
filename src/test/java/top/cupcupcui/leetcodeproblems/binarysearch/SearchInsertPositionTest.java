package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    /**
     * 输入: nums = [1,3,5,6], target = 5
     * 输出: 2
     */
    @Test
    public void test_PositiveCase0() {
        SearchInsertPosition service = new SearchInsertPosition();
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
        SearchInsertPosition service = new SearchInsertPosition();
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
        SearchInsertPosition service = new SearchInsertPosition();
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
        SearchInsertPosition service = new SearchInsertPosition();
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
        SearchInsertPosition service = new SearchInsertPosition();
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
        SearchInsertPosition service = new SearchInsertPosition();
        int[] arg1 = {1};
        int arg2 = 2;
        int expected = 1;
        int response = service.searchInsert(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: nums = [1,3], target = 4
     * 输出: 2
     */
    @Test
    public void test_PositiveCase6() {
        SearchInsertPosition service = new SearchInsertPosition();
        int[] arg1 = {1, 3};
        int arg2 = 4;
        int expected = 2;
        int response = service.searchInsert(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

}