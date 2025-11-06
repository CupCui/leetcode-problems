package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    /**
     * 输入：[1,8,6,2,5,4,8,3,7]
     * 输出：49
     */
    @Test
    public void test_PositiveCase0() {
        ContainerWithMostWater service = new ContainerWithMostWater();
        int[] arg1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        int response = service.maxArea(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [1,1]
     * 输出：1
     */
    @Test
    public void test_PositiveCase1() {
        ContainerWithMostWater service = new ContainerWithMostWater();
        int[] arg1 = {1, 1};
        int expected = 1;
        int response = service.maxArea(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [1,2,3,4]
     * 输出：4
     */
    @Test
    public void test_PositiveCase2() {
        ContainerWithMostWater service = new ContainerWithMostWater();
        int[] arg1 = {1, 2, 3, 4};
        int expected = 4;
        int response = service.maxArea(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [0,0]
     * 输出：0
     */
    @Test
    public void test_PositiveCase3() {
        ContainerWithMostWater service = new ContainerWithMostWater();
        int[] arg1 = {0, 0};
        int expected = 0;
        int response = service.maxArea(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [0,1]
     * 输出：0
     */
    @Test
    public void test_PositiveCase4() {
        ContainerWithMostWater service = new ContainerWithMostWater();
        int[] arg1 = {0, 1};
        int expected = 0;
        int response = service.maxArea(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [1,0]
     * 输出：0
     */
    @Test
    public void test_PositiveCase5() {
        ContainerWithMostWater service = new ContainerWithMostWater();
        int[] arg1 = {1, 0};
        int expected = 0;
        int response = service.maxArea(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [2,2]
     * 输出：2
     */
    @Test
    public void test_PositiveCase6() {
        ContainerWithMostWater service = new ContainerWithMostWater();
        int[] arg1 = {2, 2};
        int expected = 2;
        int response = service.maxArea(arg1);

        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：height = [1,0,1]
     * 输出：2
     */
    @Test
    public void test_PositiveCase7() {
        ContainerWithMostWater service = new ContainerWithMostWater();
        int[] arg1 = {1, 0, 1};
        int expected = 2;
        int response = service.maxArea(arg1);

        Assert.assertEquals(expected, response);
    }

}