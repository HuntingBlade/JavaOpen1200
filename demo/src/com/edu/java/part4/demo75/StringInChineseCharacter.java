package com.edu.java.part4.demo75;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @description: 获取字符串中汉字的个数
 * @author: CL
 * @time: 2019/11/8 15:02
 */
public class StringInChineseCharacter {

    /**
     * 获取字符串中汉字的个数
     *
     * @param str
     * @return
     */
    protected int countChineseCharacterInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // 使用正则表达式判断字符是否属于汉字编码
            boolean matches = Pattern.matches("^[\u4E00-\u9FA5]{0,}$", str.charAt(i) + "");
            if (matches) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找汉字个数的字符串：");
        String str = scanner.nextLine();
        StringInChineseCharacter icc = new StringInChineseCharacter();
        int number = icc.countChineseCharacterInString(str);
        System.out.println("汉字的个数为：" + number);
    }
}
