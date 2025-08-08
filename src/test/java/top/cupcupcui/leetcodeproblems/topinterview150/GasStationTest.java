package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GasStationTest {

    /**
     * 输入: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
     * 输出: 3
     */
    @Test
    public void test_PositiveCase0() {
        GasStation gasStation = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int expected = 3;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: gas = [2,3,4], cost = [3,4,3]
     * 输出: -1
     */
    @Test
    public void test_PositiveCase1() {
        GasStation gasStation = new GasStation();
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        int expected = -1;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: gas = [2,3,4], cost = [3,4,3]
     * 输出: -1
     */
    @Test
    public void test_PositiveCase2() {
        GasStation gasStation = new GasStation();
        int[] gas = {2};
        int[] cost = {3};
        int expected = -1;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: gas = [2,3,4], cost = [3,4,3]
     * 输出: -1
     */
    @Test
    public void test_PositiveCase3() {
        GasStation gasStation = new GasStation();
        int[] gas = {0};
        int[] cost = {3};
        int expected = -1;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * n == gas.length == cost.length
     * 1 <= n <= 105
     * 0 <= gas[i], cost[i] <= 104
     * <p>
     * 输入: gas = [2,3,4], cost = [3,4,3]
     * 输出: -1
     */
    @Test
    public void test_PositiveCase4() {
        GasStation gasStation = new GasStation();
        int[] gas = {0};
        int[] cost = {0};
        int expected = 0;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: gas = [2,3,4], cost = [3,4,3]
     * 输出: -1
     */
    @Test
    public void test_PositiveCase5() {
        GasStation gasStation = new GasStation();
        int[] gas = {1};
        int[] cost = {0};
        int expected = 0;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * n == gas.length == cost.length
     * 1 <= n <= 105
     * 0 <= gas[i], cost[i] <= 104
     * <p>
     * 输入: gas = [2,3,4], cost = [3,4,3]
     * 输出: -1
     */
    @Test
    public void test_PositiveCase6() {
        GasStation gasStation = new GasStation();
        int[] gas = {1};
        int[] cost = {1};
        int expected = 0;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: gas = [2,3,4], cost = [3,4,3]
     * 输出: -1
     */
    @Test
    public void test_PositiveCase7() {
        GasStation gasStation = new GasStation();
        int[] gas = {1};
        int[] cost = {2};
        int expected = -1;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: gas = [2,3,4], cost = [3,4,3]
     * 输出: -1
     */
    @Test
    public void test_PositiveCase8() {
        GasStation gasStation = new GasStation();
        int[] gas = {1, 1};
        int[] cost = {2, 2};
        int expected = -1;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入: gas = [104,0,0], cost = [1,1,1]
     * 输出: 0
     */
    @Test
    public void test_PositiveCase9() {
        GasStation gasStation = new GasStation();
        int[] gas = {104, 0, 0};
        int[] cost = {1, 1, 1};
        int expected = 0;
        int response = gasStation.canCompleteCircuit(gas, cost);
        Assert.assertEquals(expected, response);
    }

    /**
     * 官方题目
     */
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            return -1;
        }
    }

    /**
     * 作者：力扣官方题解
     * 链接：https://leetcode.cn/problems/gas-station/solutions/488357/jia-you-zhan-by-leetcode-solution/
     * 来源：力扣（LeetCode）
     */
    class SolutionLeetCode {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int n = gas.length;
            int i = 0;
            while (i < n) {
                int sumOfGas = 0, sumOfCost = 0;
                int cnt = 0;
                while (cnt < n) {
                    int j = (i + cnt) % n;
                    sumOfGas += gas[j];
                    sumOfCost += cost[j];
                    if (sumOfCost > sumOfGas) {
                        break;
                    }
                    cnt++;
                }
                if (cnt == n) {
                    return i;
                } else {
                    i = i + cnt + 1;
                }
            }
            return -1;
        }
    }

}