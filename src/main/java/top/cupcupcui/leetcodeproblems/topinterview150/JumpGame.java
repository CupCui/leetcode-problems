package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/7/10 11:32
 * @description 55. 跳跃游戏
 */
public class JumpGame {

    /**
     * 55. 跳跃游戏
     * <p>
     * 给你一个非负整数数组 nums ，你最初位于数组的 第一个下标 。数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * 判断你是否能够到达最后一个下标，如果可以，返回 true ；否则，返回 false 。
     * <p>
     * 示例 1：
     * 输入：nums = [2,3,1,1,4]
     * 输出：true
     * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
     * 示例 2：
     * 输入：nums = [3,2,1,0,4]
     * 输出：false
     * 解释：无论怎样，总会到达下标为 3 的位置。但该下标的最大跳跃长度是 0 ， 所以永远不可能到达最后一个下标。
     * <p>
     * 提示：
     * 1 <= nums.length <= 104
     * 0 <= nums[i] <= 105
     * <p>
     * <p>
     * 思路：
     * -[]
     * 时间复杂度：0(1)
     * 空间负责度：0(n)
     * 知识点：数组 / 字符串
     * 测试: 已测试
     * 结果: 通过
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @return
     */

    public boolean jumpGame(int[] nums) {
        /**
         * 贪心
         * 我们可以用贪心的方法解决这个问题。
         *
         * 设想一下，对于数组中的任意一个位置 y，我们如何判断它是否可以到达？根据题目的描述，只要存在一个位置 x，它本身可以到达，并且它跳跃的最大长度为 x+nums[x]，这个值大于等于 y，即 x+nums[x]≥y，那么位置 y 也可以到达。
         * 换句话说，对于每一个可以到达的位置 x，它使得 x+1,x+2,⋯,x+nums[x] 这些连续的位置都可以到达。
         * 这样一来，我们依次遍历数组中的每一个位置，并实时维护 最远可以到达的位置。对于当前遍历到的位置 x，如果它在 最远可以到达的位置 的范围内，那么我们就可以从起点通过若干次跳跃到达该位置，因此我们可以用 x+nums[x] 更新 最远可以到达的位置。
         * 在遍历的过程中，如果 最远可以到达的位置 大于等于数组中的最后一个位置，那就说明最后一个位置可达，我们就可以直接返回 True 作为答案。反之，如果在遍历结束后，最后一个位置仍然不可达，我们就返回 False 作为答案。
         * 以题目中的示例一
         * [2, 3, 1, 1, 4]
         * 为例：
         * 我们一开始在位置 0，可以跳跃的最大长度为 2，因此最远可以到达的位置被更新为 2；
         * 我们遍历到位置 1，由于 1≤2，因此位置 1 可达。我们用 1 加上它可以跳跃的最大长度 3，将最远可以到达的位置更新为 4。由于 4 大于等于最后一个位置 4，因此我们直接返回 True。
         * 我们再来看看题目中的示例二
         * [3, 2, 1, 0, 4]
         * 我们一开始在位置 0，可以跳跃的最大长度为 3，因此最远可以到达的位置被更新为 3；
         * 我们遍历到位置 1，由于 1≤3，因此位置 1 可达，加上它可以跳跃的最大长度 2 得到 3，没有超过最远可以到达的位置；
         * 位置 2、位置 3 同理，最远可以到达的位置不会被更新；
         * 我们遍历到位置 4，由于 4>3，因此位置 4 不可达，我们也就不考虑它可以跳跃的最大长度了。
         * 在遍历完成之后，位置 4 仍然不可达，因此我们返回 False。
         */

        if (nums[0] == 0) {
            if (nums.length == 1) {
                return true;
            } else {
                return false;
            }
        }

        // 最大可达位置
        int maxReachableIndex = nums[0];
        int lastIndex = nums.length - 1;
        int numsLength = nums.length;
        // 遍历每个元素
        for (int i = 0; i < numsLength; i++) {
            // 判断当前位置是否可达
            boolean isCurrReachable = maxReachableIndex >= i;
            if (!isCurrReachable) {
                return false;
            }

            // 获取当前最大可达距离，并更新 maxReachableIndex
            int currNum = nums[i];
            int currMaxIndex = currNum + i;
            if (currMaxIndex > maxReachableIndex) {
                maxReachableIndex = currMaxIndex;
            }

            // 判断是否可达最后一位
            if (maxReachableIndex >= lastIndex) {
                return true;
            }
        }

        return false;
    }


}
