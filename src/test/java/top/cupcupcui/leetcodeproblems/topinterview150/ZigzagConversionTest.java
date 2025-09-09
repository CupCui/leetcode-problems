package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

public class ZigzagConversionTest {

    /**
     * 输入：s = "PAYPALISHIRING", numRows = 3
     * 输出："PAHNAPLSIIGYIR"
     */
    @Test
    public void test_PositiveCase0() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String nums = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        String response = zigzagConversion.convert(nums, numRows);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     */
    @Test
    public void test_PositiveCase1() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String nums = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        String response = zigzagConversion.convert(nums, numRows);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "A", numRows = 1
     * 输出："A"
     */
    @Test
    public void test_PositiveCase2() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String nums = "A";
        int numRows = 1;
        String expected = "A";
        String response = zigzagConversion.convert(nums, numRows);
        Assert.assertEquals(expected, response);
    }

}