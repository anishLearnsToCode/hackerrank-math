// https://www.hackerrank.com/challenges/strange-grid
// T: O(1)
// S: O(1)

import java.util.Scanner;

public class StrangeGridAgain {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final int r = SCANNER.nextInt();
        final int c = SCANNER.nextInt();
        System.out.println(integerValue(r, c));
    }

    private static long integerValue(final long row, final long column) {
        return 10 * ((row - 1) / 2) + (row - 1) % 2 + 2 * (column - 1);
    }
}
