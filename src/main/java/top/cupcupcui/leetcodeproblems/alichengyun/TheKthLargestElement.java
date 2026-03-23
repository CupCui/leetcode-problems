package top.cupcupcui.leetcodeproblems.alichengyun;

/**
 * 数组第 K 大元素（用快速排序思想实现）
 *
 * @author cuiguanghao
 * @date 2026/3/23 14:42
 */
public class TheKthLargestElement {
    /**
     * 题目：数组第 K 大元素（用快速排序思想实现）
     *
     * 题目描述：
     * 给定一个整数数组 nums 和一个整数 k，请返回数组中**第 k 大**的**元素**。
     * 要求使用**快排**相关思想完成（推荐：partition 分区过程），而不是直接调用库排序。
     *
     * 说明：
     * 1. 第 k 大是按从大到小排序后的第 k 个元素，不是第 k 个不同元素。
     * 2. 可以基于快速排序做部分排序，或使用快速选择（QuickSelect）实现。
     *
     * 输入格式：
     * nums：整数数组
     * k：正整数
     *
     * 输出格式：
     * 返回一个整数，表示第 k 大元素
     *
     * 示例 1：
     * 输入：nums = [3,2,1,5,6,4], k = 2
     * 输出：5
     * 解释：从大到小排序后为 [6,5,4,3,2,1]，第 2 大是 5。
     *
     * 示例 2：
     * 输入：nums = [3,2,3,1,2,4,5,5,6], k = 4
     * 输出：4
     * 解释：从大到小排序后为 [6,5,5,4,3,3,2,2,1]，第 4 大是 4。
     *
     * 数据范围：
     * 1 <= nums.length <= 10^5
     * -10^4 <= nums[i] <= 10^4
     * 1 <= k <= nums.length
     */

    /**
     * 思路：
     * 1) 先使用快速排序（QuickSort）将数组按升序排好。
     * 2) 第 k 大元素在升序数组中的下标是 nums.length - k。
     * <p>
     * 快排核心：partition（分区）
     * - 选定一个 pivot（这里固定使用右端元素 nums[right]）
     * - 一次扫描后把数组分成两部分：
     * [left, pivotIndex - 1] 全部 < pivot
     * [pivotIndex + 1, right] 全部 >= pivot
     * - pivot 放到 pivotIndex 后，这个位置就是 pivot 的最终有序位置
     * <p>
     * 递归含义：
     * - 左边继续排：partition(nums, left, pivotIndex - 1)
     * - 右边继续排：partition(nums, pivotIndex + 1, right)
     * - 当 left >= right 时，子区间长度 <= 1，天然有序，递归结束
     * <p>
     * 时间复杂度：平均 O(n log n)，最坏 O(n^2)
     * 空间复杂度：平均 O(log n)（递归栈），最坏 O(n)
     * <p>
     * 说明：
     * - 这版是“完整快排后取第 k 大”，逻辑直观；
     * - 若追求这道题最优平均复杂度，可改为 QuickSelect（平均 O(n)）。
     *
     * @return
     */
    public int theKthLargestElement(int[] nums, int k) {
        // 完整快排：将 nums 整体排成升序。
        int left = 0;
        int right = nums.length - 1;
        partition(nums, left, right);

        // 第 k 大 -> 升序下标 nums.length - k
        return nums[nums.length - k];
    }

    private void partition(int[] nums, int left, int right) {
        // 防御式边界判断：越界时直接返回，避免非法访问。
        if (left < 0 || right > nums.length - 1) {
            return;
        }
        // 递归终止：区间长度为 0 或 1 时，已经有序。
        if (left >= right) {
            return;
        }

        // pivotIndex 指向“下一个应放置 < pivot 元素的位置”。
        int pivotIndex = left;
        // 这里 pivot 固定取 nums[right]。
        // 循环不变量（每轮开始时）：
        // [left, pivotIndex - 1] 都是 < pivot 的元素
        // [pivotIndex, i - 1] 都是 >= pivot 的元素
        for (int i = left; i <= right; i++) {
            // 发现 < pivot 的元素，就交换到左侧区间并扩展左区间边界。
            if (nums[i] < nums[right]) {
                swap(nums, i, pivotIndex);
                pivotIndex++;
            }
        }
        // 扫描结束后，将 pivot 放到最终有序位置 pivotIndex。
        swap(nums, pivotIndex, right);

        // 递归处理 pivot 左右两侧未排序区间。
        partition(nums, left, pivotIndex - 1);
        partition(nums, pivotIndex + 1, right);
    }

    private void swap(int[] nums, int source, int target) {
        // 交换数组中两个位置的值。
        int temp = nums[source];
        nums[source] = nums[target];
        nums[target] = temp;
    }

    public class TheKthLargestElementV2 {

        public int theKthLargestElement(int[] nums, int k) {
            if (nums == null || nums.length == 0) {
                throw new IllegalArgumentException("nums 不能为空");
            }
            if (k < 1 || k > nums.length) {
                throw new IllegalArgumentException("k 超出范围");
            }

            // 1) 先把数组整体排成升序
            quickSort(nums, 0, nums.length - 1);
            // 2) 第 k 大在升序数组中的下标为 n-k
            return nums[nums.length - k];
        }

        /**
         * 快排模板（与当前思路一致）：
         * - 取右端元素作为 pivot
         * - 分区后 pivot 落到最终有序位置
         * - 递归处理左右区间
         */
        private void quickSort(int[] nums, int left, int right) {
            if (left >= right) {
                return;
            }

            int pivotIndex = partition(nums, left, right);
            quickSort(nums, left, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, right);
        }

        /**
         * 分区不变量（循环过程中始终成立）：
         * - [left, storeIndex - 1] < pivot
         * - [storeIndex, i - 1] >= pivot
         */
        private int partition(int[] nums, int left, int right) {
            int pivotValue = nums[right];
            int storeIndex = left;

            // i < right：right 是 pivot 所在位置，不参与比较
            for (int i = left; i < right; i++) {
                if (nums[i] < pivotValue) {
                    swap(nums, i, storeIndex);
                    storeIndex++;
                }
            }

            // 将 pivot 放到最终位置 storeIndex
            swap(nums, storeIndex, right);
            return storeIndex;
        }

        private void swap(int[] nums, int source, int target) {
            if (source == target) {
                return;
            }
            int temp = nums[source];
            nums[source] = nums[target];
            nums[target] = temp;
        }
    }

}
