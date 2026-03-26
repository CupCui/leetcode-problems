# 面试准备 - LRU 缓存算法题

## 题目描述

实现一个 LRU 缓存数据结构，实现 get 和 set 操作。

LRU (Least Recently Used) 缓存是一种缓存淘汰策略。当缓存空间不足时，会淘汰最近最少使用的数据。

### 示例说明

```
LRUCache cache = new LRUCache(2); // 缓存容量为 2

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // 返回 1
cache.put(3, 3);    // 该操作会使得键 2 作废
cache.get(2);       // 返回 -1 (未找到)
cache.put(4, 4);    // 该操作会使得键 1 作废
cache.get(1);       // 返回 -1 (未找到)
cache.get(3);       // 返回 3
cache.get(4);       // 返回 4
```

## 解题思路

### 核心要点

LRU 缓存需要同时满足以下条件：
1. **快速查找**：通过 key 快速获取值
2. **快速删除/插入**：快速删除最久未使用的元素，插入新元素
3. **有序性**：记录访问顺序，知道哪个是最久未使用的

### 数据结构选择

- **哈希表 (HashMap)**：提供 O(1) 的查找性能
- **双向链表**：提供 O(1) 的插入和删除性能，同时保持元素的访问顺序

### 算法流程

#### Get 操作
1. 如果 key 不存在，返回 -1
2. 如果 key 存在：
   - 从链表原位置删除该节点
   - 将节点插入到链表头部（表示最近使用）
   - 返回对应的 value

#### Put 操作
1. 如果 key 已存在：
   - 更新 value
   - 将节点移动到链表头部
2. 如果 key 不存在：
   - 创建新节点并插入到链表头部
   - 将 key 和节点存入哈希表
   - 如果容量超出限制：
     - 删除链表尾部的节点（最久未使用）
     - 从哈希表中删除对应的 key

## Java 实现

```java
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    // 双向链表节点类
    private static class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map; // 哈希表，key -> Node
    private final Node head, tail; // 虚拟头尾节点

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>(capacity);

        // 初始化虚拟头尾节点
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1; // key 不存在
        }

        // 移动到链表头部（表示最近使用）
        removeNode(node);
        addToHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);

        if (node != null) {
            // key 已存在，更新 value 并移动到头部
            node.value = value;
            removeNode(node);
            addToHead(node);
        } else {
            // key 不存在，创建新节点
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);

            // 如果超过容量，删除尾部节点
            if (map.size() > capacity) {
                Node tailNode = tail.prev; // 获取尾部节点（最久未使用）
                removeNode(tailNode);
                map.remove(tailNode.key);
            }
        }
    }

    // 从链表中删除节点
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // 将节点添加到链表头部
    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    // 测试方法
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // 输出 1
        cache.put(3, 3); // 该操作会使得键 2 作废
        System.out.println(cache.get(2)); // 输出 -1
        cache.put(4, 4); // 该操作会使得键 1 作废
        System.out.println(cache.get(1)); // 输出 -1
        System.out.println(cache.get(3)); // 输出 3
        System.out.println(cache.get(4)); // 输出 4
    }
}
```

## 复杂度分析

### 时间复杂度
- **get 操作**: O(1)
  - 哈希表查找: O(1)
  - 链表删除和插入: O(1)

- **put 操作**: O(1)
  - 哈希表查找: O(1)
  - 链表删除和插入: O(1)

### 空间复杂度
- O(capacity)
  - 哈希表存储所有键值对
  - 双向链表存储所有节点

## 关键点解析

### 1. 双向链表的作用
- **维护访问顺序**：链表从头到尾的顺序表示从最近使用到最久未使用
- **快速移动节点**：O(1) 时间内删除和重新插入节点

### 2. 虚拟头尾节点
- **简化边界判断**：不需要单独处理链表为空或只有一个节点的情况
- **统一操作逻辑**：所有节点的处理逻辑保持一致

### 3. 哈希表的作用
- **快速定位**：O(1) 时间内找到 key 对应的节点
- **避免遍历**：无需遍历链表查找节点

## 面试回答技巧

### 回答框架

1. **理解问题**（确保理解正确）
   - "LRU 策略是指当缓存满时，淘汰最久未使用的数据"
   - "需要实现 get 和 put，时间复杂度都要是 O(1)"

2. **提出方案**（说说你的思考过程）
   - "需要两种数据结构的结合：哈希表 + 双向链表"
   - "哈希表提供 O(1) 的查询，双向链表维护访问顺序"

3. **详细说明**（画图辅助说明）
   - 画出哈希表和双向链表的结构
   - 说明 get 和 put 的具体操作流程

4. **复杂度分析**（展示对性能的理解）
   - "时间复杂度 O(1)，空间复杂度 O(capacity)"

### 常见误区

1. **只使用哈希表**：无法维护访问顺序
2. **只使用链表**：查找需要 O(n) 时间
3. **使用单向链表**：删除节点需要 O(n) 时间找到前驱节点
4. **忘记更新访问顺序**：get 操作后也要将节点移到头部

### 优化点

如果遇到需要线程安全的场景，可以考虑：
- 使用 `ConcurrentHashMap`
- 对操作加锁
- 考虑使用读写锁提高并发性能

## 面试回答示例

"对于 LRU 缓存这个问题，我的思路是使用哈希表加双向链表的结合：

首先，哈希表可以提供 O(1) 的查找效率，让我们快速找到对应的值。但是哈希表本身无法记录访问顺序。

所以我还需要一个双向链表来维护数据的访问顺序。链表从头到尾的顺序表示从最近使用到最久未使用。每次访问一个数据时，就把它移动到链表头部；当缓存满了需要淘汰数据时，就删除链表尾部的节点。

对于 get 操作，我先在哈希表中查找，如果不存在返回 -1；如果存在，就把对应的节点从链表原位置删除并插入到头部，然后返回值。

对于 put 操作，如果 key 已存在，就更新值并移动到头部；如果 key 不存在，就创建新节点插入头部，如果容量超出就删除尾部节点。

这样两个操作的时间复杂度都是 O(1)，空间复杂度是 O(capacity)。"

## 举一反三

LRU 缓存的思想可以扩展到：
- LFU (Least Frequently Used) 缓存：淘汰使用频率最低的
- 带过期时间的缓存：每个节点增加过期时间字段
- 检查链表成环等变种问题

## 参考

- LeetCode 146: https://leetcode.com/problems/lru-cache/
- 其他面试题：参见本项目中的其他面试准备文档
