public class Use {
    public static int findPIN(int input1, int input2, int input3, int input4) {
        int sumEvenPositions = 0;
        int sumOddPositions = 0;
        int[] numbers = {input1, input2, input3};

        for (int number : numbers) {
            String numStr = String.valueOf(number);
            for (int i = 0; i < 4; i++) {
                int digit = Character.getNumericValue(numStr.charAt(3 - i));
                if ((i + 1) % 2 == 0) {
                    sumEvenPositions += digit;
                } else {
                    sumOddPositions += digit;
                }
            }
        }

        if (input4 % 2 == 0) {
            return sumEvenPositions - sumOddPositions;
        } else {
            return sumOddPositions - sumEvenPositions;
        }
    }

    public static void main(String[] args) {
        int input1 = 4413;
        int input2 = 5816;
        int input3 = 1780;
        int input4 = 25;
        System.out.println("PIN: " + findPIN(input1, input2, input3, input4));
    }
}
