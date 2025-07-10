public class laptop {
    String name;
    String proc;
    double price = 0.00;
    int ram = 0;

public laptop(String name,
    String proc,
    double price,
    int ram){
        this.name=name;
        this.proc=proc;
        this.price=price;
        this.ram=ram;
    
}
    public String allDetails() {
        // Return all values in one formatted string.
        return "LAPTOP-DETAILS:" +
               "\n name: " + name +
               "\n proc: " + proc +
               "\n price: " + price +
               "\n ram: " + ram;
    }

    public static void main(String[] args) {
        laptop lap1 = new laptop("hp","11.3a",10000,5);
        

        laptop lap2 = new laptop("lenovo","12.1.a",13000,5);
        

        System.out.println(lap1.allDetails());
        System.out.println(lap2.allDetails());
    }
}