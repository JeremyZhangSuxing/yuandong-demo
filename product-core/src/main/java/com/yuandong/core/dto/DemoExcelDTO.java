package com.yuandong.core.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DemoExcelDTO {
    @ExcelProperty(value = "用户名", index = 0)
    private String username;

}