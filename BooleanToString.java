public class BooleanToString {
    public static String booleanToString(boolean value) {
        return String.valueOf(value);
    }

    public static void main(String[] args) {
        boolean boolValue1 = true;
        boolean boolValue2 = false;

        System.out.println(booleanToString(boolValue1)); // "true"
        System.out.println(booleanToString(boolValue2)); // "false"
    }
}
