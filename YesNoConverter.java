public class YesNoConverter {
    public static String convertBooleanToYesNo(boolean value) {
        return value ? "Yes" : "No";
    }

    public static void main(String[] args) {
        boolean bool1 = true;
        System.out.println(convertBooleanToYesNo(bool1)); // Yes

        boolean bool2 = false;
        System.out.println(convertBooleanToYesNo(bool2)); // No
    }
}
