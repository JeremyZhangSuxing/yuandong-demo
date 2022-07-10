package com.yuandong.core.dto;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
public class Decorator extends Base{
    private Base base;
    public Decorator(Base base) {
        this.base = base;
    }

    @Override
    public void test() {
        System.out.println("Decorator begin...");
        base.test();
        System.out.println("Decorator end ....");
    }
}
