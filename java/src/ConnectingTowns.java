// https://www.hackerrank.com/challenges/connecting-towns
// t: number of test cases
// n: max number of cities in any test cases
// T: O(t * n)
// S: O(n)

import java.util.Scanner;

public class ConnectingTowns {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static final int MODULO = 1_234_567;

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final int towns = SCANNER.nextInt();
            final int[] distances = getArray(towns - 1);
            final int paths = totalPaths(distances);
            System.out.println(paths);
        }
    }

    private static int totalPaths(int[] array) {
        int result = 1;
        for (int element : array) {
            result = (result * element) % MODULO;
        }
        return result;
    }

    private static int[] getArray(int length) {
        final int[] array = new int[length];
        for (int i = 0 ; i < length ; i++) {
            array[i] = SCANNER.nextInt();
        }
        return array;
    }
}
