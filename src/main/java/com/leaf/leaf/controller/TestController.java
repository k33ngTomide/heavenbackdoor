package com.leaf.leaf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestController {

    @GetMapping("/getUsers")
    public List<?> getUsers(){
        RestTemplate restTemplate = new RestTemplate();
        String endpointUrl = "https://dummyjson.com/users";
        List<?> users = restTemplate.getForObject(endpointUrl, List.class);
        return users;
    }

    @GetMapping("/check")
    public String testEnd(){
        return "This is to prove to you that the backend is working fine";
    }

}
