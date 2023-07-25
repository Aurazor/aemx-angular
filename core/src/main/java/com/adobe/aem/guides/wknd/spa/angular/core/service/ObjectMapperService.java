package com.adobe.aem.guides.wknd.spa.angular.core.service;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface ObjectMapperService {
    <T> T deserialize(String json, Class<T> valueType) throws Exception;

}
