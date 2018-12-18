package com.coursework.example.controller;

import com.coursework.example.service.XmlToJsonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course-work")
public class Controller {

    private final XmlToJsonService service;

    public Controller(XmlToJsonService service) {
        this.service = service;
    }

    @PostMapping
    public String xmlToJson(@RequestBody String xml) {
        return service.parseXmlToJson(xml);
    }

    @PostMapping("/file")
    public String xmlFileToJson() {
        return service.parseXmlFileToJson();
    }
}
