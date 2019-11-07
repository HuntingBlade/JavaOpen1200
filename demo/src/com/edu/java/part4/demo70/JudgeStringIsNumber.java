package com.edu.java.part4.demo70;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

/**
 * @description: 判断字符串是否为数字
 * @author: CL
 * @time: 2019/11/7 16:39
 */
public class JudgeStringIsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入货币值:");
        String money = scanner.nextLine();
        // 判断是不是数字
        if (NumberUtils.isNumber(money)) {
            System.out.println("输入正确,是数字格式！");
        } else {
            System.out.println("输入错误,请确认格式再输入！");
        }
    }
}
