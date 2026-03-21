package top.cupcupcui.leetcodeproblems.alichengyun;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author cuiguanghao
 * @date 2026/3/21 12:37
 * @description 7、字符串压缩。
 */
public class StringCompression {
    /**
     * 7、字符串压缩。
     * 利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
     * 比如，字符串aabcccccaaa会变为a2b1c5a3。
     * 若“压缩”后的字符串没有变短，则返回原先的字符串。
     * 你可以假设字符串中只包含大小写英文字母（a至z）。
     * 示例 1：
     * 输入："aabcccccaaa"
     * 输出："a2b1c5a3"
     * 示例 2：
     * 输入："abbccd"
     * 输出："abbccd"
     * 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
     * 提示：
     * 字符串长度在 [0, 50000] 范围内。
     * 难度：简单
     */

    /**
     * 思路：遍历 s，统计相邻的元素个数，并记录
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     */
    public String stringCompression(String s) {
        if (s.isEmpty()) {
            return s;
        }

        LinkedBlockingDeque<Character> charDeque = new LinkedBlockingDeque<>();
        charDeque.addLast(s.charAt(0));
        int currCharCount = 1;
        for (int i = 1; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == charDeque.peekLast()) {
                // 重复元素，计数器加
                currCharCount++;
            } else {
                // 新元素，把上一个元素计数器 push 到堆栈
                charDeque.addLast(String.valueOf(currCharCount).charAt(0));
                charDeque.addLast(currChar);
                // 计数器置为 1
                currCharCount = 1;
            }
        }
        charDeque.addLast(String.valueOf(currCharCount).charAt(0));

        if (s.length() <= charDeque.size()) {
            return s;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!charDeque.isEmpty()) {
            stringBuilder.append(charDeque.pollFirst());
        }

        return stringBuilder.toString();
    }
}
