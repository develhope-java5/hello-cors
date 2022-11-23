package com.develhope.java5.hellocors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/custom")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }
}
