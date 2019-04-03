package com.jesusgsdev.examples.newSwitch;

public class SwitchExample {

    public Integer getDayOfWeek(DayOfWeek day) throws NoSuchDayException {
        int numLetters;
        switch(day){
            case MONDAY: case FRIDAY: case SUNDAY:
                numLetters=6;
                break;
            case TUESDAY:
                numLetters=7;
                break;
            case THURSDAY: case SATURDAY:
                numLetters=9;
                break;
            case WEDNESDAY:
                numLetters=10;
                break;
            default:
                throw new NoSuchDayException(day);
        }

        return numLetters;
    }

    public Integer newGetDayOfWeek(DayOfWeek day) throws NoSuchDayException {
        return switch(day)
                {
                    case MONDAY, FRIDAY, SUNDAY -> 6;
                    case TUESDAY -> 7;
                    case THURSDAY, SATURDAY -> 8;
                    case WEDNESDAY -> 9;
                    default -> throw new NoSuchDayException(day);
                };
    }

}
