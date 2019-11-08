package com.edu.java.part4.demo82;

import com.edu.java.utils.ScannerUtil;

/**
 * @description: 汉字与区位码的转换
 * @author: CL
 * @time: 2019/11/8 18:25
 * 技术点;
 * 1、字节码-160就是区码
 * 2、%02d  补零 5>>05  8>>08
 */
public class Example {

    /**
     * 汉字与区位码的转换
     *
     * @param str
     * @return
     */
    protected String ChineseToCode(String str) throws Exception {
        final int len = 2;
        if (str.isEmpty() || str == null) {
            throw new Exception("汉字不能为空！");
        }
        if (str.length() > len) {
            throw new Exception("不能输入过多汉字！");
        }
        str.trim();
        byte[] codeBit = str.getBytes("GB2312");
        if (codeBit.length < len) {
            throw new Exception("输入的不是汉字！");
        }
        codeBit[0] -= 160;
        codeBit[1] -= 160;
        String code = formatNumber(codeBit[0]) + formatNumber(codeBit[1]);
        return code;
    }

    /**
     * 为数字参数补零
     *
     * @param number
     * @return
     */
    public String formatNumber(int number) {
        return String.format("%02d", number);
    }

    public static void main(String[] args) throws Exception {
        String scanner = ScannerUtil.getScanner("请输入一个汉字：");
        Example example = new Example();
        String s = example.ChineseToCode(scanner);
        System.out.println(scanner + "的区位码为：" + s);
    }
}
