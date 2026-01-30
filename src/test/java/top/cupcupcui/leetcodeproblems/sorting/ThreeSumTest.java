package top.cupcupcui.leetcodeproblems.sorting;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTest {

    /**
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     */
    @Test
    public void test_PositiveCase0() {
        ThreeSumV2 service = new ThreeSumV2();
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
        ThreeSumV2 service = new ThreeSumV2();
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
        ThreeSumV2 service = new ThreeSumV2();
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
        ThreeSumV2 service = new ThreeSumV2();
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
        ThreeSumV2 service = new ThreeSumV2();
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
        ThreeSumV2 service = new ThreeSumV2();
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
        ThreeSumV2 service = new ThreeSumV2();
        int[] arg1 = {-2, 0, 1, 2};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, 0, 2));
        List<List<Integer>> response = service.threeSum(arg1);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    /**
     * 输入
     * nums = [0,0,0,0]
     * <p>
     * 输出 [[0,0,0],[0,0,0]]
     * 预期结果 [[0,0,0]]
     */
    @Test
    public void test_PositiveCase7() {
        ThreeSumV2 service = new ThreeSumV2();
        int[] arg1 = {0, 0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0));
        List<List<Integer>> response = service.threeSum(arg1);
        Assert.assertEquals(expected.size(), response.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    /**
     * 输入
     * nums =
     * [-100,-70,-60,110,120,130,160]
     * 输出
     * [[-70,-60,130]]
     * 预期结果
     * [[-100,-60,160],[-70,-60,130]]
     */
    @Test
    public void test_PositiveCase8() {
        ThreeSumV2 service = new ThreeSumV2();
        int[] arg1 = {-100, -70, -60, 110, 120, 130, 160};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-100, -60, 160), Arrays.asList(-70, -60, 130));
        List<List<Integer>> response = service.threeSum(arg1);
        Assert.assertEquals(expected.size(), response.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    /**
     * 输入
     * nums =
     * [2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10]
     * <p>
     * 添加到测试用例
     * 输出
     * [[-10,5,5],[-5,0,5],[-2,0,2]]
     * 预期结果
     * [[-10,5,5],[-5,0,5],[-4,2,2],[-3,-2,5],[-3,1,2],[-2,0,2]]
     */
    @Test
    public void test_PositiveCase9() {
        ThreeSumV2 service = new ThreeSumV2();
        int[] arg1 = {2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-10, 5, 5),
                Arrays.asList(-5, 0, 5),
                Arrays.asList(-4, 2, 2),
                Arrays.asList(-3, -2, 5),
                Arrays.asList(-3, 1, 2),
                Arrays.asList(-2, 0, 2)
        );
        List<List<Integer>> response = service.threeSum(arg1);
        Assert.assertEquals(expected.size(), response.size());
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertArrayEquals(expected.get(i).toArray(), response.get(i).toArray());
        }
    }

    @Test
    public void test_PositiveCase10() {
        ThreeSumV2 service = new ThreeSumV2();
        int[] arg1 = {-1, -1, 2, 2, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(2, 2, -4)
        );
        List<List<Integer>> response = service.threeSum(arg1);
        Assert.assertEquals(expected.size(), response.size());
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


    class LingmaThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums); // 使用内置排序
            List<List<Integer>> result = new ArrayList<>();

            for (int i = 0; i < nums.length - 2; i++) {
                // 避免重复的第一个数字
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // 跳过重复元素
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++; // 需要更大的和
                    } else {
                        right--; // 需要更小的和
                    }
                }
            }

            return result;
        }
    }

}