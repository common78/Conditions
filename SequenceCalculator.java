public class SequenceCalculator {
    public static long sequence(long n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            long a = 0;
            long b = 1;
            long c = 0;

            for (long i = 3; i <= n; i++) {
                c = (a + b) % 3;
                a = b;
                b = c;
            }

            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(sequence(1)); // 0
        System.out.println(sequence(2)); // 1
        System.out.println(sequence(3)); // 1
    }
}
