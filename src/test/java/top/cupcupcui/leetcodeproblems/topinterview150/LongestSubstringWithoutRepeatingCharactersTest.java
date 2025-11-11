package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    /**
     * 输入: s = "abcabcbb"
     * 输出: 3
     */
    @Test
    public void test_PositiveCase0() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = "abcabcbb";
        int expected = 3;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "bbbbb"
     * 输出: 1
     */
    @Test
    public void test_PositiveCase1() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = "bbbbb";
        int expected = 1;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "pwwkew"
     * 输出: 3
     */
    @Test
    public void test_PositiveCase2() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = "pwwkew";
        int expected = 3;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = ""
     * 输出: 0
     */
    @Test
    public void test_PositiveCase3() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = "";
        int expected = 0;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = " "
     * 输出: 1
     */
    @Test
    public void test_PositiveCase4() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = " ";
        int expected = 1;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "a "
     * 输出: 2
     */
    @Test
    public void test_PositiveCase5() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = "a ";
        int expected = 2;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "a  b"
     * 输出: 2
     */
    @Test
    public void test_PositiveCase6() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = "a  b";
        int expected = 2;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "a b"
     * 输出: 3
     */
    @Test
    public void test_PositiveCase7() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = "a b";
        int expected = 3;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "abcd,e fg"
     * 输出: 9
     */
    @Test
    public void test_PositiveCase8() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = "abcd,e fg";
        int expected = 9;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: s = "abba"
     * 输出: 2
     */
    @Test
    public void test_PositiveCase9() {
        LongestSubstringWithoutRepeatingCharacters service = new LongestSubstringWithoutRepeatingCharacters();
        String arg1 = "abba";
        int expected = 2;
        int response = service.lengthOfLongestSubstring(arg1);
        Assert.assertEquals(expected, response);
    }

}