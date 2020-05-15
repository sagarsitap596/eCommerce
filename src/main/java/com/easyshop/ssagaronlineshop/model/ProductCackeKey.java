package com.easyshop.ssagaronlineshop.model;

import java.lang.reflect.Method;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Service;

@Service("customKeyGenerator")
public class ProductCackeKey implements KeyGenerator {
    
    private static final String CACHE_FIELD_DELIMITER   = "#";
    private static final String ADVANCE_ID_CACHE_PREFIX = "AAP_LOC";

    public Object generate(Object target, Method method, Object... params) {

        return createLocationMasterCacheKey(params[0].toString(),params[1].toString(),params[2].toString());
    }
    
    private String createLocationMasterCacheKey(final String locationId, final String locationType,
            final String organization)
    {
        String result = locationId + CACHE_FIELD_DELIMITER + locationType + CACHE_FIELD_DELIMITER + organization;
        return result;
    }

}
