package com.onecup.springbootdemo.leetcode.problems;

import org.junit.Test;

import java.util.*;

/**
 * @author: cuiguanghao
 * @Date: 2022/11/5 11:05
 * @Description:
 */
public class FindRepeatNumber {

    @Test
    public void findRepeatNumberTest() {

        // int[] nums = new int[] (2, 3, 1, 0, 2, 5, 3);
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};

        // int repeatNumber = findRepeatNumberV01(nums);
        // int repeatNumber = findRepeatNumberV02(nums);
        // int repeatNumber = findRepeatNumberV03(nums);
        int repeatNumber = findRepeatNumberV02U01(nums);

        System.out.println("repeatNumber: " + repeatNumber);


    }

    /**
     * 思路: 遍历每个元素,在array中去除改元素,如果array中元素个数少了多于1,则返回
     * 测试: 通过
     * result: 超时
     * 时间复杂度: ???
     *
     * @param nums
     * @return
     */
    public int findRepeatNumberV03(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        for (int num : nums) {
            int originSize = numList.size();

            numList.removeAll(Collections.singleton(num));

            int newSize = numList.size();

            if (originSize - newSize > 1) {
                return num;
            }
        }

        return 0;
    }

    /**
     * 思路: 定义一个int[][]二维数组,遍历集合中每个元素,如果数值作为下标在二维数组中不存在,则把数值作为下标放入二维数组中,如果二维数组中已存在,则返回
     * 测试: 通过
     * result: 通过
     * 时间复杂度: ???
     *
     * @param nums
     * @return
     */
    public int findRepeatNumberV02U01(int[] nums) {
        int[][] num2Count = new int[nums.length][1];

        for (int num : nums) {
            int count = num2Count[num][0];
            if (count != 1) {
                num2Count[num][0] = 1;
            } else {
                return num;
            }
        }

        return 0;
    }

    /**
     * 思路: 定义一个Map<num, count>,遍历集合中每个元素,如果map中不存在,则放入map中,如果map中已存在,则返回
     * 测试: 通过
     * result: 通过
     * 时间复杂度: ???
     *
     * @param nums
     * @return
     */
    public int findRepeatNumberV02(int[] nums) {
        Map<Integer, Integer> num2CountMap = new HashMap<>();

        for (int num : nums) {
            if (!num2CountMap.containsKey(num)) {
                num2CountMap.put(num, 1);
            } else {
                return num;
            }
        }

        return 0;
    }


    /**
     * 思路: 遍历集合中每个元素,遍历集合中其他元素,和其他元素比较,如果大小相同并且坐标不同,则return
     * 测试: 通过
     * result: 超出时间限制
     * 时间复杂度: ???
     *
     * @param nums
     * @return
     */
    public int findRepeatNumberV01(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    return nums[i];
                }
            }
        }

        return 0;
    }

}
