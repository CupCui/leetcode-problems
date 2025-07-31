package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertDeleteGetRandomO1Test {

    /**
     * 正例
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [2,3,1,1,4]
     * 输出: 2
     * 解释: 跳到最后一个位置的最小跳跃数是 2。
     * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
     */
    @Test
    public void jumpGame_PositiveCase0() {
        InsertDeleteGetRandomO1 insertDeleteGetRandomO1 = new InsertDeleteGetRandomO1();
        int[] nums = {2, 3, 1, 1, 4};
        int expected = 2;
        int response = insertDeleteGetRandomO1.insertDeleteGetRandomO1();
        Assert.assertEquals(expected, response);
    }

}