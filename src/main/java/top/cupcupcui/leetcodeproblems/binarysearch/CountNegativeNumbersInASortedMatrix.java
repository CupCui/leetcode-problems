package top.cupcupcui.leetcodeproblems.binarysearch;

/**
 * @author cuiguanghao
 * @date 2025/12/16 17:25
 * @description 1351. 统计有序矩阵中的负数
 */
public class CountNegativeNumbersInASortedMatrix {
    /**
     * https://leetcode.cn/problems/count-negative-numbers-in-a-sorted-matrix/description/?envType=study-plan-v2&envId=binary-search
     * 1351. 统计有序矩阵中的负数
     * 简单
     * 提示
     * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以<b>非严格递减顺序</b>排列。 请你统计并返回 grid 中 <b>负数</b> 的数目。
     *
     * 示例 1：
     * 输入：grid = [[4,3,2,-1],
     *              [3,2,1,-1],
     *              [1,1,-1,-2],
     *              [-1,-1,-2,-3]]
     * 输出：8
     * 解释：矩阵中共有 8 个负数。
     *
     * 示例 2：
     * 输入：grid = [[3,2],[1,0]]
     * 输出：0
     *
     * 提示：
     * m == grid.length
     * n == grid[i].length
     * 1 <= m, n <= 100
     * -100 <= grid[i][j] <= 100
     *
     * 进阶：你可以设计一个时间复杂度为 O(n + m) 的解决方案吗？
     *
     * 相关标签
     * 数组 二分查找 矩阵
     */

    /**
     * 思路：二分法；二分法优化，每一次遍历范围缩小；二分法优化，分别查找行和列中第一个小于0的元素，转为一维数组
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param grid
     * @return
     */
    public int countNegatives(int[][] grid) {
        /**
         * 遍历二位数组，每一列使用二分法找到<b>第一个小于0</b>的元素
         * 时间复杂度：O(nlogn)
         * 空间复杂度：O(1)
         */

        /**
         * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以<b>非严格递减顺序</b>排列。 请你统计并返回 grid 中 <b>负数</b> 的数目。
         */
        int ans = 0;
        // 行数
        for (int i = 0; i < grid.length; i++) {
            // 列数
            for (int j = 0; j < grid[i].length; j++) {

            }
        }

        return ans;
    }

    /**
     * 思路：二分法；二分法优化，每一次遍历范围缩小；
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果: 提交未通过
     * 优化建议：
     *
     * @param grid
     * @return
     */
    public int countNegatives2(int[][] grid) {
        /**
         * 遍历二位数组，每一列使用二分法找到<b>第一个小于0</b>的元素
         * 时间复杂度：O(nlogn)
         * 空间复杂度：O(1)
         */

        /**
         * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以<b>非严格递减顺序</b>排列。 请你统计并返回 grid 中 <b>负数</b> 的数目。
         */
        int ans = 0;
        // 行数
        for (int i = 0; i < grid.length; i++) {
            // 列数
            for (int j = 0; j < grid[i].length; j++) {
                // 对每列使用二分法，查找第一个小于 0 的元素
                int left = j;
                int right = grid[i].length - 1;
                int midel = left + (right - left + 1) / 2;

                while (left <= right) {
                    if (midel + 1 < grid[i].length && grid[i][midel] > 0 && grid[i][midel + 1] < 0) {
                        ans = ans + (grid[i].length - (midel + 1));
                        break;
                    } else if (midel - 1 > 0 && grid[i][midel - 1] > 0 && grid[i][midel] < 0) {
                        ans = ans + (grid[i].length - midel);
                        break;
                    } else if (grid[i][midel] < 0) {
                        left = midel + 1;
                    } else {
                        right = midel - 1;
                    }
                }
            }
        }

        return ans;
    }

    /**
     * 思路：暴力解法，逐行遍历
     * 时间复杂度：O(mn)
     * 空间复杂度：O(1)
     * 结果:
     * 优化建议：
     *
     * @param grid
     * @return
     */
    public int countNegatives1(int[][] grid) {
        int ans = 0;
        // 行数
        for (int i = 0; i < grid.length; i++) {
            // 列数
            for (int j = 0; j < grid[i].length; j++) {
                // 第 i 行的第 j 列元素
                if (grid[i][j] < 0) {
                    ans = ans + (grid[i].length - j);
                    break;
                }
            }
        }

        return ans;
    }

}
