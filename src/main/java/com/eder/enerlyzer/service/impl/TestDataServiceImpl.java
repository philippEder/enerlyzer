package com.eder.enerlyzer.service.impl;

import com.eder.enerlyzer.entities.Day;
import com.eder.enerlyzer.entities.Rating;
import com.eder.enerlyzer.repositories.DayRepository;
import com.eder.enerlyzer.service.TestDataService;
import com.eder.enerlyzer.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class TestDataServiceImpl implements TestDataService {

    final static Calendar DAY_ONE = DateUtils.create(11, 8, 2020, 17);
    final static Calendar DAY_TWO = DateUtils.create(30, 8, 2020, 17);
    final static Calendar DAY_THREE = DateUtils.create(11, 9, 2020, 17);
    final static Calendar DAY_FOUR = DateUtils.create(30, 9, 2020, 17);
    final static Calendar DAY_FIVE = DateUtils.create(11, 10, 2020, 17);

    @Autowired
    DayRepository dayRepository;

    @Override
    public void persistTestData() {

        Day dayOne = new Day();
        dayOne.setDate(DAY_ONE);
        dayOne.setSocial(Rating.GOOD);
        dayOne.setWork(Rating.GREAT);

        dayRepository.save(dayOne);
    }
}
