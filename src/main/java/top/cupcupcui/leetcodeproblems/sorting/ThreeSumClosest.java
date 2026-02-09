package top.cupcupcui.leetcodeproblems.sorting;

/**
 * @author cuiguanghao
 * @date 2026/2/2 9:28
 * @description 16. 最接近的三数之和
 */
public class ThreeSumClosest {
    /**
     * https://leetcode.cn/problems/3sum-closest/description/?envType=problem-list-v2&envId=sorting&
     * 16. 最接近的三数之和
     * 中等
     * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出 **三个** 在 **不同下标位置** 的整数，使它们的和与 target **最接近**。
     * 返回这三个数的 **和**。
     * 假定每组输入只存在恰好一个解。
     *
     * 示例 1：
     * 输入：nums = [-1,2,1,-4], target = 1
     * 输出：2
     * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2)。
     *
     * 示例 2：
     * 输入：nums = [0,0,0], target = 1
     * 输出：0
     * 解释：与 target 最接近的和是 0（0 + 0 + 0 = 0）。
     *
     * 提示：
     * 3 <= nums.length <= 1000
     * -1000 <= nums[i] <= 1000
     * -104 <= target <= 104
     *
     * 相关标签
     * 数组 双指针 排序
     */

    /**
     * 思路：双指针 排序
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        /**
         * 16. 最接近的三数之和
         * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。
         * 请你从 nums 中选出 **三个** 在 **不同下标位置** 的整数，
         * 使它们的和与 target **最接近**。
         *      和 target 最接近的 i，即数组上 nums[i] - target 的绝对值最小，
         *
         *      我们固定 i，
         *      也即转化为求和 nums[i] - target 最接近的 l 和 h
         *      如果 nums[l] + nums[h] 等于 nums[i] - target，则距离为 0，最接近
         *      如果 nums[l] + nums[h] 大于 nums[i] - target，则距离为 0，最接近
         *      如果 nums[l] + nums[h] 小于 nums[i] - target，则距离为 0，最接近
         *
         *
         * 返回这三个数的 **和**。
         * 假定每组输入只存在恰好一个解。
         *
         * 输入：nums = [-1,2,1,-4], target = 1
         * 输出：2
         * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2)。
         * 排序：nums = [-4,-1,1,2]
         *
         *
         * 遍历 nums 中每个元素，固定当前元素，
         * 在所有 nums 中找到两个数，使 三个数的和最接近 target
         */

        // 排序
        partition(nums, 0, nums.length - 1);


        int ans = Integer.MAX_VALUE;
        return ans - target;
    }

    private static void partition(int[] nums, int l, int h) {
        if (l >= h) {
            return;
        }
        int pivot = h;
        int curr = l;
        // 快排排序，分治思想，遍历 nums，固定一个数 nums[i]，将小于nums[i]的都放到左边，大于的都放到右边
        for (int i = l; i <= h; i++) {
            if (nums[i] < nums[pivot]) {
                swap(nums, i, curr);
                curr++;
            }
        }
        swap(nums, curr, pivot);
        partition(nums, l, curr - 1);
        partition(nums, curr + 1, h);
    }

    private static void swap(int[] nums, int j, int pivot) {
        int temp = nums[j];
        nums[j] = nums[pivot];
        nums[pivot] = temp;
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
     *   就可以得到一个最接近 target 的值，那么我们以后就不用再考虑 pb
     *   了，就可以将 pb
     *   向右移动一个位置。
     *
     * 实际上，pb 和 pc
     *   就表示了我们当前可以选择的数的范围，而每一次枚举的过程中，我们尝试边界上的两个元素，根据它们与 target 的值的关系，选择「抛弃」左边界的元素还是右边界的元素，从而减少了枚举的范围。这种思路与 11. 盛最多水的容器 中的双指针解法也是类似的。
     *
     */


}
