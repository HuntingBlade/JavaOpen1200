package com.edu.java.part2.demo033;

/**
 * 使用while与自增运算符循环遍历数组
 */
public class ErgodicArray {
    public static void main(String[] args) {
        // 创建鸟类数组
        String[] birds = new String[]{"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "布谷鸟", "灰纹鸟", "百灵鸟"};
        int index = 0;
        System.out.println("我的花园里有很多鸟，种类大约包括：");
        while (index < birds.length) {
            System.out.println(birds[index++]);
        }
    }
    /**
     *  ++index 会将index的值递增，然后在使用递增后的值
     *  index++ 先使用该变量的值，返回再把变量递增
     */
}
