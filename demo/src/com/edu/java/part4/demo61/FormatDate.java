package com.edu.java.part4.demo61;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author CL
 * @description 格式化当前日期
 * @date 2019/11/6
 */
public class FormatDate {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat format;

        format = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);
        System.out.println("中国日期：" + format.format(date));
        format = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("美国日期：" + format.format(date));
        format = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
        System.out.println("英国日期：" + format.format(date));
    }
}
