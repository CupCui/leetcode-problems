package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

import java.util.Stack;

/**
 * @author garre
 */
public class StackImplementQueue {

    /**
     * 描述
     * 用两个栈来实现一个队列，使用n个元素来完成 n 次在队列尾部插入整数(push)和n次在队列头部删除整数(pop)的功能。
     * 队列中的元素为int类型。保证操作合法，即保证pop操作时队列内已有元素。
     * 数据范围： 𝑛≤1000n≤1000要求：存储n个元素的空间复杂度为 𝑂(𝑛) ，插入与删除的时间复杂度都是 𝑂(1)
     * 输入：["PSH1","PSH2","POP","POP"]
     * 返回值：1,2
     */
    @Test
    public void stackImplementQueueTest() {

        push(1);
        //push(2);

        System.out.println(pop());
        System.out.println(pop());

    }


    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                Integer popVal = stack1.pop();
                stack2.push(popVal);
            }
        }
        return stack2.pop();
    }
}
