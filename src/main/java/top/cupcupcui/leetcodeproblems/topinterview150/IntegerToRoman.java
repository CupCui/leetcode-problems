package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cuiguanghao
 * @date 2025/9/4 10:04
 * @description 12. 整数转罗马数字
 */
public class IntegerToRoman {
    /**
     * https://leetcode.cn/problems/integer-to-roman/description/?envType=study-plan-v2&envId=top-interview-150
     *
     * 12. 整数转罗马数字
     * 中等
     *
     * 七个不同的符号代表罗马数字，其值如下：
     *
     * 符号	值
     * I	1
     * V	5
     * X	10
     * L	50
     * C	100
     * D	500
     * M	1000
     * 罗马数字是通过添加从最高到最低的小数位值的转换而形成的。将小数位值转换为罗马数字有以下规则：
     *
     * 如果该值不是以 4 或 9 开头，请选择可以从输入中减去的最大值的符号，将该符号附加到结果，减去其值，然后将其余部分转换为罗马数字。
     * 如果该值以 4 或 9 开头，使用 减法形式，表示从以下符号中减去一个符号，例如 4 是 5 (V) 减 1 (I): IV ，9 是 10 (X) 减 1 (I)：IX。仅使用以下减法形式：4 (IV)，9 (IX)，40 (XL)，90 (XC)，400 (CD) 和 900 (CM)。
     * 只有 10 的次方（I, X, C, M）最多可以连续附加 3 次以代表 10 的倍数。你不能多次附加 5 (V)，50 (L) 或 500 (D)。如果需要将符号附加4次，请使用 减法形式。
     * 给定一个整数，将其转换为罗马数字。
     *
     *
     * 示例 1：
     * 输入：num = 3749
     * 输出： "MMMDCCXLIX"
     * 解释：
     * 3000 = MMM 由于 1000 (M) + 1000 (M) + 1000 (M)
     *  700 = DCC 由于 500 (D) + 100 (C) + 100 (C)
     *   40 = XL 由于 50 (L) 减 10 (X)
     *    9 = IX 由于 10 (X) 减 1 (I)
     * 注意：49 不是 50 (L) 减 1 (I) 因为转换是基于小数位
     *
     * 示例 2：
     * 输入：num = 58
     * 输出："LVIII"
     * 解释：
     * 50 = L
     *  8 = VIII
     * 示例 3：
     * 输入：num = 1994
     * 输出："MCMXCIV"
     * 解释：
     *
     * 1000 = M
     *  900 = CM
     *   90 = XC
     *    4 = IV
     *
     * 提示：
     * 1 <= num <= 3999
     *
     * 相关标签
     * 哈希表、数学、字符串
     *
     */

    /**
     * 思路：
     * -[] 先处理正向逻辑，特殊逻辑使用 map 做判断
     * 复杂度分析
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 相关标签:
     * 测试:
     * 结果:
     * 优化建议：
     * 核心思路是：
     * 空间优化：
     *
     * @param num
     */
    public String intToRoman(int num) {

        /**
         *
         * 示例 3：
         * 输入：num = 1994
         * 输出："MCMXCIV"
         * 解释：
         *
         * 1000 = M
         *  900 = CM
         *   90 = XC
         *    4 = IV
         *
         */
        Map<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(4, "IV");
        integerStringHashMap.put(9, "IX");
        integerStringHashMap.put(40, "XL");
        integerStringHashMap.put(90, "XC");
        integerStringHashMap.put(400, "CD");
        integerStringHashMap.put(900, "CM");

        integerStringHashMap.put(1, "I");
        integerStringHashMap.put(5, "V");
        integerStringHashMap.put(10, "X");
        integerStringHashMap.put(50, "L");
        integerStringHashMap.put(100, "C");
        integerStringHashMap.put(500, "D");
        integerStringHashMap.put(1000, "M");


        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;


        /**
         *
         * 输入：num = 58
         * 输出："LVIII"
         *
         * 解释：
         * 50 = L
         *  8 = VIII
         */

        int thousandValue = num / 1000 * 1000;
        int hundredValue = num % 1000 / 100 * 100;
        int tenValue = num % 100 / 10 * 10;
        int oneValue = num % 10;

        StringBuilder romanStrBuilder = new StringBuilder();

        if (thousandValue != 0) {
            if (integerStringHashMap.containsKey(thousandValue)) {
                romanStrBuilder.append(integerStringHashMap.get(thousandValue));
            } else {
                int mNum = thousandValue / M;
                for (int i = 0; i < mNum; i++) {
                    romanStrBuilder.append("M");
                }
            }
        }
        if (hundredValue != 0) {
            if (integerStringHashMap.containsKey(hundredValue)) {
                romanStrBuilder.append(integerStringHashMap.get(hundredValue));
            } else {
                if (hundredValue - D > 0) {
                    romanStrBuilder.append("D");
                    hundredValue = hundredValue - D;
                }
                int cNum = hundredValue / C;
                for (int i = 0; i < cNum; i++) {
                    romanStrBuilder.append("C");
                }
            }
        }
        if (tenValue != 0) {
            if (integerStringHashMap.containsKey(tenValue)) {
                romanStrBuilder.append(integerStringHashMap.get(tenValue));
            } else {
                if (tenValue - L > 0) {
                    romanStrBuilder.append("L");
                    tenValue = tenValue - L;
                }
                int xNum = tenValue / X;
                for (int i = 0; i < xNum; i++) {
                    romanStrBuilder.append("X");
                }
            }
        }
        if (oneValue != 0) {
            if (integerStringHashMap.containsKey(oneValue)) {
                romanStrBuilder.append(integerStringHashMap.get(oneValue));
            } else {
                int vNum = oneValue / V;
                for (int i = 0; i < vNum; i++) {
                    romanStrBuilder.append("V");
                }
                int iNum = (oneValue - vNum * V);
                for (int i = 0; i < iNum; i++) {
                    romanStrBuilder.append("I");
                }
            }
        }

        return romanStrBuilder.toString();
    }


}
