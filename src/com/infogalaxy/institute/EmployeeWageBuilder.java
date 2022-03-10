package com.infogalaxy.institute;

import java.util.Random;

public class EmployeeWageBuilder {
    int working_hrs = 0;
    int working_days = 0;
    int total_wage = 0;
    Random random = new Random();
    public static void main(String[] args) {
        EmployeeWageBuilder sc = new EmployeeWageBuilder();
        sc.calculationwage();
        sc.displaywage();
    }
    void calculationwage() {
        System.out.println("Welcome to Employee Wage Computation program Developed by Mayur");
        while (working_hrs <= Constants.TOTAL_WORKING_HRS && working_days < Constants.WORKING_DAYS) {
            working_days++;
            System.out.println("Day :" + working_days);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                int time = random.nextInt() % 2;
                if (time < 0) {
                    time = -time;
                }
                switch (time) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is Part Time");
                        total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.PART_TIME_HOUR);
                        working_hrs = working_hrs + Constants.PART_TIME_HOUR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is Full Time");
                        total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.FULL_TIME_HOUR);
                        working_hrs = working_hrs + Constants.FULL_TIME_HOUR;
                        break;
                }
            }
        }
    }
    void displaywage(){
        System.out.println("Total Month Wage = " + total_wage);
        System.out.println("Total Working Hours =" + working_hrs);
    }
}

