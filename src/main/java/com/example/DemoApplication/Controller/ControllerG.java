package com.example.DemoApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerG {
    @GetMapping("/hiG")
    public String sayHi() {
        return "Namaste Ji";
    }
}
