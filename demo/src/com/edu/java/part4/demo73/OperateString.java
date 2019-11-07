package com.edu.java.part4.demo73;

import java.util.Scanner;

/**
 * @description: 操作字符串
 * @author: CL
 * @time: 2019/11/7 18:46
 *
 * 测试数据：
 * 在了解实例前，首先需要理解一个概念--
 * 字符串是不可以改变的对象，也就是说，字符串在创建以后，
 * 就不会被改变，当使用对象的replace()、split()或remove()等
 * 方法操作字符串时，实际上是产生一个新的字符串对象，原有的字符串
 * 如果没有被引用,将会被垃圾收集器回收。
 */
public class OperateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String str = scanner.nextLine();
        String[] strArr = str.split(",|，");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strArr) {
            stringBuilder.append(s + "\n");
        }
        System.out.print(stringBuilder.toString());
    }
}
