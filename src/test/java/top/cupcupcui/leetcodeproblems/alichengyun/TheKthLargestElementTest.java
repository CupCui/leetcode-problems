package top.cupcupcui.leetcodeproblems.alichengyun;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheKthLargestElementTest {

    /**
     * 输入：nums = [3,2,1,5,6,4], k = 2
     * 输出：5
     */
    @Test
    public void test_PositiveCase0() {
        TheKthLargestElement service = new TheKthLargestElement();
        int[] arg1 = {3, 2, 1, 5, 6, 4};
        int arg2 = 2;
        int expected = 5;
        int response = service.theKthLargestElement(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [3,2,3,1,2,4,5,5,6], k = 4
     * 输出：4
     */
    @Test
    public void test_PositiveCase1() {
        TheKthLargestElement service = new TheKthLargestElement();
        int[] arg1 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int arg2 = 4;
        int expected = 4;
        int response = service.theKthLargestElement(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [3], k = 1
     * 输出：3
     */
    @Test
    public void test_PositiveCase2() {
        TheKthLargestElement service = new TheKthLargestElement();
        int[] arg1 = {3};
        int arg2 = 1;
        int expected = 3;
        int response = service.theKthLargestElement(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

}