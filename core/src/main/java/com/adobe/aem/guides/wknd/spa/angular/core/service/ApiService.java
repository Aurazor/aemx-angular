package com.adobe.aem.guides.wknd.spa.angular.core.service;

import org.osgi.annotation.versioning.ProviderType;

import java.io.IOException;

@ProviderType
public interface ApiService {
    String getDummyResponse();
    String getResponseV2() ;

}
