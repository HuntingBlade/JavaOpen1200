package com.edu.java.part4.demo68;

import java.util.Scanner;

/**
 * @description: 判断网页请求与FTP请求
 * @author: CL
 * @time: 2019/11/7 15:46
 */
public class JudgeWebRequest {
    /**
     * http协议
     */
    private static final String HTTP = "http";
    /**
     * ftp协议
     */
    private static final String FTP = "ftp";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入请求的网址：");
        String str = scanner.nextLine();

        if (str.startsWith(HTTP)) {
            System.out.println("您输入的是网页网址,希望浏览某个网页！");
        } else if (str.startsWith(FTP)) {
            System.out.println("您输入的是FTP网址,希望浏览FTP服务器！");
        } else {
            System.out.println("您输入的请求信息不完整!");
        }
    }
}
