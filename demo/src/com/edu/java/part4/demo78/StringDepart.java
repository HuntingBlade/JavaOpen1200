package com.edu.java.part4.demo78;

import com.edu.java.utils.ScannerUtil;

/**
 * @description: 从字符串中分离文件路径、文件名及扩展名
 * @author: CL
 * @time: 2019/11/8 17:29
 * 技术点：
 * 1、subString 字符串截取
 * 2、indexOf 获取子字符串在原有字符串中第一次出现的索引
 * 3、lastIndexOf 指定字符串在此字符串中最后一次出现的索引
 * 测试数据：
 * E:\data\movie\test.mp4
 */
public class StringDepart {

    /**
     * 分离字符串
     * @param filePath
     * @return
     */
    public String[] departString(String filePath) {
        // 获取文件名
        int lastIndex = filePath.lastIndexOf("\\");
        int lastPoint = filePath.lastIndexOf(".");
        String fileName = filePath.substring(lastIndex + 1, lastPoint);
        String expandName = filePath.substring(lastPoint + 1);
        return new String[]{"文件路径：" + filePath, "文件名：" + fileName, "扩展名：" + expandName};
    }

    public static void main(String[] args) {
        String filePath = ScannerUtil.getScanner("请输入文件路径：");
        StringDepart stringDepart = new StringDepart();
        String[] strings = stringDepart.departString(filePath);
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
