package org.example.Enums;

public class Schedule {

    public void getRoutine(Day day) {
        switch (day) {
            case SUNDAY:
                System.out.println("Today is push-up day.");
                break;
            case MONDAY:
                System.out.println("Today is pull-up Day.");
                break;
            case WEDNESDAY:
                System.out.println("Today is squat day.");
                break;
            case THURSDAY:
                System.out.println("Today is sprint Day.");
                break;
            default:
                System.out.println("Today is rest day.");
                break;
        }
    }
}
