package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author garre
 */
public class RemoveElementTest {

    RemoveElement removeElement;

    /**
     * 排序 nums 的前 length 个元素
     *
     * @param nums
     * @param start
     * @param length
     * @return
     */
    private int[] sortNums(int[] nums, int start, int length) {
        int[] tempNums = new int[length];
        // 获取 nums 前 removeElementResult 个元素
        for (int i = 0; i < length; i++) {
            tempNums[i] = nums[i];
        }
        nums = tempNums;

        // 对 nums 前 removeElementResult 个元素排序
        // 冒泡排序
        // 总共需要遍历的次数
        // [0, 1, 3, 0, 4]
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                // 每次遍历将最大的元素移动到末尾
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    @Before
    public void beforeInit() {
        removeElement = new RemoveElement();
    }

    /**
     * 正例
     */
    @Test
    public void removeElement_PositiveCase1() {
        /*
        示例 1：
        输入：nums = [3,2,2,3], val = 3
        输出：2, nums = [2,2,_,_]
        解释：你的函数函数应该返回 k = 2, 并且 nums 中的前两个元素均为 2。
        你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
        */
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int removeElementResult = removeElement.removeElement(nums, val);
        System.out.println("test: nums" + Arrays.toString(nums) + ", removeElementResult: " + removeElementResult);

        // 排序 nums 的前 length 个元素
        nums = sortNums(nums, 0, removeElementResult);
        System.out.println("test: nums" + Arrays.toString(nums) + ", removeElementResult: " + removeElementResult);

        int expectedValResponse = 2;
        Assert.assertEquals(expectedValResponse, removeElementResult);
        int[] expectedNumsResponse = {2, 2};
        // 排序 nums 的前 length 个元素
        expectedNumsResponse = sortNums(expectedNumsResponse, 0, expectedNumsResponse.length);
        Assert.assertArrayEquals(expectedNumsResponse, nums);
    }

    /**
     * 正例
     */
    @Test
    public void removeElement_PositiveCase2() {
        /*
         * 示例 2：
         * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
         * 输出：5, nums = [0,1,4,0,3,_,_,_]
         * 解释：你的函数应该返回 k = 5，并且 nums 中的前五个元素为 0,0,1,3,4。
         * 注意这五个元素可以任意顺序返回。
         * 你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
         */
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int removeElementResult = removeElement.removeElement(nums, val);
        System.out.println("test removeElement: nums" + Arrays.toString(nums) + ", removeElementResult: " + removeElementResult);

        // 排序 nums 的前 length 个元素
        nums = sortNums(nums, 0, removeElementResult);
        System.out.println("test sortNums: nums" + Arrays.toString(nums) + ", removeElementResult: " + removeElementResult);

        int expectedValResponse = 5;
        Assert.assertEquals(expectedValResponse, removeElementResult);
        int[] expectedNumsResponse = {0, 1, 4, 0, 3};
        // 排序 nums 的前 length 个元素
        expectedNumsResponse = sortNums(expectedNumsResponse, 0, expectedNumsResponse.length);
        Assert.assertArrayEquals(expectedNumsResponse, nums);
    }

    /**
     * 正例
     */
    @Test
    public void removeElement_PositiveCase3() {
        /*
        示例 1：
        输入：nums = [3,2,2,3], val = 999
        输出：4, nums = [3,2,2,3]
        解释：你的函数函数应该返回 k = 2, 并且 nums 中的前两个元素均为 2。
        你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
        */
        int[] nums = {3, 2, 2, 3};
        int val = 6;
        int removeElementResult = removeElement.removeElement(nums, val);
        System.out.println("test: nums" + Arrays.toString(nums) + ", removeElementResult: " + removeElementResult);

        // 排序 nums 的前 length 个元素
        nums = sortNums(nums, 0, removeElementResult);
        System.out.println("test: nums" + Arrays.toString(nums) + ", removeElementResult: " + removeElementResult);

        int expectedValResponse = 4;
        Assert.assertEquals(expectedValResponse, removeElementResult);
        int[] expectedNumsResponse = {3, 2, 2, 3};
        // 排序 nums 的前 length 个元素
        expectedNumsResponse = sortNums(expectedNumsResponse, 0, expectedNumsResponse.length);
        Assert.assertArrayEquals(expectedNumsResponse, nums);
    }

    /**
     * 正例
     */
    @Test
    public void removeElement_PositiveCase4() {
        /*
        示例 1：
        输入：nums = [], val = 999
        输出：0, nums = []
        解释：你的函数函数应该返回 k = 2, 并且 nums 中的前两个元素均为 2。
        你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
        */
        int[] nums = {};
        int val = 999;
        int removeElementResult = removeElement.removeElement(nums, val);
        System.out.println("test: nums" + Arrays.toString(nums) + ", removeElementResult: " + removeElementResult);

        // 排序 nums 的前 length 个元素
        nums = sortNums(nums, 0, removeElementResult);
        System.out.println("test: nums" + Arrays.toString(nums) + ", removeElementResult: " + removeElementResult);

        int expectedValResponse = 0;
        Assert.assertEquals(expectedValResponse, removeElementResult);
        int[] expectedNumsResponse = {};
        // 排序 nums 的前 length 个元素
        expectedNumsResponse = sortNums(expectedNumsResponse, 0, expectedNumsResponse.length);
        Assert.assertArrayEquals(expectedNumsResponse, nums);
    }


}