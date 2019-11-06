package com.edu.java.part3.demo053;

import com.edu.java.utils.RandomUtil;

/**
 * @description: 使用插入排序
 * @author: CL
 * @time: 2019/11/6 17:44
 */
public class DirectSort {

    public static int[] getDirectSortTwo(int[] arr) {
        // 定义临时变量
        int tmp;
        int j;
        for (int i = 1; i < arr.length; i++) {
            // 保存临时变量
            tmp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
                // 数组元素交换
                arr[j + 1] = arr[j];
            }
            // 在排序位置插入数据
            arr[j + 1] = tmp;
        }
        return arr;
    }

    /**
     * 插入排序
     *
     * @param arr
     * @return
     */
    public static int[] getDirectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] random = RandomUtil.getRandom(10);
        System.out.println("初始化随机数：");
        for (int rdm : random) {
            System.out.print(rdm + "\t");
        }
        System.out.println("\n使用插入排序：");
        int[] directSort = getDirectSortTwo(random);
        for (int i : directSort) {
            System.out.print(i + "\t");
        }
    }
}
