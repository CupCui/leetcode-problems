package top.cupcupcui.leetcodeproblems.binarysearch;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.net.SocketTimeoutException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author cuiguanghao
 * @date 2026/1/19 17:12
 * @description 436. 寻找右区间
 */
public class FindRightInterval {
    /**
     * https://leetcode.cn/problems/find-right-interval/description/?envType=study-plan-v2&envId=binary-search
     * 436. 寻找右区间
     * 中等
     *
     * 给你一个区间数组 intervals ，其中 intervals[i] = [starti, endi] ，**且每个 starti 都 不同** 。
     * 区间 i 的 右侧区间 是满足 startj >= endi，且 startj 最小 的区间 j。注意 i 可能等于 j 。
     * 返回一个由每个区间 i 对应的 **右侧区间 下标**组成的数组。如果某个区间 i 不存在对应的 右侧区间 ，则下标 i 处的值设为 -1 。
     *
     * 示例 1：
     * 输入：intervals = [[1,2]]
     * 输出：[-1]
     * 解释：集合中只有一个区间，所以输出-1。
     * 示例 2：
     * 输入：intervals = [[3,4],[2,3],[1,2]]
     * 输出：[-1,0,1]
     * 解释：对于 [3,4] ，没有满足条件的“右侧”区间。
     * 对于 [2,3] ，区间[3,4]具有最小的“右”起点;
     * 对于 [1,2] ，区间[2,3]具有最小的“右”起点。
     * 示例 3：
     * 输入：intervals = [[1,4],[2,3],[3,4]]
     * 输出：[-1,2,-1]
     * 解释：对于区间 [1,4] 和 [3,4] ，没有满足条件的“右侧”区间。
     * 对于 [2,3] ，区间 [3,4] 有最小的“右”起点。
     *
     * 提示：
     * 1 <= intervals.length <= 2 * 104
     * intervals[i].length == 2
     * -106 <= starti <= endi <= 106
     * 每个间隔的起点都 不相同
     *
     * 相关标签
     * 数组 二分查找 排序
     */


    /**
     * 思路：二分法：遍历 intervals，对于每一个 intervals[i] 中的 endi，找到第一个大于等于 endi 的 startj
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param intervals
     * @return
     */
    public int[] findRightInterval(int[][] intervals) {
        /**
         * 给你一个区间数组 intervals ，其中 intervals[i] = [starti, endi] ，**且每个 starti 都 不同** 。
         * 区间 i 的 右侧区间 是满足 startj >= endi，且 startj 最小 的区间 j。注意 i 可能等于 j 。
         * 返回一个由每个区间 i 对应的 **右侧区间 下标**组成的数组。如果某个区间 i 不存在对应的 右侧区间 ，则下标 i 处的值设为 -1 。
         *
         * 输入：intervals = [[3,4],[2,3],[1,2]]
         * 输出：[-1,0,1]
         * 解释：对于 [3,4] ，没有满足条件的“右侧”区间。
         * 对于 [2,3] ，区间[3,4]具有最小的“右”起点;
         * 对于 [1,2] ，区间[2,3]具有最小的“右”起点。
         */

        // 遍历 intervals，对于每一个 intervals[i] 中的 endi，找到第一个大于等于 endi 的 startj
        // 构造一个 startj 组成的单调非递减的数组，
        // 构造一个 <startj，index> 组成的 map
        int[][] startToEndMap = new int[intervals.length][2];
        for (int i = 0; i < intervals.length; i++) {
            startToEndMap[i][0] = intervals[i][0];
            startToEndMap[i][1] = i;
        }
        Arrays.sort(startToEndMap, Comparator.comparingInt(a -> a[0]));

        int[] ansList = new int[intervals.length];
        for (int m = 0; m < intervals.length; m++) {
            int intervalsLength = intervals[m].length;
            int endi = intervals[m][intervalsLength - 1];
            int target = endi;
            int ansIndex = -1;

            // 在 startjarray 中二分法查找第一个大于等于 endi 的 startj
            int l = 0;
            int h = startToEndMap.length - 1;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (startToEndMap[mid][0] == target) {
                    ansIndex = startToEndMap[mid][1];
                    h = mid - 1;
                } else if (startToEndMap[mid][0] > target) {
                    ansIndex = startToEndMap[mid][1];
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            ansList[m] = ansIndex;
        }
        return ansList;
    }


    /**
     * 思路：二分法：遍历 intervals，对于每一个 intervals[i] 中的 endi，找到第一个大于等于 endi 的 startj
     * 时间复杂度：O(nlogn)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param intervals
     * @return
     */
    public int[] findRightIntervalV2(int[][] intervals) {
        /**
         * 给你一个区间数组 intervals ，其中 intervals[i] = [starti, endi] ，**且每个 starti 都 不同** 。
         * 区间 i 的 右侧区间 是满足 startj >= endi，且 startj 最小 的区间 j。注意 i 可能等于 j 。
         * 返回一个由每个区间 i 对应的 **右侧区间 下标**组成的数组。如果某个区间 i 不存在对应的 右侧区间 ，则下标 i 处的值设为 -1 。
         *
         * 输入：intervals = [[3,4],[2,3],[1,2]]
         * 输出：[-1,0,1]
         * 解释：对于 [3,4] ，没有满足条件的“右侧”区间。
         * 对于 [2,3] ，区间[3,4]具有最小的“右”起点;
         * 对于 [1,2] ，区间[2,3]具有最小的“右”起点。
         */

        // 遍历 intervals，对于每一个 intervals[i] 中的 endi，找到第一个大于等于 endi 的 startj
        // 构造一个 startj 组成的单调非递减的数组，
        List<Integer> startList = Arrays.stream(intervals).map(e -> e[0]).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        // 构造一个 <startj，index> 组成的 map
        Map<Integer, Integer> startIndexMap = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            startIndexMap.put(intervals[i][0], i);
        }

        List<Integer> ansList = new ArrayList<>();
        for (int m = 0; m < intervals.length; m++) {
            int intervalsLength = intervals[m].length;
            int endi = intervals[m][intervalsLength - 1];
            int target = endi;

            // 在 startjarray 中二分法查找第一个大于等于 endi 的 startj
            int l = 0;
            int h = startList.size() - 1;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (startList.get(mid) == target) {
                    h = mid - 1;
                } else if (startList.get(mid) > target) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            Integer firstStartjRealIndex = -1;
            int firstStartjIndex = h + 1;
            if (firstStartjIndex <= startList.size() - 1) {
                Integer firstStartjValue = startList.get(firstStartjIndex);
                // 在 startjMap 中找到 startj 所在位置的下标
                firstStartjRealIndex = startIndexMap.get(firstStartjValue);
            }
            ansList.add(firstStartjRealIndex);
        }
        return ansList.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 思路：暴力解法：遍历 intervals，对于每一个 intervals[i] 中的 endi，找到第一个大于等于 endi 的 startj
     * 时间复杂度：O(n2)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @param intervals
     * @return
     */
    public int[] findRightIntervalV1(int[][] intervals) {
        /**
         * 给你一个区间数组 intervals ，其中 intervals[i] = [starti, endi] ，**且每个 starti 都 不同** 。
         * 区间 i 的 右侧区间 是满足 startj >= endi，且 startj 最小 的区间 j。注意 i 可能等于 j 。
         * 返回一个由每个区间 i 对应的 **右侧区间 下标**组成的数组。如果某个区间 i 不存在对应的 右侧区间 ，则下标 i 处的值设为 -1 。
         *
         * 输入：intervals = [[3,4],[2,3],[1,2]]
         * 输出：[-1,0,1]
         * 解释：对于 [3,4] ，没有满足条件的“右侧”区间。
         * 对于 [2,3] ，区间[3,4]具有最小的“右”起点;
         * 对于 [1,2] ，区间[2,3]具有最小的“右”起点。
         */

        int arrayLength = intervals.length;
        int intervalsLength = intervals[0].length;
        List<Integer> ansList = new ArrayList<>();

        for (int[] interval : intervals) {
            int endi = interval[intervalsLength - 1];
            // 遍历 intervals，对于每一个 intervals[i] 中的 endi，找到第一个大于等于 endi 的 startj
            int ans = Integer.MAX_VALUE;
            int ansIndex = -1;
            for (int i = 0; i < arrayLength; i++) {
                int startj = intervals[i][0];
                if (startj >= endi) {
                    if (startj <= ans) {
                        ans = startj;
                        ansIndex = i;
                    }
                }
            }

            ansList.add(ansIndex);
        }
        return ansList.stream().mapToInt(Integer::intValue).toArray();
    }


}
