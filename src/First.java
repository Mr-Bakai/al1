import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        double percent50 = 0.5;
        double percent30 = 0.3;
        double percent20 = 0.2;
        calculate(percent50, percent30, percent20);
    }

    private static void calculate(double percent50, double percent30, double percent20) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter amount: ");
            int salary = sc.nextInt();

            if (salary > 0) {
                double result50;
                result50 = salary * percent50;
                System.out.println("\n50% of your salary: " + result50);

                double bonus5 = result50 * 0.05;
                System.out.println("5% bonus: " + bonus5);

                double result30;
                result30 = salary * percent30;
                System.out.println("\n30% of salary: " + result30);

                double bonus8 = result50 * 0.08;
                System.out.println("5% bonus: " + bonus8);

                double result20;
                result20 = salary * percent20;
                System.out.println("\n20% of salary: "+ result20);

                double bonus10 = result20 * 0.10;
                System.out.println("10% bonus: " + bonus10);

                double totalBonus;
                totalBonus = (bonus5 + bonus8 + bonus10);

                double totalBonusWithSalary;
                totalBonusWithSalary = (salary + bonus5 + bonus8 + bonus10);

                System.out.println("\nYour total bonus for year: " + totalBonus);
                System.out.println("Your total salary with bonuses: " + totalBonusWithSalary);
                break;
            } else {
                System.out.println("Your amount should be greater then 0");
            }
        }
    }
}
