package top.cupcupcui.leetcodeproblems.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cuiguanghao
 * @date 2026/2/12 11:26
 * @description 66. 加一
 */
public class PlusOne {
    /**
     * https://leetcode.cn/problems/plus-one/description/?envType=problem-list-v2&envId=array
     * 66. 加一
     * 简单
     * 给定一个表示 **大整数** 的整数数组 digits，其中 digits[i] 是整数的第 i 位数字。
     * 这些数字按从左到右，从最高位到最低位排列。这个大整数不包含任何前导 0。
     * 将大整数**加 1**，并返回结果的**数字数组**。
     *
     * 示例 1：
     * 输入：digits = [1,2,3]
     * 输出：[1,2,4]
     * 解释：输入数组表示数字 123。
     * 加 1 后得到 123 + 1 = 124。
     * 因此，结果应该是 [1,2,4]。
     *
     * 示例 2：
     * 输入：digits = [4,3,2,1]
     * 输出：[4,3,2,2]
     * 解释：输入数组表示数字 4321。
     * 加 1 后得到 4321 + 1 = 4322。
     * 因此，结果应该是 [4,3,2,2]。
     *
     * 示例 3：
     * 输入：digits = [9]
     * 输出：[1,0]
     * 解释：输入数组表示数字 9。
     * 加 1 得到了 9 + 1 = 10。
     * 因此，结果应该是 [1,0]。
     *
     * 提示：
     * 1 <= digits.length <= 100
     * 0 <= digits[i] <= 9
     * digits 不包含任何前导 0。
     *
     * 相关标签
     * 数组 数学
     */

    /**
     * 思路：
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                ++digits[i];
                for (int j = i + 1; j < n; j++) {
                    digits[j] = 0;
                }
                return digits;
            }
        }

        // digits 中所有的元素均为 9
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }

    /**
     * 力扣官方题解
     */
    class Solution {
        public int[] plusOne(int[] digits) {
            int n = digits.length;
            for (int i = n - 1; i >= 0; --i) {
                if (digits[i] != 9) {
                    ++digits[i];
                    for (int j = i + 1; j < n; ++j) {
                        digits[j] = 0;
                    }
                    return digits;
                }
            }

            // digits 中所有的元素均为 9
            int[] ans = new int[n + 1];
            ans[0] = 1;
            return ans;
        }
    }

    /**
     * 思路：
     * 思路1：digits 数组转为 Long，Long 再+1，Long 再转为数组
     * 思路2：digits 数组倒序遍历，当前位+1，如果大于9，则当前位置0，
     * digits-1 数组倒序遍历，当前位+1，如果大于9，则当前位置0，
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param digits
     * @return
     */
    public int[] plusOneV1(int[] digits) {
        /**
         * 输入：digits = [9,9,9]
         * 输出：[1,0,0,0]
         */

        int addNum = 1;
        List<Integer> digitsArray = new ArrayList<Integer>();
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + addNum > 9) {
                digitsArray.add(0);
            } else {
                digitsArray.add(digits[i] + addNum);
                addNum = 0;
            }
        }
        if (digitsArray.get(digitsArray.size() - 1) == 0) {
            digitsArray.add(1);
        }

        int[] newDigits = new int[digitsArray.size()];
        for (int i = digitsArray.size() - 1; i >= 0; i--) {
            newDigits[digitsArray.size() - 1 - i] = digitsArray.get(i);
        }

        return newDigits;
    }
}
