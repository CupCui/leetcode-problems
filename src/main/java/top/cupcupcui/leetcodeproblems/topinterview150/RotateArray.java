package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/4/24 9:14
 * @description 189. 轮转数组
 * <p>
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 * <p>
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 * <p>
 * 提示：
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 * <p>
 * 进阶：
 * 尽可能想出更多的解决方案，至少有 三种 不同的方法可以解决这个问题。
 * 你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
 */
public class RotateArray {


    /**
     * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
     * 示例 1:
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     * <p>
     * 思路：
     * -[x] 遍历nums·将最后K个元素放入新数组中;再次遍历nums,将前n-k个元素放人新数组中
     * 时间复杂度：0(n)
     * 空间负责度：0(n)
     * 知识点：数组 / 字符串
     * 测试: 通过
     * 结果: 通过
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] rotateArray(int[] nums, int k) {
        if (k == 0 || nums.length == 0) {
            return nums;
        }
        k = k % nums.length;
        // 最后的K个元素
        int[] lastElements = new int[k];
        int tempIndex = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            lastElements[tempIndex] = nums[i];
            tempIndex++;
        }
        // 同等长度的数组
        int[] rotatedNums = new int[nums.length];
        // 将最后k个元素放人新数组中最前位置
        for (int i = 0; i < lastElements.length; i++) {
            rotatedNums[i] = lastElements[i];
        }
        // 将前n-k个元素放人新数组中
        for (int i = lastElements.length; i < nums.length; i++) {
            rotatedNums[i] = nums[i - k];
        }
        for (int i = 0; i < rotatedNums.length; i++) {
            nums[i] = rotatedNums[i];
        }

        return nums;
    }

    /**
     * 思路:
     * - [x] 遍历nums，将元素整体向右移一位
     * 时间复杂度：0(n2)
     * 空间负责度：0(1)
     * <p>
     * 知识点：数组 / 字符串
     * 测试: 通过
     * 结果: 超出时间限制
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param nums
     * @return
     */
    public int[] rotateArrayV1(int[] nums, int k) {
        // 需要遍历的次数
        for (int i = 0; i < k; i++) {
            int preElement = nums[0];
            // 将元素整体向右移一位
            for (int j = 1; j < nums.length; j++) {
                // 交换当前位置元素和占位元素
                int temp = nums[j];
                nums[j] = preElement;
                preElement = temp;
            }

            // 将最后一个元素放到第一位
            nums[0] = preElement;
        }
        return nums;
    }

}