package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/9/8 18:35
 * @description 14. 最长公共前缀
 */
public class LongestCommonPrefix {

    /**
     * https://leetcode.cn/problems/longest-common-prefix/description/?envType=study-plan-v2&envId=top-interview-150
     * longestCommonPrefix
     * LongestCommonPrefix
     *
     * 14. 最长公共前缀
     * 简单
     *
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     * 示例 1：
     * 输入：strs = ["flower","flow","flight"]
     * 输出："fl"
     *
     * 示例 2：
     * 输入：strs = ["dog","racecar","car"]
     * 输出：""
     * 解释：输入不存在公共前缀。
     *
     * 提示：
     * 1 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] 如果非空，则仅由小写英文字母组成
     *
     * 相关标签
     * 字典树、数组、字符串
     *
     */


    /**
     * 思路：
     * -[] 两次遍历，遍历数组中每个元素，根据前缀分组统计
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
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();

        int commonLength = Integer.MAX_VALUE;
        for (int index = 0; index < strs.length; index++) {
            commonLength = Math.min(strs[index].length(), commonLength);
        }

        // 需要遍历的次数
        for (int index = 0; index < strs.length; index++) {

            /**
             * 输入：strs = ["a","a"]
             * 输出："a"
             */
            if (strs[0].length() - 1 > index || strs[0].isEmpty()) {
                // 超过范围，退出循环
                return longestCommonPrefix.toString();
            }
            // 遍历 strs 中每个元素
            char commonChar = strs[0].charAt(index);
            // TODO：修改为遍历 strs 中最长的字符串长度
            for (int j = 0; j < commonLength; j++) {
                if (strs[j].length() - 1 > index) {
                    // 超过范围
                    return longestCommonPrefix.toString();
                }
                char currChar = strs[j].charAt(index);
                if (commonChar == currChar) {
                    longestCommonPrefix.append(commonChar);
                }
            }
        }

        return longestCommonPrefix.toString();
    }

}
