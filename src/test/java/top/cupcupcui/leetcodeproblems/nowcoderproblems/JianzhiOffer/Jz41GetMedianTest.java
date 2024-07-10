package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author garre
 */
public class Jz41GetMedianTest {


    private ArrayList<Integer> val = new ArrayList<Integer>();

    @Test
    public void solution() {
        int[] insertArray = new int[]{5, 2, 3, 4, 1, 6, 7, 0, 8};
        List<Double> medianNums = new ArrayList<>();
        for (int i : insertArray) {
            Insert(i);
            Double median = GetMedian();
            medianNums.add(median);

        }
        System.out.println(val);
        System.out.println(medianNums);
    }

    public void Insert(Integer num) {
        if (val.isEmpty())
            //val中没有数据，直接加入
            val.add(num);
            //val中有数据，需要插入排序
        else {
            int i = 0;
            //遍历找到插入点
            for (; i < val.size(); i++) {
                if (num <= val.get(i))
                    break;
            }
            //插入相应位置
            val.add(i, num);
        }
    }

    public Double GetMedian() {
        int n = val.size();
        //奇数个数字
        if (n % 2 == 1)
            //类型转换
            return (double) val.get(n / 2);
            //偶数个数字
        else {
            double a = val.get(n / 2);
            double b = val.get(n / 2 - 1);
            return (a + b) / 2;
        }
    }

}