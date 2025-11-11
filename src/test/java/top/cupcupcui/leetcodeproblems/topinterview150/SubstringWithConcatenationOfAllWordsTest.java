package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SubstringWithConcatenationOfAllWordsTest {

    /**
     * 输入：s = "barfoothefoobarman", words = ["foo","bar"]
     * 输出：[0,9]
     */
    @Test
    public void test_PositiveCase0() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "barfoothefoobarman";
        String[] arg2 = {"foo", "bar"};
        List<Integer> expected = Arrays.asList(0, 9);
        List<Integer> response = service.findSubstring(arg1, arg2);
        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入：s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
     * 输出：[]
     */
    @Test
    public void test_PositiveCase1() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "wordgoodgoodgoodbestword";
        String[] arg2 = {"word", "good", "best", "word"};
        List<Integer> expected = Collections.emptyList();
        List<Integer> response = service.findSubstring(arg1, arg2);
        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入：s = "barfoofoobarthefoobarman", words = ["bar","foo","the"]
     * 输出：[6,9,12]
     */
    @Test
    public void test_PositiveCase2() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "barfoofoobarthefoobarman";
        String[] arg2 = {"bar", "foo", "the"};
        List<Integer> expected = Arrays.asList(6, 9, 12);
        List<Integer> response = service.findSubstring(arg1, arg2);
        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

}