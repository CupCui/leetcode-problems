package top.cupcupcui.leetcodeproblems.topinterview150;

/**
 * @author cuiguanghao
 * @date 2025/9/9 18:29
 * @description 6. Z 字形变换
 */
public class ZigzagConversion {
    /**
     * https://leetcode.cn/problems/zigzag-conversion/description/?envType=study-plan-v2&envId=top-interview-150
     * ZigzagConversion
     * 6. Z 字形变换
     * 中等
     *
     * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
     * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
     *
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
     * 请你实现这个将字符串进行指定行数变换的函数：
     * string convert(string s, int numRows);
     *
     * 示例 1：
     * 输入：s = "PAYPALISHIRING", numRows = 3
     * 输出："PAHNAPLSIIGYIR"
     *
     * 示例 2：
     * 输入：s = "PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     * 解释：
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     *
     * 示例 3：
     * 输入：s = "A", numRows = 1
     * 输出："A"
     *
     * 提示：
     * 1 <= s.length <= 1000
     * s 由英文字母（小写和大写）、',' 和 '.' 组成
     * 1 <= numRows <= 1000
     *
     * 相关标签: 字符串
     */


    /**
     * 思路：三个数组，间隔填充数据
     * -[]
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
     * @param s
     * @return
     */
    public String convert(String s, int numRows) {

        /**
         * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
         * P   A   H   N
         * A P L S I I G
         * Y   I   R
         * [1,2,3,4,5,6,7,8,9,10,11,12,13,14]
         *
         * [1,  5,  9,    13]
         * [2,4,6,8,10,12,14]
         * [3,  7,  11,     ]
         * 1 + 4n
         * 2 + 2(n+1)
         * 2(n+1)
         *
         *
         * 输入：s = "PAYPALISHIRING", numRows = 4
         * 输出："PINALSIGYAHRPI"
         * 解释：
         * P     I    N
         * A   L S  I G
         * Y A   H R
         * P     I
         * [1,2,3,4,5,6,7,8,9,10,11,12,13,14]
         *
         * [1,    7,       13]
         * [2,  6,8,    12,14]
         * [3,5,  9, 11,     ]
         * [4,    10,        ]
         *
         */

        return null;

    }


}
