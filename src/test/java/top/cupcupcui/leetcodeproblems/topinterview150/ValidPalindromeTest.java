package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ValidPalindromeTest {

    /**
     * 输入: s = "A man, a plan, a canal: Panama"
     * 输出：true
     */
    @Test
    public void test_PositiveCase0() {
        ValidPalindrome service = new ValidPalindrome();
        String arg1 = "A man, a plan, a canal: Panama";
        boolean expected = true;
        boolean response = service.isPalindrome(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "race a car"
     * 输出：false
     */
    @Test
    public void test_PositiveCase1() {
        ValidPalindrome service = new ValidPalindrome();
        String arg1 = "race a car";
        boolean expected = false;
        boolean response = service.isPalindrome(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = " "
     * 输出：true
     */
    @Test
    public void test_PositiveCase2() {
        ValidPalindrome service = new ValidPalindrome();
        String arg1 = " ";
        boolean expected = true;
        boolean response = service.isPalindrome(arg1);

        Assert.assertEquals(expected, response);
    }
}