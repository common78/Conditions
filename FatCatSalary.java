public class FatCatSalary {
    public static String calculateTotalSalary(int salary, boolean bonus) {
        int totalSalary = bonus ? salary * 10 : salary;
        return "£" + totalSalary;
    }

    public static void main(String[] args) {
        int salary1 = 50000;
        boolean bonus1 = true;

        int salary2 = 80000;
        boolean bonus2 = false;

        System.out.println(calculateTotalSalary(salary1, bonus1)); // £500000
        System.out.println(calculateTotalSalary(salary2, bonus2)); // £80000
    }
}
