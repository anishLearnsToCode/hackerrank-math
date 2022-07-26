// https://www.hackerrank.com/challenges/most-distant
// T: O(N)
// S: O(1)

import java.util.Scanner;

public class MostDistant {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int N = SCANNER.nextInt();
        int xMin = 0, xMax = 0, yMin = 0, yMax = 0;

        xMin = xMax = SCANNER.nextInt();
        yMin = yMax = SCANNER.nextInt();

        for (int i = 1 ; i < N ; i++) {
            final int x = SCANNER.nextInt();
            final int y = SCANNER.nextInt();
            yMin = Math.min(yMin, y);
            yMax = Math.max(yMax, y);
            xMin = Math.min(xMin, x);
            xMax = Math.max(xMax, x);
        }

        double distance = max(
                xMax - xMin,
                yMax - yMin,
                distance(xMin, yMin),
                distance(xMin, yMax),
                distance(yMin, xMax),
                distance(yMax, xMax)
        );

        System.out.println(distance);
    }

    private static double distance(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    private static double max(double... numbers) {
        double result = Double.MIN_VALUE;
        for (double number : numbers) {
            result = Math.max(result, number);
        }
        return result;
    }
}
