package top.cupcupcui.leetcodeproblems.huawei.nowcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author garre
 */
public class HJ4StringDelimited {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String originInputString = "";
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            originInputString = in.nextLine();
        }

        //stringDelimited(originInputString);


        String inputString = originInputString;
        int inputLength = originInputString.length();
        int lastUnappendCharLength = inputLength % 8;
        int neededAppendCharNum = 0;
        if (lastUnappendCharLength != 0) {
            neededAppendCharNum = 8 - lastUnappendCharLength;
        }

        int groupNum = inputLength / 8 + 1;

        List<String> outputStringList = new ArrayList<>();
        if (inputLength == 0) {
            // 不处理
        } else if (inputLength < 8) {
            for (int i = 0; i < neededAppendCharNum; i++) {
                inputString += "0";
            }
            outputStringList.add(inputString);
        } else if (inputLength == 8) {
            outputStringList.add(inputString);
        } else {
            for (int i = 0; i < groupNum - 1; i++) {
                String subOutputString = inputString.substring(i * 8, (i + 1) * 8);
                outputStringList.add(subOutputString);
            }
            if (neededAppendCharNum != 0) {
                String lastSubOutputString = inputString.substring((groupNum - 1) * 8);
                for (int i = 0; i < neededAppendCharNum; i++) {
                    lastSubOutputString += "0";
                }
                outputStringList.add(lastSubOutputString);
            }
        }

        for (String out : outputStringList) {
            System.out.println(out);
        }


    }

    /**
     * 描述
     */
    //@Test
    public void stringDelimitedTest() {
        String inputString = "abc";

        List<String> outputStringList = stringDelimited(inputString);

        System.out.println("outputStringList: " + outputStringList);
    }

    /**
     * 思路:
     * 知识点：数组
     * 测试: 通过
     * result:
     * 时间复杂度:
     * 空间复杂度:
     * 优化建议：
     * 空间优化：
     *
     * @param originInputString
     * @return
     */
    public List<String> stringDelimited(String originInputString) {
        String inputString = originInputString;
        int inputLength = originInputString.length();
        int lastUnappendCharLength = inputLength % 8;
        int neededAppendCharNum = 0;
        if (lastUnappendCharLength != 0) {
            neededAppendCharNum = 8 - lastUnappendCharLength;
        }

        int groupNum = inputLength / 8 + 1;

        List<String> outputStringList = new ArrayList<>();
        if (inputLength == 0) {
            // 不处理
        } else if (inputLength < 8) {
            for (int i = 0; i < neededAppendCharNum; i++) {
                inputString += "0";
            }
            outputStringList.add(inputString);
        } else if (inputLength == 8) {
            outputStringList.add(inputString);
        } else {
            for (int i = 0; i < groupNum - 1; i++) {
                String subOutputString = inputString.substring(i * 8, (i + 1) * 8);
                outputStringList.add(subOutputString);
            }
            if (neededAppendCharNum != 0) {
                String lastSubOutputString = inputString.substring((groupNum - 1) * 8);
                for (int i = 0; i < neededAppendCharNum; i++) {
                    lastSubOutputString += "0";
                }
                outputStringList.add(lastSubOutputString);
            }
        }

        for (String out : outputStringList) {
            System.out.println(out);
        }

        return outputStringList;
    }


}
