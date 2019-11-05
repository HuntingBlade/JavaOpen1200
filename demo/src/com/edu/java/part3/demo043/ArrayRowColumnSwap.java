package com.edu.java.part3.demo043;

/**
 * @description: 将二维数组的行列互换
 * @author: CL
 * @time: 2019/11/5 16:34
 */
public class ArrayRowColumnSwap {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("行列互调前：");
        printArray(arr);
        int[][] arr2 = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[i][j] = arr[i][j];
            }
        }
        System.out.println("行列互调后");
        printArray(arr2);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
