// https://www.hackerrank.com/challenges/game-with-cells
// T: O(1)
// S: O(1)

import java.util.Scanner;

public class ArmyGame {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final int n = SCANNER.nextInt();
        final int m = SCANNER.nextInt();
        System.out.println(minimumPackages(m, n));
    }

    private static int minimumPackages(double m, double n) {
        return (int) (Math.ceil(m / 2) * Math.ceil(n / 2));
    }
}
