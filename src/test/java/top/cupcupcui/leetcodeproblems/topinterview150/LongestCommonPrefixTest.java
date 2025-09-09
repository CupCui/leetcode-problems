package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    /**
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
     */
    @Test
    public void test_PositiveCase0() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] nums = {"flower", "flow", "flight"};
        String expected = "fl";
        String response = longestCommonPrefix.longestCommonPrefix(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：strs = ["dog","racecar","car"]
     * 输出：""
     */
    @Test
    public void test_PositiveCase1() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] nums = {"dog", "racecar", "car"};
        String expected = "";
        String response = longestCommonPrefix.longestCommonPrefix(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：strs = [""]
     * 输出：""
     */
    @Test
    public void test_PositiveCase2() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] nums = {""};
        String expected = "";
        String response = longestCommonPrefix.longestCommonPrefix(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：strs = ["",""]
     * 输出：""
     */
    @Test
    public void test_PositiveCase3() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] nums = {"", ""};
        String expected = "";
        String response = longestCommonPrefix.longestCommonPrefix(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：strs = ["a","a"]
     * 输出："a"
     */
    @Test
    public void test_PositiveCase4() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] nums = {"a", "a"};
        String expected = "a";
        String response = longestCommonPrefix.longestCommonPrefix(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：strs = ["a","b"]
     * 输出：""
     */
    @Test
    public void test_PositiveCase5() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] nums = {"a", "b"};
        String expected = "";
        String response = longestCommonPrefix.longestCommonPrefix(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：strs = ["cir","car"]
     * 输出："c"
     */
    @Test
    public void test_PositiveCase6() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] nums = {"cir", "car"};
        String expected = "c";
        String response = longestCommonPrefix.longestCommonPrefix(nums);
        Assert.assertEquals(expected, response);
    }
}