package com.example.DemoApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rachit_Controller {
    @GetMapping
    public String getData(){
        return "Hello Rachit";
    }
}
