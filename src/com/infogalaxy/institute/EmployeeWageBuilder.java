package com.infogalaxy.institute;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //display welcome message to user
        System.out.println("Welcome to Employee Wage Computation program Developed by Mayur");
        //UC-2 Calculate Daily Employee Wage
        final int WAGE_PER_HR = 20;
        final int FULL_TIME_HOUR = 8;
        final int PART_TIME_HOUR = 4;
        int total_wage = 0;
        //UC-1 employee Attendance
        Random random=new Random();
        int empAttendance =random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
            //UC-3 Add Part Time Employee and Wage
            Random random1 = new Random();
            int time = random.nextInt()%2;
            if(time == 0) {
                System.out.println("Employee is Part Time");
                total_wage=WAGE_PER_HR * PART_TIME_HOUR;
            } else {
                System.out.println("Employee is Full Time");
                total_wage = WAGE_PER_HR * FULL_TIME_HOUR;
            }
        }
        System.out.println("Total Wage = "+total_wage);


    }
}
