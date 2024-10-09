package com.SimpleProject.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String handleHome()
    {
        System.out.println("Im here");
        return "Welocome to kathirvel sample project";
    }
}
