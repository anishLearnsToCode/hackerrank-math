// https://www.hackerrank.com/challenges/maximum-draws
// T: O(t) t = number of testcases, for each testcase O(1)
// S: O(1)

import java.util.Scanner;

public class MaximumDraws {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final int colors = SCANNER.nextInt();
            System.out.println(colors + 1);
        }
    }
}
