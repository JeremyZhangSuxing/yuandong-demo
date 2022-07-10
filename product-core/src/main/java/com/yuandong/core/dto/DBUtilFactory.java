package com.yuandong.core.dto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author jeremy.zhang
 * @date 2022-07-10
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DBUtilFactory {
    private static final DBUtil dbUtil = new DBUtil();

    public static DBUtil getFlyweight() {
        System.out.println("build DBUtil by flyweight");
        return dbUtil;
    }
}
