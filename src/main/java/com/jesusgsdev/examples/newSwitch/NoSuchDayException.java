package com.jesusgsdev.examples.newSwitch;

public class NoSuchDayException extends Throwable {
    public NoSuchDayException(DayOfWeek day) {
        super("Day not valid: " + day.toString());
    }
}
