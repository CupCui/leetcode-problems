package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

    /**
     * 输入: s = "III"
     * 输出: 3
     */
    @Test
    public void test_PositiveCase0() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String nums = "III";
        int expected = 3;
        int response = romanToInteger.romanToInt(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "IV"
     * 输出: 4
     */
    @Test
    public void test_PositiveCase1() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String nums = "IV";
        int expected = 4;
        int response = romanToInteger.romanToInt(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "IX"
     * 输出: 9
     */
    @Test
    public void test_PositiveCase2() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String nums = "IX";
        int expected = 9;
        int response = romanToInteger.romanToInt(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "LVIII"
     * 输出: 58
     */
    @Test
    public void test_PositiveCase3() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String nums = "LVIII";
        int expected = 58;
        int response = romanToInteger.romanToInt(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "MCMXCIV"
     * 输出: 1994
     */
    @Test
    public void test_PositiveCase4() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String nums = "MCMXCIV";
        int expected = 1994;
        int response = romanToInteger.romanToInt(nums);
        Assert.assertEquals(expected, response);
    }

}