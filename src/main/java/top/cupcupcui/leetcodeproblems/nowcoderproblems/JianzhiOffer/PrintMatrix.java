package top.cupcupcui.leetcodeproblems.nowcoderproblems.JianzhiOffer;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author cuiguanghao
 */
public class PrintMatrix {

    /**
     * 描述
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵：
     */
    @Test
    public void printMatrixTest() {
        //int[][] matrix = new int[4][4];
        //int[][] matrix = {{1,2,3,4},{5,6,7,8}, {9,10,11,12},{13,14,15,16}};
        int[][] matrix = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}};
        //int[][] mÎatrix = {{}};

        System.out.println(printMatrix(matrix));

    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix[0].length == 0) {
            return new ArrayList<>();
        }
        // 循环遍历，判断边界
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int up = 0;
        // = 3
        int down = rowLength;
        int left = 0;
        // = 4
        int right = colLength;
        int totalNum = colLength * rowLength;
        ArrayList<Integer> arrayList = new ArrayList<>(totalNum);

        while (true) {
            for (int j = left; j < right; j++) {
                // [0,0] [0,1] [0,2] [0,3]
                arrayList.add(matrix[up][j]);
            }
            if (arrayList.size() == totalNum) {
                break;
            }
            // = 1
            up++;
            for (int i = up; i < down; i++) {
                // [1,3] [2,3]
                arrayList.add(matrix[i][right - 1]);
            }
            if (arrayList.size() == totalNum) {
                break;
            }
            // = 3
            right--;
            for (int j = right - 1; j >= left; j--) {
                // [3,2] [3,1] [3,0]
                arrayList.add(matrix[down - 1][j]);
            }
            if (arrayList.size() == totalNum) {
                break;
            }
            // = 3
            down--;
            for (int i = down - 1; i >= up; i--) {
                // [2,0] [1,0]
                arrayList.add(matrix[i][left]);
            }
            left++;
            if (arrayList.size() == totalNum) {
                break;
            }
        }

        return arrayList;
    }

    public ArrayList<Integer> printMatrix20240316(int [][] matrix) {

        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        ArrayList<Integer> resultArr = new ArrayList<>(rowLen * colLen);


        //[[1,2,3],
        //[5,6,7],
        //[9,10,11],
        //[9,10,11],
        //[13,14,15]]

        // currCol++，先遍历 1 2 3 4，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    3 2 1
        // currRow++，再遍历 8 12 16，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       5 4 3
        // currCol--，再遍历 15 14 13，判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1
        // currRow--，再遍历 9 5，判断 currRow > minRow（1），如果不大于 minRow，则遍历行           1 2
        // 循环
        // 终止条件：maxCol = minCol = maxRow = maxCol



        //[[1,2,3,4,9,9],
        //[5,6,7,8,9,9],
        //[9,10,11,12,9,9],
        //[13,14,15,16,9,9]]

        // currCol++，先遍历 1 2 3 4，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    6 5 4
        // currRow++，再遍历 8 12 16，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       4 3 2
        // currCol--，再遍历 15 14 13，判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1 2
        // currRow--，再遍历 9 5，判断 currRow > minRow（1），如果不大于 minRow，则遍历行           1 2
        // 循环
        // 终止条件：maxCol = minCol = maxRow = maxCol


        //[[1,2,3,4,9],
        //[5,6,7,8,9],
        //[9,10,11,12,9],
        //[13,14,15,16,9]]

        // currCol++，先遍历 1 2 3 4，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    5 4 3
        // currRow++，再遍历 8 12 16，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       4 3 2
        // currCol--，再遍历 15 14 13，判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1 2
        // currRow--，再遍历 9 5，判断 currRow > minRow（1），如果不大于 minRow，则遍历行           1 2
        // 循环
        // 终止条件：maxCol = minCol OR maxRow = maxCol


        //[[1,2,3,4],
        //[5,6,7,8],
        //[9,10,11,12],
        //[13,14,15,16]]

        // currCol++，先遍历 1 2 3 4，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    4 3 2
        // currRow++，再遍历 8 12 16，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       4 3 2
        // currCol--，再遍历 15 14 13，判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1 2
        // currRow--，再遍历 9 5，判断 currRow > minRow（1），如果不大于 minRow，则遍历行           1 2
        // 循环
        // 终止条件：maxCol = minCol = maxRow = maxCol

        int maxCol = colLen - 1;
        int maxRow = rowLen - 1;
        int minCol = 0;
        int minRow = 0;
        int currRow = 0;
        int currCol = 0;

        boolean findFlag = false;
        while (!findFlag) {
            // currCol=0，先遍历 1 2 3 4，currCol++，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    4 3 2
            //minCol(0) =< currCol(0) && currCol < maxCol(3)
            for (; minCol <= currCol && currCol <= maxCol; currCol++) {
                resultArr.add(matrix[currRow][currCol]);
            }
            minRow++;
            currRow++;
            currCol--;
            // currRow=0,再遍历 8 12 16，currRow++，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       4 3 2
            //minRow(1) <= currRow(1) && currRow < maxRow(3)
            for (; minRow <= currRow && currRow <= maxRow; currRow++) {
                resultArr.add(matrix[currRow][currCol]);
            }
            maxCol--;
            currCol--;
            currRow--;
            // currCol=4，再遍历 15 14 13，currCol--,判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1 2
            // minCol(0) <= currCol(3) && currCol < maxCol(3)
            for (; minCol <= currCol && currCol <= maxCol; currCol--) {
                resultArr.add(matrix[currRow][currCol]);
            }
            maxRow--;
            currCol++;
            // currRow=4,再遍历 9 5，currRow++，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       4 3 2
            for (; minRow <= currRow && currRow < maxRow; currRow++) {
                resultArr.add(matrix[currRow][currCol]);
            }
            currCol++;
            minCol++;
            currRow--;
            if (minRow >= maxRow || minCol >= maxCol) {
                findFlag = true;
            }
        }

        return resultArr;
    }

    public ArrayList<Integer> printMatrix01(int [][] matrix) {

        int colLen = matrix.length;
        int rowLen = matrix[0].length;
        ArrayList<Integer> resultArr = new ArrayList<>(rowLen * colLen);


        //[[1,2,3],
        //[5,6,7],
        //[9,10,11],
        //[9,10,11],
        //[13,14,15]]

        // currCol++，先遍历 1 2 3 4，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    3 2 1
        // currRow++，再遍历 8 12 16，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       5 4 3
        // currCol--，再遍历 15 14 13，判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1
        // currRow--，再遍历 9 5，判断 currRow > minRow（1），如果不大于 minRow，则遍历行           1 2
        // 循环
        // 终止条件：maxCol = minCol = maxRow = maxCol



        //[[1,2,3,4,9,9],
        //[5,6,7,8,9,9],
        //[9,10,11,12,9,9],
        //[13,14,15,16,9,9]]

        // currCol++，先遍历 1 2 3 4，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    6 5 4
        // currRow++，再遍历 8 12 16，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       4 3 2
        // currCol--，再遍历 15 14 13，判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1 2
        // currRow--，再遍历 9 5，判断 currRow > minRow（1），如果不大于 minRow，则遍历行           1 2
        // 循环
        // 终止条件：maxCol = minCol = maxRow = maxCol


        //[[1,2,3,4,9],
        //[5,6,7,8,9],
        //[9,10,11,12,9],
        //[13,14,15,16,9]]

        // currCol++，先遍历 1 2 3 4，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    5 4 3
        // currRow++，再遍历 8 12 16，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       4 3 2
        // currCol--，再遍历 15 14 13，判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1 2
        // currRow--，再遍历 9 5，判断 currRow > minRow（1），如果不大于 minRow，则遍历行           1 2
        // 循环
        // 终止条件：maxCol = minCol OR maxRow = maxCol


        //[[1,2,3,4],
        //[5,6,7,8],
        //[9,10,11,12],
        //[13,14,15,16]]

        // currCol++，先遍历 1 2 3 4，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    4 3 2
        // currRow++，再遍历 8 12 16，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       4 3 2
        // currCol--，再遍历 15 14 13，判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1 2
        // currRow--，再遍历 9 5，判断 currRow > minRow（1），如果不大于 minRow，则遍历行           1 2
        // 循环
        // 终止条件：maxCol = minCol = maxRow = maxCol

        int maxCol = colLen;
        int maxRow = rowLen;
        int minCol = 0;
        int minRow = 1;

        for (int currRow = 0; currRow < rowLen; currRow++) {
            // currCol++，先遍历 1 2 3 4，判断是否 currCol < maxCol（4），如果不小于 maxCol，则遍历列    4 3 2
            int currCol = 0;
            for (; currCol < colLen; currCol++) {
                if (currCol < maxCol) {
                    resultArr.add(matrix[currRow][currCol]);
                }
            }
            currRow = 0;
            // currRow++，再遍历 8 12 16，判断 currRow < maxRow（4），如果不小于 maxRow，则遍历行       4 3 2
            for (; currRow < maxRow; currRow++) {
                if (currRow < maxRow) {
                    resultArr.add(matrix[currRow][currCol]);
                }
            }

            // currCol--，再遍历 15 14 13，判断是否 currCol > minCol（0），如果不大于 minCol，则遍历列   0 1 2
            for (; currCol < colLen && currCol > 0; currCol--) {
                if (currCol < minCol) {
                    resultArr.add(matrix[currRow][currCol]);
                }
            }
        }

        return resultArr;
    }

}
