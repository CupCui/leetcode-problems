package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [2,3,1,1,4]
     * 输出：true
     * 解释：可以先跳 1 步，从下标 0 到达下标 1, 然后再从下标 1 跳 3 步到达最后一个下标。
     */
    @Test
    public void jumpGame_PositiveCase0() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        boolean expected = true;
        boolean response = jumpGame.jumpGame(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [1,1,1,1,1]
     * 输出：true
     */
    @Test
    public void jumpGame_PositiveCase1() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {1, 1, 1, 1, 1};
        boolean expected = true;
        boolean response = jumpGame.jumpGame(nums);
        Assert.assertEquals(expected, response);
    }


    /**
     * 正例
     * <p>
     * 示例 1：
     * 输入：nums = [2,0,2,0,1]
     * 输出：true
     */
    @Test
    public void jumpGame_PositiveCase2() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {1, 1, 1, 1, 1};
        boolean expected = true;
        boolean response = jumpGame.jumpGame(nums);
        Assert.assertEquals(expected, response);
    }


    // ---------------------------


    /**
     * 反例
     * <p>
     * 示例 2：
     * 输入：nums = [3,2,1,0,4]
     * 输出：false
     * 解释：无论怎样，总会到达下标为 3 的位置。但该下标的最大跳跃长度是 0 ， 所以永远不可能到达最后一个下标。
     */
    @Test
    public void jumpGame_NegativeCase1() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {3, 2, 1, 0, 4};
        boolean expected = false;
        boolean response = jumpGame.jumpGame(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 反例
     * <p>
     * 示例 2：
     * 输入：nums = [0,0,0,0,4]
     * 输出：false
     */
    @Test
    public void jumpGame_NegativeCase2() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {0, 0, 0, 0, 4};
        boolean expected = false;
        boolean response = jumpGame.jumpGame(nums);
        Assert.assertEquals(expected, response);
    }


    /**
     * 反例
     * <p>
     * 示例 2：
     * 输入：nums = [2,0,2,0,0]
     * 输出：false
     */
    @Test
    public void jumpGame_NegativeCase3() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 0, 2, 0, 0};
        boolean expected = true;
        boolean response = jumpGame.jumpGame(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 反例
     * <p>
     * 示例 2：
     * 输入：nums = [0,1]
     * 输出：false
     */
    @Test
    public void jumpGame_NegativeCase4() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {0, 1};
        boolean expected = false;
        boolean response = jumpGame.jumpGame(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 2：
     * 输入：nums = [0]
     * 输出：false
     */
    @Test
    public void jumpGame_PositiveCase5() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {0};
        boolean expected = true;
        boolean response = jumpGame.jumpGame(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 正例
     * <p>
     * 示例 2：
     * 输入：nums = [2,0,0]
     * 输出：false
     */
    @Test
    public void jumpGame_PositiveCase6() {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {2, 0, 0};
        boolean expected = true;
        boolean response = jumpGame.jumpGame(nums);
        Assert.assertEquals(expected, response);
    }

}