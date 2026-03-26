package top.cupcupcui.leetcodeproblems.alichengyun;

/**
 * String Divide
 *
 * @author cuiguanghao
 * @date 2026/3/24 08:13
 */
public class StringDivide {

    /**
     * ４、对于两个字符串s和t，我们说"t能整除s"当且仅当s = t + t + t + ... + t + t（即，t被自身连接一次或多次）。
     *
     * 给定两个字符串str1和str2，返回最大的字符串x，使得x既能整除str1也能整除str2。
     * 示例1:
     * 输入:str1="ABCABC"，str2="ABC"输出:"ABC"
     * 示例2:
     * 输入:Str1="ABABAB"，Str2 ="ABAB"输出:"AB"
     *
     * 示例:
     * 输入:Str1="ABC"，Str2 ="AB" 输出:""
     * 示例:
     * 输入:Str1=""，Str2 ="" 输出:""
     * 示例:
     * 输入:Str1=null，Str2 =null 输出:""
     *
     *
     * 示例:
     * 输入:Str1="  "，Str2 =" " 输出:" "
     * 示例:
     * 输入:Str1="A A "，Str2 ="A " 输出:"A "
     */

    /**
     * ４、对于两个字符串s和t，
     * 我们说"t能整除s"当且仅当s = t + t + t + ... + t + t（即，t被自身连接一次或多次）。
     * 给定两个字符串str1和str2，
     * 返回最大的字符串x，使得x既能整除str1也能整除str2。
     * str1 = n * t
     * str2 = m * t
     *
     * 方案一思路：
     * 1. 遍历 str1，从（0， min(str1.len, str2.len)）中取子串 subStr
     *
     * 方案一设计：
     * 1. 遍历 str1，从（0， min(str1.len, str2.len)）中取子串 subStr
     * 2. 如果 str1 % subStr.len == 0 && str2 % subStr.len == 0
     * 3. 如果 subStr 拼接 str1 / subStr.len 次的结果，等于 str1
     * 4. 如果 subStr 拼接 str2 / subStr.len 次的结果，等于 str2
     * 5. 如果 subLen 大于 maxSubLen，则 maxSubLen = subLen，maxSubStr = subStr
     */

}
