package com.coke.masterdata.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {
    @GetMapping("/**/{path:[^\\.]*}")
    public String forward() {
        return "forward:/";
    }
}


