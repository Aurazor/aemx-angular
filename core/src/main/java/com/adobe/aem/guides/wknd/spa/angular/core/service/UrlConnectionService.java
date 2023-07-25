package com.adobe.aem.guides.wknd.spa.angular.core.service;

import org.osgi.annotation.versioning.ProviderType;

import java.io.IOException;
import java.net.URLConnection;

@ProviderType
public interface UrlConnectionService {
    URLConnection getUrlConnection(String url) throws IOException;
}
