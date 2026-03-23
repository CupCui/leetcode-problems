package top.cupcupcui.leetcodeproblems.alichengyun;

import java.util.Arrays;

/**
 * Reorder the sequence of each number
 *
 * @author cuiguanghao
 * @date 2026/3/22 09:45
 */
public class ReorderNumber {
    /**
     * ５、给定一组**非负**整数 nums，
     * 重新排列每个数的顺序（每个数**不可拆分**）
     * 使之组成一个**最大**的**整数**。
     *
     * 注意：
     * 1. 输出结果可能非常大，所以你需要返回一个字符串而不是整数。
     * 2. 注意编码规范性，提供3个以上能直接运行通过的测试用例,注意边界条件
     *
     * 示例 1：
     * 输入：nums = [10,2]
     * 输出："210"
     * 示例 2：
     * 输入：nums = [3,30,34,5,9]
     * 输出："9534330"
     *
     * 输入：nums = [1,2]
     * 输出："21"
     * 输入：nums = [12,21]
     * 输出："2112"
     * 输入：nums = [30,3]
     * 输出："330"
     * 输入：nums = [9,89]
     * 输出："989"
     * 输入：nums = [31,32,3,2,1]
     * 输出："3323121"
     * 输入：nums = [321,32,31,3,2,1]
     * 输出："32 321 31 3 2 1"
     *
     * 提示：
     * 1 〈= nums.length 〈= 100
     * 难度：中等
     */

    /**
     * 思路：
     * 1. 步骤一：依次比较各个位的数值数，如果不足则用最大正整数补齐位数
     * 2. 步骤一：按照最高位排序；步骤二：比较相邻两个元素
     * 3. 列出 nums 的所有组合，从组合中筛选出最大的 O(n2)
     * 时间复杂度：O(logn)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @return
     */
    public String reorderNumber(int[] nums) {
        /**
         * 输入：nums = [1,4,2,3]
         * 输入：nums = [1,3,2,4]
         * 输入：nums = [1,2,3,4]
         */

        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsStr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numsStr.length; i++) {
            stringBuilder.append(numsStr[i]);
        }

        if (stringBuilder.toString().replaceAll("0", "").isEmpty()) {
            return "0";
        }

        return stringBuilder.toString();
    }

    /**
     * Cursor 标准解法（自定义排序）：
     * 1. 将数字转成字符串；
     * 2. 按照 (b + a) 与 (a + b) 的字典序降序排序；
     * 3. 顺序拼接为最终结果；
     * 4. 若排序后首元素为 "0"，说明全部为 0，直接返回 "0"。
     * <p>
     * 时间复杂度：O(n log n * k)，k 为平均字符串长度
     * 空间复杂度：O(n * k)
     */
    public String reorderNumberV2(int[] nums) {
        String[] numsStr = new String[nums.length];
        int totalLen = 0;
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
            totalLen += numsStr[i].length();
        }

        Arrays.sort(numsStr, (a, b) -> (b + a).compareTo(a + b));

        // 排序后最大值是 0，则所有值都是 0
        if ("0".equals(numsStr[0])) {
            return "0";
        }

        StringBuilder stringBuilder = new StringBuilder(totalLen);
        for (String s : numsStr) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    /**
     * 思路：
     * 1. 步骤一：依次比较各个位的数值数，如果不足则用最大正整数补齐位数
     * 2. 步骤一：按照最高位排序；步骤二：比较相邻两个元素
     * 3. 列出 nums 的所有组合，从组合中筛选出最大的 O(n2)
     * 时间复杂度：O(n2)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @return
     */
    public String reorderNumberV1(int[] nums) {
        // 冒泡排序
        /**
         * 输入：nums = [1,4,2,3]
         * 输入：nums = [1,3,2,4]
         * 输入：nums = [1,2,3,4]
         */
        // 需要遍历的次数
        for (int i = 0; i < nums.length - 1; i++) {
            // 遍历未排序的元素
            int maxValueIndex = 0;
            for (int j = 1; j < nums.length - i; j++) {
                String s1 = "" + nums[j] + nums[maxValueIndex];
                String s2 = "" + nums[maxValueIndex] + nums[j];
                // 字符串比较大小
                if (s1.compareTo(s2) > 0) {
                    maxValueIndex = j;
                }
            }
            int temp = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = nums[maxValueIndex];
            nums[maxValueIndex] = temp;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            stringBuilder.append(nums[i]);
        }

        return stringBuilder.toString();
    }

}
