import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position in Fibonacci sequence:");
        int position = scanner.nextInt();
        
        if (position < 0) {
            System.out.println("Position cannot be negative.");
        } else {
            int result = fibonacci(position);
            System.out.println("Fibonacci number at position " + position + " is " + result);
        }
    }
}
