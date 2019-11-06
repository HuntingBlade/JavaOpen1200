package com.edu.java.part3.demo051;

import com.edu.java.utils.RandomUtil;

/**
 * @description: 冒泡排序
 * @author: CL
 * @time: 2019/11/6 14:12
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] randoms = RandomUtil.getRandom(10);
        System.out.println("冒泡排序之前的数：");
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "\t");
        }
        System.out.println("\n冒泡排序之后的数：");
        for (int i = 1; i < randoms.length; i++) {
            // 比较相邻两个元素，较大的数往后冒泡
            for (int j = 0; j < randoms.length - i; j++) {
                if (randoms[j] > randoms[j + 1]) {
                    int temp = randoms[j];
                    randoms[j] = randoms[j + 1];
                    randoms[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < randoms.length; i++) {
            System.out.print(randoms[i] + "\t");
        }
    }
}
