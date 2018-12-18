package com.coursework.example.controller;

import com.coursework.example.service.XmlToJsonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * XML-to-JSON-service Controller.
 * <p>
 * Service waits for HTTP POST requests by path "localhost:8080/course-work"
 * and then handles them using XmlToJsonService clsass.
 *
 * @author Ivanov Andrey
 */

@RestController
@RequestMapping("/course-work")
public class Controller {

    private final XmlToJsonService service;

    public Controller(XmlToJsonService service) {
        this.service = service;
    }

    /**
     * HTTP POST requests handler.
     * <p>
     * Request format:
     * Content-Type:    multipart/form-data
     * Body:
     * <p>
     * Content-Disposition: form-data; name="xml"; filename="somemxl.xml"
     * Content-Type: text/plain
     * content of somefile.xml.
     * <p>
     * Request format:
     * Content-Type:    application/json;charset=UTF-8
     * Status-Code:     202 (Accepted)
     * Body:            json containing the data from the XML file.
     *
     * @param xml XML file - a part of multipart/form-data request body. Value for key "xml".
     * @return json containing the data from the XML file
     */
    @PostMapping
    public String xmlToJson(@RequestBody String xml) {
        return service.parseXmlToJson(xml);
    }

    @PostMapping("/file")
    public String xmlFileToJson() {
        return service.parseXmlFileToJson();
    }
}
