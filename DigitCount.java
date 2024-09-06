import java.io.*;
import java.util.*;

class UserMainCode {
    public int allDigitsCount(int input1) {
        int c = 0, r;
        while (input1 > 0) {
            r = input1 % 10;
            c++;
            input1 = input1 / 10;
        }
        return c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        
        UserMainCode umc = new UserMainCode();
        int digitCount = umc.allDigitsCount(input);
        
        System.out.println("Number of digits: " + digitCount);
    }
}
