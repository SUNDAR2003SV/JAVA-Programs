public class ReversedAlphabeticPyramid {

    public static void main(String[] args) {
        int n = 5;
        printReversedPyramid(n);
    }

    public static void printReversedPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
