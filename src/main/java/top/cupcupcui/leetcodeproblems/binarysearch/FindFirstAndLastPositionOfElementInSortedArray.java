package top.cupcupcui.leetcodeproblems.binarysearch;

/**
 * @author cuiguanghao
 * @date 2026/1/15 18:15
 * @description 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    /**
     * https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=study-plan-v2&envId=binary-search
     * 34. 在排序数组中查找元素的第一个和最后一个位置
     * 中等
     *
     * 给你一个按照**非递减**顺序排列的**整数**数组 nums，
     * 和一个目标值 target。
     * 请你找出给定目标值在数组中的开始位置和结束位置。
     * 如果数组中不存在目标值 target，返回 [-1, -1]。
     * 你必须设计并实现时间复杂度为 **O(log n)** 的算法解决此问题。
     *
     *
     * 示例 1：
     * 输入：nums = [5,7,7,8,8,10], target = 8
     * 输出：[3,4]
     *
     * 示例 2：
     * 输入：nums = [5,7,7,8,8,10], target = 6
     * 输出：[-1,-1]
     *
     * 示例 3：
     * 输入：nums = [], target = 0
     * 输出：[-1,-1]
     *
     * 提示：
     * 0 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     * nums 是一个非递减数组
     * -109 <= target <= 109
     *
     * 相关标签
     * 数组、二分查找
     */

    /**
     * 思路：
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {

        /**
         * 1.查找 target 在目标数组中的下标，2.查找小于 target 的最大值，3.查找大于 target 的最小值，
         * 考虑边界，如果是第一位，如果是最后一位
         *
         * 给你一个按照**非递减**顺序排列的**整数**数组 nums，
         * 和一个目标值 target。
         * 请你找出给定目标值在数组中的开始位置和结束位置。
         *
         * 输入：nums = [5,7,7,8,8,10], target = 8
         * 输出：[3,4]
         */

        int lAns = -1;
        int hAns = -1;
        int l = 0;
        int h = nums.length - 1;
        boolean exists = false;
        // 1.查找 target 在目标数组中的下标
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                exists = true;
                hAns = mid;
                lAns = mid;
                break;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                h = mid - 1;
            }
        }

        if (!exists) {
            return new int[]{-1, -1};
        }

        l = 0;
        h = nums.length - 1;
        // 2.查找小于 target 的最大值（第一个小于 target 的值）
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                h = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                h = mid - 1;
            }
        }
        lAns = h;

        l = 0;
        h = nums.length - 1;
        // 3.查找大于 target 的最小值（第一个大于 target 的值）
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target) {
                l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                h = mid - 1;
            }
        }
        hAns = l;

        return new int[]{lAns, hAns};
    }
}
