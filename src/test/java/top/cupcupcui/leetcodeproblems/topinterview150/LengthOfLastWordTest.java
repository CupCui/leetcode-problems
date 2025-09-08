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

    /**
     * 输入：s = "    joyboy     "
     * 输出：6
     */
    @Test
    public void test_PositiveCase3() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String nums = "    joyboy     ";
        int expected = 6;
        int response = lengthOfLastWord.lengthOfLastWord(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "a     "
     * 输出：1
     */
    @Test
    public void test_PositiveCase4() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String nums = "a     ";
        int expected = 1;
        int response = lengthOfLastWord.lengthOfLastWord(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "     z"
     * 输出：1
     */
    @Test
    public void test_PositiveCase5() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String nums = "     z";
        int expected = 1;
        int response = lengthOfLastWord.lengthOfLastWord(nums);
        Assert.assertEquals(expected, response);
    }

}