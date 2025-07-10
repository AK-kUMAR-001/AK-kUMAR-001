public class laptop {
    String name;
    String proc;
    double price = 0.00;
    int ram = 0;

    public String allDetails() {
        // Return all values in one formatted string.
        return "LAPTOP-DETAILS:" +
               "\n name: " + name +
               "\n proc: " + proc +
               "\n price: " + price +
               "\n ram: " + ram;
    }

    public static void main(String[] args) {
        laptop lap1 = new laptop();
        lap1.name = "hp";
        lap1.proc = "11.3";
        lap1.price = 10000;
        lap1.ram = 4;

        laptop lap2 = new laptop();
        lap2.name = "lenovo";
        lap2.proc = "12.0";
        lap2.price = 12000;
        lap2.ram = 5;

        System.out.println(lap1.allDetails());
        System.out.println(lap2.allDetails());
    }
}