import java.io.*;
import java.util.*;

class UserMainCode {
    public static class Result {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }

    public Result findOriginalFirstAndSum(int[] input1, int input2) {
        int sum = input1[input1.length - 1];
        for (int i = input1.length - 2; i >= 0; i--) {
            input1[i] = input1[i] - input1[i + 1];
            sum += input1[i];
        }
        return new Result(input1[0], sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] input1 = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            input1[i] = scanner.nextInt();
        }

        System.out.print("Enter the second integer: ");
        int input2 = scanner.nextInt();

        UserMainCode umc = new UserMainCode();
        Result result = umc.findOriginalFirstAndSum(input1, input2);

        System.out.println("Original first element: " + result.output1);
        System.out.println("Sum of elements: " + result.output2);

        scanner.close();
    }
}
