package top.cupcupcui.leetcodeproblems.newcoderproblems.JianzhiOffer;

import org.junit.Test;

/**
 * JZ3 数组中重复的数字
 * @author cuiguanghao
 */
public class FindRepeatDocument {

    /**
     * 描述
     * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
     * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是2或者3。
     * 存在不合法的输入的话输出-1
     * 示例1
     * 输入：[2,3,1,0,2,5,3]
     * 返回值：2
     * 说明：2或3都是对的
     */
    @Test
    public void findRepeatDocumentTest() {
        int[] numbers = new int[]{2, 3, 1, 0, 2, 5, 3};
        duplicate(numbers);
    }

    /**
     * 解题思路：将值为x的数据放到数组下标为x的位置，判断下标为x的位置是否有值
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     */
    public int duplicate(int[] numbers) {
        int result = -1;

        // 遍历数组，将值为x的数据放到数组下标为x的位置
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers[i]) {
                // i 位置上的数据和 numbers[i] 值不一致
                if (numbers[numbers[i]] != numbers[i]) {
                    // 将 numbers[i] 值放到 numbers[i] 位置上
                    int temp = numbers[numbers[i]];
                    numbers[numbers[i]] = numbers[i];
                    numbers[i] = temp;
                } else {
                    // 说明 numbers[i] 位置已经有值，即已经重复
                    result = numbers[i];
                    break;
                }
            }
        }

        return result;
    }


    /**
     * 解题思路：先排序，让后判断相邻元素是否相等
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int duplicate2(int[] numbers) {
        int result = -1;

        // 遍历数组，冒泡排序
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // 当前元素大于下一个元素，则交换位置
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[i+1]) {
                result = numbers[i];
                break;
            }
        }
        return result;
    }

    /**
     * 解题思路：通过使用两次循环来解决
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int duplicate1(int[] numbers) {
        int result = -1;

        // 遍历数组，每一个元素与剩余所有元素对比匹配是否相等
        for (int i = 0; i < numbers.length; i++) {
            int preNum = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                int postNum = numbers[j];
                if (postNum == preNum) {
                    // 有相等的元素
                    result = preNum;
                    break;
                }
            }
            if (result != -1) {
                break;
            }
        }

        return result;
    }
}
