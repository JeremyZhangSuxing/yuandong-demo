package com.yuandong.core.cache;

/**
 * 队列事件监听接口，需要实现这个方法
 *
 * @param <T>
 */
public interface RedisDelayedQueueListener<T> {
    /**
     * 执行方法
     *
     * @param t
     */
    void invoke(T t);
}