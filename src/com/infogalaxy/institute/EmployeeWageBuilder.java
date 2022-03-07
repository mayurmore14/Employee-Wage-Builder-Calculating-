package com.infogalaxy.institute;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //display welcome message to user
        System.out.println("Welcome to Employee Wage Computation program Developed by Mayur");
        //UC-2 Calculate Daily Employee Wage
        final int WAGE_PER_HR = 20;
        final int HOUR_PER_HR = 8;
        int total_wage = 0;
        //UC-1 employee Attendance
        Random random=new Random();
        int empAttendance =random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
            total_wage = WAGE_PER_HR * HOUR_PER_HR;
        }
        System.out.println("Total Wage = "+total_wage);


    }
}
