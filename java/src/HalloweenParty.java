// https://www.hackerrank.com/challenges/halloween-party
// t: number of test cases
// T: O(t)
// S: O(1)

import java.util.Scanner;

public class HalloweenParty {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final long cuts = SCANNER.nextLong();
            System.out.println(maxBlocks(cuts));
        }
    }

    private static long maxBlocks(final long n) {
        return (n / 2) * (n - n / 2);
    }
}
