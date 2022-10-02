package com.yuandong.core.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author jeremy.zhang
 * @date 2022-10-02
 */
@Component
public class DelayTaskRunner implements CommandLineRunner {
    @Autowired
    private RedisDelayedQueue redisDelayedQueue;

    @Override
    public void run(String... args) throws Exception {
        TaskBodyDTO taskBody = new TaskBodyDTO();
        taskBody.setBody("测试DTO实体类的BODY,3秒之后执行");
        taskBody.setName("测试DTO实体类的姓名,3秒之后执行");
        //添加队列3秒之后执行
        redisDelayedQueue.addQueue(taskBody, 10, TimeUnit.SECONDS, TestListener.class.getName());

        taskBody.setBody("测试DTO实体类的BODY,10秒之后执行");
        taskBody.setName("测试DTO实体类的姓名,10秒之后执行");
        //添加队列10秒之后执行
        redisDelayedQueue.addQueue(taskBody, 20, TimeUnit.SECONDS, TestListener.class.getName());

        taskBody.setBody("测试DTO实体类的BODY,20秒之后执行");
        taskBody.setName("测试DTO实体类的姓名,20秒之后执行");
        //添加队列20秒之后执行
        redisDelayedQueue.addQueue(taskBody, 30, TimeUnit.SECONDS, TestListener.class.getName());
    }
}
