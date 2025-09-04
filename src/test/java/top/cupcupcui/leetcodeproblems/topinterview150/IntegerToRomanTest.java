package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {

    /**
     * 输入：num = 3749
     * 输出： "MMMDCCXLIX"
     */
    @Test
    public void test_PositiveCase0() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        int nums = 3749;
        String expected = "MMMDCCXLIX";
        String response = integerToRoman.intToRoman(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：num = 58
     * 输出："LVIII"
     */
    @Test
    public void test_PositiveCase1() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        int nums = 58;
        String expected = "LVIII";
        String response = integerToRoman.intToRoman(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：num = 1994
     * 输出："MCMXCIV"
     */
    @Test
    public void test_PositiveCase2() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        int nums = 1994;
        String expected = "MCMXCIV";
        String response = integerToRoman.intToRoman(nums);
        Assert.assertEquals(expected, response);
    }

}