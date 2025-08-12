package java_program;

import java.util.Scanner;

class MovieTicket {
    String movieName;
    int ticketCount;
    String seatType;
    int pricePerTicket;

    
    MovieTicket(String movieName, int ticketCount) {
        this(movieName, ticketCount, "Normal"); 
    }

    
    MovieTicket(String movieName, int ticketCount, String seatType) {
        this.movieName = movieName;
        this.ticketCount = ticketCount;
        this.seatType = seatType;

        
        if (seatType.equalsIgnoreCase("Normal")) {
            this.pricePerTicket = 150;
        } else if (seatType.equalsIgnoreCase("VIP")) {
            this.pricePerTicket = 300;
        } else {
            System.out.println("Invalid seat type! Setting price to 0.");
            this.pricePerTicket = 0;
        }
    }

    
    void displayBooking() {
        int totalPrice = pricePerTicket * ticketCount;
        System.out.println("Movie: " + movieName);
        System.out.println("Tickets: " + ticketCount);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Price per Ticket: ₹" + pricePerTicket);
        System.out.println("Total Price: ₹" + totalPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();
        System.out.print("Enter ticket count: ");
        int count = sc.nextInt();
        sc.nextLine(); 

        MovieTicket booking1 = new MovieTicket(movie, count);
        booking1.displayBooking();

        System.out.println("\n---\n");

        
        System.out.print("Enter movie name: ");
        String movie2 = sc.nextLine();
        System.out.print("Enter ticket count: ");
        int count2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter seat type (Normal/VIP): ");
        String seatType = sc.nextLine();

        MovieTicket booking2 = new MovieTicket(movie2, count2, seatType);
        booking2.displayBooking();

        sc.close();
    }
}
