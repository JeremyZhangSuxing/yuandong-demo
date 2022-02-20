package com.yuandong.core.service;

import com.yuandong.core.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
@Slf4j
@Component("ForeignTradeDirectLeaseProcessor")
public class ForeignTradeDirectLeaseProcessor extends AbstractCommonProcessor{
    public ForeignTradeDirectLeaseProcessor(ProjectNoProvider projectNoProvider) {
        super(projectNoProvider);
    }

    @Override
    public void doProcess(ProductDto productDto) {
        log.info("deal with ForeignTradeDirectLease here ....");
    }
}
