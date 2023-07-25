package com.adobe.aem.guides.wknd.spa.angular.core.service.impl;

import com.adobe.aem.guides.wknd.spa.angular.core.service.ObjectMapperService;
import com.adobe.xfa.Obj;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperServiceImpl implements ObjectMapperService {
    @Override
    public <T> T deserialize(String json, Class<T> valueType) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, valueType);
    }
}
