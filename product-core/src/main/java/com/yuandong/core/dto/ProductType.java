package com.yuandong.core.dto;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
public enum ProductType {
    Domestic_Trade_Direct_Lease,
    Foreign_Trade_Direct_Lease,
    Leaseback,
    Delegated_Loan,
    Securities_Fund;
    private static final Map<String, String> type2processor = new HashMap<>(16);

    static {
        Arrays.stream(ProductType.values()).forEach(v -> type2processor.put(v.name(), v.name().replace("_", "") + "Processor"));
    }

    public static String getBeanName(String type) {
        return type2processor.get(type);
    }
}
