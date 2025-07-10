public class Vehicle {
    protected String brand;
    protected int speed;
    
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "details : " + "\n" + "Brand: " + brand + "\n" + "Speed: " + speed;
    }
   
    public static class Car extends Vehicle {
        private int numDoors;

        public Car(String brand, int speed, int numDoors) {
            super(brand, speed);
            this.numDoors = numDoors;
        }

        @Override
        public String toString() {
            return "Car Details:\n" + "Brand: " + brand + "\nSpeed: " + speed + "\nNumber of doors: " + numDoors;
        }
    }

    public static class Bike extends Vehicle {
        private String type;

        public Bike(String brand, int speed, String type) {
            super(brand, speed);
            this.type = type;
        }

        @Override
        public String toString() {
            return "\nBike Details:" + "\n Brand: " + brand + "\nSpeed: " + speed + "\nType: " + type;
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, 4);
        System.out.println(car);

        Bike bike = new Bike("Honda", 100, "Electric");
        System.out.println(bike);
    }
}