package com.example.fashinn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ProductController {

    @GetMapping("/customer")
    String demo()
    {
        return "customer/index";
    }
}
