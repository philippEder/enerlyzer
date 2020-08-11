package com.eder.enerlyzer.service.impl;

import com.eder.enerlyzer.entities.Day;
import com.eder.enerlyzer.repositories.DayRepository;
import com.eder.enerlyzer.service.DayService;
import com.eder.enerlyzer.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class DayServiceImpl implements DayService {

    @Autowired
    private DayRepository dayRepository;

    @Override
    public List<Day> getAll() {
        List<Day> ret = new ArrayList<>();
        dayRepository.findAll().forEach(ret::add);
        return ret;
    }

    @Override
    public List<Day> forRange(Calendar lower, Calendar upper) {

        List<Day> ret = new ArrayList<>();
        Iterable<Day> allDays = dayRepository.findAll();

        for (Day day : allDays) {
            if (DateUtils.isInBetween(day.getDate(), lower, upper)) {
                ret.add(day);
            }
        }

        return ret;
    }

}
