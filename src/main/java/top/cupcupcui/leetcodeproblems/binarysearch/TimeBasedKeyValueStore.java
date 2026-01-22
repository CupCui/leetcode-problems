package top.cupcupcui.leetcodeproblems.binarysearch;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author cuiguanghao
 * @date 2026/1/22 10:03
 * @description 981. 基于时间的键值存储
 */
public class TimeBasedKeyValueStore {
    /**
     * https://leetcode.cn/problems/time-based-key-value-store/?envType=study-plan-v2&envId=binary-search
     * 981. 基于时间的键值存储
     * 中等
     * 设计一个基于时间的键值数据结构，该结构可以在**不同时间戳**存储对应**同一个键**的**多个值**，并针对特定时间戳检索键对应的值。
     *
     * 实现 TimeMap 类：
     * TimeMap() 初始化数据结构对象
     * void set(String key, String value, int timestamp) 存储给定时间戳 timestamp 时的键 key 和值 value。
     * String get(String key, int timestamp) 返回一个值，该值在之前调用了 set，其中 timestamp_prev <= timestamp 。
     * 如果有多个这样的值，它将返回与**最大  timestamp_prev 关联的值**。如果没有值，则返回空字符串（""）。
     *
     * 示例 1：
     * 输入：
     * ["TimeMap", "set", "get", "get", "set", "get", "get"]
     * [[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
     * 输出：
     * [null, null, "bar", "bar", null, "bar2", "bar2"]
     *
     * 解释：
     * TimeMap timeMap = new TimeMap();
     * timeMap.set("foo", "bar", 1);  // 存储键 "foo" 和值 "bar" ，时间戳 timestamp = 1
     * timeMap.get("foo", 1);         // 返回 "bar"
     * timeMap.get("foo", 3);         // 返回 "bar", 因为在时间戳 3 和时间戳 2 处没有对应 "foo" 的值，所以唯一的值位于时间戳 1 处（即 "bar"） 。
     * timeMap.set("foo", "bar2", 4); // 存储键 "foo" 和值 "bar2" ，时间戳 timestamp = 4
     * timeMap.get("foo", 4);         // 返回 "bar2"
     * timeMap.get("foo", 5);         // 返回 "bar2"
     *
     * 提示：
     * 1 <= key.length, value.length <= 100
     * key 和 value 由小写英文字母和数字组成
     * 1 <= timestamp <= 107
     * set 操作中的时间戳 timestamp 都是严格递增的
     * 最多调用 set 和 get 操作 2 * 105 次
     *
     * 相关标签
     * 设计 哈希表 字符串 二分查找
     */


}

/**
 * 思路：
 * 存储：Map<key, Map<timestamp, value>>
 * 查询：根据 key 查询 Map<timestamp, value>
 * 查询第一个小于等于 timestamp 的 value，
 * 时间复杂度：O()
 * 空间复杂度：O()
 * 结果: 超出时间限制
 * 优化建议：
 * 每次get操作都进行排序 - 这是性能瓶颈
 * 由于提示中说明set操作中的时间戳都是严格递增的，所以不需要每次都排序
 */
class TimeMap {

    // Map<key, Map<timestamp, value>>
    private Map<String, Map<Integer, String>> keyToTimeMap = new HashMap<>();

    public TimeMap() {

    }

    /**
     * 解释：
     * timeMap.set("foo", "bar", 1);  // 存储键 "foo" 和值 "bar" ，时间戳 timestamp = 1
     *
     * @param key
     * @param value
     * @param timestamp
     */
    public void set(String key, String value, int timestamp) {
        // Map<timestamp, value>
        Map<Integer, String> timestampToValueMap = keyToTimeMap.get(key);
        if (timestampToValueMap == null) {
            timestampToValueMap = new HashMap<>();
        }
        timestampToValueMap.put(timestamp, value);
        keyToTimeMap.put(key, timestampToValueMap);
    }

    /**
     * timeMap.get("foo", 1);         // 返回 "bar"
     *
     * @param key
     * @param timestamp
     * @return
     */
    public String get(String key, int timestamp) {
        if (!keyToTimeMap.containsKey(key)) {
            return "";
        }
        // Map<timestamp, value>
        Map<Integer, String> timestampToValueMap = keyToTimeMap.get(key);
        Set<Integer> keySet = timestampToValueMap.keySet();
        List<Integer> timestampList = keySet.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        // timestamp array
        Integer[] timestamps = timestampList.toArray(new Integer[]{});

        int target = timestamp;
        int l = 0;
        int h = timestamps.length - 1;
        int ans = -1;
        // 查询第一个小于等于 timestamp 的 value
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (timestamps[mid] == target) {
                l = mid + 1;
                ans = timestamps[mid];
            } else if (timestamps[mid] < target) {
                l = mid + 1;
                ans = timestamps[mid];
            } else {
                h = mid - 1;
            }
        }

        return timestampToValueMap.getOrDefault(ans, "");
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */