public class DivisibleByTwoNumbers {
    public static boolean isDivisible(int n, int x, int y) {
        return n % x == 0 && n % y == 0;
    }

    public static void main(String[] args) {
        int n1 = 3, x1 = 1, y1 = 3;
        int n2 = 12, x2 = 2, y2 = 6;
        int n3 = 100, x3 = 5, y3 = 3;
        int n4 = 12, x4 = 7, y4 = 5;

        System.out.println(isDivisible(n1, x1, y1)); // true
        System.out.println(isDivisible(n2, x2, y2)); // true
        System.out.println(isDivisible(n3, x3, y3)); // false
        System.out.println(isDivisible(n4, x4, y4)); // false
    }
}
