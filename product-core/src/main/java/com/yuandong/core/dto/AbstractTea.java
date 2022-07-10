package com.yuandong.core.dto;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
public abstract class AbstractTea {
    protected Size size;// 尺寸 作为侨界 属性存放在抽象类当中

    protected AbstractTea(Size size) {
        this.size = size;
    }

    public abstract String getType();
}
