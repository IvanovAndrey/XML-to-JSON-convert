package com.coursework.example.service;

import org.json.XML;
import org.springframework.stereotype.Service;
/**
 * XMLtoJSON convertor - converts XML to JSON
 *
 * @author Andrey Ivanov
 */
@Service
public class XmlToJsonService {
    /**
     * Converts XML to JSON
     *
     * @param xml  instance containing XML file
     * @return json containing the data from the XML
     */

    public String parseXmlToJson(String xml) {
        return XML.toJSONObject(xml).toString(1);
    }

    public String parseXmlFileToJson() {
        return "";
    }
}
