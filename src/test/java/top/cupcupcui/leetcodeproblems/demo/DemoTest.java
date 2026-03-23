package top.cupcupcui.leetcodeproblems.demo;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {

    /**
     * 输入:
     * 输出:
     */
    @Test
    public void test_PositiveCase0() {
        Demo service = new Demo();
        int arg1 = -1;
        int expected = -1;
        int response = service.demo(arg1);

        Assert.assertEquals(expected, response);
    }

}