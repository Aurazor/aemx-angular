package com.adobe.aem.guides.wknd.spa.angular.core.service.impl;

import com.adobe.aem.guides.wknd.spa.angular.core.service.ApiService;
import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.adobe.aem.guides.wknd.spa.angular.core.constant.ApiConstants.COUNTRY_URL;
import static com.adobe.aem.guides.wknd.spa.angular.core.constant.ApiConstants.USER_AGENT;

@Component(service = { ApiService.class } )
public class ApiServiceImpl implements ApiService {
    public String getResponse() throws IOException {
        String url = COUNTRY_URL;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return( response.toString() );
        } else {
            System.out.println("GET request did not work.");
        }
        return StringUtils.EMPTY;
    }
}
