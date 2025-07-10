public class Product {
    private String name;
    private double price;
    private int stock;

    // Constructor
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setters with discount logic
    public void setPrice(double price) {
        this.price = price;
        if (price > 500) {
            double discount = price * 0.10;
            System.out.println("10% Discount applied: ₹" + discount);
            this.price = price - discount;
        }
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // toString override
    @Override
    public String toString() {
        return "🛒 Product Details:\n" +
               "Name: " + name + "\n" +
               "Price: ₹" + price + "\n" +
               "Stock: " + stock + " units";
    }

    // Main method
    public static void main(String[] args) {
        // Product 1
        Product shampoo = new Product("Meera-3kg", 350.00, 15);
        System.out.println(shampoo); // before update

        shampoo.setPrice(300);
        shampoo.setStock(10);
        System.out.println("\nAfter update:");
        System.out.println(shampoo);
 
        // Product 2
        Product oil = new Product("Himalaya-5kg", 650.00, 8);
        System.out.println("\n" + oil);
        oil.setPrice(350);
        oil.setStock(25);
        System.out.println("\nAfter Applying Discount (if any):");
        System.out.println(oil);
    }
}
