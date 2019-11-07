package com.edu.java.part4.demo67_x;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 用户名排序
 * @author: CL
 * @time: 2019/11/7 13:47
 */
public class UserNameSort {
    private static List<String> userList = new ArrayList<>();

    static {
        userList.add("CharLee");
        userList.add("Jane");
        userList.add("AnNa");
        userList.add("Kevin");
        userList.add("KangKang");
    }

    public static void main(String[] args) {
        new Thread() {
            int[] indexs = new int[2];

            @Override
            public void run() {
                // 遍历数组
                for (int i = userList.size(); --i >= 0; ) {
                    indexs[0] = i;
                    // 遍历并排序所有未排序元素
                    for (int j = 0; j < i; j++) {
                        boolean compare = userList.get(i).compareToIgnoreCase(userList.get(j + 1)) > 0;
//                        if (compare && )
                    }
                }
            }
        }.start();
    }
}
