package com.edu.java.part3.demo049;

import java.util.Scanner;

/**
 * @description: 用数组反转字符串
 * @author: CL
 * @time: 2019/11/6 17:17
 */
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段字符串，我为你翻转：");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();
        // 数组反转算法
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
            System.out.println("第" + (i + 1) + "次循环：");
            for (char c : chars) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("反转后的字符串：");
        String s = new String(chars);
        System.out.println(s);
    }
}
