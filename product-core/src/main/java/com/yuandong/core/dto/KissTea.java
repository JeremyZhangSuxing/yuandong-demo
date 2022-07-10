package com.yuandong.core.dto;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
public class KissTea extends RefinedAbstractTea{

    protected KissTea(Size size) {
        super(size);
    }

    @Override
    public String getType() {
        return size.getSize()+"-"+"Kiss Tea";
    }

}
