package com.example.DemoApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlerR {
    @GetMapping("/Hi/vishnu")
    public String hi(){
        return "hi from vishnu";
    }

}
