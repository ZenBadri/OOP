public class widening {
    public static void main(String[] args) {
        int a = 100;
        long b = a;
        float c = b;
        System.out.println("Int: " + a);
        System.out.println("Long: " + b);
        System.out.println("Float: " + c);
    }
}