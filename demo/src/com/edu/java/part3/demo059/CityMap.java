package com.edu.java.part3.demo059;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @description: Map映射集合实现省市级联选择框
 * @author: CL
 * @time: 2019/11/6 16:14
 */
public class CityMap {

    public static Map<String, String[]> model = new LinkedHashMap<>();

    static {
        model.put("北京", new String[]{"北京"});
        model.put("上海", new String[]{"上海"});
        model.put("天津", new String[]{"天津"});
        model.put("重庆", new String[]{"重庆"});
        model.put("福建", new String[]{"福州", "平潭", "永泰", "南平", "厦门", "漳州", "莆田", "宁德"});
        model.put("辽宁", new String[]{"沈阳", "大连", "葫芦岛", "旅顺", "本溪", "辽阳", "营口", "朝阳"});
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要找的城市：");
        String cityName = scanner.nextLine();
        if (model.get(cityName) != null) {
            for (String str : model.get(cityName)) {
                System.out.print(str + "\t");
            }
        } else {
            System.out.println("输入的城市不存在！");
        }
    }
}
