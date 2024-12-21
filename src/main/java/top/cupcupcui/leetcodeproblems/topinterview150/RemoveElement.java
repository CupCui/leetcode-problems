package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.Arrays;

/**
 * @author garre
 */
public class RemoveElement {

    /**
     * 描述
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
     * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
     * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
     * 返回 k。
     * <p>
     * 示例 2：
     * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
     * 输出：5, nums = [0,1,4,0,3,_,_,_]
     * 解释：你的函数应该返回 k = 5，并且 nums 中的前五个元素为 0,0,1,3,4。
     * 注意这五个元素可以任意顺序返回。
     * 你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
     * <p>
     * 提示：
     * 0 <= nums.length <= 100
     * 0 <= nums[i] <= 50
     * 0 <= val <= 100
     */
    //@Test
    public void removeElementTest() {
        /*
        a
        * */
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int removeElementResult = removeElement(nums, val);

        System.out.println("output: removeElementResult: " + removeElementResult);
        System.out.println("output: nums: " + Arrays.toString(nums));
    }

    /**
     * 思路: 1.循环遍历删除数组中元素，标记删除的元素为-1；2.移动数组中元素，将值为-1的元素移动到末尾
     * 知识点：数组 / 字符串
     * 测试:
     * 结果:
     * 时间复杂度: O(n2)
     * 空间复杂度: O(1)
     * 优化建议：为了提高效率，避免二次遍历和嵌套循环，你可以使用 双指针 技巧来优化算法。
     * 核心思路是：维护两个指针，一个指针遍历数组，另一个指针记录不等于 val 的元素的下标。这样可以在一个遍历过程中完成任务，避免了额外的嵌套循环。
     * 空间优化：
     *
     * @param nums 数组
     * @param val  需要移除的元素
     * @return
     */
    public int removeElement(int[] nums, int val) {
        System.out.println("original val: " + val + " nums: " + Arrays.toString(nums));
        // 1.循环遍历删除数组中元素，标记删除的元素为-1；
        int delValCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                delValCount++;
            }
        }
        System.out.println("mark deleted equals -1, nums: " + Arrays.toString(nums));

        // 2.移动数组中元素，将值为-1的元素移动到末尾
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -1) {
                // 遍历 nums，如果当前元素值为-1，倒叙遍历 nums，和倒叙排列最后一个不为-1的元素交换位置
                for (int j = nums.length - 1; j >= i; j--) {
                    if (nums[j] != -1) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }
        return nums.length - delValCount;
    }

}
