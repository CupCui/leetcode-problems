package top.cupcupcui.leetcodeproblems.binarysearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeMapTest {

    @Test
    public void test_PositiveCase0() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);  // 存储键 "foo" 和值 "bar" ，时间戳 timestamp = 1
        String response1 = timeMap.get("foo", 1);// 返回 "bar"
        String response2 = timeMap.get("foo", 3);// 返回 "bar", 因为在时间戳 3 和时间戳 2 处没有对应 "foo" 的值，所以唯一的值位于时间戳 1 处（即 "bar"） 。
        timeMap.set("foo", "bar2", 4); // 存储键 "foo" 和值 "bar2" ，时间戳 timestamp = 4
        String response3 = timeMap.get("foo", 4);// 返回 "bar2"
        String response4 = timeMap.get("foo", 5);// 返回 "bar2"

        Assert.assertEquals("bar", response1);
        Assert.assertEquals("bar", response2);
        Assert.assertEquals("bar2", response3);
        Assert.assertEquals("bar2", response4);
    }

    @Test
    public void test_PositiveCase00() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        String response1 = timeMap.get("foo", 1);
        String response2 = timeMap.get("foo", 3);
        timeMap.set("foo", "bar2", 4);
        String response3 = timeMap.get("foo", 4);
        String response4 = timeMap.get("foo", 5);

        Assert.assertEquals("bar", response1);
        Assert.assertEquals("bar", response2);
        Assert.assertEquals("bar2", response3);
        Assert.assertEquals("bar2", response4);
    }

    @Test
    public void test_PositiveCase1() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        String response1 = timeMap.get("foo", 1);

        Assert.assertEquals("bar", response1);
    }

    @Test
    public void test_PositiveCase2() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        String response1 = timeMap.get("foo", 1);
        String response2 = timeMap.get("foo", 1);

        Assert.assertEquals("bar", response1);
        Assert.assertEquals("bar", response2);
    }

    @Test
    public void test_PositiveCase3() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        String response1 = timeMap.get("foo", 1);
        String response2 = timeMap.get("foo", 2);

        Assert.assertEquals("bar", response1);
        Assert.assertEquals("bar", response2);
    }

    @Test
    public void test_PositiveCase4() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        String response1 = timeMap.get("foo", 1);
        timeMap.set("foo", "bar2", 4);
        String response3 = timeMap.get("foo", 4);

        Assert.assertEquals("bar", response1);
        Assert.assertEquals("bar2", response3);
    }

    @Test
    public void test_PositiveCase5() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar1", 1);
        timeMap.set("foo", "bar", 1);
        String response1 = timeMap.get("foo", 1);
        timeMap.set("foo", "bar22", 4);
        timeMap.set("foo", "bar2", 4);
        String response3 = timeMap.get("foo", 4);

        Assert.assertEquals("bar", response1);
        Assert.assertEquals("bar2", response3);
    }

    @Test
    public void test_PositiveCase6() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        String response1 = timeMap.get("foofoo", 1);

        Assert.assertEquals("", response1);
    }

    /**
     * ["TimeMap","set","set","get","get","get","get","get"]
     * [[],["love","high",10],["love","low",20],["love",5],["love",10],["love",15],["love",20],["love",25]]
     * [null,null,null,"","high","high","low","low"]
     */
    @Test
    public void test_PositiveCase7() {
        TimeMap timeMap = new TimeMap();
        // [[], --- null
        // ["love","high",10], --- null
        timeMap.set("love", "high", 10);
        // ["love","low",20], --- null
        timeMap.set("love", "low", 20);
        // ["love",5], --- ""
        String response1 = timeMap.get("love", 5);
        // ["love",10], --- "high"
        String response2 = timeMap.get("love", 10);
        // ["love",15], --- "high"
        String response3 = timeMap.get("love", 15);
        // ["love",20], --- "low"
        String response4 = timeMap.get("love", 20);
        // ["love",25]] --- "low"
        String response5 = timeMap.get("love", 25);

        Assert.assertEquals("", response1);
        Assert.assertEquals("high", response2);
        Assert.assertEquals("high", response3);
        Assert.assertEquals("low", response4);
        Assert.assertEquals("low", response4);

    }

    @Test
    public void test_PositiveCase8() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar1", 1);
        timeMap.set("foo", "bar2", 2);
        String response1 = timeMap.get("foo", 1);
        timeMap.set("foo", "bar4", 4);
        timeMap.set("foo", "bar5", 5);
        String response3 = timeMap.get("foo", 4);

        Assert.assertEquals("bar1", response1);
        Assert.assertEquals("bar4", response3);
    }
}