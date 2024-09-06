public class HollowAlphabetPattern {

    public static void main(String[] args) {
        int n = 7;
        printHollowA(n);
    }

    public static void printHollowA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n / 2 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
