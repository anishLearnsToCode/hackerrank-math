// https://www.hackerrank.com/challenges/filling-jars
// m: operations
// T: O(m)
// S: O(1)

import java.util.Scanner;

public class FillingJars {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final int jars = SCANNER.nextInt();
        final int operations = SCANNER.nextInt();
        long candies = 0;
        for (int i = 0 ; i < operations ; i++) {
            final long a = SCANNER.nextLong();
            final long b = SCANNER.nextLong();
            final long k = SCANNER.nextLong();
            candies += k * (b - a + 1);
        }
        System.out.println(candies / jars);
    }
}
