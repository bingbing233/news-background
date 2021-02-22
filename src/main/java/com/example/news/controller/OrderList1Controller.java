package com.example.news.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class OrderList1Controller {
    @GetMapping("/orderList1")
    public String orderList1(){
        return "x-admin/order-list1";
    }
}
