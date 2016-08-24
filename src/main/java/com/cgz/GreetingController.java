package com.cgz;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;


@RestController
public class GreetingController {

    private Resource jsonInput;

    @Autowired
    public GreetingController(@Value("static/navigation.json") Resource jsonInput) {
        this.jsonInput=jsonInput;
    }

    @RequestMapping("/greeting")
    public Map<String, List<NavigationNode>>  greeting( ) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Map<String, List<NavigationNode>> myObjects = mapper.readValue(jsonInput.getFile(), new TypeReference<Map<String, List<NavigationNode>>>(){});

        return myObjects;
    }

}