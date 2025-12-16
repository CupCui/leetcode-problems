package top.cupcupcui.leetcodeproblems.binarysearch;

/**
 * @author cuiguanghao
 * @date 2025/12/11 17:25
 * @description 744. 寻找比目标字母大的最小字母
 */
public class FindSmallestLetterGreaterThanTarget {
    /**
     * https://leetcode.cn/problems/find-smallest-letter-greater-than-target/?envType=study-plan-v2&envId=binary-search
     * 744. 寻找比目标字母大的最小字母
     * 简单
     * 提示
     * 给你一个字符数组 letters，该数组按<b>非递减</b>顺序排序，以及一个字符 target。letters 里<b>至少有两个不同</b>的字符。
     * 返回 letters 中<b>大于</b> target 的<b>最小</b>的字符。如果不存在这样的字符，则返回 letters 的第一个字符。
     *
     * 示例 1：
     * 输入: letters = ['c', 'f', 'j']，target = 'a'
     * 输出: 'c'
     * 解释：letters 中字典上比 'a' 大的最小字符是 'c'。
     *
     * 示例 2:
     * 输入: letters = ['c','f','j'], target = 'c'
     * 输出: 'f'
     * 解释：letters 中字典顺序上大于 'c' 的最小字符是 'f'。
     *
     * 示例 3:
     * 输入: letters = ['x','x','y','y'], target = 'z'
     * 输出: 'x'
     * 解释：letters 中没有一个字符在字典上大于 'z'，所以我们返回 letters[0]。
     *
     * 提示：
     * 2 <= letters.length <= 104
     * letters[i] 是一个小写字母
     * letters 按非递减顺序排序
     * letters 最少包含两个不同的字母
     * target 是一个小写字母
     *
     * 相关标签
     * 数组 二分查找
     */

    /**
     * 思路：二分法
     * 时间复杂度：O(logn)
     * 空间复杂度：O(1)
     * 结果: 提交通过
     * 优化建议：
     *
     * @param letters
     * @param target
     * @return
     */
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid - 1 >= 0 && letters[mid - 1] <= target && letters[mid] > target) {
                return letters[mid];
            } else if (mid + 1 <= letters.length - 1 && letters[mid] <= target && letters[mid + 1] > target) {
                return letters[mid + 1];
            } else if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[0];
    }

    /**
     * 思路：二分法
     * 时间复杂度：O(logn)
     * 空间复杂度：O(1)
     * 结果: 提交未通过
     * 优化建议：
     *
     * @param letters
     * @param target
     * @return
     */
    public char nextGreatestLetterV1(char[] letters, char target) {
        /**
         * 输入: letters = ['a','b','c','d'], target = 'z'
         * 输出: 'x'
         *
         * letters = ["c","f","j"]
         * target = "d"
         * left right mid
         * 0    2     1
         *
         * left right mid
         * 0    0     0
         *
         *
         */
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] == target) {
                if (mid == letters.length - 1) {
                    // 遍历到最后了，返回第一个
                    return letters[0];
                }
                return letters[mid + 1];
            } else if (letters[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return letters[0];
    }

}
