public class TrafficLight {
    public static String changeLight(String currentLight) {
        switch (currentLight) {
            case "green":
                return "yellow";
            case "yellow":
                return "red";
            case "red":
                return "green";
            default:
                return "Invalid state";
        }
    }

    public static void main(String[] args) {
        String currentLight = "green";
        System.out.println(changeLight(currentLight));
    }
}
