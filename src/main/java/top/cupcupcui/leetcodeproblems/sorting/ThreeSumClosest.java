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
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
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
         *      我们固定 i，
         *      也即转化为求和 nums[i] - target 最接近的 l 和 h
         *      如果 nums[l] + nums[h] + nums[i] 等于 target，返回结果
         *      如果 nums[l] + nums[h] + nums[i] 大于 target，h--
         *      如果 nums[l] + nums[h] + nums[i] 小于 target，l++
         */

        // 排序
        partition(nums, 0, nums.length - 1);

        int ans = Integer.MAX_VALUE;
        int best = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int h = nums.length - 1;
            while (l < h) {
                int sum = nums[l] + nums[h] + nums[i];
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(sum - target) < best) {
                    best = Math.abs(sum - target);
                    ans = sum;
                }

                if (sum > target) {
                    h--;
                } else {
                    l++;
                }
            }
        }

        return ans;
    }

    /**
     * 思路：快排
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     *
     * @param nums
     * @param l
     * @param h
     */
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


}
