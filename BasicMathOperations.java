public class BasicMathOperations {
    public static double calculateResult(char operator, double value1, double value2) {
        double result = 0;

        switch (operator) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                result = value1 / value2;
                break;
            default:
                System.out.println("Invalid operator!");
        }

        return result;
    }

    public static void main(String[] args) {
        char operator1 = '+';
        double value1 = 4;
        double value2 = 7;
        System.out.println(calculateResult(operator1, value1, value2)); // 11.0

        char operator2 = '-';
        double value3 = 15;
        double value4 = 18;
        System.out.println(calculateResult(operator2, value3, value4)); // -3.0

        char operator3 = '*';
        double value5 = 5;
        double value6 = 5;
        System.out.println(calculateResult(operator3, value5, value6)); // 25.0

        char operator4 = '/';
        double value7 = 49;
        double value8 = 7;
        System.out.println(calculateResult(operator4, value7, value8)); // 7.0
    }
}
