public class BusCapacity {
    public static int enoughSpace(int cap, int on, int wait) {
        int availableSpace = cap - on;
        if (availableSpace >= wait) {
            return 0;
        } else {
            return wait - availableSpace;
        }
    }

    public static void main(String[] args) {
        int capacity1 = 10;
        int onboard1 = 5;
        int waiting1 = 5;
        System.out.println(enoughSpace(capacity1, onboard1, waiting1)); // 0

        int capacity2 = 100;
        int onboard2 = 60;
        int waiting2 = 50;
        System.out.println(enoughSpace(capacity2, onboard2, waiting2)); // 10
    }
}

