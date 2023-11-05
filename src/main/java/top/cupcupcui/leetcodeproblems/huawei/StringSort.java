package top.cupcupcui.leetcodeproblems.huawei;

/**
 * @author cuiguanghao
 */

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息

public class StringSort {
    public static void main(String[] args) {
        // ··········放弃了··········
        System.out.println('z' - 'a');
        Scanner in = new Scanner(System.in);
        String aToZ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case

            String charStr = in.nextLine();
            for (char c : charStr.toCharArray()) {
                // aBAb
                if (aToZ.contains(c + "")) {
                }
            }

            System.out.println(charStr);

        }
    }
}






