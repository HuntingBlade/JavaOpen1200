package com.edu.java.part3.demo057;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 用List集合传递学生信息
 * @author: CL
 * @time: 2019/11/6 15:32
 */
public class StudentInfo {
    /**
     * 获取学生信息
     */
    public static List<String> getStudentInfo() {
        List<String> list = new ArrayList<>();
        list.add("李哥,男,1981-1-1");
        list.add("小陈,女,1981-1-1");
        list.add("小刘,男,1981-1-1");
        list.add("小张,男,1981-1-1");
        list.add("小董,男,1981-1-1");
        list.add("小吕,男,1981-1-1");
        return list;
    }

    public static void main(String[] args) {
        List<String> list = getStudentInfo();
        for (String info : list) {
            String[] arg = info.split(",");
            for (String s : arg) {
                System.out.print(s + "\t");
            }
            System.out.println();
        }

    }
}
