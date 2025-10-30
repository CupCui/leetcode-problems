package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/10/30 16:12
 * @description 28. 找出字符串中第一个匹配项的下标
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {
    /**
     * https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150
     *
     * 28. 找出字符串中第一个匹配项的下标
     * 简单
     * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。如果 needle 不是 haystack 的一部分，则返回  -1 。
     *
     * 示例 1：
     * 输入：haystack = "sadbutsad", needle = "sad"
     * 输出：0
     * 解释："sad" 在下标 0 和 6 处匹配。
     * 第一个匹配项的下标是 0 ，所以返回 0 。
     * 示例 2：
     * 输入：haystack = "leetcode", needle = "leeto"
     * 输出：-1
     * 解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
     *
     * 提示：
     * 1 <= haystack.length, needle.length <= 104
     * haystack 和 needle 仅由小写英文字符组成
     *
     * 相关标签
     * 双指针 字符串 字符串匹配
     */

    /**
     * 思路：
     * -[] 两次遍历，每次遍历时比对
     * 复杂度分析
     * 时间复杂度：O(n2)
     * 空间复杂度：O(m)
     * 相关标签:
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {

        /**
         * 示例 1：
         * 输入：haystack = "sadbutsad", needle = "sad"
         * 输出：0
         * 解释："sad" 在下标 0 和 6 处匹配。
         * 第一个匹配项的下标是 0 ，所以返回 0 。
         */
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String substring = haystack.substring(i, i + needle.length());
                if (substring.equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }


    /**
     * 思路：
     * -[] indexOf 函数
     * 复杂度分析
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 相关标签:
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr1(String haystack, String needle) {

        /**
         * 示例 1：
         * 输入：haystack = "sadbutsad", needle = "sad"
         * 输出：0
         * 解释："sad" 在下标 0 和 6 处匹配。
         * 第一个匹配项的下标是 0 ，所以返回 0 。
         */
        boolean contains = haystack.contains(needle);
        if (contains) {
            return haystack.indexOf(needle);
        }

        return -1;
    }

}
