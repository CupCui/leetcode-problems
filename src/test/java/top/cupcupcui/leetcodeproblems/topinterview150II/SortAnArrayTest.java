package top.cupcupcui.leetcodeproblems.topinterview150II;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class SortAnArrayTest {

    /**
     * 输入：nums = [5,2,3,1]
     * 输出：[1,2,3,5]
     */
    @Test
    public void test_PositiveCase0() {
        SortAnArray service = new SortAnArray();
        int[] arg1 = {5, 2, 3, 1};
        int[] expected = {1, 2, 3, 5};
        int[] response = service.sortArray(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [5,1,1,2,0,0]
     * 输出：[0,0,1,1,2,5]
     */
    @Test
    public void test_PositiveCase1() {
        SortAnArray service = new SortAnArray();
        int[] arg1 = {5, 1, 1, 2, 0, 0};
        int[] expected = {0, 0, 1, 1, 2, 5};
        int[] response = service.sortArray(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [0]
     * 输出：[0]
     */
    @Test
    public void test_PositiveCase2() {
        SortAnArray service = new SortAnArray();
        int[] arg1 = {0};
        int[] expected = {0};
        int[] response = service.sortArray(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 输入：nums = [0, -1]
     * 输出：[-1,0]
     */
    @Test
    public void test_PositiveCase3() {
        SortAnArray service = new SortAnArray();
        int[] arg1 = {0, -1};
        int[] expected = {-1, 0};
        int[] response = service.sortArray(arg1);

        Assert.assertArrayEquals(expected, response);
    }

    /**
     * 官方题解
     */
    class Solution {
        public int[] sortArray(int[] nums) {
            randomizedQuicksort(nums, 0, nums.length - 1);
            return nums;
        }

        public void randomizedQuicksort(int[] nums, int l, int r) {
            if (l < r) {
                int pos = randomizedPartition(nums, l, r);
                randomizedQuicksort(nums, l, pos - 1);
                randomizedQuicksort(nums, pos + 1, r);
            }
        }

        public int randomizedPartition(int[] nums, int l, int r) {
            int i = new Random().nextInt(r - l + 1) + l; // 随机选一个作为我们的主元
            swap(nums, r, i);
            return partition(nums, l, r);
        }

        public int partition(int[] nums, int l, int r) {
            int pivot = nums[r];
            int i = l - 1;
            for (int j = l; j <= r - 1; ++j) {
                if (nums[j] < pivot) {
                    i = i + 1;
                    swap(nums, i, j);
                }
            }
            swap(nums, i + 1, r);
            return i + 1;
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

}