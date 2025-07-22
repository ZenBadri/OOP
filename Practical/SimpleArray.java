public class SimpleArray {
    public static void main(String[] args) {
        int[] scores = {88, 92, 75, 100, 85};
        
        System.out.println("The third score is: " + scores[2]);

        System.out.println("\nHere are all the scores:");
        for (int score : scores) {
            System.out.println(score);
        }
    }
}