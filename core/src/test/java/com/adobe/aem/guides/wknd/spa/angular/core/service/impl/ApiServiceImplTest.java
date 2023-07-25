package com.adobe.aem.guides.wknd.spa.angular.core.service.impl;

import com.adobe.aem.guides.wknd.spa.angular.core.service.ObjectMapperService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ApiServiceImplTest {

    @InjectMocks
    ApiServiceImpl sut;
    @Mock
    UrlConnectionServiceImpl urlConnectionService;


    @Test
    @DisplayName("Test getResponseV2 success")
    public void  getResponseV2_success() throws IOException {
        URLConnection urlConnection = mock(URLConnection.class);

        when(urlConnectionService.getUrlConnection(anyString())).thenReturn(urlConnection);
        doNothing().when(urlConnection).setRequestProperty(anyString(), anyString());
        when(urlConnection.getInputStream()).thenReturn(new ByteArrayInputStream("RESPONSE_BODY".getBytes()));
        String response = sut.getResponseV2();
        assertEquals("RESPONSE_BODY", response.toString());
    }

}
