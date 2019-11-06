package com.edu.java.part4.demo63;

import java.util.Date;
import java.util.Locale;

/**
 * @author CL
 * @description String类格式化当前日期
 * @date 2019/11/6
 * 心法：
 * 1、字符串是不可变的对象
 * 2、频繁地操作字符串对象，会在托管堆中产生大量的无用字符串,增加了垃圾收集器的压力，
 * 从而造成系统资源的浪费。
 */
public class Example {
    public static void main(String[] args) {
        Date date = new Date();

        // 英文月份
        String monthOne = String.format(Locale.US, "%tb", date);
        System.out.println("格式化后的字符串为月份的英文缩写：" + monthOne);
        String monthTwo = String.format(Locale.US, "%tB", date);
        System.out.println("格式化后的字符串为月份的英文全写：" + monthTwo);

        // 星期
        String weekOne = String.format("%ta", date);
        System.out.println("格式化后的星期：" + weekOne);
        String weekTwo = String.format("%tA", date);
        System.out.println("格式化后的星期：" + weekTwo);

        // 年
        String yearOne = String.format("%ty", date);
        System.out.println("格式化后的年份：" + yearOne);
        String yearTwo = String.format("%tY", date);
        System.out.println("格式化后的年份：" + yearTwo);

        // 月份
        String monthThree = String.format("%tm", date);
        System.out.println("格式化后的月份：" + monthThree);

        // 日期
        String dayOne = String.format("%td", date);
        System.out.println("格式化后的日期：" + dayOne);
        String dayTwo = String.format("%te", date);
        System.out.println("格式化后的日期：" + dayTwo);
    }
}
