package com.eder.enerlyzer.utils;

import com.eder.enerlyzer.entities.Day;

import java.lang.reflect.Field;

public class JsonUtils {

    public String toJson() {
        Day test = new Day();

        return null;
    }


    public static void main(String[] args) {
        Day test = new Day();
        Field[] dayFields = Day.class.getDeclaredFields();

        System.out.println(dayFields);

    }
}
