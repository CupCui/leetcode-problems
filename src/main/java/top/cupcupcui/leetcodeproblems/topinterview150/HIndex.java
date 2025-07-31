package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.*;

/**
 * @author cuiguanghao
 * @date 2025/7/30 16:27
 * @description 274. H 指数
 */
public class HIndex {

    /**
     * 274. H 指数
     * 中等
     * 提示
     * 给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。
     * 根据维基百科上 h 指数的定义：h 代表“高引用次数” ，一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，并且 至少 有 h 篇论文被引用次数大于等于 h 。如果 h 有多种可能的值，h 指数 是其中最大的那个。
     * <p>
     * 示例 1：
     * <p>
     * 输入：citations = [3,0,6,1,5]
     * 输出：3
     * 解释：给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 3, 0, 6, 1, 5 次。
     * 由于研究者有 3 篇论文每篇 至少 被引用了 3 次，其余两篇论文每篇被引用 不多于 3 次，所以她的 h 指数是 3。
     * 示例 2：
     * <p>
     * 输入：citations = [1,3,1]
     * 输出：1
     * <p>
     * 提示：
     * <p>
     * n == citations.length
     * 1 <= n <= 5000
     * 0 <= citations[i] <= 1000
     * <p>
     * 思路：
     * -[] 遍历每一个，求每一位的 h 值
     * 时间复杂度：0(n2)
     * 空间负责度：0(n)
     * 知识点：数组 / 字符串
     * 测试: 自测通过
     * 结果: 通过
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     */
    public int hIndex(int[] citations) {

        /**
         * 思路：遍历每一个，求每一位的 h 值
         * 输入：citations = [3,0,6,1,5]
         * 输出：3
         *
         * h 指数:
         * 至少发表了 h 篇论文，(length >= h)
         * 并且 至少 有 h 篇论文被引用次数大于等于 h 。
         * 如果 h 有多种可能的值，h 指数 是其中最大的那个。
         */

        // 特殊情况判断
        if (citations.length == 0) {
            return 0;
        }
        if (citations.length == 1) {
            if (citations[0] == 0) {
                return 0;
            }
            if (citations[0] >= 1) {
                return 1;
            }
        }

        /**
         * 输入：citations = [11,15]
         * 输出：1
         */

        // <h 指数, h 指数值>集合
        Map<Integer, Integer> hIndex2ValueMap = new HashMap<>();
        for (int i = 0; i < citations.length; i++) {
            // h 指数值 初始为最大预测值
            hIndex2ValueMap.put(citations[i], citations[i]);
        }

        // 遍历每个 h 指数
        for (Integer currH : hIndex2ValueMap.keySet()) {
            // 每个 h 指数被引用的总次数
            int currHIndexValue = 0;
            // 遍历 citations
            for (int j = 0; j < citations.length; j++) {
                // 求当前的 h 值
                if (citations[j] >= currH) {
                    currHIndexValue++;
                }
            }
            // 更新 h 指数值
            int minHIndex = Math.min(hIndex2ValueMap.get(currH), currHIndexValue);
            hIndex2ValueMap.put(currH, minHIndex);
        }

        int maxHIndex = 0;
        for (Map.Entry<Integer, Integer> entry : hIndex2ValueMap.entrySet()) {
            maxHIndex = Math.max(maxHIndex, entry.getValue());
        }

        return maxHIndex;
    }


}
