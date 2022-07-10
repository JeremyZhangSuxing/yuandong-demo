package com.yuandong.core.dto;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
public abstract class RefinedAbstractTea extends AbstractTea {

    protected RefinedAbstractTea(Size size) {
        super(size);
    }

    public String getSize() {
        return size.getSize();
    }
}
