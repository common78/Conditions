public class LoveCalculator {
    public static boolean areTheyInLove(int flower1Petals, int flower2Petals) {
        boolean isTimmyInLove = flower1Petals % 2 == 0;
        boolean isSarahInLove = flower2Petals % 2 == 0;

        return isTimmyInLove != isSarahInLove;
    }

    public static void main(String[] args) {
        int petals1 = 3;
        int petals2 = 4;
        System.out.println(areTheyInLove(petals1, petals2)); // true

        int petals3 = 2;
        int petals4 = 6;
        System.out.println(areTheyInLove(petals3, petals4)); // false

        int petals5 = 1;
        int petals6 = 1;
        System.out.println(areTheyInLove(petals5, petals6)); // false
    }
}
