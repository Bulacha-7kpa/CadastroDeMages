package com.ph.mastering_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {


    @GetMapping("/welcome-user")
    public String welcomeUser() {
        return "Welcome User";
    }


}
