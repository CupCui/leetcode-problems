package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/11/6 13:39
 * @description 392. 判断子序列
 */
public class IsSubsequence {

    /**
     * https://leetcode.cn/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
     * 392. 判断子序列
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
     * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
     * 进阶：
     * 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
     *
     * 示例 1：
     * 输入：s = "abc", t = "ahbgdc"
     * 输出：true
     *
     * 示例 2：
     * 输入：s = "axc", t = "ahbgdc"
     * 输出：false
     *
     * 提示：
     * 0 <= s.length <= 100
     * 0 <= t.length <= 10^4
     * 两个字符串都只由小写字符组成。
     *
     * 相关标签
     * 双指针 字符串 动态规划
     */

    /**
     * 思路：双指针
     * -[]
     * 复杂度分析
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 相关标签:
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {

        if (s.equals(t)) {
            return true;
        }
        if (s.isEmpty() && !t.isEmpty()) {
            return true;
        }
        if (t.length() < s.length()) {
            return false;
        }
        /**
         * 输入：s = "abc", t = "ahbgdc"
         * 输出：true
         */
        int left = 0;
        for (int i = 0; i < t.length(); i++) {
            int right = i;

            if (s.charAt(left) == t.charAt(right)) {
                left++;
            }
            if (left >= s.length()) {
                return true;
            }
        }

        return false;
    }

}
