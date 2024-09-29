package com.nicolasrodi.scaffolding.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClient {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String url = "http://external-api:8080/";




}
