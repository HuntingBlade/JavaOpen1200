package com.edu.java.other.swing.demo01;

import javax.swing.*;
import java.awt.*;

/**
 * @description:
 * @author: CL
 * @time: 2019/11/5 19:49
 */
public class SwingExample extends  JFrame{
    public SwingExample(){
        setTitle("java第一个GUI程序");
        setSize(400, 400);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel j1 = new JLabel("这是使用JFrame类创建的窗口");
        Container contentPane = getContentPane();
        contentPane.add(j1);
        setVisible(true);
    }


    public static void main(String[] args) {
         new SwingExample();
    }
}
