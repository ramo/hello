package com.example.hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello", produces = MediaType.TEXT_HTML_VALUE)
    public String hello() {
        return "Hello, My name is Ramo";
    }
}
