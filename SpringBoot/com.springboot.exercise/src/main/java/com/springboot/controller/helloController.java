package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class helloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name",defaultValue = "World") String name){
        String hello_ = String.format("Hello %s",name);
        return hello_;
    }
}
