package com.example.week8;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Hello {
    String greeting = "Hello, world!";

    @GetMapping(value = "/hello", produces = "application/json")
    @ResponseBody
    public String sayHello(){
        String greeting = "Hello, world!";
        return greeting;
    }
}

