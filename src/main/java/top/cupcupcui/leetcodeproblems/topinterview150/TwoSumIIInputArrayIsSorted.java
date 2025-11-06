package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/11/6 14:23
 * @description 167. 两数之和 II - 输入有序数组
 */
public class TwoSumIIInputArrayIsSorted {
    /**
     * https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150
     * 167. 两数之和 II - 输入有序数组
     * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target 的两个数。
     * 如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
     * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
     * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
     * 你所设计的解决方案必须只使用常量级的额外空间。
     *
     * 示例 1：
     * 输入：numbers = [2,7,11,15], target = 9
     * 输出：[1,2]
     * 解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。返回 [1, 2] 。
     *
     * 示例 2：
     * 输入：numbers = [2,3,4], target = 6
     * 输出：[1,3]
     * 解释：2 与 4 之和等于目标数 6 。因此 index1 = 1, index2 = 3 。返回 [1, 3] 。
     *
     * 示例 3：
     * 输入：numbers = [-1,0], target = -1
     * 输出：[1,2]
     * 解释：-1 与 0 之和等于目标数 -1 。因此 index1 = 1, index2 = 2 。返回 [1, 2] 。
     *
     * 提示：
     * 2 <= numbers.length <= 3 * 104
     * -1000 <= numbers[i] <= 1000
     * numbers 按 非递减顺序 排列
     * -1000 <= target <= 1000
     * 仅存在一个有效答案
     *
     * 相关标签
     * 数组 双指针 二分查找
     */

    /**
     * 双指针
     * 思路：
     * -[]
     * 复杂度分析
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * 相关标签:
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

    /**
     * 双指针
     * 思路：
     * -[]
     * 复杂度分析
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     * 相关标签:
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param numbers
     * @param target
     * @return
     */
    public int[] twoSum1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int left = i;
            for (int j = i + 1; j < numbers.length; j++) {
                int right = j;
                if (numbers[left] + numbers[right] == target) {
                    return new int[]{left + 1, right + 1};
                }
            }
        }
        return null;
    }

}
