package top.cupcupcui.leetcodeproblems.geminiinterview20;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 1. 两数之和
 *
 * @author cuiguanghao
 * @date 2026/3/19 17:18
 */
public class TwoSum {
    /**
     * https://leetcode.cn/problems/two-sum/description/
     * 1. 两数之和
     * 简单
     * 提示
     *
     * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 **和为**目标值 target  的那 **两个 整数**，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
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
     */


    /**
     * 思路：思维转换，找 target - nums[i] 是否存在于数组中
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        /**
         * 输入：nums = [2,7,11,15], target = 9
         * 输出：[0,1]
         */
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numToIndexMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int newTarget = target - nums[i];
            if (numToIndexMap.containsKey(newTarget)) {
                if (i == numToIndexMap.get(newTarget)) {
                    continue;
                }

                // 方便单元测试
                return new int[]{Math.min(i, numToIndexMap.get(newTarget)), Math.max(i, numToIndexMap.get(newTarget))};
            }
        }

        return null;
    }

}
