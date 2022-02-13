package com.example.hellospring.spring.app;

import com.example.hellospring.spring.app.api.AmiiboResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AmiiboController {

    private String endpointRoot = "https://www.amiiboapi.com/api/";

    @GetMapping("/amiibo")
    public AmiiboResponse getAmiibo() {

        RestTemplate template = new RestTemplate();

        String url = endpointRoot + "amiibo/";

        AmiiboResponse quote = template.getForObject(
                url, AmiiboResponse.class);
        return quote;
    }
}
