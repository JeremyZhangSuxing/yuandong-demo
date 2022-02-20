package com.yuandong.core.controller;

import com.yuandong.core.dto.ProductDto;
import com.yuandong.core.dto.ProductType;
import com.yuandong.core.service.AbstractCommonProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
