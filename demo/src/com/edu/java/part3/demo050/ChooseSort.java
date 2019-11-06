package com.edu.java.part3.demo050;

import java.util.Random;

/**
 * @description: 选择排序
 * @author: CL
 * @time: 2019/11/5 20:20
 */
public class ChooseSort {
    private static int[] arr = new int[10];

    public static void randomNum() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
    }

    public static void main(String[] args) {
        System.out.println("排序前的数组：");
        randomNum();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n选择排序之后的数组");
        int index;
        for (int i = 1; i < arr.length; i++) {
            index = 0;
            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j] > arr[index]) {
                    // 查找最大值
                    index = j;
                }
            }
            // 交换在位置arr.length -i 和index（最大值）上的两个数
            int temp = arr[arr.length - i];
            arr[arr.length - i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
