package com.edu.java.part4.demo65;

import java.util.Scanner;

/**
 * @description: 字符与Unicode码的转换
 * @author: CL
 * @time: 2019/11/7 11:51
 */
public class StrToUnicodeConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请选择您要转换的类型：1-字符转Unicode / 2-Unicode转字符");
            Integer number = scanner.nextInt();
            if (number == 1) {
                // 字符转Unicode
                System.out.print("请输入要转换Unicode编码的字符：");
                String str = scanner.next();
                char[] chars = str.toCharArray();
                StringBuffer stringBuffer = new StringBuffer();
                for (char c : chars) {
                    stringBuffer.append((int) c + " ");
                }
                System.out.println(stringBuffer);
                break;
            } else if (number == 2) {
                // Unicode转字符
                System.out.print("请输入要转换字符的Unicode编码：");
                long code = scanner.nextLong();
                System.out.println((char) code);
                break;
            } else {
                System.out.println("0_O 非法输入，请重新输入");
            }
        }
    }
}
