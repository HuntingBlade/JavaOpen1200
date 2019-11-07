package com.edu.java.part4.demo71;

import java.util.Scanner;

/**
 * @description: 验证IP地址的有效性
 * @author: CL
 * @time: 2019/11/7 16:51
 */
public class VerifyIpAddressIsEffect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入IP地址：");
        String IpAddress = scanner.nextLine();
        matches(IpAddress);
    }

    /**
     * 验证IP地址
     *
     * @param ipAddress
     * @return
     */
    private static void matches(String ipAddress) {
        if (!ipAddress.isEmpty() && ipAddress != null) {
            // 定义正则表达式
            String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5][1-9]\\d|[1-9])\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5][1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5][1-9]\\d|\\d)\\."
                    + "(1\\d{2}|2[0-4]\\d|25[0-5][1-9]\\d|\\d)$";
            // 判断IP地址是否与正则表达式匹配
            if (ipAddress.matches(regex)) {
                System.out.println(ipAddress + " 是一个合法的IP地址");
                return;
            }
            System.out.println(ipAddress + " 不是一个合法的IP地址");
        }
    }
}
