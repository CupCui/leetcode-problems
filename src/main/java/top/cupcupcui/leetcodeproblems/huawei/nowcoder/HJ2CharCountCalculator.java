package top.cupcupcui.leetcodeproblems.huawei.nowcoder;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author garre
 */
public class HJ2CharCountCalculator {

    public static void main(String[] args) {

        String inputCharString = "ABCabc";
        //String inputString = "Abc Hello";
        //String inputString = "Abc Hello";
        //String inputString = "B";
        String inputCharLine = "A";
        Scanner in = new Scanner(System.in);
        inputCharString = in.nextLine();
        inputCharLine = in.nextLine();
        inputCharString = inputCharString.toLowerCase();
        char inputChar = inputCharLine.toLowerCase().charAt(0);
        HashMap<Character, Integer> charToCountMap = new HashMap<>();
        for (int i = 0; i < inputCharString.length(); i++) {
            char charInString = inputCharString.charAt(i);
            Integer sum = charToCountMap.get(charInString);
            if (sum != null) {
                charToCountMap.put(charInString, sum + 1);
            } else {
                charToCountMap.put(charInString, 1);
            }
        }
        System.out.println(charToCountMap.get(inputChar) == null ? 0 : charToCountMap.get(inputChar));
        return;
    }

    /**
     * 描述
     * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
     * 数据范围：1 ≤ n ≤ 1000
     * 输入描述：
     * 第一行输入一个由字母、数字和空格组成的字符串，第二行输入一个字符（保证该字符不为空格）。
     * 输出描述：
     * 输出输入字符串中含有该字符的个数。（不区分大小写字母）
     * 示例1
     * 输入：
     * ABCabc
     * A
     * 输出：
     * 2
     */
    //@Test
    public void charCountCalculatorTest() {
        String inputString = "ABCabc";
        //String inputString = "Abc Hello";
        //String inputString = "Abc Hello";
        //String inputString = "B";
        String inputChar = "A";

        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        inputChar = in.nextLine();
        int repeatNumber = charCountCalculator(inputString, inputChar);

        System.out.println("repeatNumber: " + repeatNumber);
    }

    /**
     * 思路: 遍历字符串中每一个字符，并放入 HashMap 中，key 为该字符，value 为该字符出现的次数。输出输入字符串中该字符出现的次数。
     * 知识点：字符串、哈希
     * 测试: 通过
     * result:
     * 时间复杂度: O(n)
     * 空间复杂度: O(k)
     * 优化建议：去除 HashMap
     * 空间优化：去除 HashMap
     *
     * @param inputString
     * @param inputCharString
     * @return
     */
    public int charCountCalculator(String inputString, String inputCharString) {
        inputString = inputString.toLowerCase();
        char inputChar = inputCharString.toLowerCase().charAt(0);
        HashMap<Character, Integer> charToCountMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            char charInString = inputString.charAt(i);
            Integer sum = charToCountMap.get(charInString);
            if (sum != null) {
                charToCountMap.put(charInString, sum + 1);
            } else {
                charToCountMap.put(charInString, 1);
            }
        }

        return charToCountMap.get(inputChar) == null ? 0 : charToCountMap.get(inputChar);
    }


}
