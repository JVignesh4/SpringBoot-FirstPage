package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class Controller {

    @RequestMapping("/welcome")
    public String firstPage() {
        return "Welcome to Bridgelabz";
    }

}
