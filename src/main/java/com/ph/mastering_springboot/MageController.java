package com.ph.mastering_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MageController {


    @GetMapping("/welcome-user")
    public String welcomeUser() {
        return "Welcome User";
    }


}
