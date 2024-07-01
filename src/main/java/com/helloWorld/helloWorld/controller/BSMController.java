package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/bsm")
public class BSMController {

    @GetMapping
    public String bsm() {
        return "BSM's : behavior and social ";
    }
}
