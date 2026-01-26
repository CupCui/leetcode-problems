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

    /**
     * SnapshotArray snapshotArr = new SnapshotArray(3); // 初始化一个长度为 3 的快照数组
     * snapshotArr.set(0,5);  // 令 array[0] = 5
     * snapshotArr.snap();  // 获取快照，返回 snap_id = 0
     * snapshotArr.set(0,6);
     * snapshotArr.get(0,0);  // 获取 snap_id = 0 的快照中 array[0] 的值，返回 5
     */
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

}