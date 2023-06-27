public class PhilipAgeCalculator {
    public static String calculateAge(int yearOfBirth, int targetYear) {
        int age = targetYear - yearOfBirth;

        if (age == 0) {
            return "You were born this very year!";
        } else if (age > 0) {
            return "You are " + age + (age == 1 ? " year" : " years") + " old.";
        } else {
            return "You will be born in " + (-age) + ((-age) == 1 ? " year" : " years") + ".";
        }
    }

    public static void main(String[] args) {
        int yearOfBirth1 = 2017;
        int targetYear1 = 2023;

        int yearOfBirth2 = 2015;
        int targetYear2 = 2015;

        int yearOfBirth3 = 2020;
        int targetYear3 = 2040;

        System.out.println(calculateAge(yearOfBirth1, targetYear1)); // You are 6 years old.
        System.out.println(calculateAge(yearOfBirth2, targetYear2)); // You were born this very year!
        System.out.println(calculateAge(yearOfBirth3, targetYear3)); // You are 20 years old.
    }
}

