package com.yuandong.core.dto;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */

public class Supplier {
    private String name;
    public Supplier(String name) {
        this.name = name;
    }
    public String doSupplier() {
        return name + "--供应商的接口";
    }
}
