package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/11/3 17:07
 * @description 125. 验证回文串
 */
public class ValidPalindrome {

    /**
     * https://leetcode.cn/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150
     *
     * 125. 验证回文串
     * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
     * 字母和数字都属于字母数字字符。
     * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
     *
     * 示例 1：
     * 输入: s = "A man, a plan, a canal: Panama"
     * 输出：true
     * 解释："amanaplanacanalpanama" 是回文串。
     *
     * 示例 2：
     * 输入：s = "race a car"
     * 输出：false
     * 解释："raceacar" 不是回文串。
     *
     * 示例 3：
     * 输入：s = " "
     * 输出：true
     * 解释：在移除非字母数字字符之后，s 是一个空字符串 "" 。
     * 由于空字符串正着反着读都一样，所以是回文串。
     *
     * 提示：
     * 1 <= s.length <= 2 * 105
     * s 仅由可打印的 ASCII 字符组成
     *
     * 相关标签
     * 双指针 字符串
     */

    /**
     * 思路：双指针；在原字符串上直接判断
     * -[]
     * 复杂度分析
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * 相关标签:
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {

        /**
         * 大写字符转换为小写字符、并移除所有非字母数字字符之后
         *
         */
        s = s.toLowerCase();
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            int currCharInt = s.charAt(i);
            if ((97 <= currCharInt && currCharInt <= 122)
                    || (48 <= currCharInt && currCharInt <= 57)
                    || (65 <= currCharInt && currCharInt <= 90)) {
                newStr.append(currChar);
            }
        }

        int strLength = newStr.length();
        if (strLength == 1 || strLength == 0) {
            return true;
        }
        for (int i = 0; i < strLength / 2; i++) {
            int left = i;
            int right = strLength - i - 1;
            if (newStr.charAt(left) != newStr.charAt(right)) {
                return false;
            }
        }

        return true;
    }

    /**
     * 思路：
     * -[]
     * 复杂度分析
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * 相关标签:
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param s
     * @return
     */
    public boolean isPalindrome1(String s) {

        /**
         * 大写字符转换为小写字符、并移除所有非字母数字字符之后
         *
         */
        s = s.toLowerCase();
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            int currCharInt = s.charAt(i);
            if ((97 <= currCharInt && currCharInt <= 122)
                    || (48 <= currCharInt && currCharInt <= 57)
                    || (65 <= currCharInt && currCharInt <= 90)) {
                newStr += currChar;
            }
        }

        int strLength = newStr.length();
        if (strLength == 1 || strLength == 0) {
            return true;
        }
        if (strLength % 2 == 0) {
            StringBuilder reverseStr = new StringBuilder();
            // 倒序遍历并输出
            for (int i = strLength - 1; i >= strLength / 2; i--) {
                reverseStr.append(newStr.charAt(i));
            }
            String prefixSubStr = newStr.substring(0, strLength / 2);
            if (reverseStr.toString().equals(prefixSubStr)) {
                return true;
            }
        } else {
            StringBuilder reverseStr = new StringBuilder();
            // 倒序遍历并输出
            for (int i = strLength - 1; i >= strLength / 2 + 1; i--) {
                reverseStr.append(newStr.charAt(i));
            }
            String prefixSubStr = newStr.substring(0, strLength / 2);
            if (reverseStr.toString().equals(prefixSubStr)) {
                return true;
            }
        }

        return false;
    }

}
