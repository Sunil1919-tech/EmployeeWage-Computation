public class empWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

//constant
        int IS_PRESENT = 1;
        int FULL_TIME = 8;
        int WAGE_PER_HR = 20;
        int dailyWage = 0;
        //calculation
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT) {
            System.out.println(" Employee is Present");
            dailyWage = FULL_TIME * WAGE_PER_HR;
            System.out.println("the Salary is " + dailyWage);
        } else {
            System.out.println(" Employee is Absent");
            System.out.println(dailyWage);
        }
    }
}