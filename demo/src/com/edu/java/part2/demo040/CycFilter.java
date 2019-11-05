package com.edu.java.part2.demo040;

/**
 * @description: 循环体的过滤器
 * @author: CL
 * @time: 2019/11/5 16:09
 */
public class CycFilter {

    /**
     * 找出有多少只老鹰
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] birds = new String[]{
                "白鹭", "丹顶鹤", "黄鹂",
                "鹦鹉", "乌鸦", "喜鹊",
                "老鹰", "布谷鸟", "老鹰",
                "灰纹鸟", "老鹰", "百灵鸟"
        };
        int eagleCount = 0;
        for (String bird : birds) {
            if ("老鹰".equals(bird)) {
                System.out.println("0_o 发现一只老鹰，已经抓到笼子里！");
                eagleCount++;
                // 中断循环
                continue;
            }
            System.out.println("搜索鸟类,发现了：" + bird);
        }
        System.out.println("一共抓了" + eagleCount + "只老鹰");
    }
}
