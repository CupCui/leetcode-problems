package top.cupcupcui.leetcodeproblems.huawei.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author garre
 */
public class LengthOfLastWordTest {

    /**
     * 正例
     * String s = "Hello World";
     */
    @Test
    public void testLengthOfLastWord_PositiveCase1() {
        String s = "Hello World";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int length = lengthOfLastWord.lengthOfLastWord(s);
        System.out.println(length);
        Assert.assertEquals(5, length);
    }

    /**
     * 正例
     * String s = "   fly me   to   the moon  ";
     */
    @Test
    public void testLengthOfLastWord_PositiveCase2() {
        String s = "   fly me   to   the moon  ";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int length = lengthOfLastWord.lengthOfLastWord(s);
        System.out.println(length);
        Assert.assertEquals(4, length);
    }

    /**
     * 正例
     * String s = "luffy is still joyboy";
     */
    @Test
    public void testLengthOfLastWord_PositiveCase3() {
        String s = "luffy is still joyboy";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int length = lengthOfLastWord.lengthOfLastWord(s);
        System.out.println(length);
        Assert.assertEquals(6, length);
    }

    /**
     * 正例
     * String s = "word";
     */
    @Test
    public void testLengthOfLastWord_PositiveCase4() {
        String s = "word";
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        int length = lengthOfLastWord.lengthOfLastWord(s);
        System.out.println(length);
        Assert.assertEquals(4, length);
    }

}