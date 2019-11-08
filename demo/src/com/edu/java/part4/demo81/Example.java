package com.edu.java.part4.demo81;

import com.edu.java.utils.ScannerUtil;

/**
 * @description: 去掉字符串中的所有空格
 * @author: CL
 * @time: 2019/11/8 18:13
 */
public class Example {

    /**
     * 去掉字符串中的所有空格
     *
     * @param str
     * @return
     */
    public String removeStringAllSpace(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 过滤空格字符
            if (' ' == c) {
                continue;
            }
            builder.append(c);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String str = ScannerUtil.getScanner("请输入您要去掉空格的字符串：");
        Example example = new Example();
        String s = example.removeStringAllSpace(str);
        System.out.println("去掉空格后的字符串：" + s);
    }
}
