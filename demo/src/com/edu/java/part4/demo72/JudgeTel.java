package com.edu.java.part4.demo72;

import java.util.Scanner;

/**
 * @description: 判断非法电话号码
 * @author: CL
 * @time: 2019/11/7 17:05
 */
public class JudgeTel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入电话号码：");
        String tel = scanner.nextLine();
        isTel(tel);
    }

    /**
     * 电话号码验证
     *
     * @param tel
     */
    private static void isTel(String tel) {
        if (tel.isEmpty() && tel == null) {
            System.out.println("请输入电话号码！");
            return;
        }
        // 定义正则表达式
        String regex = "^\\d{3}-?\\d{8}|\\d{4}-?\\d{8}$";
        // 判断输入数据是否为电话号码
        if (tel.matches(regex)) {
            System.out.println(tel + " 是一个合法的电话号码！");
        } else {
            System.out.println(tel + " 不是一个合法的电话号码！");
        }

    }
}
