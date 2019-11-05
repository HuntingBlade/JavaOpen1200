package com.edu.java.part2.demo029;

import java.util.Scanner;

/**
 * 验证登录信息的合法性
 */
public class CheckLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入登录用户名");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        if (!"mr".equals(username)) {
            System.out.println("用户名非法。");
        } else if (!"mrsoft".equals(password)) {
            System.out.println("登录密码错误");
        } else {
            System.out.println("恭喜您，登录信息通过验证");
        }
    }
}
