package com.deepsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiService {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from the Deep Security API!";
    }
}
