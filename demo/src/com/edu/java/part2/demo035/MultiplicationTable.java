package com.edu.java.part2.demo035;

/**
 * 使用嵌套循环在控制台上输出九九乘法表
 *
 * @author Administrator
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        // 循环控制变量从1遍历到9
        for (int i = 1; i <= 9; i++) {
            // 第二层循环控制变量与第一层最大索引相等
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
