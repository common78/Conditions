public class CarRental {
    public static int calculateTotalCost(int days) {
        int totalCost = days * 40;

        if (days >= 7) {
            totalCost -= 50;
        } else if (days >= 3) {
            totalCost -= 20;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int days1 = 5;
        System.out.println(calculateTotalCost(days1));

        int days2 = 7;
        System.out.println(calculateTotalCost(days2));

        int days3 = 2;
        System.out.println(calculateTotalCost(days3));
    }
}
