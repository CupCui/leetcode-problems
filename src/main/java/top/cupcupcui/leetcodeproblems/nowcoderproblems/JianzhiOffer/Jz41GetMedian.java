package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author garre
 */
public class Jz41GetMedian {

    private List<Integer> intArr = new ArrayList<>();

    /**
     * 描述
     * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
     * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
     * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
     * 数据范围：
     * 数据流中数个数满足 1≤𝑛≤1000 1≤n≤1000  ，大小满足 1≤𝑣𝑎𝑙≤1000 1≤val≤1000
     * 进阶：
     * 空间复杂度 𝑂(𝑛) O(n)  ， 时间复杂度 𝑂(𝑛𝑙𝑜𝑔𝑛) O(nlogn)
     * <p>
     * 输入：
     * [5,2,3,4,1,6,7,0,8]
     * 返回值：
     * "5.00 3.50 3.00 3.50 3.00 3.50 4.00 3.50 4.00 "
     * 说明：
     * 数据流里面不断吐出的是5,2,3...,则得到的平均数分别为5,(5+2)/2,3...
     */
    @Test
    public void solution() {
        int[] insertArray = new int[]{5, 2, 3, 4, 1, 6, 7, 0, 8};
        List<Double> medianNums = new ArrayList<>();
        for (int i : insertArray) {
            Insert(i);
            Double median = GetMedian();
            medianNums.add(median);

        }
        System.out.println(intArr);
        System.out.println(medianNums);
    }

    private double getMediumNum(List<Integer> sortedArr) {
        // [2,5]
        int arrSize = sortedArr.size();
        double mediumNum = 0D;
        if (arrSize % 2 == 0) {
            int mediumIndex = arrSize / 2;
            Integer mediumFirstNum = sortedArr.get(mediumIndex - 1);
            Integer mediumSecondNum = sortedArr.get(mediumIndex);
            mediumNum = (mediumFirstNum + mediumSecondNum) / 2D;
        } else {
            int mediumIndex = arrSize / 2;
            mediumNum = sortedArr.get(mediumIndex);
        }
        return mediumNum;
    }

    /**
     * 插入一个数
     * 空间复杂度 O(1)
     * 时间复杂度 O(1)
     *
     * @param num
     */
    public void Insert(Integer num) {
        intArr.add(num);
    }

    /**
     * 求集合的中位数，并将结果放入到结果集中
     *
     * @return
     */
    public Double GetMedian() {
        List<Integer> integers = new ArrayList<>(intArr);

        List<Integer> sortedArr = quickSort(integers);

        double mediumNum = getMediumNum(sortedArr);

        return mediumNum;
    }

    /**
     * 快速排序
     * 空间复杂度 O(n)
     * 时间复杂度 O(n2)
     *
     * @param intArrDto
     * @return
     */
    private List<Integer> quickSort(List<Integer> intArrDto) {
        // [5,2]
        List<Integer> intArr = new ArrayList<>(intArrDto);
        // [5,2]
        // 遍历 intArr
        for (int i = 0; i < intArr.size(); i++) {
            // 待插入的元素
            Integer insertVal = intArr.get(i);
            // 待插入的位置，初始位置为 i
            int insertPosition = i;
            if (i == 0) {
                continue;
            }
            // 遍历已经排序的集合 [0, i - 1]
            for (int j = 0; j < i; j++) {
                // 遍历已经排序的集合，查找元素 intArr[i] 待插入的位置 insertPosition
                if (insertVal < intArr.get(j)) {
                    // 待插入的位置
                    insertPosition = j;
                    break;
                }
            }

            Integer neededInsertVal = insertVal;
            // 将 insertPosition 后元素平移
            for (int j = insertPosition; j <= i; j++) {
                Integer temp = intArr.get(j);
                intArr.set(j, neededInsertVal);
                neededInsertVal = temp;
            }
        }

        return intArr;
    }


}
