package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.*;

/**
 * @author cuiguanghao
 * @date 2025/11/12 10:32
 * @description 438. 找到字符串中所有字母异位词
 */
public class FindAllAnagramsInAString {
    /**
     * https://leetcode.cn/problems/find-all-anagrams-in-a-string/
     * 438. 找到字符串中所有字母异位词
     * 中等
     *
     * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
     *
     * 示例 1:
     * 输入: s = "cbaebabacd", p = "abc"
     * 输出: [0,6]
     * 解释:
     * 起始索引等于 0 的子串是 "cba", 它是 "abc" 的异位词。
     * 起始索引等于 6 的子串是 "bac", 它是 "abc" 的异位词。
     *
     *  示例 2:
     * 输入: s = "abab", p = "ab"
     * 输出: [0,1,2]
     * 解释:
     * 起始索引等于 0 的子串是 "ab", 它是 "ab" 的异位词。
     * 起始索引等于 1 的子串是 "ba", 它是 "ab" 的异位词。
     * 起始索引等于 2 的子串是 "ab", 它是 "ab" 的异位词。
     *
     * 提示:
     * 1 <= s.length, p.length <= 3 * 104
     * s 和 p 仅包含小写字母
     *
     * 相关标签
     * 哈希表 字符串 滑动窗口
     */

    /**
     * 思路：
     * -[]
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams(String s, String p) {
        /**
         * 滑动窗口
         *
         * 输入: s = "abab", p = "ab"
         * 输出: [0,1,2]
         * 遍历 s，
         * 从 s 中获取 p 长度的窗口
         * 构造一个 p 长度的数组，存放 s 窗口中在 p 中的对应位置字符的数量
         * 遍历 s 窗口，计算每个字符在 s 窗口和 p 中出现的次数是否相等
         *      如果不相等，则向右滑动一位
         *      如果相等，则返回索引
         */

        List<Integer> ans = new ArrayList<>();

        // 计算 p 中每个字符出现的次数
        Map<Character, Integer> pCharToCountMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pCharToCountMap.put(p.charAt(i), pCharToCountMap.getOrDefault(p.charAt(i), 0) + 1);
        }

        // 初始化第一个 sub 窗口，计算 sub 中在 p 中每个字符出现的次数
        Map<Character, Integer> subSCharToCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (p.contains("" + s.charAt(i))) {
                subSCharToCountMap.put(s.charAt(i), subSCharToCountMap.getOrDefault(s.charAt(i), 0) + 1);
            }
        }

        /**
         * 输入: s = "abab", p = "ab"
         * 输入: s = "ab", p = "ab"
         * 输入: s = "ba", p = "ab"
         * 输入: s = "ab", p = "ab"
         * 输出: [0,1,2]
         */

        boolean flag = true;
        // 遍历 s
        for (int i = 0; i < s.length() - p.length(); i++) {
            // left 向右移一位
            subSCharToCountMap.put(s.charAt(i), subSCharToCountMap.getOrDefault(s.charAt(i), 1) - 1);
            // right 向右移一位
            subSCharToCountMap.put(s.charAt(i + p.length()), subSCharToCountMap.getOrDefault(s.charAt(i + p.length()), 0) + 1);
            if (!subSCharToCountMap.getOrDefault(s.charAt(i), 0).equals(pCharToCountMap.getOrDefault(s.charAt(i), 0))) {
                flag = false;
            }
            if (!subSCharToCountMap.getOrDefault(s.charAt(i + p.length()), 0).equals(pCharToCountMap.getOrDefault(s.charAt(i + p.length()), 0))) {
                flag = false;
            }
            if (flag) {
                ans.add(i);
            }
        }

        return ans;
    }

    /**
     * 思路：滑动窗口结合hash
     * -[]
     * 时间复杂度：O(n*m)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams2(String s, String p) {
        /**
         * 滑动窗口
         *
         * 输入: s = "abab", p = "ab"
         * 输出: [0,1,2]
         * 遍历 s，
         * 从 s 中获取 p 长度的窗口
         * 构造一个 p 长度的数组，存放 s 窗口中在 p 中的对应位置字符的数量
         * 遍历 s 窗口，计算每个字符在 s 窗口和 p 中出现的次数是否相等
         *      如果不相等，则向右滑动一位
         *      如果相等，则返回索引
         */

        List<Integer> ans = new ArrayList<>();

        Map<Character, Integer> pCharToCountMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pCharToCountMap.put(p.charAt(i), pCharToCountMap.getOrDefault(p.charAt(i), 0) + 1);
        }

        // 遍历 s
        for (int i = 0; i < s.length() - p.length() + 1; i++) {

            // 从 s 中获取 p 长度的窗口
            String subS = s.substring(i, i + p.length());
            Map<Character, Integer> subSCharToCountMap = new HashMap<>();

            // 遍历 s 窗口，计算每个字符在 s 窗口和 p 中出现的次数是否相等
            for (int j = 0; j < subS.length(); j++) {
                subSCharToCountMap.put(subS.charAt(j), subSCharToCountMap.getOrDefault(subS.charAt(j), 0) + 1);
            }

            boolean flag = true;
            for (Character c : pCharToCountMap.keySet()) {
                if (!Objects.equals(pCharToCountMap.get(c), subSCharToCountMap.get(c))) {
                    flag = false;
                }
            }

            if (flag) {
                ans.add(i);
            }
        }

        return ans;
    }

    /**
     * 思路：滑动窗口
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     * 结果: 超出时间限制
     * 优化建议：
     *
     * @param s
     * @param p
     * @return
     */
    public List<Integer> findAnagrams1(String s, String p) {
        /**
         * 滑动窗口
         *
         * 输入: s = "abab", p = "ab"
         * 输出: [0,1,2]
         * 遍历 s，
         * 从 s 中获取 p 长度的窗口
         * 遍历 s 窗口，计算每个字符在 s 窗口和 p 中出现的次数是否相等
         *      如果不相等，则向右滑动一位
         *      如果相等，则返回索引
         */

        List<Integer> ans = new ArrayList<>();
        // 遍历 s
        for (int i = 0; i < s.length() - p.length() + 1; i++) {

            // 从 s 中获取 p 长度的窗口
            String subS = s.substring(i, i + p.length());

            boolean flag = true;
            // 遍历 s 窗口，计算每个字符在 s 窗口和 p 中出现的次数是否相等
            for (int j = 0; j < subS.length(); j++) {
                char currChar = subS.charAt(j);
                int subCharCount = 0;
                int pCharCount = 0;
                for (int k = 0; k < subS.length(); k++) {
                    if (currChar == subS.charAt(k)) {
                        subCharCount++;
                    }
                    if (currChar == p.charAt(k)) {
                        pCharCount++;
                    }
                }
                if (subCharCount != pCharCount) {
                    flag = false;
                }
            }
            if (flag) {
                ans.add(i);
            }
        }

        return ans;
    }

}
