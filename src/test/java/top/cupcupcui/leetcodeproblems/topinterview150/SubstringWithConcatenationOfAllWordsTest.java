package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SubstringWithConcatenationOfAllWordsTest {

    private static void assertEquals(List<Integer> expected, List<Integer> response) {
        if (expected.size() != response.size()) {
            Assert.fail();
        } else {
            for (Integer integer : response) {
                if (!expected.contains(integer)) {
                    Assert.fail();
                }
            }
        }
    }

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
        assertEquals(expected, response);
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
        List<Integer> expected = Arrays.asList();
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
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
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "foo", words = ["foo"]
     * 输出：[0]
     */
    @Test
    public void test_PositiveCase3() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "foo";
        String[] arg2 = {"foo"};
        List<Integer> expected = Arrays.asList(0);
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "bar", words = ["foo"]
     * 输出：[]
     */
    @Test
    public void test_PositiveCase4() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "bar";
        String[] arg2 = {"foo"};
        List<Integer> expected = Arrays.asList();
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "foobarfoo", words = ["foo"]
     * 输出：[0, 6]
     */
    @Test
    public void test_PositiveCase5() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "foobarfoo";
        String[] arg2 = {"foo"};
        List<Integer> expected = Arrays.asList(0, 6);
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "foobar", words = ["foo", "bar"]
     * 输出：[0]
     */
    @Test
    public void test_PositiveCase6() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "foobar";
        String[] arg2 = {"foo", "bar"};
        List<Integer> expected = Arrays.asList(0);
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "foobarfoo", words = ["foo", "bar"]
     * 输出：[0, 3]
     */
    @Test
    public void test_PositiveCase7() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "foobarfoo";
        String[] arg2 = {"foo", "bar"};
        List<Integer> expected = Arrays.asList(0, 3);
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "a", words = ["a"]
     * 输出：[0]
     */
    @Test
    public void test_PositiveCase8() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "a";
        String[] arg2 = {"a"};
        List<Integer> expected = Arrays.asList(0);
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "b", words = ["a"]
     * 输出：[]
     */
    @Test
    public void test_PositiveCase9() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "b";
        String[] arg2 = {"a"};
        List<Integer> expected = Arrays.asList();
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "foobarfoo", words = ["foo", "foo"]
     * 输出：[]
     */
    @Test
    public void test_PositiveCase10() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "foobarfoo";
        String[] arg2 = {"foo", "foo"};
        List<Integer> expected = Arrays.asList();
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "foobarfoofoo", words = ["foo", "foo"]
     * 输出：[6]
     */
    @Test
    public void test_PositiveCase11() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "foobarfoo";
        String[] arg2 = {"foo", "foo"};
        List<Integer> expected = Arrays.asList(6);
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入：s = "foobarfoofoo", words = ["foo", "foo", "bar"]
     * 输出：[0, 3]
     */
    @Test
    public void test_PositiveCase12() {
        SubstringWithConcatenationOfAllWords service = new SubstringWithConcatenationOfAllWords();
        String arg1 = "foobarfoofoo";
        String[] arg2 = {"foo", "foo", "bar"};
        List<Integer> expected = Arrays.asList(0, 3);
        List<Integer> response = service.findSubstring(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 官方题解
     * 方法一：滑动窗口
     */
    class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            List<Integer> res = new ArrayList<Integer>();
            int m = words.length, n = words[0].length(), ls = s.length();
            for (int i = 0; i < n; i++) {
                if (i + m * n > ls) {
                    break;
                }
                Map<String, Integer> differ = new HashMap<String, Integer>();
                for (int j = 0; j < m; j++) {
                    String word = s.substring(i + j * n, i + (j + 1) * n);
                    differ.put(word, differ.getOrDefault(word, 0) + 1);
                }
                for (String word : words) {
                    differ.put(word, differ.getOrDefault(word, 0) - 1);
                    if (differ.get(word) == 0) {
                        differ.remove(word);
                    }
                }
                for (int start = i; start < ls - m * n + 1; start += n) {
                    if (start != i) {
                        String word = s.substring(start + (m - 1) * n, start + m * n);
                        differ.put(word, differ.getOrDefault(word, 0) + 1);
                        if (differ.get(word) == 0) {
                            differ.remove(word);
                        }
                        word = s.substring(start - n, start);
                        differ.put(word, differ.getOrDefault(word, 0) - 1);
                        if (differ.get(word) == 0) {
                            differ.remove(word);
                        }
                    }
                    if (differ.isEmpty()) {
                        res.add(start);
                    }
                }
            }
            return res;
        }
    }


}