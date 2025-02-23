package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author garre
 */
public class RemoveDuplicatesFromSortedArrayiiTest {


    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [1,1,1,2,2,3]
     * 输出：5, nums = [1,1,2,2,3]
     */
    @Test
    public void removeElement_PositiveCase1() {
        RemoveDuplicatesFromSortedArrayii removeDuplicatesFromSortedArrayii = new RemoveDuplicatesFromSortedArrayii();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int expected = 5;
        int result = removeDuplicatesFromSortedArrayii.removeDuplicatesii(nums);
        Assert.assertEquals(expected, result);
    }

}