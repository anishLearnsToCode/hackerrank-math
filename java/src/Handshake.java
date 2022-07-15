// https://www.hackerrank.com/challenges/handshake
// T: O(t) t = number of test cases, for each test case O(1)
// S: O(1)

import java.util.Scanner;

public class Handshake {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final int people = SCANNER.nextInt();
            System.out.println(nC2(people));
        }
    }

    private static int nC2(int x) {
        return (x * (x - 1)) / 2;
    }
}
