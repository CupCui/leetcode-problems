package top.cupcupcui.leetcodeproblems.alichengyun;

import java.util.*;

/**
 * Arithmetic problems of addition and subtraction
 *
 * @author cuiguanghao
 * @date 2026/3/20 14:33
 */
public class ArithmeticProblems {
    /**
     * 2、生成100道加减法算术题，
     * 正例：
     * 1+2
     * 99+1
     * 2-1
     * 100-99
     *
     * 反例：
     * 100+1
     * 1+0
     * 101-1
     * 1-1
     *
     * 加法题和不超过100，加数不能为0，
     * 减法题被减数不超过100，结果大于0，
     * 随机生成加减法题，**不能重复**，题目和题目**带结果**的答案分别写入两个文件；
     * 难度：简单
     */

    /**
     * 思路：随机生成一个被加数，再对应随机生成一个加数
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     * 结果:
     * 优化建议：
     *
     * @return
     */
    public Set<Node> arithmeticProblems() {

        /**
         * 2、生成100道加减法算术题，
         * 正例：
         * 1+2
         * 99+1
         * 0+100
         * (1+2, 2+1)
         * (1+2, 1+3)
         *
         * 反例：
         * 100+1
         * 1+0
         * (1+1, 1+1)
         * (1+2, 1+2)
         *
         * 加法题和不超过100，加数不能为0，
         * 随机生成加减法题，**不能重复**，题目和题目**带结果**的答案分别写入两个文件；
         * 难度：简单
         */
        // 被加数：[0-99]
        // 加数：[1-100]

        int count = 0;
        Set<Node> nodeSet = new HashSet<>();
        do {
            int[] ints = getAddArithmetic();
            Node node = new Node(ints[0], ints[1]);
            if (!nodeSet.contains(node)) {
                nodeSet.add(node);
                count++;
            }

        } while (count < 100);

        return nodeSet;
    }

    private int[] getAddArithmetic() {
        Random random = new Random();
        int left = random.nextInt(100);

        int right;
        int rightBound = 100 - left;
        if (rightBound == 1) {
            // rightBound 为 1时，right 只能取 1
            right = rightBound;
        } else {
            do {
                right = random.nextInt(rightBound);
            } while (right == 0);
        }

        return new int[]{left, right};
    }

    public class Node {
        int left;
        int right;

        public Node(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public int getLeft() {
            return left;
        }

        public void setLeft(int left) {
            this.left = left;
        }

        public int getRight() {
            return right;
        }

        public void setRight(int right) {
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return left == node.left && right == node.right;
        }

        @Override
        public int hashCode() {
            return Objects.hash(left, right);
        }
    }

}
