package com.eder.enerlyzer.utils;

import java.util.Calendar;

public class DateUtils {

    public static boolean isInBetween(Calendar value, Calendar upperBound, Calendar lowerBound) {
        return value.compareTo(upperBound) > 0 && value.compareTo(lowerBound) < 0;
    }

}
