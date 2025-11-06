package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
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

    /**
     * 官方题解
     */
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            // 枚举 a
            for (int first = 0; first < n; ++first) {
                // 需要和上一次枚举的数不相同
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue;
                }
                // c 对应的指针初始指向数组的最右端
                int third = n - 1;
                int target = -nums[first];
                // 枚举 b
                for (int second = first + 1; second < n; ++second) {
                    // 需要和上一次枚举的数不相同
                    if (second > first + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }
                    // 需要保证 b 的指针在 c 的指针的左侧
                    while (second < third && nums[second] + nums[third] > target) {
                        --third;
                    }
                    // 如果指针重合，随着 b 后续的增加
                    // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                    if (second == third) {
                        break;
                    }
                    if (nums[second] + nums[third] == target) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        ans.add(list);
                    }
                }
            }
            return ans;
        }
    }


}