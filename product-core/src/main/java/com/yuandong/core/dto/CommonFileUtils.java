package com.yuandong.core.dto;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CommonFileUtils {

    public static String standardFileName(String name) throws UnsupportedEncodingException {
        return URLEncoder.encode(name, "UTF-8").replace("\\+", "%20");
    }

    public static String standardFileName1(String name) throws UnsupportedEncodingException {
        return URLEncoder.encode(name, StandardCharsets.ISO_8859_1.displayName()).replace("\\+", "%20");
    }
    
}