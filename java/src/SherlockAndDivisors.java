// https://www.hackerrank.com/challenges/sherlock-and-divisors
// t: number of test cases
// T: O(t * sqrt(n))
// S: O(1)

import java.util.Scanner;

public class SherlockAndDivisors {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final int n = SCANNER.nextInt();
            System.out.println(evenDivisors(n));
        }
    }

    private static int evenDivisors(final int n) {
        if (n % 2 == 1) return 0;
        int count = 1;
        for(int divisor = 2 ; divisor * divisor <= n ; divisor++){
            if(n % divisor == 0) {
                if (divisor % 2 == 0) count++;

                int dividend = n / divisor;
                if(dividend != divisor && dividend % 2 == 0) count++;
            }
        }
        return count;
    }
}
