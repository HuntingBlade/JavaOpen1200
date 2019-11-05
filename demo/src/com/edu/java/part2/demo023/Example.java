package com.edu.java.part2.demo023;

import java.util.Scanner;

/**
 * 加密（位运算）
 */
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        String password = scanner.nextLine();
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] ^ 2000);
        }
        System.out.println("加密或解密结果如下：");
        System.err.println(new String(chars));
    }
}
