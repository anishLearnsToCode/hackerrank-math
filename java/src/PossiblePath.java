// https://www.hackerrank.com/challenges/possible-path
// t: number of test cases
// n: max(a, b, x, y)
// T: O(t * log(n))
// S: O(log(n))

import java.util.Scanner;

public class PossiblePath {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final long a = SCANNER.nextLong();
            final long b = SCANNER.nextLong();
            final long x = SCANNER.nextLong();
            final long y = SCANNER.nextLong();
            System.out.println(canReach(a, b, x, y) ? "YES" : "NO");
        }
    }

    private static boolean canReach(long a, long b, long x, long y) {
        return gcd(a, b) == gcd(x, y);
    }

    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
