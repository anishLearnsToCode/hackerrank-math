import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JimAndTheJokes {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final Map<Long, Long> frequencies = new HashMap<>();
        int testCases = SCANNER.nextInt();
        while (testCases -- > 0) {
            final int month = SCANNER.nextInt();
            final int day = SCANNER.nextInt();
            final Long value = decimalFromBase(day, month);
            if (value != null) {
                frequencies.put(value, frequencies.getOrDefault(value, 0L) + 1);
            }
        }
        System.out.println(sumNC2(frequencies.values()));
    }

    private static Long decimalFromBase(int n, int base) {
        if (base == 1) return null;
        long result = 0, factor = 1;
        while (n > 0) {
            if (n % 10 >= base) return null;
            result += factor * n % 10;
            n /= 10;
            factor *= base;
        }
        return result;
    }

    private static long sumNC2(Collection<Long> numbers) {
        long result = 0;
        for (long number : numbers) {
            result += nC2(number);
        }
        return result;
    }

    private static long nC2(long x) {
        return (x * (x - 1)) / 2;
    }
}
