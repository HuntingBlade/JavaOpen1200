package com.edu.java.part2.demo039;

/**
 * @description: 终止循环体
 * @author: CL
 * @time: 2019/11/5 15:54
 */
public class BreakCyc {
    public static void main(String[] args) {
        System.out.println("*************中断单层循环的例子************");
        // 创建数组
        String[] arrays = new String[]{"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "老鹰", "布谷鸟", "老鹰", "灰纹鸟", "老鹰", "百灵鸟"};
        System.out.println("在你发现第一只老鹰之前，告诉我都有什么鸟？");
        for (String str : arrays) {
            if ("老鹰".equals(str)) {
                break;
            }
            System.out.print("有：" + str + "\t");
        }
        System.out.println();
        System.out.println("*************中断双层循环的例子************");
        // 创建成绩数组
        int[][] scores = new int[][]{{67, 78, 63, 22, 66}, {55, 68, 78, 95, 44}, {95, 97, 92, 93, 81}};
        System.out.println("宝宝这次考试成绩：\n数学\t语文\t英语\t美术\t历史");
        No1:
        for (int[] is : scores) {
            for (int i : is) {
                System.out.print(i + "\t");
                if (i < 60) {
                    System.out.println("\n等等，" + i + "分的是什么？这个为什么不及格？");
                    break No1;
                }
            }
            System.out.println();
        }
    }
}
