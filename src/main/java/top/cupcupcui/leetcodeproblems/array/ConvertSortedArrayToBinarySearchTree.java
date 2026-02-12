package top.cupcupcui.leetcodeproblems.array;

/**
 * @author cuiguanghao
 * @date 2026/2/12 15:51
 * @description 108. 将有序数组转换为二叉搜索树（涉及到树，已放弃）
 */
public class ConvertSortedArrayToBinarySearchTree {
    /**
     * https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/description/?envType=problem-list-v2&envId=array
     * 108. 将有序数组转换为二叉搜索树
     * 简单
     * 给你一个整数数组 nums ，其中元素已经按 **升序** 排列，请你将其转换为一棵 平衡 二叉搜索树。
     *
     * 示例 1：
     * 输入：nums = [-10,-3,0,5,9]
     * 输出：[0,-3,9,-10,null,5]
     * 解释：[0,-10,5,null,-3,null,9] 也将被视为正确答案：
     *
     * 示例 2：
     * 输入：nums = [1,3]
     * 输出：[3,1]
     * 解释：[1,null,3] 和 [3,1] 都是高度平衡二叉搜索树。
     *
     * 提示：
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums 按 严格递增 顺序排列
     *
     * 相关标签
     * 树 二叉搜索树 数组 分治 二叉树
     */

    /**
     * 思路：
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     *
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        /**
         * 输入：nums = [-10,-3,0,5,9]
         * 输入：nums = [-,-,0,-,-]
         * 输入：nums = [-,-3,0,-,-]
         * 输入：nums = [-10,-3,0,-,-]
         *
         *
         * 输出：[0,-3,9,-10,null,5]
         * 解释：[0,-10,5,null,-3,null,9] 也将被视为正确答案：
         */

        return null;
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
