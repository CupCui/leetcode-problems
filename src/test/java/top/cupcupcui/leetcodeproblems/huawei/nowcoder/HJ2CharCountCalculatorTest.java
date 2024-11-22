package top.cupcupcui.leetcodeproblems.huawei.nowcoder;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author garre
 */
public class HJ2CharCountCalculatorTest {

    /**
     * 正例
     */
    @Test
    public void charCountCalculator_PositiveCase1() {
        HJ2CharCountCalculator hj2CharCountCalculator = new HJ2CharCountCalculator();

        String inputString = "ABCabc";
        //String inputString = "Abc Hello";
        //String inputString = "Abc Hello";
        //String inputString = "B";
        String inputChar = "A";

        int charCountCalculator = hj2CharCountCalculator.charCountCalculator(inputString, inputChar);
        System.out.println("charCountCalculator: " + charCountCalculator);
        Assert.assertEquals(2, charCountCalculator);
    }

    /**
     * 正例
     */
    @Test
    public void charCountCalculator_PositiveCase2() {
        HJ2CharCountCalculator hj2CharCountCalculator = new HJ2CharCountCalculator();

        String inputString = "Abc Hello";
        //String inputString = "Abc Hello";
        //String inputString = "B";
        String inputChar = "A";

        int charCountCalculator = hj2CharCountCalculator.charCountCalculator(inputString, inputChar);
        System.out.println("charCountCalculator: " + charCountCalculator);
        Assert.assertEquals(1, charCountCalculator);
    }

    /**
     * 正例
     */
    @Test
    public void charCountCalculator_PositiveCase3() {
        HJ2CharCountCalculator hj2CharCountCalculator = new HJ2CharCountCalculator();

        String inputString = "Abc Hello";
        //String inputString = "B";
        String inputChar = "A";

        int charCountCalculator = hj2CharCountCalculator.charCountCalculator(inputString, inputChar);
        System.out.println("charCountCalculator: " + charCountCalculator);
        Assert.assertEquals(1, charCountCalculator);
    }

    /**
     * 正例
     */
    @Test
    public void charCountCalculator_PositiveCase4() {
        HJ2CharCountCalculator hj2CharCountCalculator = new HJ2CharCountCalculator();

        String inputString = "B";
        String inputChar = "A";

        int charCountCalculator = hj2CharCountCalculator.charCountCalculator(inputString, inputChar);
        System.out.println("charCountCalculator: " + charCountCalculator);
        Assert.assertEquals(0, charCountCalculator);
    }
}