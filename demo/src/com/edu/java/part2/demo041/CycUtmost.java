package com.edu.java.part2.demo041;

/**
 * @description: 循环的极限
 * @author: CL
 * @time: 2019/11/5 16:19
 */
public class CycUtmost {
    public static void main(String[] args) {
        int end = Integer.MAX_VALUE;
        int start = end - 50;
        int count = 0;
        /**
         * 会出现死循环
         * 循环控制范围超出整数的最大取值范围时，就会绕回整数类型的最小值
         */
        for (int i = start; i <= end; i++) {
            count++;
        }
        // 输出循环计数器
        System.out.println("本次循环次数为：" + count);
    }
}
