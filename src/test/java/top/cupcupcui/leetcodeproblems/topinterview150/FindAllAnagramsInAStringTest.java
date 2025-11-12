package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindAllAnagramsInAStringTest {

    private static void assertEquals(List<Integer> expected, List<Integer> response) {
        System.out.println("expected: " + expected + "\n" + "response: " + response);
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
     * 输入: s = "cbaebabacd", p = "abc"
     * 输出: [0,6]
     */
    @Test
    public void test_PositiveCase0() {
        FindAllAnagramsInAString service = new FindAllAnagramsInAString();
        String arg1 = "cbaebabacd";
        String arg2 = "abc";
        List<Integer> expected = Arrays.asList(0, 6);
        List<Integer> response = service.findAnagrams(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入: s = "abab", p = "ab"
     * 输出: [0,1,2]
     */
    @Test
    public void test_PositiveCase1() {
        FindAllAnagramsInAString service = new FindAllAnagramsInAString();
        String arg1 = "abab";
        String arg2 = "ab";
        List<Integer> expected = Arrays.asList(0, 1, 2);
        List<Integer> response = service.findAnagrams(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入: s = "a", p = "a"
     * 输出: [0]
     */
    @Test
    public void test_PositiveCase2() {
        FindAllAnagramsInAString service = new FindAllAnagramsInAString();
        String arg1 = "a";
        String arg2 = "a";
        List<Integer> expected = Arrays.asList(0);
        List<Integer> response = service.findAnagrams(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入: s = "ab", p = "a"
     * 输出: [0]
     */
    @Test
    public void test_PositiveCase3() {
        FindAllAnagramsInAString service = new FindAllAnagramsInAString();
        String arg1 = "ab";
        String arg2 = "a";
        List<Integer> expected = Arrays.asList(0);
        List<Integer> response = service.findAnagrams(arg1, arg2);
        assertEquals(expected, response);
    }

    /**
     * 输入: s = "b", p = "a"
     * 输出: []
     */
    @Test
    public void test_PositiveCase4() {
        FindAllAnagramsInAString service = new FindAllAnagramsInAString();
        String arg1 = "b";
        String arg2 = "a";
        List<Integer> expected = Arrays.asList();
        List<Integer> response = service.findAnagrams(arg1, arg2);
        assertEquals(expected, response);
    }


    /**
     * 官方题解
     * 方法一：滑动窗口
     */
    class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int sLen = s.length(), pLen = p.length();

            if (sLen < pLen) {
                return new ArrayList<Integer>();
            }

            List<Integer> ans = new ArrayList<Integer>();
            int[] sCount = new int[26];
            int[] pCount = new int[26];
            for (int i = 0; i < pLen; ++i) {
                ++sCount[s.charAt(i) - 'a'];
                ++pCount[p.charAt(i) - 'a'];
            }

            if (Arrays.equals(sCount, pCount)) {
                ans.add(0);
            }

            for (int i = 0; i < sLen - pLen; ++i) {
                --sCount[s.charAt(i) - 'a'];
                ++sCount[s.charAt(i + pLen) - 'a'];

                if (Arrays.equals(sCount, pCount)) {
                    ans.add(i + 1);
                }
            }

            return ans;
        }
    }


}