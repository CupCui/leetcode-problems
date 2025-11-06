package top.cupcupcui.leetcodeproblems.topinterview150;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cuiguanghao
 * @date 2025/10/31 17:11
 * @description 68. 文本左右对齐
 */
public class TextJustification {

    /**
     * https://leetcode.cn/problems/text-justification/description/?envType=study-plan-v2&envId=top-interview-150
     *
     * 68. 文本左右对齐
     * 困难
     * 给定一个单词数组 words 和一个长度 maxWidth ，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
     * 你应该使用 “贪心算法” 来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
     * 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
     * 文本的最后一行应为左对齐，且单词之间不插入额外的空格。
     *
     * 注意:
     * 单词是指由非空格字符组成的字符序列。
     * 每个单词的长度大于 0，小于等于 maxWidth。
     * 输入单词数组 words 至少包含一个单词。
     *
     *
     * 示例 1:
     * 输入: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
     * 输出:
     * [
     *    "This    is    an",
     *    "example  of text",
     *    "justification.  "
     * ]
     * 示例 2:
     * 输入:words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
     * 输出:
     * [
     *   "What   must   be",
     *   "acknowledgment  ",
     *   "shall be        "
     * ]
     * 解释: 注意最后一行的格式应为 "shall be    " 而不是 "shall     be",
     *      因为最后一行应为左对齐，而不是左右两端对齐。
     *      第二行同样为左对齐，这是因为这行只包含一个单词。
     * 示例 3:
     * 输入:words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"]，maxWidth = 20
     * 输出:
     * [
     *   "Science  is  what we",
     *   "understand      well",
     *   "enough to explain to",
     *   "a  computer.  Art is",
     *   "everything  else  we",
     *   "do                  "
     * ]
     *
     * 提示:
     * 1 <= words.length <= 300
     * 1 <= words[i].length <= 20
     * words[i] 由小写英文字母和符号组成
     * 1 <= maxWidth <= 100
     * words[i].length <= maxWidth
     *
     * 相关标签
     * 数组 字符串 模拟
     */

    /**
     *
     * 思路：模拟
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
     * @param words
     * @param maxWidth
     * @return
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        /**
         *
         * 输入: words = ["aa", "bb", "cc", "dd"], maxWidth = 3
         * 输出:
         * [
         *    "aa ",
         *    "bb ",
         *    "cc "
         *    "dd "
         * ]
         *
         * 输入: words = ["a", "b", "c", "d"], maxWidth = 2
         * 输出:
         * [
         *    "ab",
         *    "cd"
         * ]
         * 输入: words = ["a", "b", "c", "d"], maxWidth = 3
         * 输出:
         * [
         *    "abc",
         *    "d  "
         * ]
         * 输入: words = ["a", "b", "c", "d"], maxWidth = 4
         * 输出:
         * [
         *    "abcd",
         * ]
         * 输入: words = ["a", "b", "c", "d"], maxWidth = 5
         * 输出:
         * [
         *    "abcd ",
         * ]
         *
         * 1.遍历 words，根据 maxWidth 计算每行的单词数
         * 2.除最后一行外，左右两端对齐，计算每行单词数间空格的个数
         * 3.最后一行左对齐
         *
         * 给定一个单词数组 words 和一个长度 maxWidth ，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
         * 你应该使用 “贪心算法” 来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
         * 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
         * 文本的最后一行应为左对齐，且单词之间不插入额外的空格。
         *
         */

        // 每行的单词集合
        List<String> rowWordList = new ArrayList<>();

        // 当前行
        String currRow = words[0];

        if (words.length == 1) {
            // 只有一个单词，则添加到结果中
            rowWordList.add(currRow);
        } else {
            // 遍历 words
            for (int i = 1; i < words.length; i++) {
                // 处理第二个及以后的单词
                if ((currRow + " " + words[i]).length() <= maxWidth) {
                    // 每行总单词数不超过 maxWidth
                    currRow = currRow + " " + words[i];
                    if (i == words.length - 1) {
                        // 最后一个单词，则添加到结果中
                        rowWordList.add(currRow);
                    }
                } else {
                    // 每行总单词数超过 maxWidth，添加到结果中
                    rowWordList.add(currRow);
                    currRow = words[i];
                    if (i == words.length - 1) {
                        // 最后一个单词，则添加到结果中
                        rowWordList.add(currRow);
                    }
                }

            }
        }
        System.out.println(rowWordList);

        List<String> resultRowWord = new ArrayList<>();
        // 对结果格式化
        // 遍历每一行单词
        for (int rowIndex = 0; rowIndex < rowWordList.size(); rowIndex++) {
            String currRowWord = "";
            if (rowIndex == rowWordList.size() - 1) {
                // 最后一行左对齐
                currRowWord = rowWordList.get(rowIndex);

                int rowWordLength = currRowWord.length();
                int spaceTotal = maxWidth - rowWordLength;

                for (int i = 0; i < spaceTotal; i++) {
                    currRowWord += " ";
                }

                resultRowWord.add(currRowWord);
                continue;
            }

            // 非最后一行左右两端对齐
            String[] currRowWords = rowWordList.get(rowIndex).split(" ");
            int rowWordLength = 0;
            for (String word : currRowWords) {
                rowWordLength += word.length();
            }
            int spaceTotal = maxWidth - rowWordLength;

            int spaceCount = 0;
            int spaceLeft = 0;
            if (currRowWords.length == 1) {
                // 本行只有一个单词
                spaceCount = maxWidth - currRowWords[0].length();
                spaceLeft = 0;
            } else {
                spaceCount = spaceTotal / (currRowWords.length - 1);
                spaceLeft = spaceTotal % (currRowWords.length - 1);
            }

            for (int wordIndex = 0; wordIndex < currRowWords.length; wordIndex++) {
                String spaceWord = "";
                for (int i = 0; i < spaceCount; i++) {
                    spaceWord += " ";
                }
                if (wordIndex < spaceLeft) {
                    spaceWord += " ";
                }

                if (wordIndex != currRowWords.length - 1) {
                    // 非本行的最后一个单词
                    currRowWord = currRowWord + currRowWords[wordIndex] + spaceWord;
                } else {
                    if (currRowWords.length == 1) {
                        // 本行只有一个单词
                        currRowWord = currRowWord + currRowWords[wordIndex] + spaceWord;
                    } else {
                        // 本行的最后一个单词
                        currRowWord = currRowWord + currRowWords[wordIndex];
                    }
                }
            }
            resultRowWord.add(currRowWord);

        }

        return resultRowWord;
    }

}
