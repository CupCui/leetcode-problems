package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindRightIntervalTest {

    /**
     * 输入：intervals = [[1,2]]
     * 输出：[-1]
     */
    @Test
    public void test_PositiveCase0() {
        FindRightInterval service = new FindRightInterval();
        int[][] arg1 = {{1, 2}};
        int[] expected = {-1};
        int[] response = service.findRightInterval(arg1);

        Assert.assertArrayEquals(expected, response);
    }
}