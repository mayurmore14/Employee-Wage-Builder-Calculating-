package com.infogalaxy.institute;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //display welcome message to user
        System.out.println("Welcome to Employee Wage Computation program Developed by Mayur");
        //UC-2 Calculate Daily Employee Wage
        final int WAGE_PER_HR = 20;
        //UC-3 Checking Employee is Part Time or Full time
        final int FULL_TIME_HOUR = 8;
        final int PART_TIME_HOUR = 4;
        //UC-1 employee Attendance
        Random random = new Random();
        //UC-5-Calculating Wages for a Month
        for(int i = 1;i <= 20;i ++) {
            int total_wage = 0;
            int empAttendance = random.nextInt() % 2;
            System.out.println(empAttendance);
            System.out.println("Day :"+ i);
            if (empAttendance == 0) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");

                int time = random.nextInt() % 2;
                //UC-4 Solving Using Switch Case Statement
                switch (time) {
                    case 0:
                        System.out.println("Employee is Part Time");
                        total_wage = WAGE_PER_HR * PART_TIME_HOUR;
                        break;
                    case 1:
                    case -1:
                        System.out.println("Employee is Full Time");
                        total_wage = WAGE_PER_HR * FULL_TIME_HOUR;
                        break;
                }
            }
            System.out.println("Total Wage = " + total_wage);
        }

    }
}
