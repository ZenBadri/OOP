public class typeconversion {
    public static void main(String[] args) {
        int intVar = 100;
        double doubleVar = intVar;
        System.out.println("Implicit Conversion:");
        System.out.println("Integer: " + intVar);
        System.out.println("Converted to Double: " + doubleVar);
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble;
        System.out.println("\nExplicit Conversion:");
        System.out.println("Double: " + anotherDouble);
        System.out.println("Converted to Integer: " + anotherInt);
        String strNumber = "123";
        int strToInt = Integer.parseInt(strNumber);
        System.out.println("\nString to Integer Conversion:");
        System.out.println("String: " + strNumber);
        System.out.println("Converted to Integer: " + strToInt);
        int num = 456;
        String intToStr = Integer.toString(num);
        System.out.println("\nInteger to String Conversion:");
        System.out.println("Integer: " + num);
        System.out.println("Converted to String: " + intToStr);
    }
}
