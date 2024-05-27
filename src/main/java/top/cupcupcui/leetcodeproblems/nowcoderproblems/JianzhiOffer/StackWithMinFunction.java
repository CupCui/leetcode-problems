package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author garre
 */
public class StackWithMinFunction {

    /**
     * 描述
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的 min 函数，输入操作时保证 pop、top 和 min 函数操作时，栈中一定有元素。
     * 此栈包含的方法有：push(value):将value压入栈中pop():弹出栈顶元素top():获取栈顶元素min():获取栈中最小元素
     * 数据范围：操作数量满足 0≤𝑛≤300 0≤n≤300  ，输入的元素满足 ∣𝑣𝑎𝑙∣≤10000 ∣val∣≤10000
     * 进阶：栈的各个操作的时间复杂度是 𝑂(1) O(1)  ，空间复杂度是 𝑂(𝑛) O(n)
     * 示例:输入:    ["PSH-1","PSH2","MIN","TOP","POP","PSH1","TOP","MIN"]
     * 输出:    -1,2,1,-1
     * 解析:"PSH-1"表示将-1压入栈中，栈中元素为-1"PSH2"表示将2压入栈中，
     * 栈中元素为2，-1“MIN”表示获取此时栈中最小元素==>返回-1"TOP"表示获取栈顶元素==>返回2"POP"表示弹出栈顶元素，
     * 弹出2，栈中元素为-1"PSH1"表示将1压入栈中，栈中元素为1，-1"TOP"表示获取栈顶元素==>返回1“MIN”表示获取此时栈中最小元素==>返回-1
     */
    @Test
    public void stackWithMinFunctionTest() {

        Queue<Integer> queue = new LinkedList<>();
        Integer poll = queue.poll();


        push(-1);
        push(2);
        System.out.println(min());
        System.out.println(top());
        push(1);
        System.out.println(top());
        System.out.println(min());
    }

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
        if (stack2.isEmpty()) {
            stack2.push(node);
        } else if (stack2.peek() > node) {
            stack2.push(node);
        } else {
            // stack2.peek() < node
            stack2.push(stack2.peek());
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }


}
