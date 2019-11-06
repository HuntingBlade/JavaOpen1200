package com.edu.java.part4.demo62;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author CL
 * @description 货币金额大写格式
 * @date 2019/11/6
 */
public class ConvertMoney {

    public static String convert(double money) {
        // 实例化DecimalFormat对象
        DecimalFormat df = new DecimalFormat("#0.###");
        String strNum = df.format(money);
        // 判断是否包含小数点
        if (strNum.indexOf(".") != -1) {
            // 截取小数点前的字符串
            String num = strNum.substring(0, strNum.indexOf("."));
            // 整数大于12位不能转换
            if (num.length() > 12) {
                System.out.println("数字太大，不能完成转换");
                return "";
            }
        }
        String point = "";
        if (strNum.indexOf(".") != -1) {
            point = "元";
        } else {
            point = "元整";
        }
        String result = getInteger(strNum) + point;
        // + getDecimnal(strNum);
        if (result.endsWith("元")) {
            result = result.substring(1, result.length());
        }
        return result;
    }

    private static String getInteger(String num) {
        // 判断是否包含小数点
        if (num.indexOf(".") != -1) {
            num = num.substring(0, num.indexOf("."));
        }
        // 反转字符串
        num = new StringBuffer(num).reverse().toString();
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < num.length(); i++) {
//            temp.append(STR_UNIT[i]);
//            temp.append(STR_NUMBER[num.charAt(i) - 48]);
        }
        // 反转字符串
        num = temp.reverse().toString();
        num = numReplace(num, "零拾", "零");
        num = numReplace(num, "零佰", "零");
        num = numReplace(num, "零仟", "零");
        num = numReplace(num, "零万", "万");
        num = numReplace(num, "零亿", "亿");
        num = numReplace(num, "零零", "零");
        num = numReplace(num, "亿万", "亿");

        // 如果字符串以零结尾将其除去
        if (num.lastIndexOf("零") == num.length() - 1) {
            num = num.substring(0, num.length() - 1);
        }
        return num;
    }

    private static String numReplace(String num, String a, String b) {
        return num.replace(a, b);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个金额：");
        double money = scanner.nextDouble();
        // 获取金额转换后的字符串
        System.out.println(convert(money));
    }
}
