package com.adobe.aem.guides.wknd.spa.angular.core.service.impl;

import com.adobe.aem.guides.wknd.spa.angular.core.service.ApiService;
import com.adobe.aem.guides.wknd.spa.angular.core.service.UrlConnectionService;
import org.eclipse.jetty.util.IO;
import org.osgi.service.component.annotations.Component;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

import static com.adobe.aem.guides.wknd.spa.angular.core.constant.ApiConstants.COUNTRY_URL;

@Component(service = { UrlConnectionService.class } )
public class UrlConnectionServiceImpl implements UrlConnectionService{

    @Override
    public URLConnection getUrlConnection(String url) throws IOException {
        URLConnection connection = new URL(COUNTRY_URL).openConnection();
        return connection;
    }
}
