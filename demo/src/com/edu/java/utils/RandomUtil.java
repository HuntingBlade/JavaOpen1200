package com.edu.java.utils;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @description: 随机工具栏
 * @author: CL
 * @time: 2019/11/5 19:45
 */
public class RandomUtil {

    /**
     * 根据范围获取一个随机数
     *
     * @param range
     * @return
     */
    public static Integer getOneRandomNum(int range) {
        return (int) (Math.random() * range);
    }


    /**
     * 生成100以内不重复的随机数
     *
     * @param len   随机数个数
     * @param range 随机数的范围
     * @return
     */
    public static Set<Integer> getNoRepeatRandom(int len, int range) {
        Set<Integer> set = new TreeSet<>();
        Random random = new Random();
        int count = 0;
        while (count < len) {
            boolean succeed = set.add(random.nextInt(range));
            if (succeed) {
                count++;
            }
        }
        return set;
    }

    /**
     * 获取生成50以内的随机数
     *
     * @param len
     * @return
     */
    public static int[] getRandom(int len) {
        int[] arr = new int[len];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        return arr;
    }
}
