public class empWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        //constant
        int IS_PRESENT = 1;
        int HALF_TIME = 2;
        int FULL_TIME = 8;
        int PART_TIME = 4;
        int WAGE_PER_HR = 20;
        int dailyWage = 0;
        //calculation
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case 1:


                System.out.println("the Employee is Present" +IS_PRESENT);
                dailyWage = (WAGE_PER_HR * FULL_TIME);
                System.out.println("the daily Wage is " + dailyWage);
                break;

            case 2:

                System.out.println("the Employee Worked HalfDay" +HALF_TIME);
                dailyWage = (WAGE_PER_HR * PART_TIME);
                System.out.println("the daily Wage is " + dailyWage);
                break;

            default:
                System.out.println("the Employee is Absent");
                System.out.println("the daily Wage i " + dailyWage);
                break;

        }
    }
}