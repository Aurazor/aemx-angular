package com.adobe.aem.guides.wknd.spa.angular.core.service.impl;

import com.adobe.aem.guides.wknd.spa.angular.core.service.ApiService;
import com.adobe.aem.guides.wknd.spa.angular.core.service.ObjectMapperService;
import com.adobe.aem.guides.wknd.spa.angular.core.service.UrlConnectionService;
import com.drew.lang.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import static com.adobe.aem.guides.wknd.spa.angular.core.constant.ApiConstants.COUNTRY_URL;
import static com.adobe.aem.guides.wknd.spa.angular.core.constant.ApiConstants.USER_AGENT;

@Component(service = { ApiService.class } )
public class ApiServiceImpl implements ApiService {

    @Reference
    UrlConnectionService urlConnectionService;


    public String getResponseV2()  {
        try {
            URLConnection connection = urlConnectionService.getUrlConnection(COUNTRY_URL);
            String charset = java.nio.charset.StandardCharsets.UTF_8.name();
            connection.setRequestProperty("Accept-Charset", charset);
            InputStream response = connection.getInputStream();
            try (Scanner scanner = new Scanner(response)) {
                String responseBody = scanner.useDelimiter("\\A").next();
                System.out.println(responseBody);
                return responseBody;
            }
        }catch (IOException e) {
            return StringUtils.EMPTY;
        }
    }

    public String getDummyResponse(){
        String json = "[\n" +
                "  {\n" +
                "    \"name\": \"Mauritius\",\n" +
                "    \"code\": \"230\",\n" +
                "    \"image\": \"https://flagpedia.net/data/flags/w1600/mu.png\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"England\",\n" +
                "    \"code\": \"44\",\n" +
                "    \"image\": \"https://cdn.britannica.com/44/344-004-494CC2E8/Flag-England.jpg\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"United State\",\n" +
                "    \"code\": \"1\",\n" +
                "    \"image\": \"https://usflag.com/media/catalog/product/cache/eba4e5d242d0b6c2c5eaa45d6af5a7ad/u/s/us-flag_25.jpg\"\n" +
                "  }\n" +
                "]\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n";

        return json;
    }
}
