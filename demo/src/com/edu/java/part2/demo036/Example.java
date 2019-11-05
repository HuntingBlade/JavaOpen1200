package com.edu.java.part2.demo036;

import java.math.BigDecimal;

/**
 * 用while循环计算 1+1/2!+1/3!···1/20!
 *
 * @author Administrator
 */
public class Example {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal("0.0");
        BigDecimal factorial = new BigDecimal("1.0");
        int i = 1;
        int len = 20;
        while (i <= len) {
            sum = sum.add(factorial);
            ++i;
            factorial = factorial.add(new BigDecimal(1.0 / i));
        }
        System.out.println(" 用while循环计算 1+1/2!+1/3!···1/20!的结果为：" + sum);
    }
}
