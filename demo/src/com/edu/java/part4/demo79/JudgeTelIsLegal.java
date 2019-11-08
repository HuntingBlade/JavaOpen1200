package com.edu.java.part4.demo79;

import com.edu.java.utils.ScannerUtil;

/**
 * @description: 判断手机号是否合法
 * @author: CL
 * @time: 2019/11/8 17:52
 */
public class JudgeTelIsLegal {

    /**
     * 手机号是否合法
     *
     * @param telNumber
     * @return
     */
    public boolean telIsLegal(String telNumber) {
        if (telNumber == null || telNumber.isEmpty()) {
            System.out.println("手机号码不能为空！");
            return false;
        }
        // 定义正则表达式
        String regex = "^13\\d{9}|^15\\d{9}|^18\\d{9}$";
        if (telNumber.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        String telNumber = ScannerUtil.getScanner("请输入手机号码：");
        JudgeTelIsLegal jtl = new JudgeTelIsLegal();
        boolean result = jtl.telIsLegal(telNumber);
        if (result){
            System.out.println("手机号码正确！");
        }else{
            System.out.println("手机号码不正确！");
        }
    }
}
