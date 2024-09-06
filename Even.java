import java.util.Scanner;

class UserMainCode {
    public int isEven(int input1) {
        if (input1 % 2 == 0) return 2;
        else return 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        UserMainCode code = new UserMainCode();
        int result = code.isEven(input1);
        System.out.println(result);
    }
}
