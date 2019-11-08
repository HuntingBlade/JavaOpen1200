package com.edu.java.part5.demo83;

/**
 * @description: 图书实体类
 * @author: CL
 * @time: 2019/11/8 18:48
 */
public class BookDo {
    /**
     * 书名
     */
    private String title;
    /**
     * 作者
     */
    private String author;
    /**
     * 价格
     */
    private double price;

    public BookDo(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
