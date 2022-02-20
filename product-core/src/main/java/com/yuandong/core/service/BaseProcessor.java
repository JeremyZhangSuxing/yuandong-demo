package com.yuandong.core.service;

import com.yuandong.core.dto.ProductDto;

public interface BaseProcessor {
    /**
     * 处理业务
     * @param productDto 产品信息
     * @return 唯一项目号
     */
    String doProcess(ProductDto productDto);
}
