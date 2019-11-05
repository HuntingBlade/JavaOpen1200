package com.edu.java.part3.demo046;

import java.util.Scanner;

/**
 * @description: 数组的下标界限
 * @author: CL
 * @time: 2019/11/5 16:54
 */
public class ArrayIndexOut {

    protected static String[] infos = {"50元奖励", "唱一首歌", "学狗叫", "为大家讲一个笑话", "3万元奖励"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        try {
            System.out.println(infos[num]);
        } catch (Exception e) {
            throw new Error("发生异常：\n" + e.toString());
        }
    }
}
