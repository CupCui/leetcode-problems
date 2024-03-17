package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

/**
 * @author cuiguanghao
 */
public class ReplaceSpace {

    /**
     * 描述
     * 请实现一个函数，将一个字符串s中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */
    @Test
    public void replaceSpaceTest() {

        String str = "We Are Happy";
        String result = replaceSpace(str);
        System.out.println(result);

    }


    public String replaceSpace (String s) {
        // write code here
        char[] charArray = s.toCharArray();

        int newLen = charArray.length;
        for (char c : charArray) {
            if (' ' == c) {
                // 一个空格替换后占用三个字符
                newLen = newLen + 2;
            }
        }

        char[] newArray = new char[newLen];

        int j = 0;
        for (char c : charArray) {
            if (' ' != c) {
                newArray[j++] = c;
            } else {
                newArray[j++] = '%';
                newArray[j++] = '2';
                newArray[j++] = '0';
            }
        }

        return String.copyValueOf(newArray, 0, newLen);
    }

    public String replaceSpace2 (String s) {
        // write code here

        char[] charArray = s.toCharArray();

        String result = "";

        for (char c : charArray) {
            if (' ' != c) {
                result = result +  c;
            } else {
                result = result +  "%20";
            }
        }
        
        return result;
    }

    /**
     *
     * @param s string字符串
     * @return string字符串
     */
    public String replaceSpace1 (String s) {
        // write code here
        return s.replaceAll(" ", "%20");
    }

}
