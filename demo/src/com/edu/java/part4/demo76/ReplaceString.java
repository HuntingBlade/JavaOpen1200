package com.edu.java.part4.demo76;

import com.edu.java.utils.ScannerUtil;

/**
 * @description: 批量替换某一类字符串
 * @author: CL
 * @time: 2019/11/8 15:12
 */
public class ReplaceString {

    /**
     * 字符串的替换
     *
     * @param str
     * @param findStr
     * @param replaceStr
     * @return
     */
    public String replaceStr(String str, String findStr, String replaceStr) {
        return str.replace(findStr, replaceStr);
    }

    /**
     * 指定字符串中是否存在需要查找的字符串
     *
     * @param str
     * @param findStr
     * @return
     */
    public boolean stringIsExist(String str, String findStr) {
        if (str.isEmpty() && str == null) {
            System.out.println("请输入正确的字符串！");
            return false;
        }
        if (findStr.isEmpty() && findStr == null) {
            System.out.println("请输入正确的需要查找的字符串！");
            return false;
        }
        if (-1 != str.indexOf(findStr)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = ScannerUtil.getScanner("请输入一段字符串：");
        String findStr = ScannerUtil.getScanner("请输入查找的字符串：");
        ReplaceString rs = new ReplaceString();
        boolean b = rs.stringIsExist(str, findStr);
        if (b) {
            String replaceStr = ScannerUtil.getScanner("请输入替换的字符串：");
            String result = rs.replaceStr(str, findStr, replaceStr);
            System.out.println("替换后的字符串：" + result);
        }else{
            System.out.println("查找的字符串不存在！");
        }
    }
}
