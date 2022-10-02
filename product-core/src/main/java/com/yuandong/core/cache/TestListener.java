package com.yuandong.core.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 监听器
 */
@Component
public class TestListener implements RedisDelayedQueueListener<TaskBodyDTO> {

    Logger logger = LoggerFactory.getLogger(TestListener.class);

    @Override
    public void invoke(TaskBodyDTO taskBodyDTO) {
        //这里调用你延迟之后的代码
        logger.info("执行...." + taskBodyDTO.getBody() + "===" + taskBodyDTO.getName());
    }
}