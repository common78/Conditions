public class OppositeNumber {
    public static void main(String[] args) {
        int integerNumber = 1;
        float floatingPointNumber = 14.0f;
        double doubleNumber = -34.0;

        int oppositeInteger = -integerNumber;
        float oppositeFloatingPoint = -floatingPointNumber;
        double oppositeDouble = -doubleNumber;

        System.out.println("Opposite of " + integerNumber + ": " + oppositeInteger);
        System.out.println("Opposite of " + floatingPointNumber + ": " + oppositeFloatingPoint);
        System.out.println("Opposite of " + doubleNumber + ": " + oppositeDouble);
    }
}
