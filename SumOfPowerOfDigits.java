import java.io.*;
import java.util.*;
import java.lang.Math.*;

class UserMainCode {
    public int sumOfPowerOfDigits(int input1) {
        Integer sum = 0, r = 0, prev = 0;
        Double f1, f2;

        while (input1 > 0) {
            r = Integer.valueOf(input1 % 10);
            f1 = Double.valueOf(r);
            f2 = Double.valueOf(prev);
            
            if (prev != 0) {
                f1 = Math.pow(f1, f2);
            } else {
                f1 = Double.valueOf(r);
            }
            
            sum += f1.intValue();
            prev = Integer.valueOf(r);
            input1 /= 10;
        }
        
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        
        UserMainCode umc = new UserMainCode();
        int result = umc.sumOfPowerOfDigits(input);
        
        System.out.println("Sum of power of digits: " + result);
    }
}
