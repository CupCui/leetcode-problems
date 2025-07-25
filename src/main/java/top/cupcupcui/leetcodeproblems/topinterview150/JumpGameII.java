package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/7/23 18:02
 * @description 45. 跳跃游戏 II
 */
public class JumpGameII {

    /**
     * 45. 跳跃游戏 II
     * 给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。
     * 每个元素 nums[i] 表示从索引 i 向后跳转的最大长度。换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处:
     * 0 <= j <= nums[i]
     * i + j < n
     * 返回到达 nums[n - 1] 的最小跳跃次数。生成的测试用例可以到达 nums[n - 1]。
     * <p>
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [2,3,1,1,4]
     * 输出: 2
     * 解释: 跳到最后一个位置的最小跳跃数是 2。
     * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
     * 示例 2:
     * <p>
     * 输入: nums = [2,3,0,1,4]
     * 输出: 2
     * <p>
     * <p>
     * 提示:
     * <p>
     * 1 <= nums.length <= 104
     * 0 <= nums[i] <= 1000
     * 题目保证可以到达 nums[n-1]
     *
     * <p>
     * <p>
     * 思路：
     * -[] 维护一个最大可到达数组，倒叙遍历
     * 时间复杂度：0()
     * 空间负责度：0()
     * 知识点：数组 / 字符串
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @return
     */
    public int jumpGameII(int[] nums) {
        /*
         * 贪心1：反向查找
         * 贪心2：正向查找
         *方法一：反向查找出发位置
         * 我们的目标是到达数组的最后一个位置，因此我们可以考虑最后一步跳跃前所在的位置，该位置通过跳跃能够到达最后一个位置。
         * 如果有多个位置通过跳跃都能够到达最后一个位置，那么我们应该如何进行选择呢？
         * 直观上来看，我们可以「贪心」地选择距离最后一个位置最远的那个位置，也就是对应下标最小的那个位置。因此，我们可以从左到右遍历数组，选择第一个满足要求的位置。
         * 找到最后一步跳跃前所在的位置之后，我们继续贪心地寻找倒数第二步跳跃前所在的位置，以此类推，直到找到数组的开始位置。
         *  */

        int steps = 0;

        int[] maxReachableIndex = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            maxReachableIndex[i] = i + nums[i];
        }

        // 4
        int neededReachIndex = nums.length - 1;
        for (int i = maxReachableIndex.length - 1; i > 0; i--) {
            // 上一步到达不了
            boolean preCannotReach = maxReachableIndex[i - 1] < neededReachIndex;
            // 这一步到达了
            boolean currCanReach = maxReachableIndex[i] >= neededReachIndex;
            if (preCannotReach && currCanReach) {
                // 到达不了，需要一步
                neededReachIndex = i;
                steps++;
            }

            boolean currCannotReach = maxReachableIndex[i] < neededReachIndex;
            if (currCannotReach) {
                // 到达不了，需要一步
                neededReachIndex = i;
                steps++;
            }
        }

        // 第一步
        steps++;
        return steps;
    }

    /**
     * <p>
     * 思路：
     * -[] 维护一个最大可到达数组，倒叙遍历
     * 时间复杂度：0()
     * 空间负责度：0()
     * 知识点：数组 / 字符串
     * 测试: 不通过
     * 结果: 思路不对，已放弃
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param nums
     * @return
     */
    public int jumpGameII1(int[] nums) {
        /*
         * 贪心1：反向查找
         * 贪心2：正向查找
         *
         *  */

        /**
         * 输入: nums = [2,3,1,1,4]
         * 输入: maxReachableIndex = [2,4,3,4,8]
         * 输入: nums = [2,3,1,1,4]
         * 第一步: nums = [-,3,1,1,4]
         * 第一步: nums = [2,3,-,-,-]
         *
         */

        int steps = 0;

        int[] maxReachableIndex = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            maxReachableIndex[i] = i + nums[i];
        }

        // 4
        int neededReachIndex = nums.length - 1;
        for (int i = maxReachableIndex.length - 1; i > 0; i--) {
            // 上一步到达不了
            boolean preCannotReach = maxReachableIndex[i - 1] < neededReachIndex;
            // 这一步到达了
            boolean currCanReach = maxReachableIndex[i] >= neededReachIndex;
            if (preCannotReach && currCanReach) {
                // 到达不了，需要一步
                neededReachIndex = i;
                steps++;
            }

            boolean currCannotReach = maxReachableIndex[i] < neededReachIndex;
            if (currCannotReach) {
                // 到达不了，需要一步
                neededReachIndex = i;
                steps++;
            }
        }

        // 第一步
        steps++;
        return steps;
    }


}
