package com.yuandong.core.dto;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Observable;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
public class ObservableTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setName("jeremy");

        subject.addObserver((o, param) -> update(o, subject));
        subject.modify();
        System.out.println("right after a session of change  " + subject);
    }

    private static void update(Observable o, Subject param) {
        System.out.println("subject original name is " + param.getName());
        param.setName("raped jeremy....");
    }
}
