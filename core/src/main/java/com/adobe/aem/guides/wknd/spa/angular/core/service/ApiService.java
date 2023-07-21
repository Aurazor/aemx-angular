package com.adobe.aem.guides.wknd.spa.angular.core.service;

import org.osgi.annotation.versioning.ProviderType;

import java.io.IOException;

@ProviderType
public interface ApiService {
    public String getResponse() throws IOException;
}
