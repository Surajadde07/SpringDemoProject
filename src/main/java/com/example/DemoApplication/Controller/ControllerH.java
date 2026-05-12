package com.example.DemoApplication.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerH {

    @GetMapping("/hi/Harshit")
    public String sayHi() {
        return "Hi Harshit!";
    }
}
