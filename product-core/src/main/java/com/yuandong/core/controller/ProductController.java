package com.yuandong.core.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.yuandong.core.dto.CommonFileUtils;
import com.yuandong.core.dto.DemoExcelDTO;
import com.yuandong.core.dto.ProductDto;
import com.yuandong.core.dto.ProductType;
import com.yuandong.core.service.AbstractCommonProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
public class ProductController {
    private final Map<String, AbstractCommonProcessor> processorMap;

    @PostMapping("/product")
    public String processProduct(@RequestBody ProductDto productDto) {
        return processorMap.get(ProductType.getBeanName(productDto.getType()))
                .doCreateProject(productDto);
    }


    /**
     * excel 无内存溢出
     */
    @GetMapping("/excel/download")
    public void exportExcel(HttpServletResponse response) throws IOException {
        List<DemoExcelDTO> data = Collections.singletonList(new DemoExcelDTO("1"));
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        String fileName = "搬入搬出记录";
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + CommonFileUtils.standardFileName(fileName) + ".xlsx");
        EasyExcelFactory.write(response.getOutputStream(), DemoExcelDTO.class).sheet("").doWrite(data);
//        return CommonCodeResponse.success();
    }
}
