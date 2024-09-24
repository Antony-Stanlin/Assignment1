package com.assignment;
import java.util.Scanner;

public class Question4 {
    
    enum WeekDay {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        new Question4().initial();
    }

    public void initial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the DAY value from 1 to 7:");
        int dayValue = sc.nextInt();
        sc.close();  

        if (dayValue <= 0 || dayValue > 7) {
            System.out.println("Please enter a day from 1 to 7");
            
        } 
        else {
            System.out.println(day(dayValue));
        }
    }

    private String day(int dayValue) {
        switch (dayValue) {
            case 1:
                return WeekDay.MONDAY.name();
            case 2:
                return WeekDay.TUESDAY.name();
            case 3:
                return WeekDay.WEDNESDAY.name();
            case 4:
                return WeekDay.THURSDAY.name();
            case 5:
                return WeekDay.FRIDAY.name();
            case 6:
                return WeekDay.SATURDAY.name();
            case 7:
                return WeekDay.SUNDAY.name();
            default:
                return "Invalid day";
        }
    }
}



