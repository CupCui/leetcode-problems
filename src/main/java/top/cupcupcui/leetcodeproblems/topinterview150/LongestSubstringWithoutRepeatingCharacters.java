package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cuiguanghao
 * @date 2025/11/10 16:58
 * @description 3. 无重复字符的最长子串
 */
public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * https://leetcode.cn/problems/longest-substring-without-repeating-characters/?envType=study-plan-v2&envId=top-interview-150
     * 3. 无重复字符的最长子串
     * 提示
     * 给定一个字符串 s ，请你找出其中**不含有重复字符**的 **最长** **子串** 的长度。
     *
     * 示例 1:
     * 输入: s = "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。注意 "bca" 和 "cab" 也是正确答案。
     *
     * 示例 2:
     * 输入: s = "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     *
     * 示例 3:
     * 输入: s = "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     * 提示：
     * 0 <= s.length <= 5 * 104
     * s 由英文字母、数字、符号和空格组成
     *
     * 相关标签
     * 哈希表 字符串 滑动窗口
     */


    /**
     * 思路：
     * -[]
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果: 错误
     * 优化建议：
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        /*
         *
         * 思路一：暴力解法
         * 遍历 n 次，
         * 每次选第 i 个字符作为 start，
         * 遍历 [i, n] 中每个字符，判断是否在 [i, n] 中重复
         *
         * 思路三：滑动窗口 + Hash 表
         * 遍历 s，start、end 两个指针区间，
         * 使用 Hash 表，判断 end 的 next 字符，是否在 start-end 区间内，
         * 如果 next 在 start-end 区间内，则 start 指向 start-end 区间内的 next 字符，
         * 如果 next 不在 start-end 区间内，则 end + 1，
         * 记录 start-end 区间长度 maxLength 和 maxSubString
         **
         */
        int start = 0;
        int end = 0;
        int maxLenght = 0;
        Map<Character, Integer> characterToIndexMap = new HashMap<>();
        // 遍历 s
        while (end < s.length()) {
            /**
             * 输入: s = "abcdab"
             * 输出: 3
             */
            if (characterToIndexMap.containsKey(s.charAt(end))) {
                int newStart = characterToIndexMap.get(s.charAt(end)) + 1;
                for (int i = start; i < newStart; i++) {
                    characterToIndexMap.remove(s.charAt(end));
                }
                start = newStart;
            }
            characterToIndexMap.put(s.charAt(end), end);

            maxLenght = Math.max(maxLenght, end - start + 1);

            // 右边界往右滑动
            end++;
        }

        return maxLenght;
    }

    /**
     * 思路：滑动窗口
     * -[]
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring1(String s) {
        /*
         * 思路二：滑动窗口
         * 遍历 s，start、end 两个指针区间，
         * 判断 end 的 next 字符，是否在 start-end 区间内，
         * 如果 next 在 start-end 区间内，则 start 指向 start-end 区间内的 next 字符，
         * 如果 next 不在 start-end 区间内，则 end + 1，
         * 记录 start-end 区间长度 maxLength 和 maxSubString
         */
        int start = 0;
        int end = 0;
        int maxLenght = 0;
        // 遍历 s
        while (end < s.length()) {
            /**
             * 输入: s = "abcdab"
             * 输出: 3
             */
            for (int i = start; i < end; i++) {
                if (s.charAt(i) == s.charAt(end)) {
                    // 左边界往右滑动
                    start = i + 1;
                    break;
                }
            }
            maxLenght = Math.max(maxLenght, end - start + 1);

            // 右边界往右滑动
            end++;
        }

        return maxLenght;
    }


}
