package top.cupcupcui.leetcodeproblems.topinterview150;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class InsertDeleteGetRandomO1Test {

    /**
     * 输入
     * ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
     * [[], [1], [2], [2], [], [1], [2], []]
     * 输出
     * [null, true, false, true, 2, true, false, 2]
     * <p>
     * 解释
     * RandomizedSet randomizedSet = new RandomizedSet();
     * randomizedSet.insert(1); // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
     * randomizedSet.remove(2); // 返回 false ，表示集合中不存在 2 。
     * randomizedSet.insert(2); // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
     * randomizedSet.getRandom(); // getRandom 应随机返回 1 或 2 。
     */
    @Test
    public void jumpGame_PositiveCase0() {
        InsertDeleteGetRandomO1.RandomizedSet obj = new InsertDeleteGetRandomO1.RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.remove(2);
        boolean param_3 = obj.insert(2);
        int param_4 = obj.getRandom();

        boolean expected1 = true;
        boolean expected2 = false;
        boolean expected3 = true;
        int expected4_1 = 1;
        int expected4_2 = 2;
        Assert.assertEquals(expected1, param_1);
        Assert.assertEquals(expected2, param_2);
        Assert.assertEquals(expected3, param_3);
        Assert.assertTrue(Objects.equals(expected4_1, param_4) || Objects.equals(expected4_2, param_4));

    }


    /**
     * leet 官方题解
     */
    class RandomizedSet {
        List<Integer> nums;
        Map<Integer, Integer> indices;
        Random random;

        public RandomizedSet() {
            nums = new ArrayList<Integer>();
            indices = new HashMap<Integer, Integer>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (indices.containsKey(val)) {
                return false;
            }
            int index = nums.size();
            nums.add(val);
            indices.put(val, index);
            return true;
        }

        public boolean remove(int val) {
            if (!indices.containsKey(val)) {
                return false;
            }
            int index = indices.get(val);
            int last = nums.get(nums.size() - 1);
            nums.set(index, last);
            indices.put(last, index);
            nums.remove(nums.size() - 1);
            indices.remove(val);
            return true;
        }

        public int getRandom() {
            int randomIndex = random.nextInt(nums.size());
            return nums.get(randomIndex);
        }
    }


}