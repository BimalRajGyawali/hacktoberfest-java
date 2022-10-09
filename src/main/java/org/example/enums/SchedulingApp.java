package org.example.enums;

public class SchedulingApp {
    public static void main(String args[]){
        String str = "MONDAY";
        Schedule schedule = new Schedule();
        schedule.getRoutine(Day.valueOf(str));
    }
}
