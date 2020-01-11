package com.zy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class MyController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("........");
        return "nihao, spring boot!";
    }

}
