package com.example.erouteservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eroute")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomeRouteService(){
         return "Welcome to eRoute Service...!";
    }
}
