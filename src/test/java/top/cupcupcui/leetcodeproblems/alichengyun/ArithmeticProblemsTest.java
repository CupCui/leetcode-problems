package top.cupcupcui.leetcodeproblems.alichengyun;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ArithmeticProblemsTest {

    /**
     * 示例 1：
     * 输入：s = "()"
     * 输出：true
     */
    @Test
    public void test_PositiveCase0() {
        ArithmeticProblems service = new ArithmeticProblems();
        Set<ArithmeticProblems.Node> responseList = service.arithmeticProblems();
        for (ArithmeticProblems.Node node : responseList) {
            int left = node.getLeft();
            int right = node.getRight();
            int addResult = left + right;
            System.out.println(left + " + " + right + " = " + addResult);

            // 加数不能为0
            Assert.assertTrue(right > 0);
            // 加法题和不超过100
            Assert.assertTrue(addResult <= 100);
        }
        assertEquals(100, responseList.size());
    }

    @Test
    public void codeBuddyTest() {
        // 直接生成所有有效组合，然后随机选择100个
        List<int[]> allPairs = new ArrayList<>();
        for (int left = 0; left <= 99; left++) {
            for (int right = 1; right <= 100 - left; right++) {
                allPairs.add(new int[]{left, right});
            }
        }
        Collections.shuffle(allPairs);
        Set<int[]> collect = allPairs.stream().limit(100).collect(Collectors.toSet());
    }

    @Test
    public void cursorTest() {
        List<ArithmeticProblems.Node> all = new ArrayList<>();
        for (int left = 0; left <= 99; left++) {
            for (int right = 1; right <= 100 - left; right++) { // right != 0, left+right <= 100
                all.add(new ArithmeticProblems.Node(left, right));
            }
        }
        Collections.shuffle(all);
        HashSet<ArithmeticProblems.Node> nodes = new HashSet<>(all.subList(0, 100));
    }
}