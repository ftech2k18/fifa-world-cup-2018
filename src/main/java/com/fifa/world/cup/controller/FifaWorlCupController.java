package com.fifa.world.cup.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FifaWorlCupController {
    private static final Logger log = Logger.getLogger(FifaWorlCupController.class.getName());

    @GetMapping("/")
    public String hello() {
        log.info("Simple Log Message");
        return "Fifa Worldcup 2018 Service";
    }

    @GetMapping("/hello")
    public String helloMessage() {
        log.info("/hello endpoint");
        return "Hello World";
    }
}
