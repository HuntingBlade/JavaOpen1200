package com.edu.java.part2.demo026;

import java.util.Scanner;

/**
 * 不用乘法运算符实现2 * 16
 *  - 不能使用 *  和 BigDecimal的multiply
 */
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        long number = scanner.nextLong();
        System.out.println("您输入的数字是：" + number);
        System.out.println("该数字乘以2的运行结果为：" + (number << 1));
        System.out.println("该数字乘以4的运行结果为：" + (number << 2));
        System.out.println("该数字乘以8的运行结果为：" + (number << 3));
        System.out.println("该数字乘以16的运行结果为：" + (number << 4));
    }
}
