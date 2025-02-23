package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author garre
 */
public class RemoveDuplicatesFromSortedArrayii {

    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * <p>
     * 说明：
     * 为什么返回数值是整数，但输出的答案是数组呢？
     * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     * 你可以想象内部操作如下:
     * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
     * int len = removeDuplicates(nums);
     * // 在函数里修改输入数组对于调用者是可见的。
     * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
     * for (int i = 0; i < len; i++) {
     * print(nums[i]);
     * }
     * <p>
     * 示例 1：
     * 输入：nums = [1,1,1,2,2,3]
     * 输出：5, nums = [1,1,2,2,3]
     * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
     * 示例 2：
     * 输入：nums = [0,0,1,1,1,1,2,3,3]
     * 输出：7, nums = [0,0,1,1,2,3,3]
     * 解释：函数应返回新长度 length = 7, 并且原数组的前七个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。
     * <p>
     * 提示：
     * 1 <= nums.length <= 3 * 104
     * -104 <= nums[i] <= 104
     * nums 已按升序排列
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
    public int removeDuplicatesii(int[] nums) {
        int keepNumSize = nums.length;
        int removeMarker = -999;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 2]) {
                nums[i] = removeMarker;
                keepNumSize--;
            }
        }

        // 需要遍历的次数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == removeMarker) {
                //遍历第一个非 PemoveMarker 元素，并交換
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != removeMarker) {
                        // 交换元素
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
