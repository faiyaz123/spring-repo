package com.ums.vcommon.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vcommon/v1")
public class ConfigController {

    @GetMapping(value = "/answer")
    public String theAnswer(){
        return "The Answer to the Ultimate Question of Life, the Universe, and Everything is 42";
    }
}
