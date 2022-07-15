// https://www.hackerrank.com/challenges/restaurant
// t: number of test cases
// n: max of l and b in each entry
// T: O(t * log(n))
// S: O(1)

import java.util.Scanner;

public class Restaurant {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final int l = SCANNER.nextInt();
            final int b = SCANNER.nextInt();
            System.out.println(maximumNumberOfSquares(l, b));
        }
    }

    private static int maximumNumberOfSquares(int l, int b) {
        final int sideLength = gcd(l, b);
        return (l * b) / (sideLength * sideLength);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
