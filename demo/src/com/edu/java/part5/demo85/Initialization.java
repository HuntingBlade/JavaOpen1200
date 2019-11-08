package com.edu.java.part5.demo85;

/**
 * @description: 域的默认初始化的值
 * @author: CL
 * @time: 2019/11/8 19:05
 */
public class Initialization {
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private boolean bl;
    private char c;
    private String string;

    public static void main(String[] args) {
        Initialization init = new Initialization();
        System.out.println("byte:" + init.b);
        System.out.println("short:" + init.s);
        System.out.println("int:" + init.i);
        System.out.println("long:" + init.l);
        System.out.println("float:" + init.f);
        System.out.println("double:" + init.d);
        System.out.println("boolean:" + init.bl);
        System.out.println("char:" + init.c);
        System.out.println("string:" + init.string);
    }
}
