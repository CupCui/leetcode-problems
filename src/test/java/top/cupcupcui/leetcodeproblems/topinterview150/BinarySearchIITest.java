package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchIITest {

    /**
     * 输入：nums = [2, 3, 5, 7, 11, 13], target = 5
     * 输出：2
     */
    @Test
    public void test_PositiveCase00() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {2, 3, 5, 7, 11, 13};
        int arg2 = 5;
        int expected = 2;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [2, 3, 5, 7, 11, 13], target = 6
     * 输出：3
     */
    @Test
    public void test_PositiveCase000() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {2, 3, 5, 7, 11, 13};
        int arg2 = 6;
        int expected = 3;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [2, 3, 5, 7, 11, 13], target = 15
     * 输出：-1
     */
    @Test
    public void test_PositiveCase0000() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {2, 3, 5, 7, 11, 13};
        int arg2 = 15;
        int expected = -1;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 15, nums = [2, 5, 6, 8, 12, 15]
     * 输出：5
     */
    @Test
    public void test_PositiveCase0() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {2, 5, 6, 8, 12, 15};
        int arg2 = 15;
        int expected = 5;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 3, nums = [1,2,3,4]
     * 输出：2
     */
    @Test
    public void test_PositiveCase1() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {1, 2, 3, 4};
        int arg2 = 3;
        int expected = 2;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 0, nums = [1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase2() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {1};
        int arg2 = 0;
        int expected = 0;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 1, nums = [1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase3() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {1};
        int arg2 = 1;
        int expected = 0;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 2, nums = [1]
     * 输出：-1
     */
    @Test
    public void test_PositiveCase4() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {1};
        int arg2 = 2;
        int expected = -1;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 2, nums = [2,3]
     * 输出：0
     */
    @Test
    public void test_PositiveCase5() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {2, 3};
        int arg2 = 2;
        int expected = 0;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 3, nums = [2,3,4]
     * 输出：1
     */
    @Test
    public void test_PositiveCase6() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {2, 3, 4};
        int arg2 = 3;
        int expected = 1;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 5, nums = [0, 2, 5, 6, 7, 8, 9, 10]
     * 输出：2
     * 输入：target = 5, nums = [2,3,1,1,1,1,1]
     * 输出：1
     */
    @Test
    public void test_PositiveCase7() {
        BinarySearchII service = new BinarySearchII();
        int[] arg1 = {0, 2, 5, 6, 7, 8, 9, 10};
        int arg2 = 5;
        int expected = 2;
        int response = service.search(arg1, arg2, 0);

        Assert.assertEquals(expected, response);
    }

}