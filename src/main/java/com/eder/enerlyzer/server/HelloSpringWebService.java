package com.eder.enerlyzer.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringWebService {


    @RequestMapping("/")
    public String index() {
        return "was geht ab";
    }

    @RequestMapping("/days")
    public String allDays() {
        return "days..";
    }

}
