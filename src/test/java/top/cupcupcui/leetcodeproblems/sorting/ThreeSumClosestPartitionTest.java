package top.cupcupcui.leetcodeproblems.sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ThreeSumClosestPartitionTest {

    /**
     * 输入：nums = [-1,2,1,-4], target = 1
     * 输出：2
     */
    @Test
    public void test_PositiveCase0() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {-1, 2, 1, -4};
        int arg2 = 1;
        service.threeSumClosest(arg1, arg2);
    }

    /**
     * 输入：nums = [0,0,0], target = 1
     * 输出：0
     */
    @Test
    public void test_PositiveCase1() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {0, 0, 0};
        int arg2 = 1;
        service.threeSumClosest(arg1, arg2);
    }

    /**
     * 输入：nums = [100,0,0,0], target = 1
     * 输出：0
     */
    @Test
    public void test_PositiveCase4() {
        ThreeSumClosest service = new ThreeSumClosest();
        int[] arg1 = {100, 0, 0, 0};
        int arg2 = 1;
        service.threeSumClosest(arg1, arg2);
    }

}