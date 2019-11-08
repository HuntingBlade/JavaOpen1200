package com.edu.java.part4.demo74;

import java.util.Scanner;

/**
 * @description: 将字符串的每个字符进行倒序输出
 * @author: CL
 * @time: 2019/11/8 14:48
 */
public class StringReverse {

    public String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要倒序输出的字符串：");
        String str = scanner.nextLine();
        StringReverse stringReverse = new StringReverse();
        String result = stringReverse.reverseString(str);
        System.out.println("倒序结果：" + result);
    }
}
