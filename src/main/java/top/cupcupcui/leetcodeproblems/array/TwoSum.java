package top.cupcupcui.leetcodeproblems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cuiguanghao
 * @date 2026/2/10 17:46
 * @description 1. 两数之和
 */
public class TwoSum {
    /**
     * https://leetcode.cn/problems/two-sum/description/?envType=problem-list-v2&envId=array
     * 1. 两数之和
     * 简单
     * 提示
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的**数组下标**。
     * 你可以假设每种输入**只会对应一个答案**，并且你不能使用两次相同的元素。
     * 你可以按任意顺序返回答案。
     *
     * 示例 1：
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     *
     * 示例 2：
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     *
     * 示例 3：
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     *
     * 提示：
     * 2 <= nums.length <= 104
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * 只会存在一个有效答案
     *
     * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
     *
     * 相关标签
     * 初级工程师 数组 哈希表
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
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    /**
     * 力扣官方题解
     */
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }
    }

    /**
     * 思路：
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSumV2(int[] nums, int target) {
        /**
         * 排序、双指针
         * hash
         */
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndexMap.containsKey(nums[i])) {
                if (nums[i] * 2 == target) {
                    return new int[]{numToIndexMap.get(nums[i]), i};
                }
            }
            numToIndexMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            if (numToIndexMap.containsKey(newTarget) && numToIndexMap.get(newTarget) != i) {
                return new int[]{numToIndexMap.get(newTarget), i};
            }
        }

        return null;
    }

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
    public int[] twoSumV1(int[] nums, int target) {
        /**
         * 排序、双指针
         */
        // 冒泡排序
        // 快排，分治思维
        /**
         * 输入：nums = [2,7,11,15], target = 9
         * 输出：[0,1]
         * 输入：nums = [2,7,11,15]
         * 输入：nums = [3,1,2,0,2]
         *
         * 输入：nums = [0,1,2,2,3]
         */
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        bubbleSort(numsCopy);

        // partition(numsCopy, 0, numsCopy.length - 1);

        int l = 0;
        int h = numsCopy.length - 1;
        while (l < h) {
            int sum = numsCopy[l] + numsCopy[h];
            if (sum == target) {
                break;
            } else if (sum < target) {
                l++;
            } else {
                h--;
            }
        }
        int newL = -1;
        int newH = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == numsCopy[l]) {
                if (newL == -1 && newH != i) {
                    newL = i;
                }
            }
            if (nums[i] == numsCopy[h]) {
                if (newH == -1 && newL != i) {
                    newH = i;
                }
            }
        }

        return new int[]{newL, newH};
    }

    /**
     * 思路：冒泡排序
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     *
     * @param numsCopy
     */
    private static void bubbleSort(int[] numsCopy) {
        for (int i = numsCopy.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numsCopy[j] > numsCopy[j + 1]) {
                    swap(numsCopy, j, j + 1);
                }
            }
        }
    }

    /**
     * 思路：快排，分治
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(logn)
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
        int currPoint = l;
        for (int i = l; i <= h; i++) {
            if (nums[i] < nums[pivot]) {
                swap(nums, i, currPoint);
                currPoint++;
            }
        }
        swap(nums, currPoint, pivot);
        partition(nums, l, currPoint - 1);
        partition(nums, currPoint + 1, h);
    }

    private static void swap(int[] nums, int i, int currPoint) {
        int temp = nums[i];
        nums[i] = nums[currPoint];
        nums[currPoint] = temp;
    }

}
