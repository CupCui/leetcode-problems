package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    /**
     * 输入：s = "Hello World"
     * 输出：5
     */
    @Test
    public void test_PositiveCase0() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String nums = "Hello World";
        int expected = 5;
        int response = lengthOfLastWord.lengthOfLastWord(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "   fly me   to   the moon  "
     * 输出：4
     */
    @Test
    public void test_PositiveCase1() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String nums = "   fly me   to   the moon  ";
        int expected = 4;
        int response = lengthOfLastWord.lengthOfLastWord(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "luffy is still joyboy"
     * 输出：6
     */
    @Test
    public void test_PositiveCase2() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String nums = "luffy is still joyboy";
        int expected = 6;
        int response = lengthOfLastWord.lengthOfLastWord(nums);
        Assert.assertEquals(expected, response);
    }

}