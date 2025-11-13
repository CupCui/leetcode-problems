package top.cupcupcui.leetcodeproblems.topinterview150II;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortAnArrayTest {

    /**
     * 输入：nums = [5,2,3,1]
     * 输出：[1,2,3,5]
     */
    @Test
    public void test_PositiveCase0() {
        SortAnArray service = new SortAnArray();
        int[] arg1 = {5, 2, 3, 1};
        int[] expected = {1, 2, 3, 5};
        int[] response = service.sortArray(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [5,1,1,2,0,0]
     * 输出：[0,0,1,1,2,5]
     */
    @Test
    public void test_PositiveCase1() {
        SortAnArray service = new SortAnArray();
        int[] arg1 = {5, 1, 1, 2, 0, 0};
        int[] expected = {0, 0, 1, 1, 2, 5};
        int[] response = service.sortArray(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [0]
     * 输出：[0]
     */
    @Test
    public void test_PositiveCase2() {
        SortAnArray service = new SortAnArray();
        int[] arg1 = {0};
        int[] expected = {0};
        int[] response = service.sortArray(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [0, -1]
     * 输出：[-1,0]
     */
    @Test
    public void test_PositiveCase3() {
        SortAnArray service = new SortAnArray();
        int[] arg1 = {0, -1};
        int[] expected = {-1, 0};
        int[] response = service.sortArray(arg1);

        Assert.assertArrayEquals(expected, response);
    }

}