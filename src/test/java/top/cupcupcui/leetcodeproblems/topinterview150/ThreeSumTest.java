package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {

    /**
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     */
    @Test
    public void test_PositiveCase0() {
        ThreeSum service = new ThreeSum();
        int[] arg1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    /**
     * 输入：nums = [0,1,1]
     * 输出：[]
     */
    @Test
    public void test_PositiveCase1() {
        ThreeSum service = new ThreeSum();
        int[] arg1 = {0, 1, 1};
        List<List<Integer>> response = service.threeSum(arg1);
        Assert.assertTrue(CollectionUtils.isEmpty(response));
    }

    /**
     * 输入：nums = [0,0,0]
     * 输出：[[0,0,0]]
     */
    @Test
    public void test_PositiveCase2() {
        ThreeSum service = new ThreeSum();
        int[] arg1 = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    /**
     * 输入：nums = [-1,0,1]
     * 输出：[[-1,0,1]]
     */
    @Test
    public void test_PositiveCase3() {
        ThreeSum service = new ThreeSum();
        int[] arg1 = {-1, 0, 1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, 0, 1));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    /**
     * 输入：nums = [-2,1,1]
     * 输出：[[-2,1,1]]
     */
    @Test
    public void test_PositiveCase4() {
        ThreeSum service = new ThreeSum();
        int[] arg1 = {-2, 1, 1};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, 1, 1));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    /**
     * 输入：nums = [-2,1,1,2]
     * 输出：[[-2,1,1]]
     */
    @Test
    public void test_PositiveCase5() {
        ThreeSum service = new ThreeSum();
        int[] arg1 = {-2, 1, 1, 2};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, 1, 1));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    /**
     * 输入：nums = [-2,0,1,2]
     * 输出：[[-2,0,2]]
     */
    @Test
    public void test_PositiveCase6() {
        ThreeSum service = new ThreeSum();
        int[] arg1 = {-2, 0, 1, 2};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, 0, 2));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }


}