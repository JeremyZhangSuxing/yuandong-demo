package com.yuandong.core.service;

import com.yuandong.core.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public abstract class AbstractCommonProcessor {
    private final ProjectNoProvider projectNoProvider;

    /**
     * 处理业务逻辑并返回唯一的项目单号
     */
    public String doCreateProject(ProductDto productDto) {
        // generate business number
        String generateNo = projectNoProvider.generateNo(productDto.getType());
        //process different business
        doProcess(productDto);
        return generateNo;
    }


    protected abstract void doProcess(ProductDto productDto);
}
