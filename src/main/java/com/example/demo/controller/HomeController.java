package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
        public String home() {
            return "Hello World!";
        }
    
        @GetMapping("/secured")
                public String secured() {
                    return "Hello, Secured!!";
                }
}
