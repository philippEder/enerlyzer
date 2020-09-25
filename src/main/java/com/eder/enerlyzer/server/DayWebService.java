package com.eder.enerlyzer.server;

import com.eder.enerlyzer.service.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayWebService {

    @Autowired
    DayService dayService;

    @GetMapping("/all")
    public String index() {
        dayService.getAll();


        return "was geht ab";
    }

    @RequestMapping("/days")
    public String allDays() {
        return "days..";
    }

}
