package top.cupcupcui.leetcodeproblems.geminiinterview20;

import java.util.ArrayList;
import java.util.List;

/**
 * 20. 有效的括号
 *
 * @author cuiguanghao
 * @date 2026/3/19 17:43
 */
public class ValidParentheses {
    /**
     * https://leetcode.cn/problems/valid-parentheses/description/
     * 20. 有效的括号
     * 简单
     *
     * 提示
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     *
     * 有效字符串需满足：
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     * 每个右括号都有一个对应的相同类型的左括号。
     *
     * 示例 1：
     * 输入：s = "()"
     * 输出：true
     *
     * 示例 2：
     * 输入：s = "()[]{}"
     * 输出：true
     *
     * 示例 3：
     * 输入：s = "(]"
     * 输出：false
     *
     * 示例 4：
     * 输入：s = "([])"
     * 输出：true
     *
     * 示例 5：
     * 输入：s = "([)]"
     * 输出：false
     *
     * 提示：
     * 1 <= s.length <= 104
     * s 仅由括号 '()[]{}' 组成
     */

    /**
     * 思路：栈，先进先出 FIFO
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        List<Character> fifoStack = new ArrayList<>();
        fifoStack.add(s.charAt(0));

        int top = 0;
        for (int i = 1; i < s.length(); i++) {
            if (fifoStack.isEmpty()) {
                fifoStack.add(s.charAt(i));
                top++;
                continue;
            }

            if (isMatch(fifoStack.get(top), s.charAt(i))) {
                fifoStack.remove(top);
                top--;
            } else {
                fifoStack.add(s.charAt(i));
                top++;
            }
        }
        if (fifoStack.isEmpty()) {
            return true;
        }

        return false;
    }

    private boolean isMatch(char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        } else if (left == '{' && right == '}') {
            return true;
        } else if (left == '[' && right == ']') {
            return true;
        }
        return false;
    }

}
