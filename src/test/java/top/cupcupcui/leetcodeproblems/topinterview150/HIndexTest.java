package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HIndexTest {

    /**
     * 输入：citations = [3,0,6,1,5]
     * 输出：3
     */
    @Test
    public void jumpGame_PositiveCase0() {
        HIndex hIndex = new HIndex();
        int[] nums = {3, 0, 6, 1, 5};
        int expected = 3;
        int response = hIndex.hIndex(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：citations = [1,3,1]
     * 输出：1
     */
    @Test
    public void jumpGame_PositiveCase1() {
        HIndex hIndex = new HIndex();
        int[] nums = {1, 3, 1};
        int expected = 1;
        int response = hIndex.hIndex(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：citations = [1]
     * 输出：1
     */
    @Test
    public void jumpGame_PositiveCase2() {
        HIndex hIndex = new HIndex();
        int[] nums = {1};
        int expected = 1;
        int response = hIndex.hIndex(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：citations = [1]
     * 输出：0
     */
    @Test
    public void jumpGame_PositiveCase3() {
        HIndex hIndex = new HIndex();
        int[] nums = {0};
        int expected = 0;
        int response = hIndex.hIndex(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：citations = [1,1,1]
     * 输出：3
     */
    @Test
    public void jumpGame_PositiveCase4() {
        HIndex hIndex = new HIndex();
        int[] nums = {1, 1, 1};
        int expected = 1;
        int response = hIndex.hIndex(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：citations = [2,1,2]
     * 输出：2
     */
    @Test
    public void jumpGame_PositiveCase5() {
        HIndex hIndex = new HIndex();
        int[] nums = {2, 1, 2};
        int expected = 2;
        int response = hIndex.hIndex(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：citations = [100]
     * 输出：1
     */
    @Test
    public void jumpGame_PositiveCase6() {
        HIndex hIndex = new HIndex();
        int[] nums = {100};
        int expected = 1;
        int response = hIndex.hIndex(nums);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：citations = [11,15]
     * 输出：1
     */
    @Test
    public void jumpGame_PositiveCase7() {
        HIndex hIndex = new HIndex();
        int[] nums = {11, 15};
        int expected = 2;
        int response = hIndex.hIndex(nums);
        Assert.assertEquals(expected, response);
    }

}