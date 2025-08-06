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
     * 官方题目
     */
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            return -1;
        }
    }
}