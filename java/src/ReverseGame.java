// https://www.hackerrank.com/challenges/reverse-game
// t: number of test cases
// T: O(t)
// S: O(1)

import java.util.Scanner;

public class ReverseGame {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final int n = SCANNER.nextInt();
            final int k = SCANNER.nextInt();
            System.out.println(finalIndex(n, k));
        }
    }

    private static int finalIndex(int n, int k) {
        if (k < n / 2) return 2 * k + 1;
        return (n - 1 - k) * 2;
    }
}
