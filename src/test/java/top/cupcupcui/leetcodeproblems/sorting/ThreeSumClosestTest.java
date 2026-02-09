package top.cupcupcui.leetcodeproblems.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    /**
     * 输入：nums = [-1,2,1,-4], target = 1
     * 输出：2
     */
    @Test
    public void test_PositiveCase0() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {-1, 2, 1, -4};
        int arg2 = 1;
        int expected = 2;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [0,0,0], target = 1
     * 输出：0
     */
    @Test
    public void test_PositiveCase1() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {0, 0, 0};
        int arg2 = 1;
        int expected = 0;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [0,0,1], target = 1
     * 输出：1
     */
    @Test
    public void test_PositiveCase2() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {0, 0, 1};
        int arg2 = 1;
        int expected = 1;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [1,1,1], target = 1
     * 输出：3
     */
    @Test
    public void test_PositiveCase3() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {1, 1, 1};
        int arg2 = 1;
        int expected = 3;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：nums = [100,0,0,0], target = 1
     * 输出：0
     */
    @Test
    public void test_PositiveCase4() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {100, 0, 0, 0};
        int arg2 = 1;
        int expected = 0;
        int response = service.threeSumClosest(arg1, arg2);
        Assert.assertEquals(expected, response);
    }

    /**
     * 前言
     * 本题与 15. 三数之和 非常类似，可以使用「双指针」的方法来解决。但基于题解的独立性，这里还是会从零开始讲解。
     *
     * 方法一：排序 + 双指针
     * 思路与算法
     *
     * 题目要求找到与目标值 target 最接近的三元组，这里的「最接近」即为差值的绝对值最小。
     * 我们可以考虑直接使用三重循环枚举三元组，找出与目标值最接近的作为答案，时间复杂度为 O(N3)。然而本题的 N 最大为 1000，会超出时间限制。
     *
     * 那么如何进行优化呢？我们首先考虑枚举第一个元素 a，对于剩下的两个元素 b 和 c，我们希望它们的和最接近 target−a。对于 b 和 c，
     * 如果它们在原数组中枚举的范围（既包括下标的范围，也包括元素值的范围）没有任何规律可言，那么我们还是只能使用两重循环来枚举所有的可能情况。因此，我们可以考虑对整个数组进行升序排序，这样一来：
     * 假设数组的长度为 n，我们先枚举 a，它在数组中的位置为 i；
     *
     * 为了防止重复枚举，我们在位置 [i+1,n) 的范围内枚举 b 和 c。
     *
     * 当我们知道了 b 和 c 可以枚举的下标范围，并且知道这一范围对应的数组元素是有序（升序）的，那么我们是否可以对枚举的过程进行优化呢？
     *
     * 答案是可以的。借助双指针，我们就可以对枚举的过程进行优化。我们用 pb 和 pc
     *   分别表示指向 b 和 c 的指针，初始时，pb 指向位置 i+1，即左边界；
     *   pc 指向位置 n−1，即右边界。在每一步枚举的过程中，我们用 a+b+c 来更新答案，并且：
     *
     * 如果 a+b+c≥target，那么就将 pc 向左移动一个位置；
     *
     * 如果 a+b+c<target，那么就将 pb 向右移动一个位置。
     *
     * 这是为什么呢？我们对 a+b+c≥target 的情况进行一个详细的分析：
     *
     * 如果 a+b+c≥target，并且我们知道 pb 到 pc
     *   这个范围内的所有数是按照升序排序的，那么如果 pc 不变而 pb
     *   向右移动，那么 a+b+c 的值就会不断地增加，显然就不会成为最接近 target 的值了。因此，我们可以知道在固定了 pc
     *   的情况下，此时的 pb
     *   就可以得到一个最接近 target 的值，那么我们以后就不用再考虑 pc
     *   了，就可以将 pc 向左移动一个位置。
     *
     * 同样地，在 a+b+c<target 时：
     *
     * 如果 a+b+c<target，并且我们知道 pb 到 pc
     *   这个范围内的所有数是按照升序排序的，那么如果 pb 不变而 pc 向左移动，
     *   那么 a+b+c 的值就会不断地减小，显然就不会成为最接近 target 的值了。因此，我们可以知道在固定了 pb
     *   的情况下，此时的 pc
     *   就可以得到一个最接近 target 的值，那么我们以后就不用再考虑 pb 了，就可以将 pb 向右移动一个位置。
     *
     * 实际上，pb 和 pc
     *   就表示了我们当前可以选择的数的范围，而每一次枚举的过程中，
     *   我们尝试边界上的两个元素，根据它们与 target 的值的关系，
     *   选择「抛弃」左边界的元素还是右边界的元素，从而减少了枚举的范围。
     *   这种思路与 11. 盛最多水的容器 中的双指针解法也是类似的。
     */

    /**
     * 力扣官方题解
     */
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int n = nums.length;
            int best = 10000000;

            // 枚举 a
            for (int i = 0; i < n; ++i) {
                // 保证和上一次枚举的元素不相等
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                // 使用双指针枚举 b 和 c
                int j = i + 1, k = n - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    // 如果和为 target 直接返回答案
                    if (sum == target) {
                        return target;
                    }
                    // 根据差值的绝对值来更新答案
                    if (Math.abs(sum - target) < Math.abs(best - target)) {
                        best = sum;
                    }
                    if (sum > target) {
                        // 如果和大于 target，移动 c 对应的指针
                        int k0 = k - 1;
                        // 移动到下一个不相等的元素
                        while (j < k0 && nums[k0] == nums[k]) {
                            --k0;
                        }
                        k = k0;
                    } else {
                        // 如果和小于 target，移动 b 对应的指针
                        int j0 = j + 1;
                        // 移动到下一个不相等的元素
                        while (j0 < k && nums[j0] == nums[j]) {
                            ++j0;
                        }
                        j = j0;
                    }
                }
            }
            return best;
        }
    }

}