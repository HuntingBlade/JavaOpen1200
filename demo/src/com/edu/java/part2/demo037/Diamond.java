package com.edu.java.part2.demo037;

/**
 * for循环输出空心的菱形
 *
 * @author Administrator
 */
public class Diamond {
    public static void main(String[] args) {
        printHollowRhombus(10);
    }

    private static void printHollowRhombus(int size) {
        // 计算菱形的大小
        if (size % 2 == 0) {
            size++;
        }

        for (int i = 0; i < size / 2 + 1; i++) {
            // 输出左上角位置的空白
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    // 输出菱形上半部边缘
                    System.out.print("*");
                } else {
                    // 输出菱形上半部空心
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                if (j == 0 || j == 2 * (size - i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
