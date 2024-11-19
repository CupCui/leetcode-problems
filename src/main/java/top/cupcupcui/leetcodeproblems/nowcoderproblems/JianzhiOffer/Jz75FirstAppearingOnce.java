package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author garre
 */
public class Jz75FirstAppearingOnce {
    private List<Character> chars = new ArrayList<>();

    /**
     * 描述请实现一个函数用来找出字符流中第一个只出现一次的字符。
     * 例如，当从字符流中只读出前两个字符 "go" 时，第一个只出现一次的字符是 "g" 。
     * 当从该字符流中读出前六个字符 “google" 时，第一个只出现一次的字符是"l"。
     * <p>
     * 数据范围：字符串长度满足 1≤𝑛≤1000 1≤n≤1000  ，字符串中出现的字符一定在 ASCII 码内。
     * <p>
     * 进阶：空间复杂度 𝑂(𝑛) O(n)  ，时间复杂度 𝑂(𝑛) O(n)
     * <p>
     * 返回值描述：如果当前字符流没有存在出现一次的字符，返回#字符。
     * <p>
     * 示例1
     * 输入："google"
     * 返回值："ggg#ll"
     */
    @Test
    public void solution() {
        String caseOut = "";
        String caseIn = "google";

        for (int i = 0; i < caseIn.length(); i++) {
            Insert(caseIn.charAt(i));
            caseOut += FirstAppearingOnce();
            System.out.println(caseOut);
        }
        Deque<String> stringDeque = new ArrayDeque<>();



    }

    /**
     * Insert one char from stringstream
     *
     * @param ch
     */
    public void Insert(char ch) {

        // chars = [g, o, o]
        // firstAppearanceChars = [g, g, g]
        // 当 ch = g，遍历 chars
        // 1. g 不存在

        chars.add(ch);
    }

    /**
     * return the first appearance once char in current string stream
     *
     * @return
     */
    public char FirstAppearingOnce() {
        return chars.get(chars.size() - 1);
    }


}
