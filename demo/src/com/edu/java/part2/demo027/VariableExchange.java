package com.edu.java.part2.demo027;

import java.util.Scanner;

/**
 * 实现两个变量的互换（不借助第三个变量）
 */
public class VariableExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入变量A的值");
        long A = scanner.nextLong();
        System.out.println("请输入变量B的值");
        long B = scanner.nextLong();
        A = A ^ B;
        System.err.println(A);
        B = B ^ A;
        System.err.println(B);
        A = A ^ B;
        System.out.println("A =" + A);
        System.out.println("B =" + B);
    }
}
