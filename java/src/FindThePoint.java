import java.util.Scanner;

public class FindThePoint {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = SCANNER.nextInt();
        while (testCases-- > 0) {
            final int px = SCANNER.nextInt();
            final int py = SCANNER.nextInt();
            final int qx = SCANNER.nextInt();
            final int qy = SCANNER.nextInt();
            final int resultX = 2 * qx - px;
            final int resultY = 2 * qy - py;
            System.out.println(resultX + " " + resultY);
        }
    }
}
