package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/8/6 9:36
 * @description 134. 加油站
 */
public class GasStation {

    /**
     * https://leetcode.cn/problems/gas-station/?envType=study-plan-v2&envId=top-interview-150
     * gas-station
     * GasStation
     * 134. 加油站
     * 中等
     * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
     * <p>
     * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
     * <p>
     * 给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。如果存在解，则 保证 它是 唯一 的。
     * <p>
     * <p>
     * 示例 1:
     * 输入: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
     * 输出: 3
     * 解释:
     * 从 3 号加油站(索引为 3 处)出发，可获得 4 升汽油。此时油箱有 = 0 + 4 = 4 升汽油
     * 开往 4 号加油站，此时油箱有 4 - 1 + 5 = 8 升汽油
     * 开往 0 号加油站，此时油箱有 8 - 2 + 1 = 7 升汽油
     * 开往 1 号加油站，此时油箱有 7 - 3 + 2 = 6 升汽油
     * 开往 2 号加油站，此时油箱有 6 - 4 + 3 = 5 升汽油
     * 开往 3 号加油站，你需要消耗 5 升汽油，正好足够你返回到 3 号加油站。
     * 因此，3 可为起始索引。
     * 示例 2:
     * <p>
     * 输入: gas = [2,3,4], cost = [3,4,3]
     * 输出: -1
     * 解释:
     * 你不能从 0 号或 1 号加油站出发，因为没有足够的汽油可以让你行驶到下一个加油站。
     * 我们从 2 号加油站出发，可以获得 4 升汽油。 此时油箱有 = 0 + 4 = 4 升汽油
     * 开往 0 号加油站，此时油箱有 4 - 3 + 2 = 3 升汽油
     * 开往 1 号加油站，此时油箱有 3 - 3 + 3 = 3 升汽油
     * 你无法返回 2 号加油站，因为返程需要消耗 4 升汽油，但是你的油箱只有 3 升汽油。
     * 因此，无论怎样，你都不可能绕环路行驶一周。
     * <p>
     * <p>
     * 提示:
     * <p>
     * n == gas.length == cost.length
     * 1 <= n <= 105
     * 0 <= gas[i], cost[i] <= 104
     * 输入保证答案唯一。
     */


    /**
     * 思路：
     * -[]
     * 时间复杂度：0()
     * 空间负责度：0()
     * 知识点：数组 / 字符串
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {

        /**
         * 输入: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
         * 输出: 3
         * 解释: 从 3 号加油站(索引为 3 处)出发，可获得 4 升汽油。此时油箱有 = 0 + 4 = 4 升汽油
         */
        /**
         * gas =  [1,2,3,4,5]
         * cost = [3,4,5,1,2]
         * cost = [-2,-2,-2,3,3]
         */

        // 每个 station 剩余 gas
        int[] remainingGasPerStation = new int[gas.length];
        // 遍历每个 gas
        for (int i = 0; i < gas.length; i++) {
            // 遍历 gas 次，每个 gas[i] 处都加油，获取 remainingGas[i]
            remainingGasPerStation[i] = gas[i] - cost[i];
        }

        int remainingGas = 0;
        // 遍历每个 gas
        for (int i = 0; i < gas.length; i++) {
            int currIndex = i;
            // 从当前位置向后遍历
            for (; i <= currIndex && currIndex < gas.length; currIndex++) {
                remainingGas = remainingGas + remainingGasPerStation[currIndex];
                if (remainingGas < 0) {
                    break;
                }
            }
            if (currIndex == gas.length - 1) {
                currIndex = 0;
            } else {
                continue;
            }
            // 从0位置向后遍历
            for (; 0 <= currIndex && currIndex < i; currIndex++) {
                remainingGas = remainingGas + remainingGasPerStation[currIndex];
                if (remainingGas < 0) {
                    break;
                }
            }

            if (remainingGas >= 0) {
                return remainingGas;
            }
        }

        return -1;
    }

}
