package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.Objects;

/**
 * @author cuiguanghao
 * @date 2025/9/5 18:15
 * @description 58. 最后一个单词的长度
 */
public class LengthOfLastWord {
    /**
     * https://leetcode.cn/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
     * <p>
     * 58. 最后一个单词的长度
     * 简单
     * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
     * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
     * <p>
     * 示例 1：
     * 输入：s = "Hello World"
     * 输出：5
     * 解释：最后一个单词是“World”，长度为 5。
     * <p>
     * 示例 2：
     * 输入：s = "   fly me   to   the moon  "
     * 输出：4
     * 解释：最后一个单词是“moon”，长度为 4。
     * <p>
     * 示例 3：
     * 输入：s = "luffy is still joyboy"
     * 输出：6
     * 解释：最后一个单词是长度为 6 的“joyboy”。
     * <p>
     * 提示：
     * 1 <= s.length <= 104
     * s 仅有英文字母和空格 ' ' 组成
     * s 中至少存在一个单词
     * <p>
     * 相关标签
     * 字符串
     */

    /**
     * 思路：
     * -[] 根据空内容分隔，取最后一个不为空内容
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
    public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        for (int i = split.length - 1; i >= 0; i++) {
            if (!Objects.equals(split[i], " ")) {
                return split[i].length();
            }
        }

        return -1;
    }

}
