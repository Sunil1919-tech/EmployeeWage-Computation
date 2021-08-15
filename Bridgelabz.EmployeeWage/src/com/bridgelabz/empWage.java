package com.bridgelabz;

/**
 * purpose - to calculate Employee Wage
 * Prints the output on screen
 *
 * @author Sunil
 * @version 16.0
 * @since 13/08/2021
 */
public class empWage {
    //constants
    public static final int IS_FULLTIME = 1;
    public static final int IS_PARTTIME = 2;

    private int numOfCompany = 0;

    private EmployeeWage[] employeeWageArray;

    public empWage() {
        employeeWageArray = new EmployeeWage[10];  //array decleration
    }

        public void addCompanyWage (String companyName,int maxHoursPerMonth, int noOfWorkingDays, int empRatePerHour){
            employeeWageArray[numOfCompany] = new EmployeeWage(companyName, maxHoursPerMonth, noOfWorkingDays,
                    empRatePerHour);
            numOfCompany++;
        }

        public void computeWage () {
            for (int i = 0; i < numOfCompany; i++) {
                employeeWageArray[i].setTotalWage(this.computeWage(employeeWageArray[i]));
                System.out.println(employeeWageArray[i]);
            }
        }

        /**
         * This method is used to compute the employee wage
         */
        public int computeWage (EmployeeWage employeeWage){
            int empHrs = 0;
            int totalEmpHrs = 0;
            int totalWorkingDays = 0;
            /**
             * Using Math.random method to generate random numbers 0, 1 and 2
             */
            while (totalEmpHrs <= employeeWage.maxHoursPerMonth && totalWorkingDays < employeeWage.noOfWorkingDays) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case 0: // Employee is absent
                        empHrs = 0;
                    case 1: // FullTime Employee
                        empHrs = 8;
                        break;
                    case 2: // PartTime Employee
                        empHrs = 4;
                        break;
                }

                totalEmpHrs += empHrs;
                System.out.println("Day " + totalWorkingDays + " : Employee worked : " + empHrs + " Hours ");

            }
            totalEmpHrs += empHrs;
            System.out.println("Day#:" + totalWorkingDays + "Emp hr:" + empHrs);
            return totalEmpHrs * employeeWage.empRatePerHour;

        }

        public static void main (String[]args){
            System.out.println("Welcome To Employee Wage Computation Program");
            empWage wage = new empWage();
            wage.addCompanyWage("Dmart", 120, 24, 120);
            wage.addCompanyWage("Reliance", 100, 20, 80);
            wage.computeWage();
        }
    }
