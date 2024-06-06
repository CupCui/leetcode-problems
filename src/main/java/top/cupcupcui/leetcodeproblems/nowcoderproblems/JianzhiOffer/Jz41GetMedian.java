package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

/**
 * @author garre
 */
public class Jz41GetMedian {

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
        insert(1);
        Double median = getMedian();
        System.out.println(median);
    }

    public void insert(Integer num) {

    }

    public Double getMedian() {

        return (double) 0;
    }


}
