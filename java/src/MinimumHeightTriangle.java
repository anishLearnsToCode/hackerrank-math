// https://www.hackerrank.com/challenges/lowest-triangle
// T: O(1)
// S: O(1)

import java.util.Scanner;

public class MinimumHeightTriangle {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final int base = SCANNER.nextInt();
        final int area = SCANNER.nextInt();
        final int minHeight = minHeight(area, base);
        System.out.println(minHeight);
    }

    private static int minHeight(double area, double base) {
        return (int) Math.ceil(2 * area / base);
    }
}
