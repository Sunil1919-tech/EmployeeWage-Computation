package com.bridgelabz;

/**
 * empWage is a application that implements
 * employee wage details for multiple companies
 * simulates the totalworking Wage.
 * Prints the output on screen
 * @author Sunil
 * @version 16.0
 * @since 13/08/2021
 */
public class empWage {
    /*
     * Program To Calculate Employee Wage
     */

    //constants
    public static final int IS_PART_TIME = 0;
    public static final int IS_FULL_TIME = 1;

    /*
     * Declaring Method To Calculate EmpWage
     */
    public static int computeEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        int emphrs = 0;
        int totalemphrs = 0;
        int totalworkingdays = 0;
        System.out.println("welcome to the Employee wage builder for Multiple Companies program");
        //While Condition To Calculate Total EmpWage
        while (totalemphrs <= maxHoursPerMonth && totalworkingdays < numOfWorkingDays) {
            totalworkingdays++;
            int empcheck = (int) Math.floor(Math.random() * 10) % 2;
            switch (empcheck) {
                case IS_FULL_TIME:
                    emphrs = 8;
                    break;
                case IS_PART_TIME:
                    emphrs = 4;
                    break;
                default:
                    emphrs = 0;
            }
            totalemphrs = emphrs;
            System.out.println("Days:" + totalworkingdays + "empHrs: " + emphrs);
        }
        int totalempwage = totalemphrs * empRatePerHr;
        System.out.println("Total Emp Wage For Company: " + company + " is : " + totalempwage);
        return totalempwage;
    }

    /*
     * Declaring Main Method
     * Calling ComputeEmpWage Method Here
     */
    public static void main(String[] args) {
        computeEmpWage("Dmart", 20, 20, 50);
        computeEmpWage("Relaince", 30, 40, 70);
    }
}