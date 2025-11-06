package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MinimumSizeSubarraySumTest {

    /**
     * 输入：target = 7, nums = [2,3,1,2,4,3]
     * 输出：2
     */
    @Test
    public void test_PositiveCase0() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 7;
        int[] arg2 = {2, 3, 1, 2, 4, 3};
        int expected = 2;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 4, nums = [1,4,4]
     * 输出：1
     */
    @Test
    public void test_PositiveCase1() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 4;
        int[] arg2 = {1, 4, 4};
        int expected = 1;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 11, nums = [1,1,1,1,1,1,1,1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase2() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 11;
        int[] arg2 = {1, 1, 1, 1, 1, 1, 1, 1};
        int expected = 0;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 1, nums = [1]
     * 输出：1
     */
    @Test
    public void test_PositiveCase3() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 1;
        int[] arg2 = {1};
        int expected = 1;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 2, nums = [1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase4() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 2;
        int[] arg2 = {1};
        int expected = 0;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 4, nums = [1,2,3,4]
     * 输出：1
     */
    @Test
    public void test_PositiveCase5() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 4;
        int[] arg2 = {1, 2, 3, 4};
        int expected = 1;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 5, nums = [1,2,3,4]
     * 输出：2
     */
    @Test
    public void test_PositiveCase6() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 5;
        int[] arg2 = {1, 2, 3, 4};
        int expected = 2;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 7, nums = [1,2,3,4]
     * 输出：2
     */
    @Test
    public void test_PositiveCase7() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 7;
        int[] arg2 = {1, 2, 3, 4};
        int expected = 2;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 10, nums = [1,2,3,4]
     * 输出：4
     */
    @Test
    public void test_PositiveCase8() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 10;
        int[] arg2 = {1, 2, 3, 4};
        int expected = 4;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 213, nums = [12,28,83,4,25,26,25,2,25,25,25,12]
     * 输出：8
     */
    @Test
    public void test_PositiveCase9() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 213;
        int[] arg2 = {12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12};
        int expected = 8;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：target = 10, nums = [1,2,3,4]
     * 输出：4
     */
    @Test
    public void test_PositiveCase10() {
        MinimumSizeSubarraySum service = new MinimumSizeSubarraySum();
        int arg1 = 10;
        int[] arg2 = {1, 2, 3, 4};
        int expected = 4;
        int response = service.minSubArrayLen(arg1, arg2);

        Assert.assertEquals(expected, response);
    }

    /**
     * 官方题解
     */
    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            int n = nums.length;
            if (n == 0) {
                return 0;
            }
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = i; j < n; j++) {
                    sum += nums[j];
                    if (sum >= s) {
                        ans = Math.min(ans, j - i + 1);
                        break;
                    }
                }
            }
            return ans == Integer.MAX_VALUE ? 0 : ans;
        }
    }


}