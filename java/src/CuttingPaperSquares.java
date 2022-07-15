// https://www.hackerrank.com/challenges/p1-paper-cutting
// T: O(1)
// S: O(1)

import java.util.Scanner;

public class CuttingPaperSquares {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final int m = SCANNER.nextInt();
        final int n = SCANNER.nextInt();
        System.out.println(minimumCuts(m, n));
    }

    private static long minimumCuts(long m, long n) {
        return m * n - 1;
    }
}
