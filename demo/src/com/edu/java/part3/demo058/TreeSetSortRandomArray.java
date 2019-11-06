package com.edu.java.part3.demo058;

import com.edu.java.utils.RandomUtil;

import java.util.Set;

/**
 * @description: 用TreeSet生成不重复自动排序随机数组
 * @author: CL
 * @time: 2019/11/6 15:41
 */
public class TreeSetSortRandomArray {

    public static void main(String[] args) {
        Set<Integer> noRepeatRandom = RandomUtil.getNoRepeatRandom(10, 100);
        int size = noRepeatRandom.size();
        Integer[] arr = new Integer[size];
        noRepeatRandom.toArray(arr);
        for (Integer num : arr) {
            System.out.print(num + "\t");
        }
    }
}
