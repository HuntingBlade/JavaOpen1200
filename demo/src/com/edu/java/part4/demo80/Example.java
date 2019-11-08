package com.edu.java.part4.demo80;

/**
 * @description: 用字符串构造器追加字符
 * @author: CL
 * @time: 2019/11/8 18:00
 */
public class Example {
    public void StringSpendTime() {
        String appendStr = "";
        long startTime = System.nanoTime();
        for (int i = 20000; i < 50000; i++) {
            appendStr += (char) i;
        }
        long endTime = System.nanoTime();
        System.out.println("String追加字符3万个，用时：" + (endTime  -  startTime) / 1000000d + "毫秒");
    }

    public void StringBuilderSpendTime() {
        StringBuilder builder = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 20000; i < 50000; i++) {
            builder.append((char) i);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder追加字符3万个，用时：" + (endTime  -  startTime) / 1000000d + "毫秒");
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.StringSpendTime();
        example.StringBuilderSpendTime();
    }
}
