package com.yuandong.core.dto;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
public class MockUserService {
    public void queryUser() {
        DBUtil dbUtil = DBUtilFactory.getFlyweight();
        dbUtil.selectData();
    }

    public static void main(String[] args) {
        new MockUserService().queryUser();
    }
}
