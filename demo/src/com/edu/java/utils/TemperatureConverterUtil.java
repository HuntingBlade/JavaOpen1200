package com.edu.java.utils;

/**
 * @description:
 * @author: CL
 * @time: 2019/11/8 18:59
 */
public class TemperatureConverterUtil {

    /**
     * 摄氏温度转换成华氏温度
     *
     * @param centigrade
     * @return
     */
    public static double toFahrenheit(double centigrade) {
        return 1.8 * centigrade + 32;
    }
}
