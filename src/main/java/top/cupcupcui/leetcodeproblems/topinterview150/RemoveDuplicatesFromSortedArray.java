package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author garre
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
     * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
     * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
     * 返回 k 。
     * 判题标准:
     * <p>
     * 系统会用下面的代码来测试你的题解:
     * int[] nums = [...]; // 输入数组
     * int[] expectedNums = [...]; // 长度正确的期望答案
     * int k = removeDuplicates(nums); // 调用
     * assert k == expectedNums.length;
     * for (int i = 0; i < k; i++) {
     * assert nums[i] == expectedNums[i];
     * }
     * 如果所有断言都通过，那么您的题解将被 通过。
     * <p>
     * 示例 1：
     * 输入：nums = [1,1,2]
     * 输出：2, nums = [1,2,_]
     * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
     * 示例 2：
     * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
     * 输出：5, nums = [0,1,2,3,4]
     * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
     * <p>
     * 提示：
     * 1 <= nums.length <= 3 * 104
     * -104 <= nums[i] <= 104
     * nums 已按 非严格递增 排列
     * <p>
     * <p>
     * <p>
     * 思路: 1.循环遍历删除数组中元素，标记删除的元素为-1；2.移动数组中元素，将值为-1的元素移动到末尾
     * 知识点：数组 / 字符串
     * 测试:
     * 结果:
     * 时间复杂度: O()
     * 空间复杂度: O()
     * 优化建议：为了提高效率，避免二次遍历和嵌套循环，你可以使用 双指针 技巧来优化算法。
     * 核心思路是：维护两个指针，一个指针遍历数组，另一个指针记录不等于 val 的元素的下标。这样可以在一个遍历过程中完成任务，避免了额外的嵌套循环。
     * 空间优化：
     *
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int keepNumSize = nums.length;
        int removeMarker = -999;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = removeMarker;
                keepNumSize--;
            }
        }

        // 需要海历的次数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == removeMarker) {
                // 遍历第一个非 removeMarker 元素，并交换
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != removeMarker) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        return keepNumSize;

    }

}
