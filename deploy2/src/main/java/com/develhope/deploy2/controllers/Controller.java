package com.develhope.deploy2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numbers")
public class Controller {
    @GetMapping("/random")
    public Integer sum(){
        return 3 + 5;
    }
}
