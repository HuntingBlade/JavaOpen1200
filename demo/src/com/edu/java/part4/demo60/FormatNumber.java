package com.edu.java.part4.demo60;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author CL
 * @description 把数字格式化为货币字符串
 * @date 2019/11/6
 */
public class FormatNumber {

    /**
     * 各种货币符号可能会因系统缺少字体而无法正确显示
     * @param args
     */
    public static void main(String[] args) {
        // 创建标注输入流扫描器
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        double number = scanner.nextDouble();
        System.out.println("该数字用Local类的一下常量作为格式化对象的构造参数，将获得不同的货币格式：");
        NumberFormat currencyInstance;

        // 输出格式化货币格式
        // 中国
        currencyInstance = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("Locale.CHINA：" + currencyInstance.format(number));
        // 美国
        currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Locale.CHINA：" + currencyInstance.format(number));
        // 英国
        currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        System.out.println("Locale.ENGLISH：" + currencyInstance.format(number));
        // 台湾
        currencyInstance = NumberFormat.getNumberInstance(Locale.TAIWAN);
        System.out.println("Locale.TAIWANL：" + currencyInstance.format(number));
    }
}
