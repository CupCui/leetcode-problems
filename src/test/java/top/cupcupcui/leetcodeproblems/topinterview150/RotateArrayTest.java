package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author cuiguanghao
 * @date 2025/4/27 9:16
 * @description
 */
public class RotateArrayTest {

    /**
     * 正例
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
     * 输出: [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
     */
    @Test
    public void rotateArray_PositiveCase0() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3;
        int[] expected = {8, 9, 10, 1, 2, 3, 4, 5, 6, 7};
        int[] response = rotateArray.rotateArray(nums, k);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右轮转 1 步: [7,1,2,3,4,5,6]
     * 向右轮转 2 步: [6,7,1,2,3,4,5]
     * 向右轮转 3 步: [5,6,7,1,2,3,4]
     */
    @Test
    public void rotateArray_PositiveCase1() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        int[] response = rotateArray.rotateArray(nums, k);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 2:
     * <p>
     * 输入：nums = [-1,-100,3,99], k = 2
     * 输出：[3,99,-1,-100]
     * 解释:
     * 向右轮转 1 步: [99,-1,-100,3]
     * 向右轮转 2 步: [3,99,-1,-100]
     */
    @Test
    public void rotateArray_PositiveCase2() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] expected = {3, 99, -1, -100};
        int[] response = rotateArray.rotateArray(nums, k);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 2:
     * <p>
     * 输入：nums = [], k = 0
     * 输出：[]
     */
    @Test
    public void rotateArray_PositiveCase3() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {};
        int k = 0;
        int[] expected = {};
        int[] response = rotateArray.rotateArray(nums, k);
        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 2:
     * <p>
     * 输入：nums = [-1], k = 1
     * 输出：[-1]
     */
    @Test
    public void rotateArray_PositiveCase4() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {-1};
        int k = 1;
        int[] expected = {-1};
        int[] response = rotateArray.rotateArray(nums, k);
        Assert.assertArrayEquals(expected, response);
    }


    /**
     * 正例
     * <p>
     * 示例 2:
     * <p>
     * 输入：nums = [-1], k = 2
     * 输出：[-1]
     */
    @Test
    public void rotateArray_PositiveCase5() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {-1};
        int k = 2;
        int[] expected = {-1};
        int[] response = rotateArray.rotateArray(nums, k);
        Assert.assertArrayEquals(expected, response);
    }

}