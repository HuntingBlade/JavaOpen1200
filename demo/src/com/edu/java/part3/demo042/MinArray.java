package com.edu.java.part3.demo042;

import java.util.Scanner;

/**
 * @description: 获取一维数组最小值
 * @author: CL
 * @time: 2019/11/6 16:30
 */
public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一维数组：");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && charAt != ' ') {
                System.out.println("输入内容包含非数字内容");
            }
        }
        System.out.println("****" + str + "****");
        String[] s = str.split(" {1,}");
        int[] num = new int[s.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.valueOf(s[i]);
        }

        int min = num[0];
        for (int no : num) {
            if (no < min) {
                min = no;
            }
        }
        System.out.println("最小值为：" + min);
    }
}
