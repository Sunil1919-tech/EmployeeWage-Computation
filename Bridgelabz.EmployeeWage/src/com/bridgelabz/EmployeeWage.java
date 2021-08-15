package com.bridgelabz;

public class EmployeeWage {
    public String companyName;
    public int maxHoursPerMonth;
    public int noOfWorkingDays;
    public int empRatePerHour;
    public int totalWage;

    public EmployeeWage(String companyName, int maxHoursPerMonth, int noOfWorkingDays, int empRatePerHour) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
        this.totalWage = totalWage;

    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Total wage for " + companyName + " is " + totalWage;
    }
}