package top.cupcupcui.leetcodeproblems.sorting;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cuiguanghao
 * @date 2026/1/27 17:15
 * @description 15. 三数之和
 */
public class ThreeSum {
    /**
     * https://leetcode.cn/problems/3sum/description/?envType=problem-list-v2&envId=sorting&
     * 15. 三数之和
     * 中等
     * 提示
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
     * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
     *
     * 注意：答案中不可以包含重复的三元组。
     *
     * 示例 1：
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     * 解释：
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0 。
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0 。
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0 。
     * 不同的三元组是 [-1,0,1] 和 [-1,-1,2] 。
     * 注意，输出的顺序和三元组的顺序并不重要。
     *
     * 示例 2：
     * 输入：nums = [0,1,1]
     * 输出：[]
     * 解释：唯一可能的三元组和不为 0 。
     *
     * 示例 3：
     * 输入：nums = [0,0,0]
     * 输出：[[0,0,0]]
     * 解释：唯一可能的三元组和为 0 。
     *
     * 提示：
     * 3 <= nums.length <= 3000
     * -105 <= nums[i] <= 105
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
     */
    public List<List<Integer>> threeSum(int[] nums) {
        /**
         * 排序：nums = [-4,-1,-1,-1,0,1,2]
         *
         * 排序：nums = [-4,-1,-1,0,1,2]
         * 遍历 nums，当前作为基准位置，
         * 在左区间遍历，获取 nums[l] 值
         * 在右区间遍历，获取 nums[r] 值
         * 如果 nums[l] + nums[r] > nums[pivot]
         *      l--
         * 如果 nums[l] + nums[r] < nums[pivot]
         *      r++
         * 如果 nums[l] + nums[r] == nums[pivot]
         *      pivot++
         *      ans
         *
         * i    l     r    ans
         * -4   -4    2    l=-1
         *
         * i    l     r    ans
         * -1   -4    2    r=1
         *
         * i    l     r    ans
         * -1   -4    1    r=1
         *
         *
         * 输出：[[-1,-1,2],[-1,0,1]]
         */

        // 使用快排，对数组进行排序
        partition(nums, 0, nums.length - 1);

        List<List<Integer>> ansList = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            // 基准选择：确定一个 pivot 元素作为比较标准
            int pivot = i;

            int l = pivot - 1;
            int r = pivot + 1;
            int[] ans = new int[3];
            boolean isMatch = false;
            while (l >= 0 && r <= nums.length - 1) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    ans[0] = nums[l];
                    ans[1] = nums[i];
                    ans[2] = nums[r];
                    isMatch = true;
                    break;
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    r++;
                } else {
                    l--;
                }
            }
            if (isMatch) {
                ansList.add(Arrays.stream(ans).boxed().collect(Collectors.toList()));
            }
        }

        // return Collections.singletonList(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        return ansList;
    }

    /**
     * 二分法排序
     *
     * @param nums
     * @param l
     * @param h
     */
    private static void partition(int[] nums, int l, int h) {
        // 退出递归的条件
        // 关键点1：递归终止：使用 l >= h 而不是 i == l || l >= h
        if (l >= h) {
            return;
        }

        int pivot = h;
        int i = l;
        for (int j = l; j <= h; j++) {
            if (nums[j] < nums[pivot]) {
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, pivot);
        // partition left
        partition(nums, l, i - 1);

        // 关键点2：在 i 位置已经放置了基准元素，应该对 i+1 到 h 的范围进行分区
        // partition right
        partition(nums, i + 1, h);
    }

    private static void swap(int[] nums, int source, int target) {
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }
}
