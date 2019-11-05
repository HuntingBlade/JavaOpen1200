package com.edu.java.part2.demo024;

import java.util.Scanner;

/**
 * 用三元运算符判断奇数和偶数
 */
public class ParityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        long number = scanner.nextLong();
        String check = number + "是:" + ((number % 2 == 0) ? "偶数" : "奇数");
        System.out.println(check);
    }
}
