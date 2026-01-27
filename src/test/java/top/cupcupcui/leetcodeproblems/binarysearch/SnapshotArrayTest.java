package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class SnapshotArrayTest {

    /**
     * SnapshotArray snapshotArr = new SnapshotArray(3); // 初始化一个长度为 3 的快照数组
     * snapshotArr.set(0,5);  // 令 array[0] = 5
     * snapshotArr.snap();  // 获取快照，返回 snap_id = 0
     * snapshotArr.set(0,6);
     * snapshotArr.get(0,0);  // 获取 snap_id = 0 的快照中 array[0] 的值，返回 5
     */
    @Test
    public void test_PositiveCase0() {
        SnapshotArray snapshotArr = new SnapshotArray(3);
        snapshotArr.set(0, 5);
        int response1 = snapshotArr.snap();
        snapshotArr.set(0, 6);
        int response2 = snapshotArr.get(0, 0);

        Assert.assertEquals(0, response1);
        Assert.assertEquals(5, response2);
    }

    @Test
    public void test_PositiveCase1() {
        SnapshotArray snapshotArr = new SnapshotArray(3);
        snapshotArr.set(0, 5);
        int response1 = snapshotArr.snap();
        snapshotArr.set(0, 6);
        int response2 = snapshotArr.snap();
        int response3 = snapshotArr.get(0, 0);
        int response4 = snapshotArr.get(0, 1);

        Assert.assertEquals(0, response1);
        Assert.assertEquals(1, response2);
        Assert.assertEquals(5, response3);
        Assert.assertEquals(6, response4);
    }

    @Test
    public void test_PositiveCase2() {
        SnapshotArray snapshotArr = new SnapshotArray(3);
        snapshotArr.set(0, 5);
        int response1 = snapshotArr.snap();
        snapshotArr.set(0, 6);
        int response2 = snapshotArr.snap();
        int response3 = snapshotArr.get(0, 1);

        Assert.assertEquals(0, response1);
        Assert.assertEquals(1, response2);
        Assert.assertEquals(6, response3);
    }

    @Test
    public void test_PositiveCase3() {
        SnapshotArray snapshotArr = new SnapshotArray(3);
        snapshotArr.set(0, 5);
        int response1 = snapshotArr.snap();
        snapshotArr.set(0, 6);
        int response2 = snapshotArr.get(0, 2);

        Assert.assertEquals(0, response1);
        Assert.assertEquals(0, response2);
    }

    /**
     * ["SnapshotArray","set","set","set","snap","get","snap"]
     * [[1],[0,4],[0,16],[0,13],[],[0,0],[]]
     * 输出
     * [null,null,null,null,0,4,1]
     * 预期结果
     * [null,null,null,null,0,13,1]
     */
    @Test
    public void test_PositiveCase4() {
        SnapshotArray snapshotArr = new SnapshotArray(1);
        snapshotArr.set(0, 4);
        snapshotArr.set(0, 16);
        snapshotArr.set(0, 13);
        int response1 = snapshotArr.snap();
        int response2 = snapshotArr.get(0, 0);
        int response3 = snapshotArr.snap();

        Assert.assertEquals(0, response1);
        Assert.assertEquals(13, response2);
        Assert.assertEquals(1, response3);
    }

    /**
     * 输入
     * ["SnapshotArray","snap","snap","get","set","snap","set"]
     * [[4],[],[],[3,1],[2,4],[],[1,4]]
     * 输出
     * [null,0,1,-1,null,2,null]
     * 预期结果
     * [null,0,1,0,null,2,null]
     */
    @Test
    public void test_PositiveCase5() {
        SnapshotArray snapshotArr = new SnapshotArray(4);
        int response1 = snapshotArr.snap();
        int response2 = snapshotArr.snap();
        int response3 = snapshotArr.get(3, 1);
        snapshotArr.set(2, 4);
        int response4 = snapshotArr.snap();
        snapshotArr.set(1, 4);

        Assert.assertEquals(0, response1);
        Assert.assertEquals(1, response2);
        Assert.assertEquals(0, response3);
        Assert.assertEquals(2, response4);
    }

    /**
     * 输入
     * ["SnapshotArray","set","snap","snap","snap","get","snap","snap","get"]
     * [[1],[0,15],[],[],[],[0,2],[],[],[0,0]]
     * <p>
     * 添加到测试用例
     * 输出
     * [null,null,0,1,2,-1,3,4,15]
     * 预期结果
     * [null,null,0,1,2,15,3,4,15]
     */
    @Test
    public void test_PositiveCase6() {
        SnapshotArray snapshotArr = new SnapshotArray(1);
        snapshotArr.set(0, 15);
        int response1 = snapshotArr.snap();
        int response2 = snapshotArr.snap();
        int response3 = snapshotArr.snap();
        int response4 = snapshotArr.get(0, 2);
        int response5 = snapshotArr.snap();
        int response6 = snapshotArr.snap();
        int response7 = snapshotArr.get(0, 0);

        Assert.assertEquals(0, response1);
        Assert.assertEquals(1, response2);
        Assert.assertEquals(2, response3);
        Assert.assertEquals(15, response4);
        Assert.assertEquals(3, response5);
        Assert.assertEquals(4, response6);
        Assert.assertEquals(15, response7);
    }

    /**
     * 输入
     * ["SnapshotArray","snap","get","get","set","get","set","get","set"]
     * [[2],[],[1,0],[0,0],[1,8],[1,0],[0,20],[0,0],[0,7]]
     * <p>
     * 输出
     * [null,0,0,0,null,-1,null,-1,null]
     * 预期结果
     * [null,0,0,0,null,0,null,0,null]
     */
    @Test
    public void test_PositiveCase7() {
        SnapshotArray snapshotArr = new SnapshotArray(2);
        int response1 = snapshotArr.snap();
        int response2 = snapshotArr.get(1, 0);
        int response3 = snapshotArr.get(0, 0);
        snapshotArr.set(1, 8);
        int response4 = snapshotArr.get(1, 0);
        snapshotArr.set(0, 20);
        int response5 = snapshotArr.get(0, 0);
        snapshotArr.set(0, 7);

        Assert.assertEquals(0, response1);
        Assert.assertEquals(0, response2);
        Assert.assertEquals(0, response3);
        Assert.assertEquals(0, response4);
        Assert.assertEquals(0, response5);
    }

    /**
     * ["SnapshotArray","snap","snap","set","snap","get","set","get","snap","get"]
     * [[1],[],[],[0,4],[],[0,1],[0,12],[0,1],[],[0,3]]
     */
    @Test
    public void test_PositiveCase8() {
        SnapshotArray snapshotArr = new SnapshotArray(1);
        int response1 = snapshotArr.snap();
        int response2 = snapshotArr.snap();
        snapshotArr.set(0, 4);
        int response3 = snapshotArr.snap();
        int response4 = snapshotArr.get(0, 1);
        snapshotArr.set(0, 12);
        int response5 = snapshotArr.get(0, 1);
        int response6 = snapshotArr.snap();
        int response7 = snapshotArr.get(0, 3);
    }

    /**
     * 输入
     * ["SnapshotArray","set","snap","set","snap","snap","set","snap","get","snap","snap","set","snap","get","set","snap","set","set"]
     * [[2],[0,8],[],[0,9],[],[],[0,11],[],[1,1],[],[],[0,1],[],[0,1],[0,0],[],[0,3],[1,13]]
     * <p>
     * 添加到测试用例
     * 输出
     * [null,null,0,null,1,2,null,3,0,4,5,null,6,8,null,7,null,null]
     * 预期结果
     * [null,null,0,null,1,2,null,3,0,4,5,null,6,9,null,7,null,null]
     */
    @Test
    public void test_PositiveCase9() {
        SnapshotArray snapshotArr = new SnapshotArray(2);
        snapshotArr.set(0, 8);
        int response1 = snapshotArr.snap();
        snapshotArr.set(0, 9);
        int response2 = snapshotArr.snap();
        int response3 = snapshotArr.snap();
        snapshotArr.set(0, 11);
        int response4 = snapshotArr.snap();
        int response5 = snapshotArr.get(1, 1);
        int response6 = snapshotArr.snap();
        int response7 = snapshotArr.snap();
        snapshotArr.set(0, 1);
        int response8 = snapshotArr.snap();
        int response9 = snapshotArr.get(0, 1);
        snapshotArr.set(0, 0);
        int response10 = snapshotArr.snap();
        snapshotArr.set(0, 3);
        snapshotArr.set(1, 13);

        Assert.assertEquals(0, response1);
        Assert.assertEquals(1, response2);
        Assert.assertEquals(2, response3);
        Assert.assertEquals(3, response4);
        Assert.assertEquals(0, response5);
        Assert.assertEquals(4, response6);
        Assert.assertEquals(5, response7);
        Assert.assertEquals(6, response8);
        Assert.assertEquals(9, response9);
        Assert.assertEquals(7, response10);
    }

}