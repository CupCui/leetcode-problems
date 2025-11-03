package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TextJustificationTest {

    /**
     * 输入: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
     * 输出:
     * [
     * "This    is    an",
     * "example  of text",
     * "justification.  "
     * ]
     */
    @Test
    public void test_PositiveCase0() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"This", "is", "an", "example", "of", "text", "justification."};
        int arg2 = 16;
        List<String> expected = Arrays.asList("This    is    an",
                "example  of text",
                "justification.  ");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入:words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
     * 输出:
     * [
     * "What   must   be",
     * "acknowledgment  ",
     * "shall be        "
     * ]
     */
    @Test
    public void test_PositiveCase1() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int arg2 = 16;
        List<String> expected = Arrays.asList("What   must   be",
                "acknowledgment  ",
                "shall be        ");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入:words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"]，maxWidth = 20
     * 输出:
     * [
     * "Science  is  what we",
     * "understand      well",
     * "enough to explain to",
     * "a  computer.  Art is",
     * "everything  else  we",
     * "do                  "
     * ]
     */
    @Test
    public void test_PositiveCase2() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int arg2 = 20;
        List<String> expected = Arrays.asList("Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  ");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入: words = ["aa", "bb", "cc", "dd"], maxWidth = 3
     * 输出:
     * [
     * "aa ",
     * "bb ",
     * "cc ",
     * "dd "
     * ]
     */
    @Test
    public void test_PositiveCase3() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"aa", "bb", "cc", "dd"};
        int arg2 = 3;
        List<String> expected = Arrays.asList("aa ",
                "bb ",
                "cc ",
                "dd ");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入: words = ["a", "b", "c", "d"], maxWidth = 2
     * 输出:
     * [
     * "ab",
     * "cd"
     * ]
     */
    @Test
    public void test_PositiveCase4() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"a", "b", "c", "d"};
        int arg2 = 2;
        List<String> expected = Arrays.asList("a ",
                "b ",
                "c ",
                "d ");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入: words = ["a", "b", "c", "d"], maxWidth = 3
     * 输出:
     * [
     * "abc",
     * "d  "
     * ]
     */
    @Test
    public void test_PositiveCase5() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"a", "b", "c", "d"};
        int arg2 = 3;
        List<String> expected = Arrays.asList("a b",
                "c d");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }


    /**
     * 输入: words = ["aa", "bb", "cc", "dd"], maxWidth = 1
     * 输出:
     * [
     * "a",
     * "b",
     * "c",
     * "d"
     * ]
     */
    @Test
    public void test_PositiveCase6() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"a", "b", "c", "d"};
        int arg2 = 1;
        List<String> expected = Arrays.asList("a",
                "b",
                "c",
                "d");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }

    /**
     * 输入: words = ["a"], maxWidth = 1
     * 输出:
     * [
     * "a"
     * ]
     */
    @Test
    public void test_PositiveCase7() {
        TextJustification service = new TextJustification();
        String[] arg1 = {"a"};
        int arg2 = 1;
        List<String> expected = Arrays.asList("a");
        List<String> response = service.fullJustify(arg1, arg2);

        Assert.assertArrayEquals(expected.toArray(), response.toArray());
    }


    /**
     * 官方题解
     * 链接：https://leetcode.cn/problems/text-justification/solutions/986756/wen-ben-zuo-you-dui-qi-by-leetcode-solut-dyeg/
     * <p>
     * 方法一：模拟
     * 根据题干描述的贪心算法，对于每一行，我们首先确定最多可以放置多少单词，这样可以得到该行的空格个数，从而确定该行单词之间的空格个数。
     * <p>
     * 根据题目中填充空格的细节，我们分以下三种情况讨论：
     * <p>
     * 当前行是最后一行：单词左对齐，且单词之间应只有一个空格，在行末填充剩余空格；
     * 当前行不是最后一行，且只有一个单词：该单词左对齐，在行末填充空格；
     * 当前行不是最后一行，且不只一个单词：设当前行单词数为 numWords，空格数为 numSpaces，我们需要将空格均匀分配在单词之间，则单词之间应至少有
     * avgSpaces=⌊
     * numWords−1
     * numSpaces
     * ​
     * ⌋
     * 个空格，对于多出来的
     * extraSpaces=numSpacesmod(numWords−1)
     * 个空格，应填在前 extraSpaces 个单词之间。因此，前 extraSpaces 个单词之间填充 avgSpaces+1 个空格，其余单词之间填充 avgSpaces 个空格。
     * <p>
     * 作者：力扣官方题解
     * 链接：https://leetcode.cn/problems/text-justification/solutions/986756/wen-ben-zuo-you-dui-qi-by-leetcode-solut-dyeg/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    class Solution {
        public List<String> fullJustify(String[] words, int maxWidth) {
            List<String> ans = new ArrayList<String>();
            int right = 0, n = words.length;
            while (true) {
                int left = right; // 当前行的第一个单词在 words 的位置
                int sumLen = 0; // 统计这一行单词长度之和
                // 循环确定当前行可以放多少单词，注意单词之间应至少有一个空格
                while (right < n && sumLen + words[right].length() + right - left <= maxWidth) {
                    sumLen += words[right++].length();
                }

                // 当前行是最后一行：单词左对齐，且单词之间应只有一个空格，在行末填充剩余空格
                if (right == n) {
                    StringBuffer sb = join(words, left, n, " ");
                    sb.append(blank(maxWidth - sb.length()));
                    ans.add(sb.toString());
                    return ans;
                }

                int numWords = right - left;
                int numSpaces = maxWidth - sumLen;

                // 当前行只有一个单词：该单词左对齐，在行末填充剩余空格
                if (numWords == 1) {
                    StringBuffer sb = new StringBuffer(words[left]);
                    sb.append(blank(numSpaces));
                    ans.add(sb.toString());
                    continue;
                }

                // 当前行不只一个单词
                int avgSpaces = numSpaces / (numWords - 1);
                int extraSpaces = numSpaces % (numWords - 1);
                StringBuffer sb = new StringBuffer();
                sb.append(join(words, left, left + extraSpaces + 1, blank(avgSpaces + 1))); // 拼接额外加一个空格的单词
                sb.append(blank(avgSpaces));
                sb.append(join(words, left + extraSpaces + 1, right, blank(avgSpaces))); // 拼接其余单词
                ans.add(sb.toString());
            }
        }

        // blank 返回长度为 n 的由空格组成的字符串
        public String blank(int n) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n; ++i) {
                sb.append(' ');
            }
            return sb.toString();
        }

        // join 返回用 sep 拼接 [left, right) 范围内的 words 组成的字符串
        public StringBuffer join(String[] words, int left, int right, String sep) {
            StringBuffer sb = new StringBuffer(words[left]);
            for (int i = left + 1; i < right; ++i) {
                sb.append(sep);
                sb.append(words[i]);
            }
            return sb;
        }
    }

}