package com.adobe.aem.guides.wknd.spa.angular.core.models;

import com.adobe.aem.guides.wknd.spa.angular.core.models.impl.CountrySelectorComponentImpl;
import com.adobe.aem.guides.wknd.spa.angular.core.service.ApiService;
import com.adobe.aem.guides.wknd.spa.angular.core.service.ObjectMapperService;
import com.adobe.aem.guides.wknd.spa.angular.core.service.impl.ApiServiceImpl;
import com.adobe.xfa.Obj;
import com.day.cq.wcm.api.components.Toolbar;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.formula.functions.Count;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CountrySelectorComponentImplTest {

    @InjectMocks
    CountrySelectorComponentImpl countrySelectorComponent;
    @Mock
    ApiServiceImpl apiService;
    @Mock
    ObjectMapperService objectMapperService;

    @Test
    @DisplayName("Test get original countries success")
    public void testGetOriginalCountries_success() throws Exception {
        when(apiService.getResponseV2()).thenReturn(getDummyResponse());
        when(apiService.getDummyResponse()).thenReturn(getDummyResponse());
        when(objectMapperService.deserialize(anyString(), (Class<Object>) any())).thenReturn(getCustomCountryModels());

       CustomCountryModel[] countries =  countrySelectorComponent.getOriginalCountries();

    }

    private CustomCountryModel[] getCustomCountryModels() throws JsonProcessingException {
        CustomCountryModel customCountryModel1 = new CustomCountryModel("France", "22", "france.png");
        CustomCountryModel customCountryModel2 = new CustomCountryModel("Mauritius", "25", "mauritius.png");
        CustomCountryModel[] customCountryModels = {customCountryModel1, customCountryModel2};
        return customCountryModels;
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
