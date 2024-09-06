import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the principal loan amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter the loan term in years: ");
        int years = scanner.nextInt();
        
        double monthlyPayment = calculateMonthlyPayment(principal, annualInterestRate, years);
        
        System.out.printf("The monthly mortgage payment is: %.2f\n", monthlyPayment);
        
        scanner.close();
    }

    public static double calculateMonthlyPayment(double principal, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = years * 12;
        double numerator = monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments);
        double denominator = Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;
        double monthlyPayment = principal * (numerator / denominator);
        return monthlyPayment;
    }
}
