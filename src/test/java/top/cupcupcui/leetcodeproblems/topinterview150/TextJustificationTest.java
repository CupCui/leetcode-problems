package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TextJustificationTest {

    /**
     * 输入: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
     * 输出:
     * [
     * "This    is    an",
     * "example  of text",
     * "justification.  "
     * ]
     */
    @Test
    public void test_PositiveCase0() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"This", "is", "an", "example", "of", "text", "justification."};
        int arg2 = 16;
        List<String> expected = Arrays.asList("This    is    an",
                "example  of text",
                "justification.  ");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入:words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
     * 输出:
     * [
     * "What   must   be",
     * "acknowledgment  ",
     * "shall be        "
     * ]
     */
    @Test
    public void test_PositiveCase1() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int arg2 = 16;
        List<String> expected = Arrays.asList("What   must   be",
                "acknowledgment  ",
                "shall be        ");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入:words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"]，maxWidth = 20
     * 输出:
     * [
     * "Science  is  what we",
     * "understand      well",
     * "enough to explain to",
     * "a  computer.  Art is",
     * "everything  else  we",
     * "do                  "
     * ]
     */
    @Test
    public void test_PositiveCase2() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int arg2 = 20;
        List<String> expected = Arrays.asList("Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  ");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }
}