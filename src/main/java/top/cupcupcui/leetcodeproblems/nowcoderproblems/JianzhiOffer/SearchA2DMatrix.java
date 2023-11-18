package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

/**
 * @author cuiguanghao
 */
public class SearchA2DMatrix {

    /**
     * 描述
     * 在一个二维数组array中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * [
     * [1,2,8,9],
     * [2,4,9,12],
     * [4,7,10,13],
     * [6,8,11,15]
     * ]
     * 给定 target = 7，返回 true。
     * 给定 target = 3，返回 false。
     */
    @Test
    public void searchA2DMatrixTest() {
        int target = 7;
        //int[][] array = {{}};
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

        boolean isFind = Find(target, array);

        System.out.println("isFind: " + isFind);
    }

    /**
     * 思路：每一行使用二分查找法？？待完成
     * 时间复杂度：O(nm)
     * 空间复杂度: O(1)
     *
     * @param target int整型
     * @param array  int整型二维数组
     * @return bool布尔型
     */
    public boolean Find(int target, int[][] array) {
        if (array[0].length == 0) {
            return false;
        }
        boolean isFind = false;

        for (int i = 0; i < array.length; i++) {
            int maxColumn = array[0].length;


            for (int j = 0; j < maxColumn; j++) {
                // 遍历第i行第j列，如果大于 target 则进行下一步
                if (array[i][j] > target) {
                    // 缩小列区间，只在剩下的列中查找
                    maxColumn = j + 1;
                } else if (array[i][j] == target) {
                    isFind = true;
                    break;
                }
            }
        }

        return isFind;
    }

    /**
     * 思路：线性查找，先从左下角开始匹配
     * 时间复杂度：O(n + m)
     * 空间复杂度: O(1)
     *
     * @param target int整型
     * @param array  int整型二维数组
     * @return bool布尔型
     */
    public boolean Find2(int target, int[][] array) {
        if (array[0].length == 0) {
            return false;
        }

        boolean isFind = false;

        int maxRow = array.length;
        int maxColumn = array[0].length;
        for (int i = maxRow - 1, j = 0; i >= 0 && j <= maxColumn - 1; ) {
            if (array[i][j] == target) {
                // 匹配到
                isFind = true;
                break;
            } else if (array[i][j] < target) {
                // 先从左下角开始匹配
                // 向右搜索 j++
                j++;
            } else if (array[i][j] > target) {
                // 向上搜索 i--
                i--;
            }
        }

        return isFind;
    }

    /**
     * 思路：先遍历每一行判断大小，再遍历每一列判断大小
     * 时间复杂度：O(nm)
     * 空间复杂度: O(1)
     *
     * @param target int整型
     * @param array  int整型二维数组
     * @return bool布尔型
     */
    public boolean Find1(int target, int[][] array) {
        boolean isFind = false;

        for (int i = 0; i < array.length; i++) {
            int maxColumn = array[0].length;
            for (int j = 0; j < maxColumn; j++) {
                // 遍历第i行第j列，如果大于 target 则进行下一步
                if (array[i][j] > target) {
                    // 缩小列区间，只在剩下的列中查找
                    maxColumn = j + 1;
                } else if (array[i][j] == target) {
                    isFind = true;
                    break;
                }
            }
        }

        return isFind;
    }

}
