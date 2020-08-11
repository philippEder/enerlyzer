package com.eder.enerlyzer.utils;

import org.slf4j.Logger;

public class LogUtils {

    static final String START_MESSAGE = "______START RUNNING *______";
    static final String END_MESSAGE = "______END RUNNING *______";

    public  static void logStart(Logger logger, String message) {
        logger.info(START_MESSAGE.replace("*", message));
    }

    public static void logEnd(Logger logger, String message) {
        logger.info(END_MESSAGE.replace("*", message));
    }

}
