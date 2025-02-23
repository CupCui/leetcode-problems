package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author garre
 */
public class RemoveDuplicatesFromSortedArrayTest {


    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [1,1,2]
     * 输出：2, nums = [1,2,_]
     */
    @Test
    public void removeElement_PositiveCase1() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = {1, 1, 2};
        int expected = 2;
        int result = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        Assert.assertEquals(expected, result);
    }


}