package top.cupcupcui.leetcodeproblems.huawei.nowcoder;

import java.util.*;

/**
 * @author garre
 */
public class HJ3RandomNumberProcessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 第一行先输入随机整数的个数 N
        int total = in.nextInt();
        // 接下来的 N 行每行输入一个整数，代表明明生成的数字
        List<Integer> inputIntList = new ArrayList<>();
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            inputIntList.add(in.nextInt());
        }
        //randomNumberProcessor(total, intList);


        // 去重
        Set<Integer> intSet = new HashSet<>(inputIntList);
        inputIntList = new ArrayList<>(intSet);
        if (inputIntList.size() == 0 || inputIntList.size() == 1) {
            for (int i = 0; i < inputIntList.size(); i++) {
                System.out.println(inputIntList.get(i));
            }
            //return inputIntList;
        } else {
            // 排序。然后再把这些数从小到大排序
            // 冒泡排序
            // 快排
            // 工具类排序
            // 需要循环的次数
            for (int i = 0; i < inputIntList.size(); i++) {
                // 遍历，比较相邻的数据，交换相邻数据，将较大的数据移到靠后的位置，最终将本次循环最大的数移动到最后
                for (int j = 0; j < inputIntList.size() - i - 1; j++) {
                    int tempMaxNum;
                    if (inputIntList.get(j) > inputIntList.get(j + 1)) {
                        tempMaxNum = inputIntList.get(j);
                        // 交换相邻数据，将较大的数据移到靠后的位置
                        inputIntList.set(j, inputIntList.get(j + 1));
                        inputIntList.set(j + 1, tempMaxNum);
                    } else {
                        // 保持顺序不变
                    }

                }
            }

            for (int i = 0; i < inputIntList.size(); i++) {
                System.out.println(inputIntList.get(i));
            }
            //return inputIntList;
        }

    }

    /**
     * 描述
     * 明明生成了N个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
     * <p>
     * 数据范围： 1≤n≤1000  ，输入的数字大小满足 1≤val≤500
     * 输入描述：
     * 第一行先输入随机整数的个数 N 。 接下来的 N 行每行输入一个整数，代表明明生成的数字。 具体格式可以参考下面的"示例"。请不要自行生成随机数。
     * 输出描述：
     * 输出多行，表示输入数据处理后的结果
     * <p>
     * 示例1
     * 输入：
     * 3
     * 2
     * 2
     * 1
     * 输出：
     * 1
     * 2
     * 说明：
     * 输入解释：
     * 第一个数字是3，也即这个小样例的N=3，说明用计算机生成了3个1到500之间的随机整数，接下来每行一个随机数字，共3行，也即这3个随机数字为：
     * 2
     * 2
     * 1
     * 所以样例的输出为：
     * 1
     * 2
     */
    //@Test
    public void randomNumberProcessorTest() {
        // 第一行先输入随机整数的个数 N
        int total = 3;
        // 接下来的 N 行每行输入一个整数，代表明明生成的数字
        List<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(2);
        intList.add(2);
        intList.add(1);
        intList.add(3);

        List<Integer> resultList = randomNumberProcessor(total, intList);

        System.out.println("resultList: " + resultList.toString());
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
     * @param total
     * @param inputIntList
     * @return
     */
    public List<Integer> randomNumberProcessor(int total, List<Integer> inputIntList) {
        // 去重
        Set<Integer> intSet = new HashSet<>(inputIntList);
        inputIntList = new ArrayList<>(intSet);
        if (inputIntList.size() == 0 || inputIntList.size() == 1) {
            for (int i = 0; i < inputIntList.size(); i++) {
                System.out.println(inputIntList.get(i));
            }
            return inputIntList;
        } else {
            // 排序。然后再把这些数从小到大排序
            // 冒泡排序
            // 快排
            // 工具类排序
            // 需要循环的次数
            for (int i = 0; i < inputIntList.size(); i++) {
                // 遍历，比较相邻的数据，交换相邻数据，将较大的数据移到靠后的位置，最终将本次循环最大的数移动到最后
                for (int j = 0; j < inputIntList.size() - i - 1; j++) {
                    int tempMaxNum;
                    if (inputIntList.get(j) > inputIntList.get(j + 1)) {
                        tempMaxNum = inputIntList.get(j);
                        // 交换相邻数据，将较大的数据移到靠后的位置
                        inputIntList.set(j, inputIntList.get(j + 1));
                        inputIntList.set(j + 1, tempMaxNum);
                    } else {
                        // 保持顺序不变
                    }

                }
            }

            for (int i = 0; i < inputIntList.size(); i++) {
                System.out.println(inputIntList.get(i));
            }
            return inputIntList;
        }
    }

    public List<Integer> randomNumberProcessor_solution2(int total, List<Integer> inputIntList) {
        // 去重
        Set<Integer> intSet = new HashSet<>(inputIntList);
        inputIntList = new ArrayList<>(intSet);
        if (inputIntList.size() == 0 || inputIntList.size() == 1) {
        } else {
            // 排序。然后再把这些数从小到大排序
            // 冒泡排序
            // 快排
            // 工具类排序
            inputIntList.sort(Comparator.comparingInt(x -> x));
        }
        for (int i = 0; i < inputIntList.size(); i++) {
            System.out.println(inputIntList.get(i));
        }
        return inputIntList;
    }

}
