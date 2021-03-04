package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnicodeController {
    @GetMapping("/unicode")
    public String unicode(){
        return "x-admin/unicode";
    }
}
