package com.edu.java.part2.demo025;

import java.math.BigDecimal;

/**
 * 更准确的使用浮点数
 */
public class AccuratelyFloat {
    public static void main(String[] args) {
        double money = 2;
        double price = 1.1;
        double result = money - price;
        System.out.println("余额:" + result);
        BigDecimal money1 = new BigDecimal("2");
        BigDecimal price1 = new BigDecimal("1.1");
        BigDecimal result1 = money1.subtract(price1);
        System.out.println("余额:" + result1);
    }
}
