package top.cupcupcui.leetcodeproblems.sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * @author cuiguanghao
 * @date 2026/2/9 13:35
 * @description 217. 存在重复元素
 */
public class ContainsDuplicate {

    /**
     * https://leetcode.cn/problems/contains-duplicate/?envType=problem-list-v2&envId=sorting&
     * 217. 存在重复元素
     * 简单
     * 给你一个整数数组 nums 。如果任一值在数组中出现 **至少两次** ，返回 true ；如果数组中每个元素互不相同，返回 false 。
     *
     * 示例 1：
     * 输入：nums = [1,2,3,1]
     * 输出：true
     * 解释：
     * 元素 1 在下标 0 和 3 出现。
     *
     * 示例 2：
     * 输入：nums = [1,2,3,4]
     * 输出：false
     * 解释：
     * 所有元素都不同。
     *
     * 示例 3：
     * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
     * 输出：true
     *
     * 提示：
     * 1 <= nums.length <= 105
     * -109 <= nums[i] <= 109
     *
     * 相关标签
     * 数组 哈希表 排序
     */

    /**
     * 思路：
     * 思路1：遍历数组，固定一个位置 i，遍历数组，查找等于 nums[i] 的元素。O(n2)
     * 思路2：排序，遍历数组，固定一个位置 i，遍历当前位置后的元素，查找等于 nums[i] 的元素。O(nlogn)
     * 思路3：使用 map。遍历数组，放到 map<元素值，个数>，如果个数大于 1，则返回。O(nlogn)
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            boolean notPresent = numSet.add(nums[i]);
            if (!notPresent) {
                return true;
            }
        }

        return false;
    }

}
