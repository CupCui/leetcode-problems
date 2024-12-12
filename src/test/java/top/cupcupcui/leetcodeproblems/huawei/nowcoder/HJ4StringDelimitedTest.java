package top.cupcupcui.leetcodeproblems.huawei.nowcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author garre
 */
public class HJ4StringDelimitedTest {

    /**
     * 正例
     */
    @Test
    public void stringDelimited_PositiveCase1() {
        HJ4StringDelimited hj4StringDelimited = new HJ4StringDelimited();
        String inputString = "abc";
        List<String> outputStringList = hj4StringDelimited.stringDelimited(inputString);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("abc00000");
        Assert.assertArrayEquals(expectedResult.toArray(), outputStringList.toArray());
    }

    /**
     * 正例
     */
    @Test
    public void stringDelimited_PositiveCase2() {
        HJ4StringDelimited hj4StringDelimited = new HJ4StringDelimited();
        String inputString = "abcabcab12345678abc";
        List<String> outputStringList = hj4StringDelimited.stringDelimited(inputString);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("abcabcab");
        expectedResult.add("12345678");
        expectedResult.add("abc00000");
        Assert.assertArrayEquals(expectedResult.toArray(), outputStringList.toArray());
    }


    /**
     * 正例
     */
    @Test
    public void stringDelimited_PositiveCase3() {
        HJ4StringDelimited hj4StringDelimited = new HJ4StringDelimited();
        String inputString = "abcabcab12345678";
        List<String> outputStringList = hj4StringDelimited.stringDelimited(inputString);
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("abcabcab");
        expectedResult.add("12345678");
        Assert.assertArrayEquals(expectedResult.toArray(), outputStringList.toArray());
    }

    /**
     * 正例
     */
    @Test
    public void stringDelimited_PositiveCase4() {
        HJ4StringDelimited hj4StringDelimited = new HJ4StringDelimited();
        String inputString = "";
        List<String> outputStringList = hj4StringDelimited.stringDelimited(inputString);
        List<String> expectedResult = new ArrayList<>();
        Assert.assertArrayEquals(expectedResult.toArray(), outputStringList.toArray());
    }


}