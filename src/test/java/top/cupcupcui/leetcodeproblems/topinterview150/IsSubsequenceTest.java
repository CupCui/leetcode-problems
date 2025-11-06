package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsSubsequenceTest {

    /**
     * 输入：s = "abc", t = "ahbgdc"
     * 输出：true
     */
    @Test
    public void test_PositiveCase0() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "abc";
        String arg2 = "ahbgdc";
        boolean expected = true;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "axc", t = "ahbgdc"
     * 输出：false
     */
    @Test
    public void test_PositiveCase1() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "axc";
        String arg2 = "ahbgdc";
        boolean expected = false;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "", t = ""
     * 输出：true
     */
    @Test
    public void test_PositiveCase2() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "";
        String arg2 = "";
        boolean expected = true;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "a", t = "a"
     * 输出：true
     */
    @Test
    public void test_PositiveCase3() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "a";
        String arg2 = "a";
        boolean expected = true;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "ab", t = "abc"
     * 输出：true
     */
    @Test
    public void test_PositiveCase4() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "ab";
        String arg2 = "abc";
        boolean expected = true;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "ac", t = "abc"
     * 输出：true
     */
    @Test
    public void test_PositiveCase5() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "ac";
        String arg2 = "abc";
        boolean expected = true;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "ab", t = "ac"
     * 输出：false
     */
    @Test
    public void test_PositiveCase6() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "ab";
        String arg2 = "ac";
        boolean expected = false;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "ab", t = "aababbacbadb"
     * 输出：true
     */
    @Test
    public void test_PositiveCase7() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "ab";
        String arg2 = "aababbacbadb";
        boolean expected = true;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "abc", t = "aababbacbadbabbbbbac"
     * 输出：true
     */
    @Test
    public void test_PositiveCase8() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "ab";
        String arg2 = "aababbacbadbabbbbbac";
        boolean expected = true;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "abc", t = "adcaababbacbadbabbbbba"
     * 输出：true
     */
    @Test
    public void test_PositiveCase9() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "ab";
        String arg2 = "adcaababbacbadbabbbbba";
        boolean expected = true;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "abc", t = ""
     * 输出：false
     */
    @Test
    public void test_PositiveCase10() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "abc";
        String arg2 = "";
        boolean expected = false;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "abc", t = "a"
     * 输出：false
     */
    @Test
    public void test_PositiveCase11() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "abc";
        String arg2 = "a";
        boolean expected = false;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "", t = "ahbgdc"
     * 输出：true
     */
    @Test
    public void test_PositiveCase12() {
        IsSubsequence service = new IsSubsequence();
        String arg1 = "";
        String arg2 = "ahbgdc";
        boolean expected = true;
        boolean response = service.isSubsequence(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

}