package com.edu.java.part4.demo64;

import java.util.Scanner;

/**
 * @description: 字符串大小写转换
 * @author: CL
 * @time: 2019/11/7 11:43
 */
public class StringCaseUpLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要转换的字符串");
        String str = scanner.nextLine();
        for (; ; ) {
            System.out.println("请输入要转换成大写还是小写？(1-大写 / 0-小写)");
            Integer num = scanner.nextInt();
            if (num == 1) {
                System.out.println("大写：" + str.toUpperCase());
                break;
            } else if (num == 0) {
                System.out.println("小写：" + str.toLowerCase());
                break;
            } else {
                System.out.println("非法字符！请重新输入");
            }
        }
    }
}
