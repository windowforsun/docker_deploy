package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/")
    public String root() {
        return "hello ~ spring boot docker jar";
    }

    @GetMapping("/echo/{str}")
    public String echoGet(@PathVariable String str){
        return str;
    }

    @PostMapping("/echo")
    public String echoPost(@RequestBody String str) {
        return str;
    }
}
