package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAppController {
    @GetMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        // Forward到index.html让前端路由处理
        return "forward:/index.html";
    }
}
