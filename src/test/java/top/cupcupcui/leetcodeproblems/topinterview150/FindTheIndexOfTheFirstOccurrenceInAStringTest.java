package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    /**
     * 输入：haystack = "sadbutsad", needle = "sad"
     * 输出：0
     */
    @Test
    public void test_PositiveCase0() {
        FindTheIndexOfTheFirstOccurrenceInAString service = new FindTheIndexOfTheFirstOccurrenceInAString();
        String arg1 = "sadbutsad";
        String arg2 = "sad";
        int expected = 0;
        int response = service.strStr(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：haystack = "leetcode", needle = "leeto"
     * 输出：-1
     */
    @Test
    public void test_PositiveCase1() {
        FindTheIndexOfTheFirstOccurrenceInAString service = new FindTheIndexOfTheFirstOccurrenceInAString();
        String arg1 = "leetcode";
        String arg2 = "leeto";
        int expected = -1;
        int response = service.strStr(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：haystack = "a", needle = "a"
     * 输出：0
     */
    @Test
    public void test_PositiveCase2() {
        FindTheIndexOfTheFirstOccurrenceInAString service = new FindTheIndexOfTheFirstOccurrenceInAString();
        String arg1 = "a";
        String arg2 = "a";
        int expected = 0;
        int response = service.strStr(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：haystack = "a", needle = "b"
     * 输出：-1
     */
    @Test
    public void test_PositiveCase3() {
        FindTheIndexOfTheFirstOccurrenceInAString service = new FindTheIndexOfTheFirstOccurrenceInAString();
        String arg1 = "a";
        String arg2 = "b";
        int expected = -1;
        int response = service.strStr(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：haystack = "hello", needle = "o"
     * 输出：4
     */
    @Test
    public void test_PositiveCase4() {
        FindTheIndexOfTheFirstOccurrenceInAString service = new FindTheIndexOfTheFirstOccurrenceInAString();
        String arg1 = "hello";
        String arg2 = "o";
        int expected = 4;
        int response = service.strStr(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：haystack = "hello", needle = "h"
     * 输出：0
     */
    @Test
    public void test_PositiveCase5() {
        FindTheIndexOfTheFirstOccurrenceInAString service = new FindTheIndexOfTheFirstOccurrenceInAString();
        String arg1 = "hello";
        String arg2 = "h";
        int expected = 0;
        int response = service.strStr(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：haystack = "hello", needle = "z"
     * 输出：-1
     */
    @Test
    public void test_PositiveCase6() {
        FindTheIndexOfTheFirstOccurrenceInAString service = new FindTheIndexOfTheFirstOccurrenceInAString();
        String arg1 = "hello";
        String arg2 = "z";
        int expected = -1;
        int response = service.strStr(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：haystack = "aaa", needle = "aaaa"
     * 输出：-1
     */
    @Test
    public void test_PositiveCase7() {
        FindTheIndexOfTheFirstOccurrenceInAString service = new FindTheIndexOfTheFirstOccurrenceInAString();
        String arg1 = "aaa";
        String arg2 = "aaaa";
        int expected = -1;
        int response = service.strStr(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：haystack = "mississippi", needle = "issipi"
     * 输出：-1
     */
    @Test
    public void test_PositiveCase8() {
        FindTheIndexOfTheFirstOccurrenceInAString service = new FindTheIndexOfTheFirstOccurrenceInAString();
        String arg1 = "mississippi";
        String arg2 = "issipi";
        int expected = -1;
        int response = service.strStr(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 作者：力扣官方题解
     * 链接：https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/solutions/732236/shi-xian-strstr-by-leetcode-solution-ds6y/
     */
    class Solution {
        public int strStr(String haystack, String needle) {
            int n = haystack.length(), m = needle.length();
            for (int i = 0; i + m <= n; i++) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return i;
                }
            }
            return -1;
        }
    }

}