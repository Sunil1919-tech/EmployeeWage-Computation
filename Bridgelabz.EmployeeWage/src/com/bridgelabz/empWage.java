package com.bridgelabz;

/**
 * empWage is a application that implements
 * employee wage detatils
 * simuklates the totalworking Wage.
 * Prints the output on screen
 * @author Sunil
 * @version 16.0
 * @since 13/08/2021
 */
public class empWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HR = 20;
     public static final int NUM_WORKING_DAYS = 20;
     public static final int MAX_WORKING_HRS = 100;

    public static int computEmpWage(){
        //variable decleration
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays =0;

        // Computation
        while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays< NUM_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day : " + totalWorkingDays + " Employee Hrs: " +empHrs);
        }
        int totalEmpWage = totalEmpHrs * WAGE_PER_HR;
        System.out.println("Total Employee Wage = " + totalEmpWage);
        return  totalEmpWage;
    }

    public static void main(String[] args) {
        computEmpWage();
    }


}