package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

import java.util.Stack;

/**
 * @author garre
 */
public class Jz31IsPopOrder {


    /**
     * 描述
     * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
     * 1. 0<=pushV.length == popV.length <=1000
     * 2. -1000<=pushV[i]<=1000
     * 3. pushV 的所有数字均不相同
     * 输入： [1,2,3,4,5],[4,5,3,2,1]
     * 返回值：true
     * 说明：
     * 可以通过push(1)=>push(2)=>push(3)=>push(4)=>pop()=>push(5)=>pop()=>pop()=>pop()=>pop()
     * 这样的顺序得到[4,5,3,2,1]这个序列，返回true
     * <p>
     * 输入：[1,2,3,4,5],[4,3,5,1,2]
     * 返回值：false
     * 说明：
     * 由于是[1,2,3,4,5]的压入顺序，[4,3,5,1,2]的弹出顺序，要求4，3，5必须在1，2前压入，
     * 且1，2不能弹出，但是这样压入的顺序，1又不能在2之前弹出，所以无法形成的，返回false
     * <p>
     * 输入：[1,2,3,4,5],[2,3,4,5,1]
     * 返回值：true
     * 输入：[1,2,3,4,5],[3,4,5,2,1]
     * 返回值：true
     * 输入：[1,2,3,4,5],[3,5,4,2,1]
     * 返回值：true
     * 输入：[1,2,3,4,5],[1,3,5,2,4]
     * 返回值：false
     * 输入：[1,2,3,4,5],[1,5,4,2,3]
     * 返回值：false
     */
    @Test
    public void isPopOrderTest() {
        //int[] pushV = new int[0];
        //int[] pushV = {1, 2, 3, 4, 5};
        //int[] popV = {4, 5, 3, 2, 1};
        int[] pushV = {1, 2, 3, 4, 5};
        int[] popV = {4, 3, 5, 1, 2};
        boolean popOrder = isPopOrder(pushV, popV);
        System.out.println(popOrder);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param pushV int整型一维数组
     * @param popV  int整型一维数组
     * @return bool布尔型
     */
    public boolean isPopOrder(int[] pushV, int[] popV) {
        // write code here
        int[] pushArray = pushV;
        int[] popArray = popV;
        int popArrayLength = 0;
        int popIndex = popArrayLength;

        Stack<Integer> stack1 = new Stack<>();

        /**
         * 输入：[1,2,3,4,5],[3,5,4,2,1]
         * 返回值：true
         */

        for (int pushVal : pushArray) {
            // 先入栈
            stack1.push(pushVal);
            while (!stack1.empty()) {
                // 比较 stack 中 top 元素 和 popArray top 元素
                Integer topStack = stack1.peek();
                if (topStack == popArray[popIndex]) {
                    // 如果匹配，则出栈
                    stack1.pop();
                    popIndex++;
                } else {
                    // 如果不匹配，则退出循环
                    break;
                }
            }
        }
        return stack1.empty();
    }


}
