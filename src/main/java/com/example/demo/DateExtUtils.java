package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Demo class
 *
 * @author nol
 * @date 2023/5/26
 */
public class DateExtUtils {
    public static String getPreviousHourString() {
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();

        // 获取上一个小时的时间
        LocalDateTime previousHour = now.minusHours(1);

        // 定义时间格式化器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");

        // 格式化时间为字符串
        String previousHourString = previousHour.format(formatter);

        return previousHourString;
    }
}
