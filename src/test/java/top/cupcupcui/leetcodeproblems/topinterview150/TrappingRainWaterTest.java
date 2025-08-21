package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrappingRainWaterTest {

    /**
     * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * 输出：6
     */
    @Test
    public void test_PositiveCase0() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int expected = 6;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [4,2,0,3,2,5]
     * 输出：9
     */
    @Test
    public void test_PositiveCase1() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {4, 2, 0, 3, 2, 5};
        int expected = 9;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [0]
     * 输出：0
     */
    @Test
    public void test_PositiveCase2() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {0};
        int expected = 0;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase3() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {1};
        int expected = 0;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [1, 1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase4() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {1, 1};
        int expected = 0;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height =            [0,1,0,2,1,0,3,1,0]
     * 输出：4
     */
    @Test
    public void test_PositiveCase5() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] nums = {0, 1, 0, 2, 1, 0, 3, 1, 0};
        int expected = 4;
        int response = trappingRainWater.trap(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 方法一：动态规划
     * 对于下标 i，下雨后水能到达的最大高度等于下标 i 两边的最大高度的最小值，下标 i 处能接的雨水量等于下标 i 处的水能到达的最大高度减去 height[i]。
     *
     * 朴素的做法是对于数组 height 中的每个元素，分别向左和向右扫描并记录左边和右边的最大高度，然后计算每个下标位置能接的雨水量。
     * 假设数组 height 的长度为 n，该做法需要对每个下标位置使用 O(n) 的时间向两边扫描并得到最大高度，因此总时间复杂度是 O(n * 2)。
     *
     * 上述做法的时间复杂度较高是因为需要对每个下标位置都向两边扫描。如果已经知道每个位置两边的最大高度，则可以在 O(n) 的时间内得到能接的雨水总量。使用动态规划的方法，可以在 O(n) 的时间内预处理得到每个位置两边的最大高度。
     *
     * 创建两个长度为 n 的数组 leftMax 和 rightMax。对于 0≤i<n，leftMax[i] 表示下标 i 及其左边的位置中，height 的最大高度，rightMax[i] 表示下标 i 及其右边的位置中，height 的最大高度。
     *
     * 显然，leftMax[0]=height[0]，rightMax[n−1]=height[n−1]。两个数组的其余元素的计算如下：
     *
     * 当 1≤i≤n−1 时，leftMax[i]=max(leftMax[i−1],height[i])；
     *
     * 当 0≤i≤n−2 时，rightMax[i]=max(rightMax[i+1],height[i])。
     *
     * 因此可以正向遍历数组 height 得到数组 leftMax 的每个元素值，反向遍历数组 height 得到数组 rightMax 的每个元素值。
     *
     * 在得到数组 leftMax 和 rightMax 的每个元素值之后，对于 0≤i<n，下标 i 处能接的雨水量等于 min(leftMax[i],rightMax[i])−height[i]。遍历每个下标位置即可得到能接的雨水总量。
     *复杂度分析
     *
     * 时间复杂度：O(n)，其中 n 是数组 height 的长度。计算数组 leftMax 和 rightMax 的元素值各需要遍历数组 height 一次，计算能接的雨水总量还需要遍历一次。
     *
     * 空间复杂度：O(n)，其中 n 是数组 height 的长度。需要创建两个长度为 n 的数组 leftMax 和 rightMax。
     *
     * 作者：力扣官方题解
     */

}