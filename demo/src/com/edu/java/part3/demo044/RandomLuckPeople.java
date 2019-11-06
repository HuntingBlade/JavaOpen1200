package com.edu.java.part3.demo044;

import com.edu.java.utils.RandomUtil;

import java.util.Scanner;

/**
 * @description: 利用数组随机抽取幸运观众
 * @author: CL
 * @time: 2019/11/6 16:57
 */
public class RandomLuckPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入本次抽取的名单名称：");
        String names = scanner.nextLine();

        String[] strArr = names.split(",{1,}");

        int index = RandomUtil.getOneRandomNum(strArr.length);
        System.out.println("中奖号码为：" + index);
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[index].equals(strArr[i])) {
                System.out.println("恭喜" + strArr[index] + "中奖了!");
                break;
            }
        }
    }
}
