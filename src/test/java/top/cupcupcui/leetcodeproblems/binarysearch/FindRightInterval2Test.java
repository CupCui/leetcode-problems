package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindRightInterval2Test {

    /**
     * 输入：intervals = [[1,2]]
     * 输出：[-1]
     */
    @Test
    public void test_PositiveCase0() {
        FindRightInterval service = new FindRightInterval();
        int[][] arg1 = {{1, 2}};
        int[] expected = {-1};
        int[] response = service.findRightInterval(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：intervals = [[3,4],[2,3],[1,2]]
     * 输出：[-1,0,1]
     */
    @Test
    public void test_PositiveCase1() {
        FindRightInterval service = new FindRightInterval();
        int[][] arg1 = {{3, 4}, {2, 3}, {1, 2}};
        int[] expected = {-1};
        int[] response = service.findRightInterval(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：intervals = [[1,4],[2,3],[3,4]]
     * 输出：[-1,2,-1]
     */
    @Test
    public void test_PositiveCase2() {
        FindRightInterval service = new FindRightInterval();
        int[][] arg1 = {{1, 4}, {2, 3}, {3, 4}};
        int[] expected = {-1};
        int[] response = service.findRightInterval(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：intervals = [[1,2],[2,3],[3,4]]
     * 输出：[1,2,-1]
     */
    @Test
    public void test_PositiveCase3() {
        FindRightInterval service = new FindRightInterval();
        int[][] arg1 = {{1, 2}, {2, 3}, {3, 4}};
        int[] expected = {1};
        int[] response = service.findRightInterval(arg1);

        Assert.assertArrayEquals(expected, response);
    }

}