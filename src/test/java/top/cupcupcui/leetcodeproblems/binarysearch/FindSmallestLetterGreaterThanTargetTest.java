package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindSmallestLetterGreaterThanTargetTest {

    /**
     * 输入: letters = ['c', 'f', 'j']，target = 'a'
     * 输出: 'c'
     */
    @Test
    public void test_PositiveCase0() {
        FindSmallestLetterGreaterThanTarget service = new FindSmallestLetterGreaterThanTarget();
        char[] arg1 = {'c', 'f', 'j'};
        char arg2 = 'a';
        char expected = 'c';
        int response = service.nextGreatestLetter(arg1, arg2);

        Assert.assertEquals("expected: " + (char) expected + ", response: " + (char) response, (char) expected, (char) response);
    }

    /**
     * 输入: letters = ['c','f','j'], target = 'c'
     * 输出: 'f'
     */
    @Test
    public void test_PositiveCase1() {
        FindSmallestLetterGreaterThanTarget service = new FindSmallestLetterGreaterThanTarget();
        char[] arg1 = {'c', 'f', 'j'};
        char arg2 = 'c';
        char expected = 'f';
        int response = service.nextGreatestLetter(arg1, arg2);

        Assert.assertEquals("expected: " + (char) expected + ", response: " + (char) response, (char) expected, (char) response);
    }

    /**
     * 输入: letters = ['x','x','y','y'], target = 'z'
     * 输出: 'x'
     */
    @Test
    public void test_PositiveCase2() {
        FindSmallestLetterGreaterThanTarget service = new FindSmallestLetterGreaterThanTarget();
        char[] arg1 = {'x', 'x', 'y', 'y'};
        char arg2 = 'z';
        char expected = 'x';
        int response = service.nextGreatestLetter(arg1, arg2);

        Assert.assertEquals("expected: " + (char) expected + ", response: " + (char) response, (char) expected, (char) response);
    }

    /**
     * 输入: letters = ['x,'y'], target = 'z'
     * 输出: 'x'
     */
    @Test
    public void test_PositiveCase3() {
        FindSmallestLetterGreaterThanTarget service = new FindSmallestLetterGreaterThanTarget();
        char[] arg1 = {'x', 'y'};
        char arg2 = 'z';
        char expected = 'x';
        int response = service.nextGreatestLetter(arg1, arg2);

        Assert.assertEquals("expected: " + (char) expected + ", response: " + (char) response, (char) expected, (char) response);
    }

    /**
     * 输入: letters = ['x,'y'], target = 'x'
     * 输出: 'y'
     */
    @Test
    public void test_PositiveCase4() {
        FindSmallestLetterGreaterThanTarget service = new FindSmallestLetterGreaterThanTarget();
        char[] arg1 = {'x', 'y'};
        char arg2 = 'x';
        char expected = 'y';
        int response = service.nextGreatestLetter(arg1, arg2);

        Assert.assertEquals("expected: " + (char) expected + ", response: " + (char) response, (char) expected, (char) response);
    }

    /**
     * 输入: letters = ['x,'y'], target = 'y'
     * 输出: 'x'
     */
    @Test
    public void test_PositiveCase5() {
        FindSmallestLetterGreaterThanTarget service = new FindSmallestLetterGreaterThanTarget();
        char[] arg1 = {'x', 'y'};
        char arg2 = 'y';
        char expected = 'x';
        int response = service.nextGreatestLetter(arg1, arg2);

        Assert.assertEquals("expected: " + (char) expected + ", response: " + (char) response, (char) expected, (char) response);
    }

    /**
     * 输入: letters = ['x','y','z'], target = 'x'
     * 输出: 'y'
     */
    @Test
    public void test_PositiveCase6() {
        FindSmallestLetterGreaterThanTarget service = new FindSmallestLetterGreaterThanTarget();
        char[] arg1 = {'x', 'y', 'z'};
        char arg2 = 'x';
        char expected = 'y';
        int response = service.nextGreatestLetter(arg1, arg2);

        Assert.assertEquals("expected: " + (char) expected + ", response: " + (char) response, (char) expected, (char) response);
    }

    /**
     * 输入
     * letters = ["c","f","j"]
     * target = "d"
     * 输出
     * "c"
     * 预期结果
     * "f"
     */
    @Test
    public void test_PositiveCase7() {
        FindSmallestLetterGreaterThanTarget service = new FindSmallestLetterGreaterThanTarget();
        char[] arg1 = {'c', 'f', 'j'};
        char arg2 = 'd';
        char expected = 'f';
        int response = service.nextGreatestLetter(arg1, arg2);

        Assert.assertEquals("expected: " + (char) expected + ", response: " + (char) response, (char) expected, (char) response);
    }

}