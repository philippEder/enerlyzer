package com.eder.enerlyzer.utils;

import java.util.Calendar;

public class DateUtils {

    public static boolean isInBetween(Calendar value, Calendar upperBound, Calendar lowerBound) {
        return value.compareTo(upperBound) > 0 && value.compareTo(lowerBound) < 0;
    }

    public static Calendar create(int dayOfMonth, int month, int year, int hourOfDay) {
        Calendar ret = Calendar.getInstance();
        ret.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        ret.set(Calendar.MONTH, month);
        ret.set(Calendar.YEAR, year);
        ret.set(Calendar.HOUR_OF_DAY, hourOfDay);

        ret.set(Calendar.MILLISECOND, 0);
        ret.set(Calendar.SECOND, 0);
        ret.set(Calendar.MINUTE, 0);

        return ret;
    }

}
