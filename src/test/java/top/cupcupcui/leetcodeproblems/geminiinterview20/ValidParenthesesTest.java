package top.cupcupcui.leetcodeproblems.geminiinterview20;

import org.junit.Assert;
import org.junit.Test;
import top.cupcupcui.leetcodeproblems.array.PlusOne;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    /**
     * 示例 1：
     * 输入：s = "()"
     * 输出：true
     */
    @Test
    public void test_PositiveCase0() {
        ValidParentheses service = new ValidParentheses();
        String arg1 = "()";
        boolean expected = true;
        boolean response = service.isValid(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 示例 2：
     * 输入：s = "()[]{}"
     * 输出：true
     */
    @Test
    public void test_PositiveCase1() {
        ValidParentheses service = new ValidParentheses();
        String arg1 = "()[]{}";
        boolean expected = true;
        boolean response = service.isValid(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 示例 3：
     * 输入：s = "(]"
     * 输出：false
     */
    @Test
    public void test_PositiveCase2() {
        ValidParentheses service = new ValidParentheses();
        String arg1 = "(]";
        boolean expected = false;
        boolean response = service.isValid(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 示例 4：
     * 输入：s = "([])"
     * 输出：true
     */
    @Test
    public void test_PositiveCase3() {
        ValidParentheses service = new ValidParentheses();
        String arg1 = "([])";
        boolean expected = true;
        boolean response = service.isValid(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 示例 5：
     * 输入：s = "([)]"
     * 输出：false
     */
    @Test
    public void test_PositiveCase4() {
        ValidParentheses service = new ValidParentheses();
        String arg1 = "([)]";
        boolean expected = false;
        boolean response = service.isValid(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 示例 6：
     * 输入：s = "("
     * 输出：false
     */
    @Test
    public void test_PositiveCase5() {
        ValidParentheses service = new ValidParentheses();
        String arg1 = "(";
        boolean expected = false;
        boolean response = service.isValid(arg1);
        Assert.assertEquals(expected, response);
    }
}