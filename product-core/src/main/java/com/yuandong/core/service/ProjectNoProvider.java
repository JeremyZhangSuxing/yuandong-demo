package com.yuandong.core.service;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Component
public class ProjectNoProvider {
    /**
     * businessCode + timestamp + 四位随机数字
     * 分布式 场景选择redis 此处作demo 简单处理
     */
    public synchronized String generateNo(String type) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        String timestamp = localTime.replace("-", "")
                .replace(":", "")
                .replace(" ", "");
        int suffix = new Random().nextInt(9999);
        return type + "-" + timestamp + "-" + suffix;
    }
}
