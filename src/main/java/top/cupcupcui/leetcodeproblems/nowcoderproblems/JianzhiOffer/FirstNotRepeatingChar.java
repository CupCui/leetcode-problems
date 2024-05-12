package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

/**
 * @author garre
 */
public class FirstNotRepeatingChar {


    /**
     * 描述
     * 在一个长为 字符串中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
     * 数据范围：0≤𝑛≤100000≤n≤10000，且字符串只有字母组成。要求：空间复杂度 𝑂(𝑛)O(n)，时间复杂度 𝑂(𝑛)O(n)
     * 输入："google"
     * 返回值：4
     */
    @Test
    public void firstNotRepeatingCharTest() {
        //String str = "google";
        //String str = "aa";
        String str = "npLByfdfoU";

        System.out.println(FirstNotRepeatingChar(str));

    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @return int整型
     */
    public int FirstNotRepeatingChar (String str) {
        // write code here

        int [] charArray = new int['z'-'A' + 1];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            int index = charAt - 'A';

            if (charArray[index] == 0) {
                charArray[index] = 1;
            } else {
                charArray[index] += 1;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            int index = charAt - 'A';

            if (charArray[index] == 1) {
                return i;
            }
        }

        return -1;

    }
}
