// https://www.hackerrank.com/challenges/sherlock-and-moving-tiles
// t: test cases
// T: O(t)
// S: O(1)

import java.util.Scanner;

public class SherlockAndMovingTiles {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static final double SQRT_2 = Math.sqrt(2);

    public static void main(String[] args) {
        final int length = SCANNER.nextInt();
        final int v1 = SCANNER.nextInt();
        final int v2 = SCANNER.nextInt();
        final int velocityDiff = Math.abs(v1 - v2);
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final double area = SCANNER.nextDouble();
            System.out.println(time(area, length, velocityDiff));
        }
    }

    private static double time(double area, int length, int velocityDiff) {
        return SQRT_2 * (length - Math.sqrt(area)) / velocityDiff;
    }
}
