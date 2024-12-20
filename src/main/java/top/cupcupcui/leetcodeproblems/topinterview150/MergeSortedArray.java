package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.Arrays;

/**
 * @author garre
 */
public class MergeSortedArray {


    /**
     * 描述
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     * 示例 1：
     * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * 输出：[1,2,2,3,5,6]
     * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
     * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
     */
    //@Test
    public void mergeSortedArrayTest() {
        /*
         * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
         * 输出：[1,2,2,3,5,6]
         *
         * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
         * 输出：[1]
         *
         * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
         * 输出：[1]
         *
         * 输入：nums1 = [], m = 0, nums2 = [], n = 0
         * 输出：[]
         *
         * */
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] ints = mergeSortedArray(nums1, m, nums2, n);

        System.out.println("output: " + Arrays.toString(ints));
    }

    /**
     * 思路: 1.数组拼接，2.排序
     * 知识点：数组 / 字符串
     * 测试:
     * 结果:
     * 时间复杂度: O(n^2)
     * 空间复杂度: O(1)
     * 优化建议：可以使用"双指针"或"归并"的方法，充分利用两个数组已经有序的特点。
     * 空间优化：
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     * @return
     */
    public int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        // 1.数组拼接
        int nums2Index = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[nums2Index++];
        }
        // 2.排序
        // 冒泡排序，遍历 m 次，每次遍历都将最大的元素移动到数组末尾
        // 需要遍历的次数
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length - i - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    // 交换 j 和 j + 1 位置的元素
                    int tempNum = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = tempNum;
                }
            }
        }

        return nums1;
    }

}
