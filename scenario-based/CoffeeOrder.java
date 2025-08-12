package java_program;


	import java.util.Scanner;

	class CoffeeOrder {
	    String size;
	    int price;

	    CoffeeOrder(String size) {
	        this.size = size;

	        if (size.equalsIgnoreCase("Small")) {
	            this.price = 50;
	        } else if (size.equalsIgnoreCase("Medium")) {
	            this.price = 70;
	        } else if (size.equalsIgnoreCase("Large")) {
	            this.price = 90;
	        } else {
	            System.out.println("Invalid size! Setting price to 0.");
	            this.price = 0;
	        }
	    }

	    void displayOrder() {
	        System.out.println("Coffee Size: " + size);
	        System.out.println("Price: ₹" + price);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter coffee size (Small/Medium/Large): ");
	        String size = sc.nextLine();

	        CoffeeOrder order = new CoffeeOrder(size);
	        order.displayOrder();

	        sc.close();
	    }
	}



