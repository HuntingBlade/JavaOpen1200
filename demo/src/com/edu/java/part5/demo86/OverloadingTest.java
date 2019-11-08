package com.edu.java.part5.demo86;

/**
 * @description: 编写同名的方法（重载）
 * @author: CL
 * @time: 2019/11/8 19:20
 */
public class OverloadingTest {

    public void info() {
        System.out.println("普通方法：明日科技1岁了！");
    }

    public void info(int age) {
        System.out.println("重载方法：明日科技" + age + "岁了！");
    }

    public static void main(String[] args) {
        OverloadingTest test = new OverloadingTest();
        // 测试无参数的info方法
        test.info();
        int len = 5;
        for (int i = 0; i < len; i++) {
            test.info(i);
        }
    }
}
