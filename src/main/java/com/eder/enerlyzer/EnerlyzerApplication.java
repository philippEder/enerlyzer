package com.eder.enerlyzer;

import com.eder.enerlyzer.service.DayService;
import com.eder.enerlyzer.utils.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnerlyzerApplication {

    private static final Logger log = LoggerFactory.getLogger(EnerlyzerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EnerlyzerApplication.class, args);
    }

    @Bean
    public CommandLineRunner testData(DayService dayService) {
        return (args) -> {
            LogUtils.logStart(log, "Test Data Generator");

            log.info("DAYS IN DB: " +  dayService.getAll().size());


            LogUtils.logEnd(log, "Test Data Generator");
        };
    }

}
