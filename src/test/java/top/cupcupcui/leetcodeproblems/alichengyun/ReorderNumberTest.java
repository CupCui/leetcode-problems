package top.cupcupcui.leetcodeproblems.alichengyun;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReorderNumberTest {

    /**
     * 输入：nums = [10,2]
     * 输出："210"
     */
    @Test
    public void test_PositiveCase0() {
        ReorderNumber service = new ReorderNumber();
        int[] arg1 = {10, 2};
        String expected = "210";
        String response = service.reorderNumber(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [3,30,34,5,9]
     * 输出："9534330"
     */
    @Test
    public void test_PositiveCase1() {
        ReorderNumber service = new ReorderNumber();
        int[] arg1 = {3, 30, 34, 5, 9};
        String expected = "9534330";
        String response = service.reorderNumber(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1]
     * 输出："1"
     */
    @Test
    public void test_PositiveCase2() {
        ReorderNumber service = new ReorderNumber();
        int[] arg1 = {1};
        String expected = "1";
        String response = service.reorderNumber(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [12,21]
     * 输出："2112"
     */
    @Test
    public void test_PositiveCase3() {
        ReorderNumber service = new ReorderNumber();
        int[] arg1 = {12, 21};
        String expected = "2112";
        String response = service.reorderNumber(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [30,3]
     * 输出："330"
     */
    @Test
    public void test_PositiveCase4() {
        ReorderNumber service = new ReorderNumber();
        int[] arg1 = {30, 3};
        String expected = "330";
        String response = service.reorderNumber(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [9,89]
     * 输出："989"
     */
    @Test
    public void test_PositiveCase5() {
        ReorderNumber service = new ReorderNumber();
        int[] arg1 = {9, 89};
        String expected = "989";
        String response = service.reorderNumber(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [321,32,31,3,2,1]
     * 输出："3 32 321 31 2 1"
     */
    @Test
    public void test_PositiveCase6() {
        ReorderNumber service = new ReorderNumber();
        int[] arg1 = {321, 32, 31, 3, 2, 1};
        String expected = "3323213121";
        String response = service.reorderNumber(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [0,0]
     * 输出："0"
     */
    @Test
    public void test_PositiveCase7() {
        ReorderNumber service = new ReorderNumber();
        int[] arg1 = {0, 0};
        String expected = "0";
        String response = service.reorderNumber(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [0,1]
     * 输出："10"
     */
    @Test
    public void test_PositiveCase8() {
        ReorderNumber service = new ReorderNumber();
        int[] arg1 = {0, 1};
        String expected = "10";
        String response = service.reorderNumber(arg1);

        Assert.assertEquals(expected, response);
    }
}