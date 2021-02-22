package com.example.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderListController {
    @GetMapping("/orderList")
    public String orderList(){
        return "x-admin/order-list";
    }
}