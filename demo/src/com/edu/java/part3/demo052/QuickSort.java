package com.edu.java.part3.demo052;

import com.edu.java.utils.RandomUtil;

/**
 * @description: 使用快速排序法
 * @author: CL
 * @time: 2019/11/6 14:24
 */
public class QuickSort {

    public static void quickSort(int[] arry, int lowIndex, int highIndex) {
        // 记录最小的索引
        int lo = lowIndex;
        // 记录最大的索引
        int hi = highIndex;
        // 记录分界点的元素
        int mid;
        if (highIndex > lowIndex) {
            // 确定中间分界点元素的值
            mid = arry[(lowIndex + highIndex) / 2];
            while (lo <= hi) {
                // 确定不大于分界元素值的最小索引
                while ((lo < highIndex) && (arry[lo] < mid)) {
                    ++lo;
                }
                // 确定大于分界元素值的最大索引
                while ((hi > lowIndex) && arry[hi] > mid) {
                    --hi;
                }
                if (lo <= hi) {
                    swap(arry, lo, hi);
                    ++lo;
                    --hi;
                }
            }
            if (lowIndex < hi) {
                quickSort(arry, lowIndex, hi);
            }
            if (lo < highIndex) {
                quickSort(arry, lo, highIndex);
            }
        }
    }

    private static void swap(int[] arry, int i, int j) {
        int temp = arry[i];
        arry[i] = arry[j];
        arry[j] = temp;
        for (int k = 0; k < arry.length; k++) {
            System.out.print(arry[k] + "\t");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] random = RandomUtil.getRandom(10);
        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i] + "\t");
        }
        System.out.println("\n**************");
        quickSort(random, 0, 9);
    }
}
