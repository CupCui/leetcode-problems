package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author garre
 */
public class Jz40GetLeastNumbers {

    /**
     * 描述
     * 给定一个长度为 n 的可能有重复值的数组，找出其中不去重的最小的 k 个数。
     * 例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4(任意顺序皆可)。
     * 数据范围：0≤𝑘,𝑛≤100000≤k,n≤10000，数组中每个数的大小0≤𝑣𝑎𝑙≤10000≤val≤1000
     * 要求：空间复杂度 𝑂(𝑛)O(n) ，时间复杂度 𝑂(𝑛𝑙𝑜𝑔𝑘)O(nlogk)
     * <p>
     * 输入：
     * [4,5,1,6,2,7,3,8],4
     * 返回值：
     * [1,2,3,4]
     * 说明：
     * 返回最小的4个数即可，返回[1,3,2,4]也可以
     */
    @Test
    public void getLeastNumbersTest() {
        int[] input = {};
        int k = 0;
        getLeastNumbers(input, k);
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param input int整型一维数组
     * @param k     int整型
     * @return int整型ArrayList
     */
    public ArrayList<Integer> getLeastNumbers(int[] input, int k) {
        // write code here
        return new ArrayList<>();
    }


}
