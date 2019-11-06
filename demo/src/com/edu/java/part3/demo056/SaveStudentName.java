package com.edu.java.part3.demo056;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @description: 用动态数组保存学生姓名
 * @author: CL
 * @time: 2019/11/6 15:22
 */
public class SaveStudentName {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.println("请输入要添加的学生名称");
            Scanner scanner = new Scanner(System.in);
            String studentName = scanner.nextLine();
            list.add(studentName);
            System.out.println("是否继续添加？（回车继续添加 / N-否）");
            String next = scanner.nextLine();
            if ("N".equals(next.toUpperCase())) {
                break;
            }
        }
        for (String name : list) {
            System.out.print(name + "\t");
        }
    }
}
