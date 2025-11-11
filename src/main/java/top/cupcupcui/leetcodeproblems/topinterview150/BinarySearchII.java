package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/11/7 10:45
 * @description 704. Binary Search（二分查找）
 */
public class BinarySearchII {

    /**
     * 题目描述：在有序数组中查找第一个大于等于目标值的位置
     * 给定一个 n 个元素的**有序（升序）**整型数组 nums 和一个目标值 target，写一个函数搜索 nums 中第一个大于等于 target 的元素。如果存在这样的元素，返回其下标；否则返回 -1。
     * 示例
     * 示例 1：
     * 输入：nums = [2, 3, 5, 7, 11, 13], target = 5
     * 输出：2
     * 解释：数组中第一个大于等于 5 的元素是 nums[2] = 5
     * 示例 2：
     * 输入：nums = [2, 3, 5, 7, 11, 13], target = 6
     * 输出：3
     * 解释：数组中第一个大于等于 6 的元素是 nums[3] = 7
     * 示例 3：
     * 输入：nums = [2, 3, 5, 7, 11, 13], target = 15
     * 输出：-1
     * 解释：数组中没有大于等于 15 的元素
     * 要求
     * 时间复杂度：O(log n)
     * 空间复杂度：O(1)
     * 约束条件
     * 1 <= nums.length <= 10^4
     * -10^4 < nums[i], target < 10^4
     * nums 是升序排列的
     */

    /**
     * 思路：二分查找
     * -[]
     * 时间复杂度：O(logn)
     * 空间复杂度：O(1)
     * 结果: 通过
     * 优化建议：
     *
     * @param nums
     * @param target
     * @param left
     * @return
     */
    public int search(int[] nums, int target, int left) {
        int right = nums.length - 1;
        if (left == right && nums[left] >= target) {
            // 只有一个元素并且第一个元素满足要求
            return left;
        }

        // 给定一个 n 个元素的**有序（升序）**整型数组 nums 和一个目标值 target，写一个函数搜索 nums 中第一个大于等于 target 的元素。如果存在这样的元素，返回其下标；否则返回 -1。
        while (left <= right) {
            int middleIndex = (right - left) / 2 + left;

            if (nums[middleIndex] >= target) {
                if (middleIndex == 0 || nums[middleIndex - 1] < target) {
                    return middleIndex;
                }
                right = middleIndex - 1;
            } else if (nums[middleIndex] < target) {
                left = middleIndex + 1;
            }
        }
        return -1;
    }

}
