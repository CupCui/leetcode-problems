package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ZigzagConversionTest {

    /**
     * 输入：s = "PAYPALISHIRING", numRows = 3
     * 输出："PAHNAPLSIIGYIR"
     */
    @Test
    public void test_PositiveCase0() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String nums = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        String response = zigzagConversion.convert(nums, numRows);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     */
    @Test
    public void test_PositiveCase1() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String nums = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        String response = zigzagConversion.convert(nums, numRows);
        Assert.assertEquals(expected, response);
    }

    /**
     * 输入：s = "A", numRows = 1
     * 输出："A"
     */
    @Test
    public void test_PositiveCase2() {
        ZigzagConversion zigzagConversion = new ZigzagConversion();
        String nums = "A";
        int numRows = 1;
        String expected = "A";
        String response = zigzagConversion.convert(nums, numRows);
        Assert.assertEquals(expected, response);
    }

    /**
     * 方法一：利用二维矩阵模拟
     * 设 n 为字符串 s 的长度，r=numRows。对于 r=1（只有一行）或者 r≥n（只有一列）的情况，答案与 s 相同，我们可以直接返回 s。
     * 对于其余情况，考虑创建一个二维矩阵，然后在矩阵上按 Z 字形填写字符串 s，最后逐行扫描矩阵中的非空字符，组成答案。
     *
     * 根据题意，当我们在矩阵上填写字符时，会向下填写 r 个字符，然后向右上继续填写 r−2 个字符，
     * 最后回到第一行，因此 Z 字形变换的周期 t=r+r−2=2r−2，每个周期会占用矩阵上的 1+r−2=r−1 列。
     *
     * 因此我们有 ⌈
     * t
     * n
     * ​
     *  ⌉ 个周期（最后一个周期视作完整周期），乘上每个周期的列数，得到矩阵的列数 c=⌈
     * t
     * n
     * ​
     *  ⌉⋅(r−1)。
     *
     * 创建一个 r 行 c 列的矩阵，然后遍历字符串 s 并按 Z 字形填写。具体来说，设当前填写的位置为 (x,y)，即矩阵的 x 行 y 列。初始 (x,y)=(0,0)，即矩阵左上角。若当前字符下标 i 满足 imodt<r−1，则向下移动，否则向右上移动。
     *
     * 填写完成后，逐行扫描矩阵中的非空字符，组成答案。
     *
     */


    /**
     * 方法三：直接构造
     * 我们来研究方法一中矩阵的每个非空字符会对应到 s 的哪个下标（记作 idx），从而直接构造出答案。
     * 由于 Z 字形变换的周期为 t=2r−2，因此对于矩阵第一行的非空字符，其对应的 idx 均为 t 的倍数，即 idx≡0(modt)；同理，对于矩阵最后一行的非空字符，应满足 idx≡r−1(modt)。
     * 对于矩阵的其余行（行号设为 i），每个周期内有两个字符，第一个字符满足 idx≡i(modt)，第二个字符满足 idx≡t−i(modt)。
     *
     */
    /**
     * 0             0+t                    0+2t                     0+3t
     * 1      t-1    1+t            0+2t-1  1+2t            0+3t-1   1+3t
     * 2  t-2        2+t  0+2t-2            2+2t  0+3t-2             2+3t
     * 3             3+t                    3+2t                     3+3t
     * <p>
     * [1,  5,  9,    13]
     * [2,4,6,8,10,12,14]
     * [3,  7,  11,     ]
     * t = 2*3 - 2 = 4
     */
    public String convert(String s, int numRows) {
        int n = s.length();
        int r = numRows;
        if (r == 1 || r >= n) {
            return s;
        }
        int t = r * 2 - 2;
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < r; i++) { // 枚举矩阵的行
            for (int j = 0; j < n - i; j += t) { // 枚举每个周期的起始下标
                ans.add(String.valueOf(s.charAt(j + i))); // 当前周期的第一个字符
                if (0 < i && i < r - 1 && j + t - i < n) {
                    ans.add(String.valueOf(s.charAt(j + t - i))); // 当前周期的第二个字符
                }
            }
        }
        return null;
    }

}