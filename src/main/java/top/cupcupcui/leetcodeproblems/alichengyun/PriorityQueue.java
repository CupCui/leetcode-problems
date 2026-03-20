package top.cupcupcui.leetcodeproblems.alichengyun;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * PriorityQueue 偏难，已放弃
 *
 * @author cuiguanghao
 * @date 2026/3/20 11:03
 */
public class PriorityQueue {
    /**
     * 1、根据队列中的元素的**优先级**实现**插队**，优先级高的**先出队列**
     *
     * ，如果优先级相同，入队时间早的先出队，
     *
     * 有一个超时时间，
     *
     * 如果队列中存在某个元素到达超时时间还未出队，则该队列转变成为普通先入先出队列，
     * 直到队列中不存在任何元素后，队列再次变为优先队列；
     */

    /**
     * 思路：栈，先进先出 FIFO
     * 时间复杂度：O(n²)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     */
    public void priorityQueue(String[] args) {
        // 提示：Queue_Capacity <= 10
        Queue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
        blockingQueue.offer(1);
        blockingQueue.offer(2);
        blockingQueue.offer(3);
        blockingQueue.offer(4);
        // 1. 根据队列中的元素的**优先级**实现**插队**，优先级高的**先出队列**，如果优先级相同，入队时间早的先出队，
        // T ODO：改造为 LinkedBlockingQueue
        // 遍历 queue，找到第一个不小于 priority 的位置，插入元素

        // 2.如果队列中存在某个元素到达超时时间还未出队，
        // 遍历 queue，找到第一个不小于 ttl 的位置，插入元素

        // blockingQueue.

    }

    /**
     * 提示：0 =< priority < 100
     */
    public class QueueNode {

        // 优先级
        private int priority;
        // 值
        private int value;
        // 超时时间
        private int ttl;

        public QueueNode() {
        }

    }

}
