package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpGameIITest {


    /**
     * 正例
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [2,3,1,1,4]
     * 输出: 2
     * 解释: 跳到最后一个位置的最小跳跃数是 2。
     * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
     */
    @Test
    public void jumpGame_PositiveCase0() {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {2, 3, 1, 1, 4};
        int expected = 2;
        int response = jumpGameII.jumpGameII(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [1,1,1,1,1]
     * 输出：4
     */
    @Test
    public void jumpGame_PositiveCase1() {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {1, 1, 1, 1, 1};
        int expected = 4;
        int response = jumpGameII.jumpGameII(nums);
        Assert.assertEquals(expected, response);
    }


    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [2,0,2,0,1]
     * 输出：2
     */
    @Test
    public void jumpGame_PositiveCase2() {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {1, 1, 1, 1, 1};
        int expected = 2;
        int response = jumpGameII.jumpGameII(nums);
        Assert.assertEquals(expected, response);
    }


    // ---------------------------


    /**
     * 反例
     * <p>
     * 示例 2：
     * 输入：nums = [3,2,1,1,4]
     * 输出：2
     * 解释：
     */
    @Test
    public void jumpGame_NegativeCase1() {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {3, 2, 1, 1, 4};
        int expected = 2;
        int response = jumpGameII.jumpGameII(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 反例
     * <p>
     * 示例 2：
     * 输入：nums = [1,1,1,1,4]
     * 输出：4
     */
    @Test
    public void jumpGame_NegativeCase2() {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {1, 1, 1, 1, 4};
        int expected = 4;
        int response = jumpGameII.jumpGameII(nums);
        Assert.assertEquals(expected, response);
    }


    /**
     * 反例
     * <p>
     * 示例 2：
     * 输入：nums = [2,0,2,0,0]
     * 输出：2
     */
    @Test
    public void jumpGame_NegativeCase3() {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {2, 0, 2, 0, 0};
        int expected = 2;
        int response = jumpGameII.jumpGameII(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 反例
     * <p>
     * 示例 2：
     * 输入：nums = [1,1]
     * 输出：2
     */
    @Test
    public void jumpGame_NegativeCase4() {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {2, 1};
        int expected = 2;
        int response = jumpGameII.jumpGameII(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 2：
     * 输入：nums = [1]
     * 输出：1
     */
    @Test
    public void jumpGame_PositiveCase5() {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {1};
        int expected = 1;
        int response = jumpGameII.jumpGameII(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 2：
     * 输入：nums = [2,0,0]
     * 输出：1
     */
    @Test
    public void jumpGame_PositiveCase6() {
        JumpGameII jumpGameII = new JumpGameII();
        int[] nums = {2, 0, 0};
        int expected = 1;
        int response = jumpGameII.jumpGameII(nums);
        Assert.assertEquals(expected, response);
    }

}