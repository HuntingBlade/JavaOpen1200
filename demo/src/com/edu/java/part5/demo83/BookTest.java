package com.edu.java.part5.demo83;

/**
 * @description: 图书测试类
 * @author: CL
 * @time: 2019/11/8 18:48
 */
public class BookTest {
    public static void main(String[] args) {
        BookDo bookDo = new BookDo("《java 1200实例》", "明日科技", 59.8);
        System.out.println("书名：" + bookDo.getTitle());
        System.out.println("作者：" + bookDo.getAuthor());
        System.out.println("价格：" + bookDo.getPrice() + "元");
    }
}
