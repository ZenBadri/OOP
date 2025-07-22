public class SimpleControlStructures {
    public static void main(String[] args) {
        int temperature = 25;

        if (temperature > 30) {
            System.out.println("It's a hot day!");
        } else {
            System.out.println("It's a cool day.");
        }

        System.out.println("\nI will count to 4:");
        for (int i = 0; i < 5; i++) {
            System.out.println("The number is: " + i);
        }
    }
}
