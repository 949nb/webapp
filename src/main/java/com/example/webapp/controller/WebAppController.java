package com.example.webapp.controller;

import com.example.webapp.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class WebAppController {

    @GetMapping("/api")
    public User APIController() {
        return new User("小明", 18);
    }

    @GetMapping("/api/some-endpoint")
    public String[] getSomeData() {
        // 创建并返回一个响应对象。这里只是示例，你可以根据需要返回适当的数据。
        return new String[]{"创建并返回一个响应对象。这里只是示例，你可以根据需要返回适当的数据。"};
    }

    @GetMapping("/api/hello")
    public String[] hello() {
        // 创建并返回一个响应对象。这里只是示例，你可以根据需要返回适当的数据。
        return new String[]{"Hello, world!"};
    }

    @RequestMapping(value = "/{path:[^\\.]*}")
    public String redirect() {
        return "forward:/index.html";
    }
}
