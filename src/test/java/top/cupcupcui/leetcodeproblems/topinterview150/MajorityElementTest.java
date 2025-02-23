package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author garre
 */
public class MajorityElementTest {

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [3,2,3]
     * 输出：3
     */
    @Test
    public void removeElement_PositiveCase1() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {3, 2, 3};
        int expected = 3;
        int result = majorityElement.majorityElement(nums);
        Assert.assertEquals(expected, result);
    }

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [3,2,3]
     * 输出：3
     */
    @Test
    public void removeElementV1_PositiveCase1() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {3, 2, 3};
        int expected = 3;
        int result = majorityElement.majorityElementV1(nums);
        Assert.assertEquals(expected, result);
    }

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [6,5,5]
     * 输出：5
     */
    @Test
    public void removeElementV1_PositiveCase2() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {6, 5, 5};
        int expected = 5;
        int result = majorityElement.majorityElementV1(nums);
        Assert.assertEquals(expected, result);
    }

}