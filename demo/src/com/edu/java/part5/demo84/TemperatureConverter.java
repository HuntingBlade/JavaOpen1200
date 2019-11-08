package com.edu.java.part5.demo84;

import com.edu.java.utils.TemperatureConverterUtil;

import java.util.Scanner;

/**
 * @description: 温度单位转换工具
 * @author: CL
 * @time: 2019/11/8 18:58
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要转换的温度：（单位：摄氏度）");
        double temperature = scanner.nextDouble();
        double fahrenheit = TemperatureConverterUtil.toFahrenheit(temperature);
        System.out.println("转换完成的温度（单位：华氏度）" + fahrenheit);
    }
}
