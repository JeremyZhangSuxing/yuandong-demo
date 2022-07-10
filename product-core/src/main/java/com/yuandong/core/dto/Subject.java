package com.yuandong.core.dto;

import lombok.Data;

import java.util.Observable;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
@Data
public class Subject extends Observable {
    private String name;

    public void modify() {
        System.out.println("change current obj");
        this.setChanged();
        System.out.println("notify observable obj here...");
        this.notifyObservers();
    }
}
