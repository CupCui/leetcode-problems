package top.cupcupcui.leetcodeproblems.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    /**
     * 输入：nums = [1,2,3,1]
     * 输出：true
     */
    @Test
    public void test_PositiveCase0() {
        ContainsDuplicate service = new ContainsDuplicate();
        int[] arg1 = {1, 2, 3, 1};
        boolean expected = true;
        boolean response = service.containsDuplicate(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1,2,3,4]
     * 输出：false
     */
    @Test
    public void test_PositiveCase1() {
        ContainsDuplicate service = new ContainsDuplicate();
        int[] arg1 = {1, 2, 3, 4};
        boolean expected = false;
        boolean response = service.containsDuplicate(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
     * 输出：true
     */
    @Test
    public void test_PositiveCase2() {
        ContainsDuplicate service = new ContainsDuplicate();
        int[] arg1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean expected = true;
        boolean response = service.containsDuplicate(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [0]
     * 输出：false
     */
    @Test
    public void test_PositiveCase3() {
        ContainsDuplicate service = new ContainsDuplicate();
        int[] arg1 = {0};
        boolean expected = false;
        boolean response = service.containsDuplicate(arg1);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [0, 0]
     * 输出：true
     */
    @Test
    public void test_PositiveCase4() {
        ContainsDuplicate service = new ContainsDuplicate();
        int[] arg1 = {0, 0};
        boolean expected = true;
        boolean response = service.containsDuplicate(arg1);
        Assert.assertEquals(expected, response);
    }

}