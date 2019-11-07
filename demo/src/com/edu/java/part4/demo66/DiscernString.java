package com.edu.java.part4.demo66;

import java.util.Scanner;

/**
 * @description: 辨别字符串
 * @author: CL
 * @time: 2019/11/7 13:43
 */
public class DiscernString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String account = scanner.nextLine();
        if ("admin".equals(account)) {
            System.out.println("对不起，这个用户名是管理员，不是你的");
        } else if ("mingri".equals(account)) {
            System.out.println("该用户名对应的密码已经发送到注册时的邮箱，请查收");
        } else {
            System.out.println("您输入的用户名不存在,留意Caps Lock建是否按下");
        }
    }
}
