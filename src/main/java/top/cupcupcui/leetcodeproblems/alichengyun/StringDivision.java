package top.cupcupcui.leetcodeproblems.alichengyun;

/**
 * 字符串整除
 *
 * @author cuiguanghao
 * @date 2026/3/23 16:13
 */
public class StringDivision {
    /**
     * ４、对于两个字符串s和t，
     * 我们说"t能整除s"当且仅当s = t + t + t + ... + t + t（即，t被自身连接一次或多次）。
     *
     * 给定两个字符串str1和str2，返回**最大**的字符串x，使得x既能整除str1也能整除str2。
     * 示例1:
     * 输入:str1="ABCABC"，str2="ABC"输出:"ABC"
     * 示例2:
     * 输入:Str1="ABABAB"，Str2 ="ABAB"输出:"AB"
     * 难度：中等
     *
     * 正例
     * 示例11:
     * 输入:Str1="AB AB"，Str2 ="AB"输出:"AB"
     * 示例11:
     * 输入:Str1="AA"，Str2 ="A"输出:"A"
     * 示例11:
     * 输入:Str1="AAAA"，Str2 ="AA"输出:"AA"
     * 示例12:
     * 输入:Str1="AB"，Str2 ="AB"输出:"AB"
     * 示例13:
     * 输入:Str1="ABAB ABAB"，Str2 ="ABAB"输出:"ABAB"
     * 示例13:
     * 输入:Str1="ABCD ABCD"，Str2 ="ABCD"输出:"ABCD"
     * 示例13:
     * 输入:Str1="ABCAB ABCAB"，Str2 ="ABCAB"输出:"ABCAB"
     *
     *
     * 反例
     * 反例21:
     * 输入:Str1="ABC"，Str2 ="AB"输出:""
     * 输入:Str1=""，Str2 ="AB"输出:""
     * 输入:Str1="AB"，Str2 =""输出:""
     * 输入:Str1=""，Str2 =""输出:""
     */

    /**
     * 思路：
     * 思路1：遍历 i in min(Str1,Str2)，Str1[i] 能整除 Str1 和 Str2
     * 思路2：定义基准指针 pivotIndex，遍历 min(Str1,Str2)，移动指针，比较Str1[pivotIndex] Str2[pivotIndex]，到结束
     * 思路1.1：如果匹配，再缩小范围；获取子串 subStr 的最小的整除数子串 subStr1，从n=0开始，比较 subStr1*n 是否可以整除 Str1 和 Str2
     * 思路3：
     * 思路2.1：遍历 Str1 的连续字符串，判断子串 split 的长度是否和 Str1.lenght / subStr1.lenght
     * 思路2.2：Str1 的最小的整除数子串 subStr1；Str1和Str2对subStr1的最大公共集
     * 思路4：Str1 所有整除数 t1；Str2 所有整除数 t2；t1和t2的最大的交集
     * 时间复杂度：O()
     * 空间复杂度：O()
     * 结果:
     * 优化建议：
     */
    public void stringDivision(String str1, String str2) {
        int minLen = Math.min(str1.length(), str2.length());

        // minLen = 3
        for (int i = minLen - 1; i > 0; i--) {
            // substring = ABC

        }

    }

}
