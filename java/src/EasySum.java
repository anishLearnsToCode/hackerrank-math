import java.util.Scanner;

public class EasySum {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final int n = SCANNER.nextInt();
            final int m = SCANNER.nextInt();
            final int rows = ceil((double) (n - m + 1) / m) + 1;
            final int k = m - ((n - m + 1) % m);
            System.out.println(summation(m - 1) * rows - (summation(m - 1) - summation(m - k - 1)));
        }
    }

    private static int ceil(double x) {
        return (int) Math.ceil(x);
    }

    private static long summation(long x) {
        return (x * (x + 1)) / 2;
    }
}
