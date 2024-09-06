import java.io.*;
import java.util.*;

class UserMainCode {
    public int seriesN(int input1, int input2, int input3, int input4) {
        int i = 3, diff = 0, next = 0;
        while (i < input4) {
            diff = input2 - input1;
            next = input3 + diff;
            input1 = input2;
            input2 = input3;
            input3 = next;
            i++;
        }
        return next;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first term of the series: ");
        int input1 = scanner.nextInt();
        
        System.out.print("Enter the second term of the series: ");
        int input2 = scanner.nextInt();
        
        System.out.print("Enter the third term of the series: ");
        int input3 = scanner.nextInt();
        
        System.out.print("Enter the position of the term to find: ");
        int input4 = scanner.nextInt();
        
        UserMainCode umc = new UserMainCode();
        int result = umc.seriesN(input1, input2, input3, input4);
        
        System.out.println("The term at position " + input4 + " is: " + result);
        
        scanner.close();
    }
}
