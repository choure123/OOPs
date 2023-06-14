// Java Program to demonstrate
// Constructor


class Geeks {
    // Constructor
    Geeks() {
        super();
        System.out.println("Constructor Called");
    }

    // main function
    public static void main(String[] args) {
        Geeks geek = new Geeks();
    }
}

class Car1 {
    private String brand;
    private String color;
    private int year;

    // Default constructor
    public Car1() {
        brand = "Unknown";
        color = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    public Car1(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    // Getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


 //public class Main {
    public static void main(String[] args) {
        // Create a car using the default constructor
      //  Car car1 = new Car();
     //   car1.setBrand("Toyota");
     //   car1.setColor("Red");

        // Create a car using the parameterized constructor
        Car car2 = new Car("Honda", "Blue", 2018);

        // Display car information
        System.out.println("Car 1:");
    //    System.out.println("Brand: " + car1.getBrand());
    //    System.out.println("Color: " + car1.getColor());


        System.out.println("\nCar 2:");
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Color: " + car2.getColor());

    }

}



class Rectangle {
    private int width;
    private int height;

    // Default constructor
    public Rectangle() {
        width = 0;
        height = 0;
    }

    // Constructor with width and height parameters
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Constructor with a single parameter to create a square
    public Rectangle(int sideLength) {
        width = sideLength;
        height = sideLength;
    }

    // Getters and setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

 class main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println("Rectangle 1 - Width: " + rectangle1.getWidth() + ", Height: " + rectangle1.getHeight());

        Rectangle rectangle2 = new Rectangle(5, 10);
        System.out.println("Rectangle 2 - Width: " + rectangle2.getWidth() + ", Height: " + rectangle2.getHeight());

        Rectangle square = new Rectangle(7);
        System.out.println("Square - Width: " + square.getWidth() + ", Height: " + square.getHeight());
    }
}
