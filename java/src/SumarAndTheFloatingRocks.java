// https://www.hackerrank.com/challenges/harry-potter-and-the-floating-rocks
// t: test cases
// n: max(x, y)
// T: O(t * log(n))
// S: O(log(n))

import java.util.Objects;
import java.util.Scanner;

public class SumarAndTheFloatingRocks {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static final class Point {
        private final int x;
        private final int y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Point) obj;
            return this.x == that.x &&
                    this.y == that.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final int x1 = SCANNER.nextInt();
            final int y1 = SCANNER.nextInt();
            final int x2 = SCANNER.nextInt();
            final int y2 = SCANNER.nextInt();
            System.out.println(integralPointsBetween(new Point(x1, y1), new Point(x2, y2)));
        }
    }

    private static int integralPointsBetween(Point p1, Point p2) {
        if (p1.equals(p2)) return 0;
        if (p1.x == p2.x) return Math.abs(p1.y - p2.y) - 1;
        if (p1.y == p2.y) return Math.abs(p1.x - p2.x) - 1;
        final int diffX = Math.abs(p1.x - p2.x);
        final int diffY = Math.abs(p1.y - p2.y);
        final int slopeGcd = gcd(diffX, diffY);
        final int factor = diffX / slopeGcd;
        return (diffX - 1) / factor;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
