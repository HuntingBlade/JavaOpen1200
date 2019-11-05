package com.edu.java.part2.demo038;

import java.util.ArrayList;
import java.util.List;

/**
 * foreach循环优于for循环
 *
 * @author Administrator
 */
public class UserForeach {
    public static void main(String[] args) {
        // 创建List集合
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("efg");
        list.add("hij");
        list.add("klm");
        list.add("nop");
        list.add("qrs");
        System.out.println("foreach遍历集合：");
        for (String str : list) {
            System.out.print(str + "\t");
        }
        System.out.println();
        String[] strings = new String[list.size()];
        list.toArray(strings);
        System.out.println("foreach遍历集合：");
        for (String s : strings) {
            System.out.print(s + "\t");
        }
    }
}
