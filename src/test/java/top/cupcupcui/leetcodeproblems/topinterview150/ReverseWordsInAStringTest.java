package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAStringTest {

    /**
     * 输入：s = "the sky is blue"
     * 输出："blue is sky the"
     */
    @Test
    public void test_PositiveCase0() {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        String nums = "the sky is blue";
        String expected = "blue is sky the";
        String response = reverseWordsInAString.reverseWords(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "  hello world  "
     * 输出："world hello"
     */
    @Test
    public void test_PositiveCase1() {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        String nums = "  hello world  ";
        String expected = "world hello";
        String response = reverseWordsInAString.reverseWords(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "a good   example"
     * 输出："example good a"
     */
    @Test
    public void test_PositiveCase3() {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        String nums = "a good   example";
        String expected = "example good a";
        String response = reverseWordsInAString.reverseWords(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "a"
     * 输出："a"
     */
    @Test
    public void test_PositiveCase4() {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        String nums = "a";
        String expected = "a";
        String response = reverseWordsInAString.reverseWords(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "   a  "
     * 输出："a"
     */
    @Test
    public void test_PositiveCase5() {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        String nums = "   a  ";
        String expected = "a";
        String response = reverseWordsInAString.reverseWords(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "   a   b  "
     * 输出："b a"
     */
    @Test
    public void test_PositiveCase6() {
        ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
        String nums = "   a   b  ";
        String expected = "b a";
        String response = reverseWordsInAString.reverseWords(nums);
        Assert.assertEquals(expected, response);
    }

}