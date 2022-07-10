package com.yuandong.core.dto;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
public class DecoratorTest {
    // 业务的本身没变 但是前后做了一些增强 类似在aop的 前后也会做增强，但是最终实现还是类本身
    public static void main(String[] args) {
        Base base = new BaseImpl();
        Decorator decorator = new Decorator(base);
        decorator.test();
    }
}
