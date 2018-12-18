package com.coursework.example.service;

import org.json.XML;
import org.springframework.stereotype.Service;

@Service
public class XmlToJsonService {


    public String parseXmlToJson(String xml) {
        return XML.toJSONObject(xml).toString(1);
    }

    public String parseXmlFileToJson() {
        return "";
    }
}
