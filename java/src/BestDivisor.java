// https://www.hackerrank.com/challenges/best-divisor
// T: O(N log(N))
// S: O(1)

import java.util.Scanner;

public class BestDivisor {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static final class Number implements Comparable<Number> {
        private final int value;
        private final int sumOfDigits;

        Number(int value) {
            this.value = value;
            this.sumOfDigits = sumOfDigits(value);
        }

        private int sumOfDigits(int x) {
            int result = 0;
            while (x > 0) {
                result += x % 10;
                x /= 10;
            }
            return result;
        }

        @Override
        public int compareTo(Number o) {
            if (this.sumOfDigits == o.sumOfDigits) return Integer.compare(o.value, this.value);
            return Integer.compare(this.sumOfDigits, o.sumOfDigits);
        }
    }

    public static void main(String[] args) {
        final int n = SCANNER.nextInt();
        final Number input = new Number(n);
        Number result = input;
        for (int i = 1 ; i <= n / 2 ; i++) {
            if (n % i == 0) {
                final Number number = new Number(i);
                if (number.compareTo(input) > 0 && number.compareTo(result) > 0) {
                    result = number;
                }
            }
        }
        System.out.println(result.value);
    }
}
