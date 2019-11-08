package com.edu.java.part4.demo77;

import com.edu.java.utils.ScannerUtil;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @description:
 * @author: CL
 * @time: 2019/11/8 16:05
 */
public class ErrorMessagePrintOutToWindows {
    public static void main(String[] args) {
        // 创建字节流数组输出流
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        // 重定向err输出流
        System.setErr(new PrintStream(stream));
        String str = ScannerUtil.getScanner("请输入一段字符串：");
        try {
            // 字符串转整数
            Integer value = Integer.valueOf(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        // 获取字节输出流的字符串
        String info = stream.toString();
        if (info.isEmpty()){
            // 显示正常转换的提示信息
            System.out.println("字符串到Integer的转换没有发生异常");
        }else{
            System.out.println("出错啦！转换过程中出现了如下异常错误：\n" + info);
        }
    }
}
