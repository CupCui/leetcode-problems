package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountNegativeNumbersInASortedMatrixTest {

    /**
     * 输入：grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}
     * 输出：8
     */
    @Test
    public void test_PositiveCase0() {
        CountNegativeNumbersInASortedMatrix service = new CountNegativeNumbersInASortedMatrix();
        int[][] arg1 = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int expected = 8;
        int response = service.countNegatives(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：grid = {{3,2},{1,0}}
     * 输出：0
     */
    @Test
    public void test_PositiveCase1() {
        CountNegativeNumbersInASortedMatrix service = new CountNegativeNumbersInASortedMatrix();
        int[][] arg1 = {{3, 2}, {1, 0}};
        int expected = 0;
        int response = service.countNegatives(arg1);

        Assert.assertEquals(expected, response);
    }
}