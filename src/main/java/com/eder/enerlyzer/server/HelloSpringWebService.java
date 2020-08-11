package com.eder.enerlyzer.server;

import com.eder.enerlyzer.entities.Day;
import com.eder.enerlyzer.service.api.DayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloSpringWebService {

    @Autowired
    DayService dayService;

    @RequestMapping("/")
    public String index() {
        return "was geht ab";
    }

    @RequestMapping("/days")
    public String allDays() {
        List<Day>  days= dayService.getAll();

        return days.toString();
    }

}
