package top.cupcupcui.leetcodeproblems.huawei.nowcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author garre
 */
public class HJ3RandomNumberProcessorTest {

    /**
     * 正例
     */
    @Test
    public void randomNumberProcessor_PositiveCase1() {
        // 第一行先输入随机整数的个数 N
        int total = 3;
        // 接下来的 N 行每行输入一个整数，代表明明生成的数字
        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(2);
        intList.add(1);

        HJ3RandomNumberProcessor hj3RandomNumberProcessor = new HJ3RandomNumberProcessor();
        List<Integer> resultList = hj3RandomNumberProcessor.randomNumberProcessor(total, intList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());

        System.out.println("resultList: " + resultList.toString());
    }

    /**
     * 正例
     */
    @Test
    public void randomNumberProcessor_PositiveCase2() {
        // 第一行先输入随机整数的个数 N
        int total = 3;
        // 接下来的 N 行每行输入一个整数，代表明明生成的数字
        List<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(2);
        intList.add(2);
        intList.add(1);
        intList.add(3);

        HJ3RandomNumberProcessor hj3RandomNumberProcessor = new HJ3RandomNumberProcessor();
        List<Integer> resultList = hj3RandomNumberProcessor.randomNumberProcessor(total, intList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(4);
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());

        System.out.println("resultList: " + resultList.toString());
    }

    /**
     * 正例
     */
    @Test
    public void randomNumberProcessor_PositiveCase3() {
        // 第一行先输入随机整数的个数 N
        int total = 3;
        // 接下来的 N 行每行输入一个整数，代表明明生成的数字
        List<Integer> intList = new ArrayList<>();
        intList.add(1);

        HJ3RandomNumberProcessor hj3RandomNumberProcessor = new HJ3RandomNumberProcessor();
        List<Integer> resultList = hj3RandomNumberProcessor.randomNumberProcessor(total, intList);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());

        System.out.println("resultList: " + resultList.toString());
    }

    /**
     * 反例
     */
    @Test
    public void randomNumberProcessor_NegativeCase1() {
        // 第一行先输入随机整数的个数 N
        int total = 3;
        // 接下来的 N 行每行输入一个整数，代表明明生成的数字
        List<Integer> intList = new ArrayList<>();

        HJ3RandomNumberProcessor hj3RandomNumberProcessor = new HJ3RandomNumberProcessor();
        List<Integer> resultList = hj3RandomNumberProcessor.randomNumberProcessor(total, intList);
        List<Integer> expectedList = new ArrayList<>();
        Assert.assertArrayEquals(expectedList.toArray(), resultList.toArray());

        System.out.println("resultList: " + resultList.toString());
    }

}