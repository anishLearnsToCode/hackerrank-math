// https://www.hackerrank.com/challenges/leonardo-and-prime
// t: test cases
// n: max value of n in nay test case
// T: O(t * log(n))
// T: O(1)

import java.util.Scanner;

public class LeonardosPrimeFactors {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static final long[] SMALLEST_PRIME_FACTOR_PRODUCTS = {
            2, 6, 30, 210, 2310, 30030, 510510, 9699690, 223092870, 6469693230L, 200560490130L, 7420738134810L,
            304250263527210L, 13082761331670030L, 614889782588491410L
    };

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final long n = SCANNER.nextLong();
            final int result = maxDistinctPrimeFactorsBetween1And(n);
            System.out.println(result);
        }
    }

    private static int maxDistinctPrimeFactorsBetween1And(long x) {
        int index = binarySearch(x);
        if (index >= SMALLEST_PRIME_FACTOR_PRODUCTS.length) return index;
        return SMALLEST_PRIME_FACTOR_PRODUCTS[index] == x
                ? index + 1
                : index;
    }

    private static int binarySearch(long x) {
        final int length = SMALLEST_PRIME_FACTOR_PRODUCTS.length;
        int left = 0, right = length - 1, middle;
        while (left <= right) {
            middle = left + (right - left) / 2;
            if (SMALLEST_PRIME_FACTOR_PRODUCTS[middle] == x) return middle;
            else if (SMALLEST_PRIME_FACTOR_PRODUCTS[middle] > x) right = middle - 1;
            else left = middle + 1;
        }
        return left;
    }
}
