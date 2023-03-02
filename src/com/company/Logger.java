package com.company;

import java.util.Date;

public class Logger {
    private static Logger logger;
    protected int num = 1;
    Date date = new Date();

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println(date.toString() + " [" + num++ + "] " + msg);
    }

}
