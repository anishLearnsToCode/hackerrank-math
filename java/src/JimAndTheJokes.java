import java.util.Scanner;
import java.util.stream.LongStream;

public class JimAndTheJokes {
    private static final Scanner SCANNNER = new Scanner(System.in);

    public static void main(String[] args) {
        final long[] t = new long[38];
        for (int n = SCANNNER.nextInt(); n > 0; n--) {
            final int m = SCANNNER.nextInt();
            final int d = SCANNNER.nextInt();
            final String s = Integer.toString(d);
            if (m > 1 && s.chars().noneMatch(c -> c >= '0' + m)) {
                t[Integer.parseInt(s, m)]++;
            }
        }
        System.out.println(LongStream.of(t).map(k -> k * (k - 1) / 2).sum());
    }
}
