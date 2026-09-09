package com.example.demomvc.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home() {
        return "/home";
    }


}
