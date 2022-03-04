package com.infogalaxy.institute;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //display welcome message to user
        System.out.println("Welcome to Employee Wage Computation program Developed by Mayur");
        Random random=new Random();
        int empAttendance =random.nextInt()%2;
        System.out.println(empAttendance);
        //UC-1 employee is absent or present
        if(empAttendance == 0) {
            System.out.println("Employee is absent");
        } else {
            System.out.println("Employee is Present");
        }

    }
}
