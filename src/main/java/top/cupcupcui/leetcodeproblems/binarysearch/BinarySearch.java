package top.cupcupcui.leetcodeproblems.binarysearch;

import java.util.Arrays;

/**
 * @author cuiguanghao
 * @date 2025/11/21 17:43
 * @description 35. 搜索插入位置
 */
public class BinarySearch {
    /**
     * https://leetcode.cn/problems/binary-search/description/?envType=study-plan-v2&envId=binary-search
     * 35. 搜索插入位置
     * 简单
     * 给定一个**排序数组**和一个目标值，在数组中找到目标值，并返回其**索引**。如果目标值不存在于数组中，返回它将会被**按顺序插入**的位置。
     *
     * 请必须使用时间复杂度为 O(log n) 的算法。
     *
     * 示例 1:
     * 输入: nums = [1,3,5,6], target = 5
     * 输出: 2
     *
     * 示例 2:
     * 输入: nums = [1,3,5,6], target = 2
     * 输出: 1
     *
     * 示例 3:
     * 输入: nums = [1,3,5,6], target = 7
     * 输出: 4
     *
     * 提示:
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums 为 无重复元素 的 升序 排列数组
     * -104 <= target <= 104
     *
     * 相关标签
     * 数组 二分查找
     */


    /**
     * 思路：二分法，简化递归
     * 时间复杂度：O(logn)
     * 空间复杂度：O(logn)
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else if (nums[middle] > target) {
                right = middle - 1;
            }
        }
        return left;
    }


    /**
     * 思路：lingma 建议：二分法，迭代版本简化
     * 时间复杂度：O(logn)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert3(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    /**
     * 思路：二分法（遍历数组，找到第一个大于等于target的元素，返回索引）
     * 时间复杂度：O(logn)
     * 空间复杂度：O(logn)
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        return extracted(nums, target, left, right);
    }

    private static int extracted(int[] nums, int target, int left, int right) {
        if (left >= right) {
            if (nums[right] < target) {
                return right + 1;
            } else {
                return right;
            }
        }
        int length = right - left + 1;

        int middle = left + length / 2;
        if (nums[middle] == target) {
            // 如果 target 等于中间的值，返回索引
            return middle;
        } else if (nums[middle] > target) {
            // 如果 target 小于中间的值，遍历左数组
            return extracted(nums, target, left, middle - 1);
        } else {
            // 如果 target 大于中间的值，遍历右数组
            return extracted(nums, target, middle + 1, right);
        }
    }

    /**
     * 思路：暴力解法，遍历数组（遍历数组，找到第一个大于等于target的元素，返回索引）
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
