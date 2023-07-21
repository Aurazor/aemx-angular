package com.adobe.aem.guides.wknd.spa.angular.core.models;
import com.adobe.aem.guides.wknd.spa.angular.core.models.impl.CustomComponentImpl;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;


public interface CountrySelectorComponent extends ComponentExporter{
//    public CustomCountryModel[] getCountries();
    public String getMessage();
}