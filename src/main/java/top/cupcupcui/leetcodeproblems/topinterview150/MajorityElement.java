package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author garre
 */
public class MajorityElement {

    /**
     * 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     * <p>
     * 示例 1：
     * 输入：nums = [3,2,3]
     * 输出：3
     * 示例 2：
     * 输入：nums = [2,2,1,1,1,2,2]
     * 输出：2
     * 提示：
     * n == nums.length
     * 1 <= n <= 5 * 104
     * -109 <= nums[i] <= 109
     * <p>
     * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
     * <p>
     * 思路: 1.循环遍历删除数组中元素，标记删除的元素为-1；2.移动数组中元素，将值为-1的元素移动到末尾
     * 知识点：数组 / 字符串
     * 测试:
     * 结果:
     * 时间复杂度: O()
     * 空间复杂度: O()
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> key2CountMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = key2CountMap.get(nums[i]);
            if (count == null) {
                key2CountMap.put(nums[i], 1);
            } else {
                key2CountMap.put(nums[i], ++count);
            }
        }
        int majorityCount = 0;
        int majorityElement = -1;
        for (Map.Entry<Integer, Integer> entry : key2CountMap.entrySet()) {
            if (entry.getValue() > majorityCount) {
                majorityCount = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
        return majorityElement;
    }


    public int majorityElementV1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        System.out.println("majority element not found");
        return -1;
    }
}