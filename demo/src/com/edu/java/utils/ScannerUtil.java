package com.edu.java.utils;

import java.util.Scanner;

/**
 * @description: Scanner工具类封装
 * @author: CL
 * @time: 2019/11/8 15:13
 */
public class ScannerUtil {

    public static String getScanner(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
