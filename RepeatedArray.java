import java.util.*;

class UserMainCode {
    public int findRepArray(int[] input1, int input2) {
        Set<Integer> seen = new HashSet<>();
        int lastElement = 0;
        boolean allNonPositive = true;

        for (int i = input2 - 1; i >= 0; i--) {
            int current = input1[i];

            if (current > 0) {
                allNonPositive = false;

                if (seen.contains(current)) {
                    return current;
                } else {
                    seen.add(current);
                }
            }

            if (i == input2 - 1) {
                lastElement = current;
            }
        }

        if (allNonPositive) {
            return 0;
        }

        return lastElement;
    }
}