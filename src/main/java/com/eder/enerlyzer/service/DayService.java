package com.eder.enerlyzer.service;

import com.eder.enerlyzer.entities.Day;

import java.util.Calendar;
import java.util.List;

public interface DayService {
    List<Day> getAll();

    List<Day> forRange(Calendar lower, Calendar upper);
}
