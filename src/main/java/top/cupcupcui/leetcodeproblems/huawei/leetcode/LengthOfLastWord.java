package top.cupcupcui.leetcodeproblems.huawei.leetcode;

import org.junit.Test;

/**
 * @author garre
 */
public class LengthOfLastWord {

    /**
     * 58. 最后一个单词的长度
     * 简单
     * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
     * <p>
     * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
     * <p>
     * 示例 1：
     * 输入：s = "Hello World"
     * 输出：5
     * 解释：最后一个单词是“World”，长度为 5。
     * 示例 2：
     * 输入：s = "   fly me   to   the moon  "
     * 输出：4
     * 解释：最后一个单词是“moon”，长度为 4。
     * 示例 3：
     * 输入：s = "luffy is still joyboy"
     * 输出：6
     * 解释：最后一个单词是长度为 6 的“joyboy”。
     * <p>
     * 提示：
     * 1 <= s.length <= 104
     * s 仅有英文字母和空格 ' ' 组成
     * s 中至少存在一个单词
     */
    @Test
    public void lengthOfLastWordTest() {
        String s = "Hello World";
        //String s = "   fly me   to   the moon  ";
        //String s = "luffy is still joyboy";
        //String s = "word";

        int repeatNumber = lengthOfLastWord(s);
        System.out.println("repeatNumber: " + repeatNumber);
    }

    /**
     * 思路: 将字符串 s 根据空格符 ' ' 拆分为字符串数组，倒叙遍历字符串数组，如果最后一个字符串部位空串，则返回最后一个字符串长度
     * 知识点：字符串
     * 测试: 通过
     * result: 超时
     * 时间复杂度: O(n)
     * 空间复杂度: O(n)
     * 优化：
     * 空间优化：避免创建新的数组
     *
     * @param s
     * @return
     */
    public int lengthOfLastWord(String s) {
        String[] splitArray = s.split(" ");

        for (int i = splitArray.length - 1; i >= 0; i--) {
            String subString = splitArray[i];
            if (!subString.contains(" ")) {
                return subString.length();
            }
        }

        return 0;
    }


}
