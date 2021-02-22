package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CityController {
    @GetMapping("/city")
    public String city(){
        return "x-admin/city";
    }
}
