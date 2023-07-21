package com.adobe.aem.guides.wknd.spa.angular.core.models.impl;

import com.adobe.aem.guides.wknd.spa.angular.core.models.CountrySelectorComponent;
import com.adobe.aem.guides.wknd.spa.angular.core.models.CustomComponent;
import com.adobe.aem.guides.wknd.spa.angular.core.models.CustomCountryModel;
import com.adobe.aem.guides.wknd.spa.angular.core.service.ApiService;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.day.cq.wcm.api.components.Toolbar;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.io.IOException;

@Model(adaptables = SlingHttpServletRequest.class, adapters = { CountrySelectorComponent.class,
        ComponentExporter.class }, resourceType = CountrySelectorComponentImpl.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CountrySelectorComponentImpl implements CountrySelectorComponent {

//    @OSGiService
//    ApiService apiService;

    @ValueMapValue
    private String message;

    static final String RESOURCE_TYPE = "wknd-spa-angular/components/country-selector-component";
    private final ObjectMapper objectMapper = new ObjectMapper();
//    @Override
//    public CustomCountryModel[] getCountries() {
////        CustomCountryModel[] countryModels = {};
//        try {
////            String response = apiService.getResponse();
////            countryModels = objectMapper.readValue(response, CustomCountryModel[].class);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return countryModels;
//    }

    public String getMessage(){
        return message;
    }

    @Override
    public String getExportedType() {
        return CountrySelectorComponentImpl.RESOURCE_TYPE;
    }


}
