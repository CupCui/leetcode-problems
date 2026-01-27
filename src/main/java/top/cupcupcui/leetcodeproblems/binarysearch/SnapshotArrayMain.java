package top.cupcupcui.leetcodeproblems.binarysearch;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author cuiguanghao
 * @date 2026/1/23 10:21
 * @description 1146. 快照数组
 */
public class SnapshotArrayMain {
    /**
     * https://leetcode.cn/problems/snapshot-array/description/?envType=study-plan-v2&envId=binary-search
     * 1146. 快照数组
     * 中等
     * 实现支持下列接口的「快照数组」- SnapshotArray：
     *
     * SnapshotArray(int length) - 初始化一个与指定长度相等的 类数组 的数据结构。初始时，每个元素都等于 0。
     * void set(index, val) - 会将指定索引 index 处的元素设置为 val。
     * int snap() - 获取该数组的快照，并返回快照的编号 snap_id（快照号是调用 snap() 的总次数减去 1）。
     * int get(index, snap_id) - 根据指定的 snap_id 选择快照，并返回该快照指定索引 index 的值。
     *
     * 示例：
     * 输入：["SnapshotArray","set","snap","set","get"]
     *      [[3],[0,5],[],[0,6],[0,0]]
     * 输出：[null,null,0,null,5]
     * 解释：
     * SnapshotArray snapshotArr = new SnapshotArray(3); // 初始化一个长度为 3 的快照数组
     * snapshotArr.set(0,5);  // 令 array[0] = 5
     * snapshotArr.snap();  // 获取快照，返回 snap_id = 0
     * snapshotArr.set(0,6);
     * snapshotArr.get(0,0);  // 获取 snap_id = 0 的快照中 array[0] 的值，返回 5
     *
     * 提示：
     * 1 <= length <= 50000
     * 题目最多进行50000 次set，snap，和 get的调用 。
     * 0 <= index < length
     * 0 <= snap_id < 我们调用 snap() 的总次数
     * 0 <= val <= 10^9
     *
     * 设计 数组 哈希表 二分查找
     */

}

/**
 * 思路：Map<index, Map<snapId, snap_value>>
 * 因为 snapId 是单调递增的，所以可以使用二分法查询小于等于 target_snapId 的最大的 snapId
 * 时间复杂度：O()
 * 空间复杂度：O()
 * 结果: 解答错误
 * 优化建议：
 */
class SnapshotArray {

    // Map<index, Map<snapId, snap_value>>
    // Map<索引, Map<快照编号, 值>> 一个索引处，有多个快照值
    private final Map<Integer, Map<Integer, Integer>> snapIdToArrayMap = new HashMap<>();
    // 快照编号
    private int snapId = 0;

    public SnapshotArray(int length) {
        for (int i = 0; i < length; i++) {
            // 初始化
            snapIdToArrayMap.put(i, null);
        }
    }

    public void set(int index, int val) {
        // 索引处的快照值集合
        Map<Integer, Integer> snapIdToValueMap = snapIdToArrayMap.get(index);
        if (snapIdToValueMap == null) {
            snapIdToValueMap = new HashMap<>();
        }
        // 添加/更新快照值
        snapIdToValueMap.put(snapId, val);
        snapIdToArrayMap.put(index, snapIdToValueMap);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        // Map<索引, Map<快照编号, 值>> 一个索引处，有多个快照值

        // 索引处的快照值集合
        Map<Integer, Integer> snapIdToValueMap = snapIdToArrayMap.get(index);
        if (snapIdToValueMap == null) {
            return 0;
        }
        Set<Integer> snapIdSet = snapIdToValueMap.keySet();
        Integer[] snapIdArray = snapIdSet.toArray(new Integer[]{});

        /**
         * 思路：Map<index, Map<snapId, snap_value>>
         * 因为 snapId 是单调递增的，所以可以使用二分法查询小于等于 target_snapId 的最大的 snapId
         */
        int l = 0;
        int h = snapIdArray.length - 1;
        int target = snap_id;
        int ans = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (snapIdArray[mid] == target) {
                ans = snapIdArray[mid];
                break;
            } else if (snapIdArray[mid] < target) {
                ans = snapIdArray[mid];
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        if (ans == -1) {
            return 0;
        } else {
            return snapIdToValueMap.get(ans);
        }
    }
}

/**
 * 思路：Map<snapId, List<snap_value>>
 * 时间复杂度：O(n)
 * 空间复杂度：O(m*n)
 * 结果: 超出内存限制
 * 优化建议：
 */
class SnapshotArrayV1 {

    private final Map<Integer, List<Integer>> snapIdToArrayMap = new HashMap<>();

    private final List<Integer> snapshotArray = new ArrayList<>();

    private int snapId = -1;

    public SnapshotArrayV1(int length) {
        for (int i = 0; i < length; i++) {
            snapshotArray.add(0);
        }
    }

    public void set(int index, int val) {
        snapshotArray.set(index, val);
    }

    public int snap() {
        snapId = snapId + 1;
        snapIdToArrayMap.put(snapId, new ArrayList<>(snapshotArray));
        return snapId;
    }

    public int get(int index, int snap_id) {
        return snapIdToArrayMap.get(snap_id).get(index);
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */


