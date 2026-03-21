package top.cupcupcui.leetcodeproblems.alichengyun;

import org.junit.Assert;
import org.junit.Test;
import top.cupcupcui.leetcodeproblems.binarysearch.BinarySearch;

import static org.junit.Assert.*;

public class StringCompressionTest {

    /**
     * 输入："aabcccccaaa"
     * 输出："a2b1c5a3"
     */
    @Test
    public void test_PositiveCase0() {
        StringCompression service = new StringCompression();
        String arg1 = "aabcccccaaa";
        String expected = "a2b1c5a3";
        String response = service.stringCompression(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入："abbccd"
     * 输出："abbccd"
     */
    @Test
    public void test_PositiveCase1() {
        StringCompression service = new StringCompression();
        String arg1 = "abbccd";
        String expected = "abbccd";
        String response = service.stringCompression(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：""
     * 输出：""
     */
    @Test
    public void test_PositiveCase2() {
        StringCompression service = new StringCompression();
        String arg1 = "";
        String expected = "";
        String response = service.stringCompression(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入："a"
     * 输出："a"
     */
    @Test
    public void test_PositiveCase3() {
        StringCompression service = new StringCompression();
        String arg1 = "a";
        String expected = "a";
        String response = service.stringCompression(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入："aabb"
     * 输出："aabb"
     */
    @Test
    public void test_PositiveCase4() {
        StringCompression service = new StringCompression();
        String arg1 = "aabb";
        String expected = "aabb";
        String response = service.stringCompression(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入："aabbb"
     * 输出："aabbb"
     */
    @Test
    public void test_PositiveCase5() {
        StringCompression service = new StringCompression();
        String arg1 = "aabbb";
        String expected = "a2b3";
        String response = service.stringCompression(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入："aaaaaaaa"
     * 输出："a8"
     */
    @Test
    public void test_PositiveCase6() {
        StringCompression service = new StringCompression();
        String arg1 = "aaaaaaaa";
        String expected = "a8";
        String response = service.stringCompression(arg1);

        Assert.assertEquals(expected, response);
    }
}