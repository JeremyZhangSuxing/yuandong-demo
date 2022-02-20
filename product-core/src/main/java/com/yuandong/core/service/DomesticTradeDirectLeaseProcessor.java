package com.yuandong.core.service;

import com.yuandong.core.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("DomesticTradeDirectLeaseProcessor")
public class DomesticTradeDirectLeaseProcessor extends AbstractCommonProcessor {

    public DomesticTradeDirectLeaseProcessor(ProjectNoProvider projectNoProvider) {
        super(projectNoProvider);
    }

    @Override
    public void doProcess(ProductDto productDto) {
        log.info("deal with DomesticTradeDirectLease here ....");
    }
}
