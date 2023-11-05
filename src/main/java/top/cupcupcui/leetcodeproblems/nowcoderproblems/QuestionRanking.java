package top.cupcupcui.leetcodeproblems.nowcoderproblems;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: cuiguanghao
 * @date: 2023/4/5 18:40
 * @description:
 */
public class QuestionRanking {

    @Test
    public void questionRankingTest() {

        //int[] nums = new int[] {2, 3, 1, 0, 2, 5, 3};
        int[] arr = new int[]{5, 1, 6, 2, 5};

        //int[] rank = bubblingSort(arr);
        quickSort(arr);

        System.out.println("repeatNumber: " + Arrays.toString(arr));


    }

    private int[] bubblingSort(int[] arr) {
        // 给定一个长度为 n 的数组，请你编写一个函数，返回该数组按升序排序后的结果。
        // * 输入：[5,2,3,1,4]
        // * 返回值：[1,2,3,4,5]

        // 冒泡排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

    private void quickSort(int[] arr) {
        // 给定一个长度为 n 的数组，请你编写一个函数，返回该数组按升序排序后的结果。
        // * 输入：[5,2,3,1,4]
        // * 返回值：[1,2,3,4,5]


        // 快速排序
        int low = 0;
        int high = arr.length - 1;

        quickSort(arr, low, high);

    }

    private static void quickSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;

        if (low >= high) {
            return;
        }
        int temp = arr[low];

        while (i < j) {

            // 左边
            while (arr[i] <= temp && i < j) {
                i++;
            }

            // 右边
            while (arr[j] >= temp && i < j) {
                j--;
            }

            // 交换middle左边和右边的数据
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        arr[low] = arr[i];
        arr[i] = temp;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);


    }


}
