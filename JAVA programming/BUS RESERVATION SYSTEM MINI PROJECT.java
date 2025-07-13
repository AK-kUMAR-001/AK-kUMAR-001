import java.util.Scanner;

// Normal bus
class Bus {
    String busNumber;
    String destination;
    int capacity;
    int bookedSeats;

    // Constructor
    public Bus(String busNumber, String destination, int capacity) {
        this.busNumber = busNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    // Book seat
    public boolean bookSeat(int seatsToBook) {
        if (bookedSeats + seatsToBook <= capacity) {
            bookedSeats += seatsToBook;
            return true;
        } else {
            return false;
        }
    }

    // Rate of normal bus
    int getRate() {
        return 700;
    }

    // toString()
    public String toString() {
        return "Normal-Bus : " +  
               "\n BUS Number : " + busNumber +
               "\n Destination : " + destination +
               "\n Capacity : " + capacity +
               "\n Booked Seats : " + bookedSeats +
               "\n Available Seats : " + (capacity - bookedSeats) +
               "\n Rate per Seat : " + getRate();
    }
}

// AC Bus subclass
class ACBus extends Bus {
    public ACBus(String busNumber, String destination, int capacity) {
        super(busNumber, destination, capacity);
    }

    int getRate() {
        return 1000;
    }

    public String toString() {
        return "AC-Bus : " +
               "\n BUS Number : " + busNumber +
               "\n Destination : " + destination +
               "\n Capacity : " + capacity +
               "\n Booked Seats : " + bookedSeats +
               "\n Available Seats : " + (capacity - bookedSeats) +
               "\n Rate per Seat : " + getRate();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create bus list
        Bus[] buses = new Bus[4];
        buses[0] = new ACBus("A101", "Chennai", 23);
        buses[1] = new Bus("B102", "Chennai", 25);
        buses[2] = new ACBus("A103", "Coimbatore", 23);
        buses[3] = new Bus("B104", "Coimbatore", 25);

        while (true) {
            System.out.println("\n=== BUS RESERVATION SYSTEM ===");
            System.out.println("1. Show all details");
            System.out.println("2. Book seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); // Clear buffer

            if (choice == 1) {
                for (int i = 0; i < buses.length; i++) {
                    System.out.println("\nBus "  + " Details:");
                    System.out.println(buses[i]);
                }
            } else if (choice == 2) {
                System.out.print("Enter the Bus Number: ");
                String busNum = input.nextLine();

                boolean found = false;

                for (int i = 0; i < buses.length; i++) {
                    if (buses[i].busNumber.equalsIgnoreCase(busNum)) {
                        found = true;
                        System.out.print("Enter number of seats to book: ");
                        int seats = input.nextInt();

                        if (buses[i].bookSeat(seats)) {
                            int total = buses[i].getRate() * seats;
                            System.out.println("** Ticket confirmed!");
                            System.out.println("Total Price: ₹" + total);
                        } else {
                            System.out.println("x Not enough seats available.");
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("x Bus not found.");
                }

            } else if (choice == 3) {
                System.out.println(" Thanks for using BRS [Axi]!");
                break;
            } else {
                System.out.println("xxx Invalid input, try again.");
            }
        }

        input.close();
    }
}
