package com.example.DemoApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KController {

    public class KController {

        @GetMapping("/hi")
        public String sayHi() {
            return "Hi from Khushi";
        }
    }
}
